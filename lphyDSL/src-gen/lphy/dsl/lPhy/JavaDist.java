/**
 * generated by Xtext 2.25.0
 */
package lphy.dsl.lPhy;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Dist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lphy.dsl.lPhy.JavaDist#getDistributionType <em>Distribution Type</em>}</li>
 * </ul>
 *
 * @see lphy.dsl.lPhy.LPhyPackage#getJavaDist()
 * @model
 * @generated
 */
public interface JavaDist extends DistributionTypeSpecification
{
  /**
   * Returns the value of the '<em><b>Distribution Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distribution Type</em>' containment reference.
   * @see #setDistributionType(JvmTypeReference)
   * @see lphy.dsl.lPhy.LPhyPackage#getJavaDist_DistributionType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getDistributionType();

  /**
   * Sets the value of the '{@link lphy.dsl.lPhy.JavaDist#getDistributionType <em>Distribution Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distribution Type</em>' containment reference.
   * @see #getDistributionType()
   * @generated
   */
  void setDistributionType(JvmTypeReference value);

} // JavaDist
