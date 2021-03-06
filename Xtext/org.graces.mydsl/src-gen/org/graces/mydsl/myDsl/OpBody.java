/**
 * generated by Xtext 2.13.0
 */
package org.graces.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.graces.mydsl.myDsl.OpBody#getName <em>Name</em>}</li>
 *   <li>{@link org.graces.mydsl.myDsl.OpBody#getArgs <em>Args</em>}</li>
 *   <li>{@link org.graces.mydsl.myDsl.OpBody#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see org.graces.mydsl.myDsl.MyDslPackage#getOpBody()
 * @model
 * @generated
 */
public interface OpBody extends EObject
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
   * @see org.graces.mydsl.myDsl.MyDslPackage#getOpBody_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.graces.mydsl.myDsl.OpBody#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.graces.mydsl.myDsl.ArgBody}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.graces.mydsl.myDsl.MyDslPackage#getOpBody_Args()
   * @model containment="true"
   * @generated
   */
  EList<ArgBody> getArgs();

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(ReturnBody)
   * @see org.graces.mydsl.myDsl.MyDslPackage#getOpBody_Return()
   * @model containment="true"
   * @generated
   */
  ReturnBody getReturn();

  /**
   * Sets the value of the '{@link org.graces.mydsl.myDsl.OpBody#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(ReturnBody value);

} // OpBody
