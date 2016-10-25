/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.BPMNDiagram#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getBPMNDiagram()
 * @model annotation="gmf.diagram model.extension='bpmn' diagram.extension='bpmn_diagram'"
 * @generated
 */
public interface BPMNDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getBPMNDiagram_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // BPMNDiagram
