/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RefUML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance value is a value specification that identifies an instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RefUML.InstanceValue#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see RefUML.RefUMLPackage#getInstanceValue()
 * @model
 * @generated
 */
public interface InstanceValue extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instance that is the specified value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(InstanceSpecification)
	 * @see RefUML.RefUMLPackage#getInstanceValue_Instance()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InstanceSpecification getInstance();

	/**
	 * Sets the value of the '{@link RefUML.InstanceValue#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(InstanceSpecification value);

} // InstanceValue
