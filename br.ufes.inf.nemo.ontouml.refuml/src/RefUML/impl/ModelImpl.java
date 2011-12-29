/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RefUML.impl;

import RefUML.Model;
import RefUML.RefUMLPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RefUML.impl.ModelImpl#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends PackageImpl implements Model {
	/**
	 * The default value of the '{@link #getViewpoint() <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEWPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewpoint() <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
	protected String viewpoint = VIEWPOINT_EDEFAULT;

	/**
	 * This is true if the Viewpoint attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean viewpointESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefUMLPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewpoint() {
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewpoint(String newViewpoint) {
		String oldViewpoint = viewpoint;
		viewpoint = newViewpoint;
		boolean oldViewpointESet = viewpointESet;
		viewpointESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefUMLPackage.MODEL__VIEWPOINT, oldViewpoint, viewpoint, !oldViewpointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetViewpoint() {
		String oldViewpoint = viewpoint;
		boolean oldViewpointESet = viewpointESet;
		viewpoint = VIEWPOINT_EDEFAULT;
		viewpointESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RefUMLPackage.MODEL__VIEWPOINT, oldViewpoint, VIEWPOINT_EDEFAULT, oldViewpointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetViewpoint() {
		return viewpointESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMetamodel() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefUMLPackage.MODEL__VIEWPOINT:
				return getViewpoint();
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
			case RefUMLPackage.MODEL__VIEWPOINT:
				setViewpoint((String)newValue);
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
			case RefUMLPackage.MODEL__VIEWPOINT:
				unsetViewpoint();
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
			case RefUMLPackage.MODEL__VIEWPOINT:
				return isSetViewpoint();
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
			case RefUMLPackage.MODEL___IS_METAMODEL:
				return isMetamodel();
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
		result.append(" (viewpoint: ");
		if (viewpointESet) result.append(viewpoint); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModelImpl
