/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RefUML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An expression that specifies a string value that is derived by concatenating a set of sub string expressions, some of which might be template parameters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RefUML.StringExpression#getSubExpression <em>Sub Expression</em>}</li>
 *   <li>{@link RefUML.StringExpression#getOwningExpression <em>Owning Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see RefUML.RefUMLPackage#getStringExpression()
 * @model
 * @generated
 */
public interface StringExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Sub Expression</b></em>' containment reference list.
	 * The list contents are of type {@link RefUML.StringExpression}.
	 * It is bidirectional and its opposite is '{@link RefUML.StringExpression#getOwningExpression <em>Owning Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StringExpressions that constitute this StringExpression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Expression</em>' containment reference list.
	 * @see RefUML.RefUMLPackage#getStringExpression_SubExpression()
	 * @see RefUML.StringExpression#getOwningExpression
	 * @model opposite="owningExpression" containment="true" ordered="false"
	 * @generated
	 */
	EList<StringExpression> getSubExpression();

	/**
	 * Returns the value of the '<em><b>Owning Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link RefUML.StringExpression#getSubExpression <em>Sub Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string expression of which this expression is a substring.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Expression</em>' container reference.
	 * @see #setOwningExpression(StringExpression)
	 * @see RefUML.RefUMLPackage#getStringExpression_OwningExpression()
	 * @see RefUML.StringExpression#getSubExpression
	 * @model opposite="subExpression" transient="false" ordered="false"
	 * @generated
	 */
	StringExpression getOwningExpression();

	/**
	 * Sets the value of the '{@link RefUML.StringExpression#getOwningExpression <em>Owning Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Expression</em>' container reference.
	 * @see #getOwningExpression()
	 * @generated
	 */
	void setOwningExpression(StringExpression value);

} // StringExpression
