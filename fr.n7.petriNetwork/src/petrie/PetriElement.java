/**
 */
package petrie;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrie.PetriElement#getPetrinet <em>Petrinet</em>}</li>
 * </ul>
 *
 * @see petrie.PetriePackage#getPetriElement()
 * @model abstract="true"
 * @generated
 */
public interface PetriElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Petrinet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrie.PetriNet#getPetriElements <em>Petri Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet</em>' container reference.
	 * @see #setPetrinet(PetriNet)
	 * @see petrie.PetriePackage#getPetriElement_Petrinet()
	 * @see petrie.PetriNet#getPetriElements
	 * @model opposite="petriElements" required="true" transient="false"
	 * @generated
	 */
	PetriNet getPetrinet();

	/**
	 * Sets the value of the '{@link petrie.PetriElement#getPetrinet <em>Petrinet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petrinet</em>' container reference.
	 * @see #getPetrinet()
	 * @generated
	 */
	void setPetrinet(PetriNet value);

} // PetriElement
