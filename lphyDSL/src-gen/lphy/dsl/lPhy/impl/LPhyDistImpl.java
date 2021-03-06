/**
 * generated by Xtext 2.25.0
 */
package lphy.dsl.lPhy.impl;

import lphy.dsl.lPhy.LPhyDist;
import lphy.dsl.lPhy.LPhyModel;
import lphy.dsl.lPhy.LPhyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lphy.dsl.lPhy.impl.LPhyDistImpl#getDistributionType <em>Distribution Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPhyDistImpl extends DistributionTypeSpecificationImpl implements LPhyDist
{
  /**
   * The cached value of the '{@link #getDistributionType() <em>Distribution Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistributionType()
   * @generated
   * @ordered
   */
  protected LPhyModel distributionType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LPhyDistImpl()
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
    return LPhyPackage.Literals.LPHY_DIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LPhyModel getDistributionType()
  {
    if (distributionType != null && distributionType.eIsProxy())
    {
      InternalEObject oldDistributionType = (InternalEObject)distributionType;
      distributionType = (LPhyModel)eResolveProxy(oldDistributionType);
      if (distributionType != oldDistributionType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LPhyPackage.LPHY_DIST__DISTRIBUTION_TYPE, oldDistributionType, distributionType));
      }
    }
    return distributionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LPhyModel basicGetDistributionType()
  {
    return distributionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDistributionType(LPhyModel newDistributionType)
  {
    LPhyModel oldDistributionType = distributionType;
    distributionType = newDistributionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPhyPackage.LPHY_DIST__DISTRIBUTION_TYPE, oldDistributionType, distributionType));
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
      case LPhyPackage.LPHY_DIST__DISTRIBUTION_TYPE:
        if (resolve) return getDistributionType();
        return basicGetDistributionType();
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
      case LPhyPackage.LPHY_DIST__DISTRIBUTION_TYPE:
        setDistributionType((LPhyModel)newValue);
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
      case LPhyPackage.LPHY_DIST__DISTRIBUTION_TYPE:
        setDistributionType((LPhyModel)null);
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
      case LPhyPackage.LPHY_DIST__DISTRIBUTION_TYPE:
        return distributionType != null;
    }
    return super.eIsSet(featureID);
  }

} //LPhyDistImpl
