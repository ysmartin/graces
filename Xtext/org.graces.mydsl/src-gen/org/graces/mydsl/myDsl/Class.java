/**
 * generated by Xtext 2.13.0
 */
package org.graces.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.graces.mydsl.myDsl.Class#getHeader <em>Header</em>}</li>
 *   <li>{@link org.graces.mydsl.myDsl.Class#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.graces.mydsl.myDsl.MyDslPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject
{
  /**
   * Returns the value of the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' containment reference.
   * @see #setHeader(ClassHeader)
   * @see org.graces.mydsl.myDsl.MyDslPackage#getClass_Header()
   * @model containment="true"
   * @generated
   */
  ClassHeader getHeader();

  /**
   * Sets the value of the '{@link org.graces.mydsl.myDsl.Class#getHeader <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' containment reference.
   * @see #getHeader()
   * @generated
   */
  void setHeader(ClassHeader value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ClassBody)
   * @see org.graces.mydsl.myDsl.MyDslPackage#getClass_Body()
   * @model containment="true"
   * @generated
   */
  ClassBody getBody();

  /**
   * Sets the value of the '{@link org.graces.mydsl.myDsl.Class#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ClassBody value);

} // Class
