/**
 * generated by Xtext 2.25.0
 */
package lphy.dsl.lPhy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lphy.dsl.lPhy.LPhyModel#getPackage <em>Package</em>}</li>
 *   <li>{@link lphy.dsl.lPhy.LPhyModel#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link lphy.dsl.lPhy.LPhyModel#getName <em>Name</em>}</li>
 *   <li>{@link lphy.dsl.lPhy.LPhyModel#getParameters <em>Parameters</em>}</li>
 *   <li>{@link lphy.dsl.lPhy.LPhyModel#getLawNodes <em>Law Nodes</em>}</li>
 * </ul>
 *
 * @see lphy.dsl.lPhy.LPhyPackage#getLPhyModel()
 * @model
 * @generated
 */
public interface LPhyModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' attribute.
   * @see #setPackage(String)
   * @see lphy.dsl.lPhy.LPhyPackage#getLPhyModel_Package()
   * @model
   * @generated
   */
  String getPackage();

  /**
   * Sets the value of the '{@link lphy.dsl.lPhy.LPhyModel#getPackage <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' attribute.
   * @see #getPackage()
   * @generated
   */
  void setPackage(String value);

  /**
   * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Section</em>' containment reference.
   * @see #setImportSection(XImportSection)
   * @see lphy.dsl.lPhy.LPhyPackage#getLPhyModel_ImportSection()
   * @model containment="true"
   * @generated
   */
  XImportSection getImportSection();

  /**
   * Sets the value of the '{@link lphy.dsl.lPhy.LPhyModel#getImportSection <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Section</em>' containment reference.
   * @see #getImportSection()
   * @generated
   */
  void setImportSection(XImportSection value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see lphy.dsl.lPhy.LPhyPackage#getLPhyModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link lphy.dsl.lPhy.LPhyModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' attribute list.
   * @see lphy.dsl.lPhy.LPhyPackage#getLPhyModel_Parameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameters();

  /**
   * Returns the value of the '<em><b>Law Nodes</b></em>' containment reference list.
   * The list contents are of type {@link lphy.dsl.lPhy.LawNode}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Law Nodes</em>' containment reference list.
   * @see lphy.dsl.lPhy.LPhyPackage#getLPhyModel_LawNodes()
   * @model containment="true"
   * @generated
   */
  EList<LawNode> getLawNodes();

} // LPhyModel
