/**
 */
package org.eclipse.emfcloud.cmmn.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sentry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.Sentry#getOnPartId <em>On Part Id</em>}</li>
 *   <li>{@link metamodel.Sentry#getIfPart <em>If Part</em>}</li>
 *   <li>{@link metamodel.Sentry#getSentryType <em>Sentry Type</em>}</li>
 *   <li>{@link metamodel.Sentry#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getSentry()
 * @model
 * @generated
 */
public interface Sentry extends CMMNElement {
	/**
	 * Returns the value of the '<em><b>On Part Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Part Id</em>' attribute.
	 * @see #setOnPartId(String)
	 * @see metamodel.MetamodelPackage#getSentry_OnPartId()
	 * @model
	 * @generated
	 */
	String getOnPartId();

	/**
	 * Sets the value of the '{@link metamodel.Sentry#getOnPartId <em>On Part Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Part Id</em>' attribute.
	 * @see #getOnPartId()
	 * @generated
	 */
	void setOnPartId(String value);

	/**
	 * Returns the value of the '<em><b>If Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Part</em>' attribute.
	 * @see #setIfPart(String)
	 * @see metamodel.MetamodelPackage#getSentry_IfPart()
	 * @model
	 * @generated
	 */
	String getIfPart();

	/**
	 * Sets the value of the '{@link metamodel.Sentry#getIfPart <em>If Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Part</em>' attribute.
	 * @see #getIfPart()
	 * @generated
	 */
	void setIfPart(String value);

	/**
	 * Returns the value of the '<em><b>Sentry Type</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodel.SentryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentry Type</em>' attribute.
	 * @see metamodel.SentryType
	 * @see #setSentryType(SentryType)
	 * @see metamodel.MetamodelPackage#getSentry_SentryType()
	 * @model
	 * @generated
	 */
	SentryType getSentryType();

	/**
	 * Sets the value of the '{@link metamodel.Sentry#getSentryType <em>Sentry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sentry Type</em>' attribute.
	 * @see metamodel.SentryType
	 * @see #getSentryType()
	 * @generated
	 */
	void setSentryType(SentryType value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see metamodel.MetamodelPackage#getSentry_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link metamodel.Sentry#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // Sentry