/**
 * generated by Xtext 2.25.0
 */
package lphy.dsl.lPhy.impl;

import lphy.dsl.lPhy.JavaDist;
import lphy.dsl.lPhy.LPhyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Dist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lphy.dsl.lPhy.impl.JavaDistImpl#getDistributionType <em>Distribution Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaDistImpl extends DistributionTypeSpecificationImpl implements JavaDist
{
  /**
   * The cached value of the '{@link #getDistributionType() <em>Distribution Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistributionType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference distributionType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JavaDistImpl()
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
    return LPhyPackage.Literals.JAVA_DIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmTypeReference getDistributionType()
  {
    return distributionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDistributionType(JvmTypeReference newDistributionType, NotificationChain msgs)
  {
    JvmTypeReference oldDistributionType = distributionType;
    distributionType = newDistributionType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPhyPackage.JAVA_DIST__DISTRIBUTION_TYPE, oldDistributionType, newDistributionType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDistributionType(JvmTypeReference newDistributionType)
  {
    if (newDistributionType != distributionType)
    {
      NotificationChain msgs = null;
      if (distributionType != null)
        msgs = ((InternalEObject)distributionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPhyPackage.JAVA_DIST__DISTRIBUTION_TYPE, null, msgs);
      if (newDistributionType != null)
        msgs = ((InternalEObject)newDistributionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPhyPackage.JAVA_DIST__DISTRIBUTION_TYPE, null, msgs);
      msgs = basicSetDistributionType(newDistributionType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPhyPackage.JAVA_DIST__DISTRIBUTION_TYPE, newDistributionType, newDistributionType));
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
      case LPhyPackage.JAVA_DIST__DISTRIBUTION_TYPE:
        return basicSetDistributionType(null, msgs);
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
      case LPhyPackage.JAVA_DIST__DISTRIBUTION_TYPE:
        return getDistributionType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LPhyPackage.JAVA_DIST__DISTRIBUTION_TYPE:
        setDistributionType((JvmTypeReference)newValue);
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
      case LPhyPackage.JAVA_DIST__DISTRIBUTION_TYPE:
        setDistributionType((JvmTypeReference)null);
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
      case LPhyPackage.JAVA_DIST__DISTRIBUTION_TYPE:
        return distributionType != null;
    }
    return super.eIsSet(featureID);
  }

} //JavaDistImpl