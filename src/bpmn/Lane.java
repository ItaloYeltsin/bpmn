/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Lane#getFlowControllers <em>Flow Controllers</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getLane()
 * @model
 * @generated
 */
public interface Lane extends Partition {
	/**
	 * Returns the value of the '<em><b>Flow Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.FlowController}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Controllers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Controllers</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getLane_FlowControllers()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowController> getFlowControllers();

} // Lane
