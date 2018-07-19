package org.graces.mydsl.app;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.ui.internal.Model;
import org.graces.mydsl.MyDslStandaloneSetup;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.papyrus.infra.architecture.commands.IModelCreationCommand;
import org.eclipse.papyrus.uml.diagram.common.commands.CreateUMLModelCommand;
import org.eclipse.papyrus.uml.diagram.sequence.CreateSequenceDiagramCommand;
import org.eclipse.uml2.uml.*;

import com.google.common.io.Resources;
import com.google.inject.Injector;


public class MainApp {
	public MainApp() {

	}
	
	public Resource setup() throws IOException{
		// Set the platform URI to the one we want
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		
		Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	    String inputURI = "platform:/resource/org.graces.mydsl/src/org/graces/mydsl/example.mydsl";
	    String outputURI = "platform:/resource/org.graces.mydsl/src/org/graces/mydsl/example.xmi";
		Resource mydslresource = resourceSet.getResource(
		    URI.createURI(inputURI), true);
		EObject myModel = mydslresource.getAllContents().next();
		System.out.println(mydslresource.getContents());

		Resource xmiResource = resourceSet.createResource(URI.createURI(outputURI));
	    xmiResource.getContents().add(myModel);
	    
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
	    return xmiResource;
	}
	   	
	   	public static void main(String[] args){
	    	MainApp app = new MainApp();
	    	try {
				Resource inResource = app.setup();
//				System.out.println(inResource.getContents());
				Resource umlResource = app.transform(inResource);
//				app.arrange(umlResource);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	   	
	  public Resource transform(Resource inResource) throws IOException{
		  new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		  		  
		  // Register URIs (quizá hay que usar EPackage para registrar)
		  
		  ResourceSet resourceSet = new ResourceSetImpl();
		  
		  EObject UMLMeta = UMLPackage.eINSTANCE;
		  
		  String UMLUri = UMLPackage.eNS_URI;
		  
		  resourceSet.getPackageRegistry().put(UMLUri, UMLMeta);
		  
		  Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( )
		  .put("*", new XMIResourceFactoryImpl());
		  
		  EPackage mm1 = (EPackage) resourceSet.getResource(URI.createURI("platform:/resource/org.graces.mydsl/model/generated/MyDsl.ecore"), true).getContents().get(0);
		  
		  resourceSet.getPackageRegistry().put(mm1.getNsURI(), mm1);
		
		  // Refer to an existing transformation via URI
		  URI transformationURI = URI.createURI("platform:/resource/XtextToUML/transforms/TransformToUML.qvto");
		  // create executor for the given transformation
		  TransformationExecutor executor = new TransformationExecutor(transformationURI);

		  // define the transformation input
		  // Remark: we take the objects from a resource, however
		  // a list of arbitrary in-memory EObjects may be passed
		  ExecutionContextImpl context = new ExecutionContextImpl();	
		  EList<EObject> inObjects = inResource.getContents();

		  // create the input extent with its initial contents
		  ModelExtent input = new BasicModelExtent(inObjects);		
		  // create an empty extent to catch the output
		  ModelExtent output = new BasicModelExtent();

			// setup the execution environment details -> 
			// configuration properties, logger, monitor object etc.
			context.setConfigProperty("keepModeling", true);
		  
			// run the transformation assigned to the executor with the given 
			// input and output and execution context -> ChangeTheWorld(in, out)
			// Remark: variable arguments count is supported
			ExecutionDiagnostic result = executor.execute(context, input, output);
			
			// check the result for success
			if(result.getSeverity() == Diagnostic.OK) {
				// the output objects got captured in the output extent
				List<EObject> outObjects = output.getContents();
				// let's persist them using a resource 
			        ResourceSet resourceSet2 = new ResourceSetImpl();
			        
			    // TODO: Deberia crear el fichero nuevo antes de rrealizar la transformacion    
				Resource outResource = resourceSet2.createResource(
						URI.createURI("platform:/resource/XtextToUML/transforms/TransformToUML.uml"));
				outResource.getContents().addAll(outObjects);
				outResource.save(Collections.emptyMap());
				return outResource;
			} else {
				// turn the result diagnostic into status and send it to error log			
				IStatus status = BasicDiagnostic.toIStatus(result);
//				Activator.getDefault().getLog().log(status);
				System.out.println(status);
			}
			return null;
	  }
	  
//	  public void arrange(Resource umlResource) {
//		  final IModelCreationCommand creationCommand = new CreateUMLModelCommand();
//		  creationCommand.createModel(umlResource.getContents().get(0).);
//			
//			final CreateSequenceDiagramCommand diagramCommand = new CreateSequenceDiagramCommand();
//			diagramCommand.createDiagram(modelset, null, diagramName);
//	  }

}
