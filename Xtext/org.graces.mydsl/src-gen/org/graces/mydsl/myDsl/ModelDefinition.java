/**
 * generated by Xtext 2.13.0
 */
package org.graces.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.graces.mydsl.myDsl.ModelDefinition#getModelname <em>Modelname</em>}</li>
 * </ul>
 *
 * @see org.graces.mydsl.myDsl.MyDslPackage#getModelDefinition()
 * @model
 * @generated
 */
public interface ModelDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Modelname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modelname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modelname</em>' attribute.
   * @see #setModelname(String)
   * @see org.graces.mydsl.myDsl.MyDslPackage#getModelDefinition_Modelname()
   * @model
   * @generated
   */
  String getModelname();

  /**
   * Sets the value of the '{@link org.graces.mydsl.myDsl.ModelDefinition#getModelname <em>Modelname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modelname</em>' attribute.
   * @see #getModelname()
   * @generated
   */
  void setModelname(String value);

} // ModelDefinition