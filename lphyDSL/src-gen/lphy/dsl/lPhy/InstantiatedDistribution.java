/**
 * generated by Xtext 2.25.0
 */
package lphy.dsl.lPhy;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiated Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lphy.dsl.lPhy.InstantiatedDistribution#getGeneratedVariables <em>Generated Variables</em>}</li>
 *   <li>{@link lphy.dsl.lPhy.InstantiatedDistribution#getTypeSpec <em>Type Spec</em>}</li>
 *   <li>{@link lphy.dsl.lPhy.InstantiatedDistribution#isExplicitArguments <em>Explicit Arguments</em>}</li>
 *   <li>{@link lphy.dsl.lPhy.InstantiatedDistribution#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see lphy.dsl.lPhy.LPhyPackage#getInstantiatedDistribution()
 * @model
 * @generated
 */
public interface InstantiatedDistribution extends LawNode
{
  /**
   * Returns the value of the '<em><b>Generated Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generated Variables</em>' containment reference.
   * @see #setGeneratedVariables(Variable)
   * @see lphy.dsl.lPhy.LPhyPackage#getInstantiatedDistribution_GeneratedVariables()
   * @model containment="true"
   * @generated
   */
  Variable getGeneratedVariables();

  /**
   * Sets the value of the '{@link lphy.dsl.lPhy.InstantiatedDistribution#getGeneratedVariables <em>Generated Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generated Variables</em>' containment reference.
   * @see #getGeneratedVariables()
   * @generated
   */
  void setGeneratedVariables(Variable value);

  /**
   * Returns the value of the '<em><b>Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Spec</em>' containment reference.
   * @see #setTypeSpec(DistributionTypeSpecification)
   * @see lphy.dsl.lPhy.LPhyPackage#getInstantiatedDistribution_TypeSpec()
   * @model containment="true"
   * @generated
   */
  DistributionTypeSpecification getTypeSpec();

  /**
   * Sets the value of the '{@link lphy.dsl.lPhy.InstantiatedDistribution#getTypeSpec <em>Type Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Spec</em>' containment reference.
   * @see #getTypeSpec()
   * @generated
   */
  void setTypeSpec(DistributionTypeSpecification value);

  /**
   * Returns the value of the '<em><b>Explicit Arguments</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Explicit Arguments</em>' attribute.
   * @see #setExplicitArguments(boolean)
   * @see lphy.dsl.lPhy.LPhyPackage#getInstantiatedDistribution_ExplicitArguments()
   * @model
   * @generated
   */
  boolean isExplicitArguments();

  /**
   * Sets the value of the '{@link lphy.dsl.lPhy.InstantiatedDistribution#isExplicitArguments <em>Explicit Arguments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explicit Arguments</em>' attribute.
   * @see #isExplicitArguments()
   * @generated
   */
  void setExplicitArguments(boolean value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link lphy.dsl.lPhy.Argument}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see lphy.dsl.lPhy.LPhyPackage#getInstantiatedDistribution_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Argument> getArguments();

} // InstantiatedDistribution