/**
 */
package bpmn.impl;

import bpmn.BpmnPackage;
import bpmn.FlowController;
import bpmn.Lane;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.LaneImpl#getFlowControllers <em>Flow Controllers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaneImpl extends PartitionImpl implements Lane {
	/**
	 * The cached value of the '{@link #getFlowControllers() <em>Flow Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowController> flowControllers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.LANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowController> getFlowControllers() {
		if (flowControllers == null) {
			flowControllers = new EObjectContainmentEList<FlowController>(FlowController.class, this, BpmnPackage.LANE__FLOW_CONTROLLERS);
		}
		return flowControllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnPackage.LANE__FLOW_CONTROLLERS:
				return ((InternalEList<?>)getFlowControllers()).basicRemove(otherEnd, msgs);
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
			case BpmnPackage.LANE__FLOW_CONTROLLERS:
				return getFlowControllers();
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
			case BpmnPackage.LANE__FLOW_CONTROLLERS:
				getFlowControllers().clear();
				getFlowControllers().addAll((Collection<? extends FlowController>)newValue);
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
			case BpmnPackage.LANE__FLOW_CONTROLLERS:
				getFlowControllers().clear();
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
			case BpmnPackage.LANE__FLOW_CONTROLLERS:
				return flowControllers != null && !flowControllers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LaneImpl
