/**
 * generated by Xtext 2.13.0
 */
package org.graces.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.graces.mydsl.myDsl.ClassHeader#getClassname <em>Classname</em>}</li>
 * </ul>
 *
 * @see org.graces.mydsl.myDsl.MyDslPackage#getClassHeader()
 * @model
 * @generated
 */
public interface ClassHeader extends EObject
{
  /**
   * Returns the value of the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classname</em>' attribute.
   * @see #setClassname(String)
   * @see org.graces.mydsl.myDsl.MyDslPackage#getClassHeader_Classname()
   * @model
   * @generated
   */
  String getClassname();

  /**
   * Sets the value of the '{@link org.graces.mydsl.myDsl.ClassHeader#getClassname <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classname</em>' attribute.
   * @see #getClassname()
   * @generated
   */
  void setClassname(String value);

} // ClassHeader
