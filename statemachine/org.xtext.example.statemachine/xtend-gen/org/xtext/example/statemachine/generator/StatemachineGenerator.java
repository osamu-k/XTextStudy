/**
 * generated by Xtext
 */
package org.xtext.example.statemachine.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.statemachine.statemachine.Event;
import org.xtext.example.statemachine.statemachine.State;
import org.xtext.example.statemachine.statemachine.Statemachine;
import org.xtext.example.statemachine.statemachine.Transition;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class StatemachineGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Statemachine> _filter = Iterables.<Statemachine>filter(_iterable, Statemachine.class);
    for (final Statemachine e : _filter) {
      {
        String _name = e.getName();
        String _string = _name.toString();
        String _plus = (_string + ".h");
        CharSequence _compileH = this.compileH(e);
        fsa.generateFile(_plus, _compileH);
        String _name_1 = e.getName();
        String _string_1 = _name_1.toString();
        String _plus_1 = (_string_1 + ".c");
        CharSequence _compileC = this.compileC(e);
        fsa.generateFile(_plus_1, _compileC);
      }
    }
  }
  
  public CharSequence compileH(final Statemachine stm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// definition of states");
    _builder.newLine();
    _builder.append("typedef enum {");
    _builder.newLine();
    {
      EList<State> _states = stm.getStates();
      for(final State s : _states) {
        _builder.append("\t");
        String _name = s.getName();
        _builder.append(_name, "\t");
        {
          EList<State> _states_1 = stm.getStates();
          State _last = IterableExtensions.<State>last(_states_1);
          boolean _notEquals = (!Objects.equal(s, _last));
          if (_notEquals) {
            _builder.append(",");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("} state_t;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// definition of events");
    _builder.newLine();
    _builder.append("typedef enum {");
    _builder.newLine();
    {
      EList<Event> _events = stm.getEvents();
      for(final Event e : _events) {
        _builder.append("\t");
        String _name_1 = e.getName();
        _builder.append(_name_1, "\t");
        {
          EList<Event> _events_1 = stm.getEvents();
          Event _last_1 = IterableExtensions.<Event>last(_events_1);
          boolean _notEquals_1 = (!Objects.equal(e, _last_1));
          if (_notEquals_1) {
            _builder.append(",");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("} event_t;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// function prototypes");
    _builder.newLine();
    _builder.append("void init();");
    _builder.newLine();
    _builder.append("int next( event_t e );");
    _builder.newLine();
    _builder.append("state_t current_state();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// state entering functions");
    _builder.newLine();
    {
      EList<State> _states_2 = stm.getStates();
      for(final State s_1 : _states_2) {
        _builder.append("void enter_");
        String _name_2 = s_1.getName();
        String _string = _name_2.toString();
        _builder.append(_string, "");
        _builder.append("( event_t e );");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("// state exiting functions");
    _builder.newLine();
    {
      EList<State> _states_3 = stm.getStates();
      for(final State s_2 : _states_3) {
        _builder.append("void exit_");
        String _name_3 = s_2.getName();
        String _string_1 = _name_3.toString();
        _builder.append(_string_1, "");
        _builder.append("( event_t e );");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("// transition functions");
    _builder.newLine();
    {
      EList<Transition> _transitions = stm.getTransitions();
      for(final Transition t : _transitions) {
        _builder.append("void trans_");
        State _from = t.getFrom();
        String _name_4 = _from.getName();
        String _string_2 = _name_4.toString();
        _builder.append(_string_2, "");
        _builder.append("_");
        Event _event = t.getEvent();
        String _name_5 = _event.getName();
        String _string_3 = _name_5.toString();
        _builder.append(_string_3, "");
        _builder.append("_");
        State _to = t.getTo();
        String _name_6 = _to.getName();
        String _string_4 = _name_6.toString();
        _builder.append(_string_4, "");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compileC(final Statemachine stm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include \"");
    String _name = stm.getName();
    String _string = _name.toString();
    _builder.append(_string, "");
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("static state_t state;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("typedef struct {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("state_t state;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void (*enter_func)( event_t );");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void (*exir_func)( event_t );");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("} state_info_t;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("static state_info_t state_info_table[] = {");
    _builder.newLine();
    {
      EList<State> _states = stm.getStates();
      for(final State s : _states) {
        _builder.append("\t");
        _builder.append("{ ");
        String _name_1 = s.getName();
        String _string_1 = _name_1.toString();
        _builder.append(_string_1, "\t");
        _builder.append(", enter_");
        String _name_2 = s.getName();
        String _string_2 = _name_2.toString();
        _builder.append(_string_2, "\t");
        _builder.append(", exit_");
        String _name_3 = s.getName();
        String _string_3 = _name_3.toString();
        _builder.append(_string_3, "\t");
        _builder.append(" }, ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("typedef struct {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("state_t from;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event_t event;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("state_t to;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("void (*trans_func)();");
    _builder.newLine();
    _builder.append("} transition_t;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("static transition_t transition_table[] = {");
    _builder.newLine();
    {
      EList<Transition> _transitions = stm.getTransitions();
      for(final Transition t : _transitions) {
        _builder.append("\t");
        _builder.append("{ ");
        State _from = t.getFrom();
        String _name_4 = _from.getName();
        String _string_4 = _name_4.toString();
        _builder.append(_string_4, "\t");
        _builder.append(", ");
        Event _event = t.getEvent();
        String _name_5 = _event.getName();
        String _string_5 = _name_5.toString();
        _builder.append(_string_5, "\t");
        _builder.append(", ");
        State _to = t.getTo();
        String _name_6 = _to.getName();
        String _string_6 = _name_6.toString();
        _builder.append(_string_6, "\t");
        _builder.append(", trans_");
        State _from_1 = t.getFrom();
        String _name_7 = _from_1.getName();
        String _string_7 = _name_7.toString();
        _builder.append(_string_7, "\t");
        _builder.append("_");
        Event _event_1 = t.getEvent();
        String _name_8 = _event_1.getName();
        String _string_8 = _name_8.toString();
        _builder.append(_string_8, "\t");
        _builder.append("_");
        State _to_1 = t.getTo();
        String _name_9 = _to_1.getName();
        String _string_9 = _name_9.toString();
        _builder.append(_string_9, "\t");
        _builder.append(" },");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void init()");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("state = ");
    State _initialiState = stm.getInitialiState();
    String _name_10 = _initialiState.getName();
    String _string_10 = _name_10.toString();
    _builder.append(_string_10, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("int next( event_t e )");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for( int i = 0; i < sizeof(transition_table)/sizeof(transition_table[0]; i++ ){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if( (transition_table[i].from == _state) && (transition_table[i].event == e) ){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("for( int idx_state= 0; idx_state < sizeof(state_info_t)/sizeof(state_info_t[0]); idx_state++ ){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if( state_info_t[idx_state].state == transition_table[i].from ){");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("(*(state_info_t[idx_state].exit_func))( e );");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("state = transition_table[i].to;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("(*(transition_table[i].trans_func))();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("for( int idx_state= 0; idx_state < sizeof(state_info_t)/sizeof(state_info_t[0]); idx_state++ ){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if( state_info_t[idx_state].state == transition_table[i].to ){");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("(*(state_info_t[idx_state].exit_func))( e );");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return 1;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("state_t current_state()");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return state;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
