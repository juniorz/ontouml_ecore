/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RefUML.impl;

import RefUML.PackageMerge;
import RefUML.RefUMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RefUML.impl.PackageMergeImpl#getMergedPackage <em>Merged Package</em>}</li>
 *   <li>{@link RefUML.impl.PackageMergeImpl#getReceivingPackage <em>Receiving Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageMergeImpl extends DirectedRelationshipImpl implements PackageMerge {
	/**
	 * The cached value of the '{@link #getMergedPackage() <em>Merged Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergedPackage()
	 * @generated
	 * @ordered
	 */
	protected RefUML.Package mergedPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageMergeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefUMLPackage.Literals.PACKAGE_MERGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefUML.Package getMergedPackage() {
		if (mergedPackage != null && mergedPackage.eIsProxy()) {
			InternalEObject oldMergedPackage = (InternalEObject)mergedPackage;
			mergedPackage = (RefUML.Package)eResolveProxy(oldMergedPackage);
			if (mergedPackage != oldMergedPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefUMLPackage.PACKAGE_MERGE__MERGED_PACKAGE, oldMergedPackage, mergedPackage));
			}
		}
		return mergedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefUML.Package basicGetMergedPackage() {
		return mergedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergedPackage(RefUML.Package newMergedPackage) {
		RefUML.Package oldMergedPackage = mergedPackage;
		mergedPackage = newMergedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefUMLPackage.PACKAGE_MERGE__MERGED_PACKAGE, oldMergedPackage, mergedPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefUML.Package getReceivingPackage() {
		if (eContainerFeatureID() != RefUMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE) return null;
		return (RefUML.Package)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivingPackage(RefUML.Package newReceivingPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReceivingPackage, RefUMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingPackage(RefUML.Package newReceivingPackage) {
		if (newReceivingPackage != eInternalContainer() || (eContainerFeatureID() != RefUMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE && newReceivingPackage != null)) {
			if (EcoreUtil.isAncestor(this, newReceivingPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReceivingPackage != null)
				msgs = ((InternalEObject)newReceivingPackage).eInverseAdd(this, RefUMLPackage.PACKAGE__PACKAGE_MERGE, RefUML.Package.class, msgs);
			msgs = basicSetReceivingPackage(newReceivingPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefUMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE, newReceivingPackage, newReceivingPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefUMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReceivingPackage((RefUML.Package)otherEnd, msgs);
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
			case RefUMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE:
				return basicSetReceivingPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RefUMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE:
				return eInternalContainer().eInverseRemove(this, RefUMLPackage.PACKAGE__PACKAGE_MERGE, RefUML.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefUMLPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				if (resolve) return getMergedPackage();
				return basicGetMergedPackage();
			case RefUMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE:
				return getReceivingPackage();
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
			case RefUMLPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				setMergedPackage((RefUML.Package)newValue);
				return;
			case RefUMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE:
				setReceivingPackage((RefUML.Package)newValue);
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
			case RefUMLPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				setMergedPackage((RefUML.Package)null);
				return;
			case RefUMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE:
				setReceivingPackage((RefUML.Package)null);
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
			case RefUMLPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				return mergedPackage != null;
			case RefUMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE:
				return getReceivingPackage() != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageMergeImpl
