/**
 * generated by Xtext 2.13.0
 */
package org.graces.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.graces.mydsl.myDsl.Model#getName <em>Name</em>}</li>
 *   <li>{@link org.graces.mydsl.myDsl.Model#getClazzes <em>Clazzes</em>}</li>
 * </ul>
 *
 * @see org.graces.mydsl.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.graces.mydsl.myDsl.MyDslPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.graces.mydsl.myDsl.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Clazzes</b></em>' containment reference list.
   * The list contents are of type {@link org.graces.mydsl.myDsl.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clazzes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clazzes</em>' containment reference list.
   * @see org.graces.mydsl.myDsl.MyDslPackage#getModel_Clazzes()
   * @model containment="true"
   * @generated
   */
  EList<org.graces.mydsl.myDsl.Class> getClazzes();

} // Model
