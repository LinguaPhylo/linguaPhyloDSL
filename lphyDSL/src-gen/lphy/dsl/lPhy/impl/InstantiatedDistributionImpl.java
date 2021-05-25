/**
 * generated by Xtext 2.25.0
 */
package lphy.dsl.lPhy.impl;

import java.util.Collection;

import lphy.dsl.lPhy.Argument;
import lphy.dsl.lPhy.DistributionTypeSpecification;
import lphy.dsl.lPhy.InstantiatedDistribution;
import lphy.dsl.lPhy.LPhyPackage;
import lphy.dsl.lPhy.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instantiated Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lphy.dsl.lPhy.impl.InstantiatedDistributionImpl#getGeneratedVariables <em>Generated Variables</em>}</li>
 *   <li>{@link lphy.dsl.lPhy.impl.InstantiatedDistributionImpl#getTypeSpec <em>Type Spec</em>}</li>
 *   <li>{@link lphy.dsl.lPhy.impl.InstantiatedDistributionImpl#isExplicitArguments <em>Explicit Arguments</em>}</li>
 *   <li>{@link lphy.dsl.lPhy.impl.InstantiatedDistributionImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstantiatedDistributionImpl extends LawNodeImpl implements InstantiatedDistribution
{
  /**
   * The cached value of the '{@link #getGeneratedVariables() <em>Generated Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneratedVariables()
   * @generated
   * @ordered
   */
  protected Variable generatedVariables;

  /**
   * The cached value of the '{@link #getTypeSpec() <em>Type Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSpec()
   * @generated
   * @ordered
   */
  protected DistributionTypeSpecification typeSpec;

  /**
   * The default value of the '{@link #isExplicitArguments() <em>Explicit Arguments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplicitArguments()
   * @generated
   * @ordered
   */
  protected static final boolean EXPLICIT_ARGUMENTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExplicitArguments() <em>Explicit Arguments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplicitArguments()
   * @generated
   * @ordered
   */
  protected boolean explicitArguments = EXPLICIT_ARGUMENTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<Argument> arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstantiatedDistributionImpl()
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
    return LPhyPackage.Literals.INSTANTIATED_DISTRIBUTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable getGeneratedVariables()
  {
    return generatedVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGeneratedVariables(Variable newGeneratedVariables, NotificationChain msgs)
  {
    Variable oldGeneratedVariables = generatedVariables;
    generatedVariables = newGeneratedVariables;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPhyPackage.INSTANTIATED_DISTRIBUTION__GENERATED_VARIABLES, oldGeneratedVariables, newGeneratedVariables);
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
  public void setGeneratedVariables(Variable newGeneratedVariables)
  {
    if (newGeneratedVariables != generatedVariables)
    {
      NotificationChain msgs = null;
      if (generatedVariables != null)
        msgs = ((InternalEObject)generatedVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPhyPackage.INSTANTIATED_DISTRIBUTION__GENERATED_VARIABLES, null, msgs);
      if (newGeneratedVariables != null)
        msgs = ((InternalEObject)newGeneratedVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPhyPackage.INSTANTIATED_DISTRIBUTION__GENERATED_VARIABLES, null, msgs);
      msgs = basicSetGeneratedVariables(newGeneratedVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPhyPackage.INSTANTIATED_DISTRIBUTION__GENERATED_VARIABLES, newGeneratedVariables, newGeneratedVariables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DistributionTypeSpecification getTypeSpec()
  {
    return typeSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeSpec(DistributionTypeSpecification newTypeSpec, NotificationChain msgs)
  {
    DistributionTypeSpecification oldTypeSpec = typeSpec;
    typeSpec = newTypeSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPhyPackage.INSTANTIATED_DISTRIBUTION__TYPE_SPEC, oldTypeSpec, newTypeSpec);
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
  public void setTypeSpec(DistributionTypeSpecification newTypeSpec)
  {
    if (newTypeSpec != typeSpec)
    {
      NotificationChain msgs = null;
      if (typeSpec != null)
        msgs = ((InternalEObject)typeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPhyPackage.INSTANTIATED_DISTRIBUTION__TYPE_SPEC, null, msgs);
      if (newTypeSpec != null)
        msgs = ((InternalEObject)newTypeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPhyPackage.INSTANTIATED_DISTRIBUTION__TYPE_SPEC, null, msgs);
      msgs = basicSetTypeSpec(newTypeSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPhyPackage.INSTANTIATED_DISTRIBUTION__TYPE_SPEC, newTypeSpec, newTypeSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isExplicitArguments()
  {
    return explicitArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExplicitArguments(boolean newExplicitArguments)
  {
    boolean oldExplicitArguments = explicitArguments;
    explicitArguments = newExplicitArguments;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPhyPackage.INSTANTIATED_DISTRIBUTION__EXPLICIT_ARGUMENTS, oldExplicitArguments, explicitArguments));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Argument> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<Argument>(Argument.class, this, LPhyPackage.INSTANTIATED_DISTRIBUTION__ARGUMENTS);
    }
    return arguments;
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
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__GENERATED_VARIABLES:
        return basicSetGeneratedVariables(null, msgs);
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__TYPE_SPEC:
        return basicSetTypeSpec(null, msgs);
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__GENERATED_VARIABLES:
        return getGeneratedVariables();
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__TYPE_SPEC:
        return getTypeSpec();
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__EXPLICIT_ARGUMENTS:
        return isExplicitArguments();
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__ARGUMENTS:
        return getArguments();
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
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__GENERATED_VARIABLES:
        setGeneratedVariables((Variable)newValue);
        return;
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__TYPE_SPEC:
        setTypeSpec((DistributionTypeSpecification)newValue);
        return;
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__EXPLICIT_ARGUMENTS:
        setExplicitArguments((Boolean)newValue);
        return;
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends Argument>)newValue);
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
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__GENERATED_VARIABLES:
        setGeneratedVariables((Variable)null);
        return;
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__TYPE_SPEC:
        setTypeSpec((DistributionTypeSpecification)null);
        return;
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__EXPLICIT_ARGUMENTS:
        setExplicitArguments(EXPLICIT_ARGUMENTS_EDEFAULT);
        return;
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__ARGUMENTS:
        getArguments().clear();
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
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__GENERATED_VARIABLES:
        return generatedVariables != null;
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__TYPE_SPEC:
        return typeSpec != null;
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__EXPLICIT_ARGUMENTS:
        return explicitArguments != EXPLICIT_ARGUMENTS_EDEFAULT;
      case LPhyPackage.INSTANTIATED_DISTRIBUTION__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (explicitArguments: ");
    result.append(explicitArguments);
    result.append(')');
    return result.toString();
  }

} //InstantiatedDistributionImpl