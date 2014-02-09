/**
 */
package org.xtext.example.statemachine.statemachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.statemachine.statemachine.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link org.xtext.example.statemachine.statemachine.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.example.statemachine.statemachine.Transition#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.statemachine.statemachine.StatemachinePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(State)
   * @see org.xtext.example.statemachine.statemachine.StatemachinePackage#getTransition_From()
   * @model
   * @generated
   */
  State getFrom();

  /**
   * Sets the value of the '{@link org.xtext.example.statemachine.statemachine.Transition#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(State value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(Event)
   * @see org.xtext.example.statemachine.statemachine.StatemachinePackage#getTransition_Event()
   * @model
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link org.xtext.example.statemachine.statemachine.Transition#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(State)
   * @see org.xtext.example.statemachine.statemachine.StatemachinePackage#getTransition_To()
   * @model
   * @generated
   */
  State getTo();

  /**
   * Sets the value of the '{@link org.xtext.example.statemachine.statemachine.Transition#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(State value);

} // Transition
