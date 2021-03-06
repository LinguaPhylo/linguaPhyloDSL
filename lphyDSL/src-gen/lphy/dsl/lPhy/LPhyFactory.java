/**
 * generated by Xtext 2.25.0
 */
package lphy.dsl.lPhy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lphy.dsl.lPhy.LPhyPackage
 * @generated
 */
public interface LPhyFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LPhyFactory eINSTANCE = lphy.dsl.lPhy.impl.LPhyFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  LPhyModel createLPhyModel();

  /**
   * Returns a new object of class '<em>Law Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Law Node</em>'.
   * @generated
   */
  LawNode createLawNode();

  /**
   * Returns a new object of class '<em>Instantiated Distribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instantiated Distribution</em>'.
   * @generated
   */
  InstantiatedDistribution createInstantiatedDistribution();

  /**
   * Returns a new object of class '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument</em>'.
   * @generated
   */
  Argument createArgument();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range</em>'.
   * @generated
   */
  Range createRange();

  /**
   * Returns a new object of class '<em>Distribution Type Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Distribution Type Specification</em>'.
   * @generated
   */
  DistributionTypeSpecification createDistributionTypeSpecification();

  /**
   * Returns a new object of class '<em>Dist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dist</em>'.
   * @generated
   */
  LPhyDist createLPhyDist();

  /**
   * Returns a new object of class '<em>Java Dist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Java Dist</em>'.
   * @generated
   */
  JavaDist createJavaDist();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LPhyPackage getLPhyPackage();

} //LPhyFactory
