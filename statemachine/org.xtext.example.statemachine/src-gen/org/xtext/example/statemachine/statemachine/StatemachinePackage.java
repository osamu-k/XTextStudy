/**
 */
package org.xtext.example.statemachine.statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.statemachine.statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public interface StatemachinePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "statemachine";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/statemachine/Statemachine";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "statemachine";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StatemachinePackage eINSTANCE = org.xtext.example.statemachine.statemachine.impl.StatemachinePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.statemachine.statemachine.impl.StatemachineImpl <em>Statemachine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.statemachine.statemachine.impl.StatemachineImpl
   * @see org.xtext.example.statemachine.statemachine.impl.StatemachinePackageImpl#getStatemachine()
   * @generated
   */
  int STATEMACHINE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__NAME = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__STATES = 1;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__EVENTS = 2;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__TRANSITIONS = 3;

  /**
   * The feature id for the '<em><b>Initiali State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__INITIALI_STATE = 4;

  /**
   * The number of structural features of the '<em>Statemachine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.statemachine.statemachine.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.statemachine.statemachine.impl.StateImpl
   * @see org.xtext.example.statemachine.statemachine.impl.StatemachinePackageImpl#getState()
   * @generated
   */
  int STATE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.statemachine.statemachine.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.statemachine.statemachine.impl.EventImpl
   * @see org.xtext.example.statemachine.statemachine.impl.StatemachinePackageImpl#getEvent()
   * @generated
   */
  int EVENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.statemachine.statemachine.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.statemachine.statemachine.impl.TransitionImpl
   * @see org.xtext.example.statemachine.statemachine.impl.StatemachinePackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 3;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__FROM = 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = 1;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TO = 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.example.statemachine.statemachine.Statemachine <em>Statemachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statemachine</em>'.
   * @see org.xtext.example.statemachine.statemachine.Statemachine
   * @generated
   */
  EClass getStatemachine();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.statemachine.statemachine.Statemachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.statemachine.statemachine.Statemachine#getName()
   * @see #getStatemachine()
   * @generated
   */
  EAttribute getStatemachine_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.statemachine.statemachine.Statemachine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see org.xtext.example.statemachine.statemachine.Statemachine#getStates()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_States();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.statemachine.statemachine.Statemachine#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see org.xtext.example.statemachine.statemachine.Statemachine#getEvents()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Events();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.statemachine.statemachine.Statemachine#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see org.xtext.example.statemachine.statemachine.Statemachine#getTransitions()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Transitions();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.statemachine.statemachine.Statemachine#getInitialiState <em>Initiali State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Initiali State</em>'.
   * @see org.xtext.example.statemachine.statemachine.Statemachine#getInitialiState()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_InitialiState();

  /**
   * Returns the meta object for class '{@link org.xtext.example.statemachine.statemachine.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.xtext.example.statemachine.statemachine.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.statemachine.statemachine.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.statemachine.statemachine.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.statemachine.statemachine.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.xtext.example.statemachine.statemachine.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.statemachine.statemachine.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.statemachine.statemachine.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.statemachine.statemachine.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.xtext.example.statemachine.statemachine.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.statemachine.statemachine.Transition#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see org.xtext.example.statemachine.statemachine.Transition#getFrom()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_From();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.statemachine.statemachine.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see org.xtext.example.statemachine.statemachine.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Event();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.statemachine.statemachine.Transition#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see org.xtext.example.statemachine.statemachine.Transition#getTo()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_To();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StatemachineFactory getStatemachineFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.statemachine.statemachine.impl.StatemachineImpl <em>Statemachine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.statemachine.statemachine.impl.StatemachineImpl
     * @see org.xtext.example.statemachine.statemachine.impl.StatemachinePackageImpl#getStatemachine()
     * @generated
     */
    EClass STATEMACHINE = eINSTANCE.getStatemachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMACHINE__NAME = eINSTANCE.getStatemachine_Name();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__STATES = eINSTANCE.getStatemachine_States();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__EVENTS = eINSTANCE.getStatemachine_Events();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__TRANSITIONS = eINSTANCE.getStatemachine_Transitions();

    /**
     * The meta object literal for the '<em><b>Initiali State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__INITIALI_STATE = eINSTANCE.getStatemachine_InitialiState();

    /**
     * The meta object literal for the '{@link org.xtext.example.statemachine.statemachine.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.statemachine.statemachine.impl.StateImpl
     * @see org.xtext.example.statemachine.statemachine.impl.StatemachinePackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.statemachine.statemachine.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.statemachine.statemachine.impl.EventImpl
     * @see org.xtext.example.statemachine.statemachine.impl.StatemachinePackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.statemachine.statemachine.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.statemachine.statemachine.impl.TransitionImpl
     * @see org.xtext.example.statemachine.statemachine.impl.StatemachinePackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__FROM = eINSTANCE.getTransition_From();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TO = eINSTANCE.getTransition_To();

  }

} //StatemachinePackage
