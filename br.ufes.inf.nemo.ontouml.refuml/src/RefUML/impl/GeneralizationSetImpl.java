/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RefUML.impl;

import RefUML.Classifier;
import RefUML.Generalization;
import RefUML.GeneralizationSet;
import RefUML.RefUMLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RefUML.impl.GeneralizationSetImpl#isIsCovering <em>Is Covering</em>}</li>
 *   <li>{@link RefUML.impl.GeneralizationSetImpl#isIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link RefUML.impl.GeneralizationSetImpl#getPowertype <em>Powertype</em>}</li>
 *   <li>{@link RefUML.impl.GeneralizationSetImpl#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationSetImpl extends PackageableElementImpl implements GeneralizationSet {
	/**
	 * The default value of the '{@link #isIsCovering() <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCovering()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COVERING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCovering() <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCovering()
	 * @generated
	 * @ordered
	 */
	protected boolean isCovering = IS_COVERING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisjoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISJOINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisjoint()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisjoint = IS_DISJOINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPowertype() <em>Powertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertype()
	 * @generated
	 * @ordered
	 */
	protected Classifier powertype;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefUMLPackage.Literals.GENERALIZATION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCovering() {
		return isCovering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCovering(boolean newIsCovering) {
		boolean oldIsCovering = isCovering;
		isCovering = newIsCovering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefUMLPackage.GENERALIZATION_SET__IS_COVERING, oldIsCovering, isCovering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDisjoint() {
		return isDisjoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisjoint(boolean newIsDisjoint) {
		boolean oldIsDisjoint = isDisjoint;
		isDisjoint = newIsDisjoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefUMLPackage.GENERALIZATION_SET__IS_DISJOINT, oldIsDisjoint, isDisjoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getPowertype() {
		if (powertype != null && powertype.eIsProxy()) {
			InternalEObject oldPowertype = (InternalEObject)powertype;
			powertype = (Classifier)eResolveProxy(oldPowertype);
			if (powertype != oldPowertype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefUMLPackage.GENERALIZATION_SET__POWERTYPE, oldPowertype, powertype));
			}
		}
		return powertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetPowertype() {
		return powertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowertype(Classifier newPowertype, NotificationChain msgs) {
		Classifier oldPowertype = powertype;
		powertype = newPowertype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RefUMLPackage.GENERALIZATION_SET__POWERTYPE, oldPowertype, newPowertype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowertype(Classifier newPowertype) {
		if (newPowertype != powertype) {
			NotificationChain msgs = null;
			if (powertype != null)
				msgs = ((InternalEObject)powertype).eInverseRemove(this, RefUMLPackage.CLASSIFIER__POWERTYPE_EXTENT, Classifier.class, msgs);
			if (newPowertype != null)
				msgs = ((InternalEObject)newPowertype).eInverseAdd(this, RefUMLPackage.CLASSIFIER__POWERTYPE_EXTENT, Classifier.class, msgs);
			msgs = basicSetPowertype(newPowertype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefUMLPackage.GENERALIZATION_SET__POWERTYPE, newPowertype, newPowertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectWithInverseEList.ManyInverse<Generalization>(Generalization.class, this, RefUMLPackage.GENERALIZATION_SET__GENERALIZATION, RefUMLPackage.GENERALIZATION__GENERALIZATION_SET);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefUMLPackage.GENERALIZATION_SET__POWERTYPE:
				if (powertype != null)
					msgs = ((InternalEObject)powertype).eInverseRemove(this, RefUMLPackage.CLASSIFIER__POWERTYPE_EXTENT, Classifier.class, msgs);
				return basicSetPowertype((Classifier)otherEnd, msgs);
			case RefUMLPackage.GENERALIZATION_SET__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefUMLPackage.GENERALIZATION_SET__POWERTYPE:
				return basicSetPowertype(null, msgs);
			case RefUMLPackage.GENERALIZATION_SET__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
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
			case RefUMLPackage.GENERALIZATION_SET__IS_COVERING:
				return isIsCovering();
			case RefUMLPackage.GENERALIZATION_SET__IS_DISJOINT:
				return isIsDisjoint();
			case RefUMLPackage.GENERALIZATION_SET__POWERTYPE:
				if (resolve) return getPowertype();
				return basicGetPowertype();
			case RefUMLPackage.GENERALIZATION_SET__GENERALIZATION:
				return getGeneralization();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RefUMLPackage.GENERALIZATION_SET__IS_COVERING:
				setIsCovering((Boolean)newValue);
				return;
			case RefUMLPackage.GENERALIZATION_SET__IS_DISJOINT:
				setIsDisjoint((Boolean)newValue);
				return;
			case RefUMLPackage.GENERALIZATION_SET__POWERTYPE:
				setPowertype((Classifier)newValue);
				return;
			case RefUMLPackage.GENERALIZATION_SET__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
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
			case RefUMLPackage.GENERALIZATION_SET__IS_COVERING:
				setIsCovering(IS_COVERING_EDEFAULT);
				return;
			case RefUMLPackage.GENERALIZATION_SET__IS_DISJOINT:
				setIsDisjoint(IS_DISJOINT_EDEFAULT);
				return;
			case RefUMLPackage.GENERALIZATION_SET__POWERTYPE:
				setPowertype((Classifier)null);
				return;
			case RefUMLPackage.GENERALIZATION_SET__GENERALIZATION:
				getGeneralization().clear();
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
			case RefUMLPackage.GENERALIZATION_SET__IS_COVERING:
				return isCovering != IS_COVERING_EDEFAULT;
			case RefUMLPackage.GENERALIZATION_SET__IS_DISJOINT:
				return isDisjoint != IS_DISJOINT_EDEFAULT;
			case RefUMLPackage.GENERALIZATION_SET__POWERTYPE:
				return powertype != null;
			case RefUMLPackage.GENERALIZATION_SET__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (isCovering: ");
		result.append(isCovering);
		result.append(", isDisjoint: ");
		result.append(isDisjoint);
		result.append(')');
		return result.toString();
	}

} //GeneralizationSetImpl
