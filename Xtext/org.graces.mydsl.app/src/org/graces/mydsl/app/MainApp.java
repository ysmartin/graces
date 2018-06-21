package org.graces.mydsl.app;
import org.graces.mydsl.*;


import java.io.IOException;

import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.ui.internal.Model;
import org.graces.mydsl.MyDslStandaloneSetup;

import com.google.inject.Injector;


public class MainApp {
	public MainApp() {
		
	}
	
	public void setup() throws IOException{
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	    String inputURI = "platform:/resource/org.graces.mydsl/src/org/graces/mydsl/example.mydsl";
	    String outputURI = "platform:/resource/org.graces.mydsl/src/org/graces/mydsl/example.xmi";
		Resource mydslresource = resourceSet.getResource(
		    URI.createURI(inputURI), true);
		//Model myModel = (Model) mydslresource.getContents().get(0);
//		EObject myModel = mydslresource.getContents().get(0);
		EObject myModel = mydslresource.getAllContents().next();

		Resource xmiResource = resourceSet.createResource(URI.createURI(outputURI));
	    xmiResource.getContents().add(myModel);
	    
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(myModel);
	   	System.out.println(diagnostic.toString());
	   	if (myModel instanceof Model) {
	   		System.out.println("WORKS");
	   	}else{
	   		System.out.println("FAIL");
	   	}
	}
	   	
	   	public static void main(String[] args){
	    	MainApp app = new MainApp();
	    	try {
				app.setup();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }

}
