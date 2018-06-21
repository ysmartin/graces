/**
 * generated by Xtext 2.13.0
 */
package org.graces.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.graces.mydsl.myDsl.AttrBody;
import org.graces.mydsl.myDsl.ClassBody;
import org.graces.mydsl.myDsl.MyDslPackage;
import org.graces.mydsl.myDsl.OpBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.graces.mydsl.myDsl.impl.ClassBodyImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.graces.mydsl.myDsl.impl.ClassBodyImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassBodyImpl extends MinimalEObjectImpl.Container implements ClassBody
{
  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<AttrBody> attributes;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<OpBody> operations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassBodyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.CLASS_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttrBody> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<AttrBody>(AttrBody.class, this, MyDslPackage.CLASS_BODY__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OpBody> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<OpBody>(OpBody.class, this, MyDslPackage.CLASS_BODY__OPERATIONS);
    }
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.CLASS_BODY__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case MyDslPackage.CLASS_BODY__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.CLASS_BODY__ATTRIBUTES:
        return getAttributes();
      case MyDslPackage.CLASS_BODY__OPERATIONS:
        return getOperations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.CLASS_BODY__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends AttrBody>)newValue);
        return;
      case MyDslPackage.CLASS_BODY__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends OpBody>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.CLASS_BODY__ATTRIBUTES:
        getAttributes().clear();
        return;
      case MyDslPackage.CLASS_BODY__OPERATIONS:
        getOperations().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.CLASS_BODY__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case MyDslPackage.CLASS_BODY__OPERATIONS:
        return operations != null && !operations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassBodyImpl