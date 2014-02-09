/**
 */
package org.xtext.example.statemachine.statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.statemachine.statemachine.Event;
import org.xtext.example.statemachine.statemachine.State;
import org.xtext.example.statemachine.statemachine.Statemachine;
import org.xtext.example.statemachine.statemachine.StatemachinePackage;
import org.xtext.example.statemachine.statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statemachine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.statemachine.statemachine.impl.StatemachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.statemachine.statemachine.impl.StatemachineImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.xtext.example.statemachine.statemachine.impl.StatemachineImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.xtext.example.statemachine.statemachine.impl.StatemachineImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.xtext.example.statemachine.statemachine.impl.StatemachineImpl#getInitialiState <em>Initiali State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatemachineImpl extends MinimalEObjectImpl.Container implements Statemachine
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;

  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> events;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> transitions;

  /**
   * The cached value of the '{@link #getInitialiState() <em>Initiali State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialiState()
   * @generated
   * @ordered
   */
  protected State initialiState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatemachineImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StatemachinePackage.Literals.STATEMACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATEMACHINE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<State>(State.class, this, StatemachinePackage.STATEMACHINE__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<Event>(Event.class, this, StatemachinePackage.STATEMACHINE__EVENTS);
    }
    return events;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getTransitions()
  {
    if (transitions == null)
    {
      transitions = new EObjectContainmentEList<Transition>(Transition.class, this, StatemachinePackage.STATEMACHINE__TRANSITIONS);
    }
    return transitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getInitialiState()
  {
    if (initialiState != null && initialiState.eIsProxy())
    {
      InternalEObject oldInitialiState = (InternalEObject)initialiState;
      initialiState = (State)eResolveProxy(oldInitialiState);
      if (initialiState != oldInitialiState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.STATEMACHINE__INITIALI_STATE, oldInitialiState, initialiState));
      }
    }
    return initialiState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetInitialiState()
  {
    return initialiState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialiState(State newInitialiState)
  {
    State oldInitialiState = initialiState;
    initialiState = newInitialiState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATEMACHINE__INITIALI_STATE, oldInitialiState, initialiState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StatemachinePackage.STATEMACHINE__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
      case StatemachinePackage.STATEMACHINE__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
      case StatemachinePackage.STATEMACHINE__TRANSITIONS:
        return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StatemachinePackage.STATEMACHINE__NAME:
        return getName();
      case StatemachinePackage.STATEMACHINE__STATES:
        return getStates();
      case StatemachinePackage.STATEMACHINE__EVENTS:
        return getEvents();
      case StatemachinePackage.STATEMACHINE__TRANSITIONS:
        return getTransitions();
      case StatemachinePackage.STATEMACHINE__INITIALI_STATE:
        if (resolve) return getInitialiState();
        return basicGetInitialiState();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StatemachinePackage.STATEMACHINE__NAME:
        setName((String)newValue);
        return;
      case StatemachinePackage.STATEMACHINE__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>)newValue);
        return;
      case StatemachinePackage.STATEMACHINE__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends Event>)newValue);
        return;
      case StatemachinePackage.STATEMACHINE__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection<? extends Transition>)newValue);
        return;
      case StatemachinePackage.STATEMACHINE__INITIALI_STATE:
        setInitialiState((State)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StatemachinePackage.STATEMACHINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StatemachinePackage.STATEMACHINE__STATES:
        getStates().clear();
        return;
      case StatemachinePackage.STATEMACHINE__EVENTS:
        getEvents().clear();
        return;
      case StatemachinePackage.STATEMACHINE__TRANSITIONS:
        getTransitions().clear();
        return;
      case StatemachinePackage.STATEMACHINE__INITIALI_STATE:
        setInitialiState((State)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StatemachinePackage.STATEMACHINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StatemachinePackage.STATEMACHINE__STATES:
        return states != null && !states.isEmpty();
      case StatemachinePackage.STATEMACHINE__EVENTS:
        return events != null && !events.isEmpty();
      case StatemachinePackage.STATEMACHINE__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
      case StatemachinePackage.STATEMACHINE__INITIALI_STATE:
        return initialiState != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StatemachineImpl
