/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RefUML.impl;

import RefUML.MultiplicityElement;
import RefUML.RefUMLPackage;
import RefUML.StructuralFeature;
import RefUML.Type;
import RefUML.TypedElement;
import RefUML.ValueSpecification;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RefUML.impl.StructuralFeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link RefUML.impl.StructuralFeatureImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link RefUML.impl.StructuralFeatureImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link RefUML.impl.StructuralFeatureImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link RefUML.impl.StructuralFeatureImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link RefUML.impl.StructuralFeatureImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link RefUML.impl.StructuralFeatureImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link RefUML.impl.StructuralFeatureImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StructuralFeatureImpl extends FeatureImpl implements StructuralFeature {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperValue;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification lowerValue;

	/**
	 * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefUMLPackage.Literals.STRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefUMLPackage.STRUCTURAL_FEATURE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefUMLPackage.STRUCTURAL_FEATURE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefUMLPackage.STRUCTURAL_FEATURE__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefUMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		// TODO: implement this method to return the 'Upper' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		// TODO: implement this method to set the 'Upper' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		// TODO: implement this method to return the 'Lower' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		// TODO: implement this method to set the 'Lower' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(ValueSpecification newUpperValue, NotificationChain msgs) {
		ValueSpecification oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RefUMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE, oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(ValueSpecification newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RefUMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RefUMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefUMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(ValueSpecification newLowerValue, NotificationChain msgs) {
		ValueSpecification oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RefUMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE, oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(ValueSpecification newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RefUMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RefUMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefUMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefUMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesCardinality(int C) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesMultiplicity(MultiplicityElement M) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lowerBound() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upperBound() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean compatibleWith(MultiplicityElement other) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is(int lowerbound, int upperbound) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefUMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
			case RefUMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefUMLPackage.STRUCTURAL_FEATURE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case RefUMLPackage.STRUCTURAL_FEATURE__IS_ORDERED:
				return isIsOrdered();
			case RefUMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE:
				return isIsUnique();
			case RefUMLPackage.STRUCTURAL_FEATURE__UPPER:
				return getUpper();
			case RefUMLPackage.STRUCTURAL_FEATURE__LOWER:
				return getLower();
			case RefUMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE:
				return getUpperValue();
			case RefUMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE:
				return getLowerValue();
			case RefUMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY:
				return isIsReadOnly();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RefUMLPackage.STRUCTURAL_FEATURE__TYPE:
				setType((Type)newValue);
				return;
			case RefUMLPackage.STRUCTURAL_FEATURE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case RefUMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case RefUMLPackage.STRUCTURAL_FEATURE__UPPER:
				setUpper((Integer)newValue);
				return;
			case RefUMLPackage.STRUCTURAL_FEATURE__LOWER:
				setLower((Integer)newValue);
				return;
			case RefUMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case RefUMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case RefUMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case RefUMLPackage.STRUCTURAL_FEATURE__TYPE:
				setType((Type)null);
				return;
			case RefUMLPackage.STRUCTURAL_FEATURE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case RefUMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case RefUMLPackage.STRUCTURAL_FEATURE__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case RefUMLPackage.STRUCTURAL_FEATURE__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case RefUMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case RefUMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case RefUMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RefUMLPackage.STRUCTURAL_FEATURE__TYPE:
				return type != null;
			case RefUMLPackage.STRUCTURAL_FEATURE__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case RefUMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case RefUMLPackage.STRUCTURAL_FEATURE__UPPER:
				return getUpper() != UPPER_EDEFAULT;
			case RefUMLPackage.STRUCTURAL_FEATURE__LOWER:
				return getLower() != LOWER_EDEFAULT;
			case RefUMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE:
				return upperValue != null;
			case RefUMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE:
				return lowerValue != null;
			case RefUMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case RefUMLPackage.STRUCTURAL_FEATURE__TYPE: return RefUMLPackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case RefUMLPackage.STRUCTURAL_FEATURE__IS_ORDERED: return RefUMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case RefUMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE: return RefUMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case RefUMLPackage.STRUCTURAL_FEATURE__UPPER: return RefUMLPackage.MULTIPLICITY_ELEMENT__UPPER;
				case RefUMLPackage.STRUCTURAL_FEATURE__LOWER: return RefUMLPackage.MULTIPLICITY_ELEMENT__LOWER;
				case RefUMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE: return RefUMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				case RefUMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE: return RefUMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case RefUMLPackage.TYPED_ELEMENT__TYPE: return RefUMLPackage.STRUCTURAL_FEATURE__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case RefUMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED: return RefUMLPackage.STRUCTURAL_FEATURE__IS_ORDERED;
				case RefUMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE: return RefUMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE;
				case RefUMLPackage.MULTIPLICITY_ELEMENT__UPPER: return RefUMLPackage.STRUCTURAL_FEATURE__UPPER;
				case RefUMLPackage.MULTIPLICITY_ELEMENT__LOWER: return RefUMLPackage.STRUCTURAL_FEATURE__LOWER;
				case RefUMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE: return RefUMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE;
				case RefUMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE: return RefUMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseOperationID) {
				case RefUMLPackage.MULTIPLICITY_ELEMENT___SET_LOWER__INT: return RefUMLPackage.STRUCTURAL_FEATURE___SET_LOWER__INT;
				case RefUMLPackage.MULTIPLICITY_ELEMENT___SET_UPPER__INT: return RefUMLPackage.STRUCTURAL_FEATURE___SET_UPPER__INT;
				case RefUMLPackage.MULTIPLICITY_ELEMENT___GET_LOWER: return RefUMLPackage.STRUCTURAL_FEATURE___GET_LOWER;
				case RefUMLPackage.MULTIPLICITY_ELEMENT___GET_UPPER: return RefUMLPackage.STRUCTURAL_FEATURE___GET_UPPER;
				case RefUMLPackage.MULTIPLICITY_ELEMENT___IS_MULTIVALUED: return RefUMLPackage.STRUCTURAL_FEATURE___IS_MULTIVALUED;
				case RefUMLPackage.MULTIPLICITY_ELEMENT___INCLUDES_CARDINALITY__INT: return RefUMLPackage.STRUCTURAL_FEATURE___INCLUDES_CARDINALITY__INT;
				case RefUMLPackage.MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT: return RefUMLPackage.STRUCTURAL_FEATURE___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;
				case RefUMLPackage.MULTIPLICITY_ELEMENT___LOWER_BOUND: return RefUMLPackage.STRUCTURAL_FEATURE___LOWER_BOUND;
				case RefUMLPackage.MULTIPLICITY_ELEMENT___UPPER_BOUND: return RefUMLPackage.STRUCTURAL_FEATURE___UPPER_BOUND;
				case RefUMLPackage.MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT: return RefUMLPackage.STRUCTURAL_FEATURE___COMPATIBLE_WITH__MULTIPLICITYELEMENT;
				case RefUMLPackage.MULTIPLICITY_ELEMENT___IS__INT_INT: return RefUMLPackage.STRUCTURAL_FEATURE___IS__INT_INT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RefUMLPackage.STRUCTURAL_FEATURE___IS_MULTIVALUED:
				return isMultivalued();
			case RefUMLPackage.STRUCTURAL_FEATURE___INCLUDES_CARDINALITY__INT:
				return includesCardinality((Integer)arguments.get(0));
			case RefUMLPackage.STRUCTURAL_FEATURE___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT:
				return includesMultiplicity((MultiplicityElement)arguments.get(0));
			case RefUMLPackage.STRUCTURAL_FEATURE___LOWER_BOUND:
				return lowerBound();
			case RefUMLPackage.STRUCTURAL_FEATURE___UPPER_BOUND:
				return upperBound();
			case RefUMLPackage.STRUCTURAL_FEATURE___COMPATIBLE_WITH__MULTIPLICITYELEMENT:
				return compatibleWith((MultiplicityElement)arguments.get(0));
			case RefUMLPackage.STRUCTURAL_FEATURE___IS__INT_INT:
				return is((Integer)arguments.get(0), (Integer)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(')');
		return result.toString();
	}

} //StructuralFeatureImpl
