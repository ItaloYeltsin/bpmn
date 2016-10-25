/**
 */
package bpmn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Connector#getSource <em>Source</em>}</li>
 *   <li>{@link bpmn.Connector#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getConnector()
 * @model abstract="true"
 *        annotation="gmf.link label='name' source='source' target='target' border.style='solid' target.decoration='arrow' width='1' tool.small.bundle='bpmn.edit' tool.small.path='/icons/full/obj16/MessageFlow.gif'"
 * @generated
 */
public interface Connector extends Element {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(FlowController)
	 * @see bpmn.BpmnPackage#getConnector_Source()
	 * @model
	 * @generated
	 */
	FlowController getSource();

	/**
	 * Sets the value of the '{@link bpmn.Connector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(FlowController value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(FlowController)
	 * @see bpmn.BpmnPackage#getConnector_Target()
	 * @model
	 * @generated
	 */
	FlowController getTarget();

	/**
	 * Sets the value of the '{@link bpmn.Connector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(FlowController value);

} // Connector
