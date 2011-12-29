/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RefUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Unlimited Natural</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A literal unlimited natural is a specification of an unlimited natural number.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RefUML.LiteralUnlimitedNatural#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see RefUML.RefUMLPackage#getLiteralUnlimitedNatural()
 * @model
 * @generated
 */
public interface LiteralUnlimitedNatural extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specified UnlimitedNatural value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see RefUML.RefUMLPackage#getLiteralUnlimitedNatural_Value()
	 * @model default="0" dataType="RefUML.UnlimitedNatural" required="true" ordered="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link RefUML.LiteralUnlimitedNatural#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // LiteralUnlimitedNatural
