package org.xtext.example.statemachine.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.statemachine.services.StatemachineGrammarAccess;
import org.xtext.example.statemachine.statemachine.Event;
import org.xtext.example.statemachine.statemachine.State;
import org.xtext.example.statemachine.statemachine.Statemachine;
import org.xtext.example.statemachine.statemachine.StatemachinePackage;
import org.xtext.example.statemachine.statemachine.Transition;

@SuppressWarnings("all")
public class StatemachineSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StatemachineGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == StatemachinePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StatemachinePackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case StatemachinePackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case StatemachinePackage.STATEMACHINE:
				if(context == grammarAccess.getStatemachineRule()) {
					sequence_Statemachine(context, (Statemachine) semanticObject); 
					return; 
				}
				else break;
			case StatemachinePackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.EVENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.EVENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.STATE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID states+=State* events+=Event* transitions+=Transition* initialiState=[State|ID])
	 */
	protected void sequence_Statemachine(EObject context, Statemachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (from=[State|ID] event=[Event|ID] to=[State|ID])
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.TRANSITION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.TRANSITION__FROM));
			if(transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.TRANSITION__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.TRANSITION__EVENT));
			if(transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.TRANSITION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.TRANSITION__TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionAccess().getFromStateIDTerminalRuleCall_0_0_1(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_2_0_1(), semanticObject.getEvent());
		feeder.accept(grammarAccess.getTransitionAccess().getToStateIDTerminalRuleCall_4_0_1(), semanticObject.getTo());
		feeder.finish();
	}
}
