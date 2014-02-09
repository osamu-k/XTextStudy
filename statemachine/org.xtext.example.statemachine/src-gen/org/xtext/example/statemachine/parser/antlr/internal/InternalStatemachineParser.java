package org.xtext.example.statemachine.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.statemachine.services.StatemachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStatemachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'statemachine'", "'{'", "'states'", "'}'", "'events'", "'transitions'", "'initialState'", "'*'", "'->'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalStatemachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStatemachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStatemachineParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g"; }



     	private StatemachineGrammarAccess grammarAccess;
     	
        public InternalStatemachineParser(TokenStream input, StatemachineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Statemachine";	
       	}
       	
       	@Override
       	protected StatemachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStatemachine"
    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:67:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:68:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:69:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine75);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:76:1: ruleStatemachine returns [EObject current=null] : (otherlv_0= 'statemachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'events' otherlv_8= '{' ( (lv_events_9_0= ruleEvent ) )* otherlv_10= '}' otherlv_11= 'transitions' otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) )* otherlv_14= '}' otherlv_15= 'initialState' ( (otherlv_16= RULE_ID ) ) otherlv_17= '}' ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_states_5_0 = null;

        EObject lv_events_9_0 = null;

        EObject lv_transitions_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:79:28: ( (otherlv_0= 'statemachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'events' otherlv_8= '{' ( (lv_events_9_0= ruleEvent ) )* otherlv_10= '}' otherlv_11= 'transitions' otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) )* otherlv_14= '}' otherlv_15= 'initialState' ( (otherlv_16= RULE_ID ) ) otherlv_17= '}' ) )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:80:1: (otherlv_0= 'statemachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'events' otherlv_8= '{' ( (lv_events_9_0= ruleEvent ) )* otherlv_10= '}' otherlv_11= 'transitions' otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) )* otherlv_14= '}' otherlv_15= 'initialState' ( (otherlv_16= RULE_ID ) ) otherlv_17= '}' )
            {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:80:1: (otherlv_0= 'statemachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'events' otherlv_8= '{' ( (lv_events_9_0= ruleEvent ) )* otherlv_10= '}' otherlv_11= 'transitions' otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) )* otherlv_14= '}' otherlv_15= 'initialState' ( (otherlv_16= RULE_ID ) ) otherlv_17= '}' )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:80:3: otherlv_0= 'statemachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'events' otherlv_8= '{' ( (lv_events_9_0= ruleEvent ) )* otherlv_10= '}' otherlv_11= 'transitions' otherlv_12= '{' ( (lv_transitions_13_0= ruleTransition ) )* otherlv_14= '}' otherlv_15= 'initialState' ( (otherlv_16= RULE_ID ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleStatemachine122); 

                	newLeafNode(otherlv_0, grammarAccess.getStatemachineAccess().getStatemachineKeyword_0());
                
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatemachine139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStatemachineAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStatemachineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine156); 

                	newLeafNode(otherlv_2, grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStatemachine168); 

                	newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getStatesKeyword_3());
                
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine180); 

                	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:114:1: ( (lv_states_5_0= ruleState ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:115:1: (lv_states_5_0= ruleState )
            	    {
            	    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:115:1: (lv_states_5_0= ruleState )
            	    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:116:3: lv_states_5_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStatemachine201);
            	    lv_states_5_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_5_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleStatemachine214); 

                	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleStatemachine226); 

                	newLeafNode(otherlv_7, grammarAccess.getStatemachineAccess().getEventsKeyword_7());
                
            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine238); 

                	newLeafNode(otherlv_8, grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_8());
                
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:144:1: ( (lv_events_9_0= ruleEvent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:145:1: (lv_events_9_0= ruleEvent )
            	    {
            	    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:145:1: (lv_events_9_0= ruleEvent )
            	    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:146:3: lv_events_9_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleStatemachine259);
            	    lv_events_9_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_9_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleStatemachine272); 

                	newLeafNode(otherlv_10, grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleStatemachine284); 

                	newLeafNode(otherlv_11, grammarAccess.getStatemachineAccess().getTransitionsKeyword_11());
                
            otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine296); 

                	newLeafNode(otherlv_12, grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_12());
                
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:174:1: ( (lv_transitions_13_0= ruleTransition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:175:1: (lv_transitions_13_0= ruleTransition )
            	    {
            	    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:175:1: (lv_transitions_13_0= ruleTransition )
            	    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:176:3: lv_transitions_13_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleStatemachine317);
            	    lv_transitions_13_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_13_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_14=(Token)match(input,14,FOLLOW_14_in_ruleStatemachine330); 

                	newLeafNode(otherlv_14, grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_14());
                
            otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleStatemachine342); 

                	newLeafNode(otherlv_15, grammarAccess.getStatemachineAccess().getInitialStateKeyword_15());
                
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:200:1: ( (otherlv_16= RULE_ID ) )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:201:1: (otherlv_16= RULE_ID )
            {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:201:1: (otherlv_16= RULE_ID )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:202:3: otherlv_16= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStatemachineRule());
            	        }
                    
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatemachine362); 

            		newLeafNode(otherlv_16, grammarAccess.getStatemachineAccess().getInitialiStateStateCrossReference_16_0()); 
            	

            }


            }

            otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleStatemachine374); 

                	newLeafNode(otherlv_17, grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_17());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleState"
    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:225:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:226:2: (iv_ruleState= ruleState EOF )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:227:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState410);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState420); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:234:1: ruleState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:237:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:238:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:238:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:239:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:239:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:240:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState461); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:264:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:265:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:266:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent501);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent511); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:273:1: ruleEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:276:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:277:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:277:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:278:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:278:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:279:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent552); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleTransition"
    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:303:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:304:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:305:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition592);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition602); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:312:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:315:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:316:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:316:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:316:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) )
            {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:316:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:317:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:317:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:318:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition647); 

            		newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleTransition659); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getAsteriskKeyword_1());
                
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:333:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:334:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:334:1: (otherlv_2= RULE_ID )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:335:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition679); 

            		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getEventEventCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleTransition691); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:350:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:351:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:351:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.statemachine/src-gen/org/xtext/example/statemachine/parser/antlr/internal/InternalStatemachine.g:352:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition711); 

            		newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getToStateCrossReference_4_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStatemachine122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatemachine139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine156 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStatemachine168 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine180 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleState_in_ruleStatemachine201 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleStatemachine214 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStatemachine226 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine238 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatemachine259 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleStatemachine272 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStatemachine284 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine296 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleStatemachine317 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleStatemachine330 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStatemachine342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatemachine362 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStatemachine374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition647 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTransition659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition679 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTransition691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition711 = new BitSet(new long[]{0x0000000000000002L});

}