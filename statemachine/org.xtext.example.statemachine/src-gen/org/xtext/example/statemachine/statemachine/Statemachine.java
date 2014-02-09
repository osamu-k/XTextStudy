/**
 */
package org.xtext.example.statemachine.statemachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statemachine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.statemachine.statemachine.Statemachine#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.statemachine.statemachine.Statemachine#getStates <em>States</em>}</li>
 *   <li>{@link org.xtext.example.statemachine.statemachine.Statemachine#getEvents <em>Events</em>}</li>
 *   <li>{@link org.xtext.example.statemachine.statemachine.Statemachine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.xtext.example.statemachine.statemachine.Statemachine#getInitialiState <em>Initiali State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.statemachine.statemachine.StatemachinePackage#getStatemachine()
 * @model
 * @generated
 */
public interface Statemachine extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.statemachine.statemachine.StatemachinePackage#getStatemachine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.statemachine.statemachine.Statemachine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.statemachine.statemachine.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see org.xtext.example.statemachine.statemachine.StatemachinePackage#getStatemachine_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.statemachine.statemachine.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see org.xtext.example.statemachine.statemachine.StatemachinePackage#getStatemachine_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.statemachine.statemachine.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see org.xtext.example.statemachine.statemachine.StatemachinePackage#getStatemachine_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

  /**
   * Returns the value of the '<em><b>Initiali State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initiali State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initiali State</em>' reference.
   * @see #setInitialiState(State)
   * @see org.xtext.example.statemachine.statemachine.StatemachinePackage#getStatemachine_InitialiState()
   * @model
   * @generated
   */
  State getInitialiState();

  /**
   * Sets the value of the '{@link org.xtext.example.statemachine.statemachine.Statemachine#getInitialiState <em>Initiali State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initiali State</em>' reference.
   * @see #getInitialiState()
   * @generated
   */
  void setInitialiState(State value);

} // Statemachine
