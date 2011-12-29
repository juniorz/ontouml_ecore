/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RefUML.impl;

import RefUML.Enumeration;
import RefUML.NamedElement;
import RefUML.PackageMerge;
import RefUML.PackageableElement;
import RefUML.PrimitiveType;
import RefUML.RefUMLPackage;
import RefUML.Type;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RefUML.impl.PackageImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link RefUML.impl.PackageImpl#getPackageMerge <em>Package Merge</em>}</li>
 *   <li>{@link RefUML.impl.PackageImpl#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link RefUML.impl.PackageImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link RefUML.impl.PackageImpl#getNestingPackage <em>Nesting Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamespaceImpl implements RefUML.Package {
	/**
	 * The cached value of the '{@link #getPackageMerge() <em>Package Merge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageMerge()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageMerge> packageMerge;

	/**
	 * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageableElement> packagedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefUMLPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getOwnedType() {
		// TODO: implement this method to return the 'Owned Type' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageMerge> getPackageMerge() {
		if (packageMerge == null) {
			packageMerge = new EObjectContainmentWithInverseEList<PackageMerge>(PackageMerge.class, this, RefUMLPackage.PACKAGE__PACKAGE_MERGE, RefUMLPackage.PACKAGE_MERGE__RECEIVING_PACKAGE);
		}
		return packageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getPackagedElement() {
		if (packagedElement == null) {
			packagedElement = new EObjectContainmentEList<PackageableElement>(PackageableElement.class, this, RefUMLPackage.PACKAGE__PACKAGED_ELEMENT);
		}
		return packagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefUML.Package> getNestedPackage() {
		// TODO: implement this method to return the 'Nested Package' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefUML.Package getNestingPackage() {
		RefUML.Package nestingPackage = basicGetNestingPackage();
		return nestingPackage != null && nestingPackage.eIsProxy() ? (RefUML.Package)eResolveProxy((InternalEObject)nestingPackage) : nestingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefUML.Package basicGetNestingPackage() {
		// TODO: implement this method to return the 'Nesting Package' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingPackage(RefUML.Package newNestingPackage) {
		// TODO: implement this method to set the 'Nesting Package' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefUML.Class createOwnedClass(String name, boolean isAbstract) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createOwnedEnumeration(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createOwnedPrimitiveType(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createOwnedInterface(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAppliedProfile(String qualifiedName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAppliedProfile(String qualifiedName, boolean recurse) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModelLibrary() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> visibleMembers() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makesVisible(NamedElement el) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case RefUMLPackage.PACKAGE__PACKAGE_MERGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageMerge()).basicAdd(otherEnd, msgs);
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
			case RefUMLPackage.PACKAGE__PACKAGE_MERGE:
				return ((InternalEList<?>)getPackageMerge()).basicRemove(otherEnd, msgs);
			case RefUMLPackage.PACKAGE__PACKAGED_ELEMENT:
				return ((InternalEList<?>)getPackagedElement()).basicRemove(otherEnd, msgs);
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
			case RefUMLPackage.PACKAGE__OWNED_TYPE:
				return getOwnedType();
			case RefUMLPackage.PACKAGE__PACKAGE_MERGE:
				return getPackageMerge();
			case RefUMLPackage.PACKAGE__PACKAGED_ELEMENT:
				return getPackagedElement();
			case RefUMLPackage.PACKAGE__NESTED_PACKAGE:
				return getNestedPackage();
			case RefUMLPackage.PACKAGE__NESTING_PACKAGE:
				if (resolve) return getNestingPackage();
				return basicGetNestingPackage();
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
			case RefUMLPackage.PACKAGE__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends Type>)newValue);
				return;
			case RefUMLPackage.PACKAGE__PACKAGE_MERGE:
				getPackageMerge().clear();
				getPackageMerge().addAll((Collection<? extends PackageMerge>)newValue);
				return;
			case RefUMLPackage.PACKAGE__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				getPackagedElement().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case RefUMLPackage.PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				getNestedPackage().addAll((Collection<? extends RefUML.Package>)newValue);
				return;
			case RefUMLPackage.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((RefUML.Package)newValue);
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
			case RefUMLPackage.PACKAGE__OWNED_TYPE:
				getOwnedType().clear();
				return;
			case RefUMLPackage.PACKAGE__PACKAGE_MERGE:
				getPackageMerge().clear();
				return;
			case RefUMLPackage.PACKAGE__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				return;
			case RefUMLPackage.PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				return;
			case RefUMLPackage.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((RefUML.Package)null);
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
			case RefUMLPackage.PACKAGE__OWNED_TYPE:
				return !getOwnedType().isEmpty();
			case RefUMLPackage.PACKAGE__PACKAGE_MERGE:
				return packageMerge != null && !packageMerge.isEmpty();
			case RefUMLPackage.PACKAGE__PACKAGED_ELEMENT:
				return packagedElement != null && !packagedElement.isEmpty();
			case RefUMLPackage.PACKAGE__NESTED_PACKAGE:
				return !getNestedPackage().isEmpty();
			case RefUMLPackage.PACKAGE__NESTING_PACKAGE:
				return basicGetNestingPackage() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RefUMLPackage.PACKAGE___CREATE_OWNED_CLASS__STRING_BOOLEAN:
				return createOwnedClass((String)arguments.get(0), (Boolean)arguments.get(1));
			case RefUMLPackage.PACKAGE___CREATE_OWNED_ENUMERATION__STRING:
				return createOwnedEnumeration((String)arguments.get(0));
			case RefUMLPackage.PACKAGE___CREATE_OWNED_PRIMITIVE_TYPE__STRING:
				return createOwnedPrimitiveType((String)arguments.get(0));
			case RefUMLPackage.PACKAGE___CREATE_OWNED_INTERFACE__STRING:
				createOwnedInterface((String)arguments.get(0));
				return null;
			case RefUMLPackage.PACKAGE___GET_APPLIED_PROFILE__STRING:
				getAppliedProfile((String)arguments.get(0));
				return null;
			case RefUMLPackage.PACKAGE___GET_APPLIED_PROFILE__STRING_BOOLEAN:
				getAppliedProfile((String)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case RefUMLPackage.PACKAGE___IS_MODEL_LIBRARY:
				return isModelLibrary();
			case RefUMLPackage.PACKAGE___VISIBLE_MEMBERS:
				return visibleMembers();
			case RefUMLPackage.PACKAGE___MAKES_VISIBLE__NAMEDELEMENT:
				return makesVisible((NamedElement)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PackageImpl
