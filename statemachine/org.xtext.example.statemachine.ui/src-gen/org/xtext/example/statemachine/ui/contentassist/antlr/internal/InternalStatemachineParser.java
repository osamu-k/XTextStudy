package org.xtext.example.statemachine.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.statemachine.services.StatemachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStatemachineParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g"; }


     
     	private StatemachineGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(StatemachineGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleStatemachine"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:60:1: entryRuleStatemachine : ruleStatemachine EOF ;
    public final void entryRuleStatemachine() throws RecognitionException {
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:61:1: ( ruleStatemachine EOF )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:62:1: ruleStatemachine EOF
            {
             before(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine61);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStatemachineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:69:1: ruleStatemachine : ( ( rule__Statemachine__Group__0 ) ) ;
    public final void ruleStatemachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:73:2: ( ( ( rule__Statemachine__Group__0 ) ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:74:1: ( ( rule__Statemachine__Group__0 ) )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:74:1: ( ( rule__Statemachine__Group__0 ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:75:1: ( rule__Statemachine__Group__0 )
            {
             before(grammarAccess.getStatemachineAccess().getGroup()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:76:1: ( rule__Statemachine__Group__0 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:76:2: rule__Statemachine__Group__0
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine94);
            rule__Statemachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleState"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:88:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:89:1: ( ruleState EOF )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:90:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState121);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:97:1: ruleState : ( ( rule__State__NameAssignment ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:101:2: ( ( ( rule__State__NameAssignment ) ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:102:1: ( ( rule__State__NameAssignment ) )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:102:1: ( ( rule__State__NameAssignment ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:103:1: ( rule__State__NameAssignment )
            {
             before(grammarAccess.getStateAccess().getNameAssignment()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:104:1: ( rule__State__NameAssignment )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:104:2: rule__State__NameAssignment
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_in_ruleState154);
            rule__State__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:116:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:117:1: ( ruleEvent EOF )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:118:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent181);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:125:1: ruleEvent : ( ( rule__Event__NameAssignment ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:129:2: ( ( ( rule__Event__NameAssignment ) ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:130:1: ( ( rule__Event__NameAssignment ) )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:130:1: ( ( rule__Event__NameAssignment ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:131:1: ( rule__Event__NameAssignment )
            {
             before(grammarAccess.getEventAccess().getNameAssignment()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:132:1: ( rule__Event__NameAssignment )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:132:2: rule__Event__NameAssignment
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_in_ruleEvent214);
            rule__Event__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleTransition"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:144:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:145:1: ( ruleTransition EOF )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:146:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition241);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:153:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:157:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:158:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:158:1: ( ( rule__Transition__Group__0 ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:159:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:160:1: ( rule__Transition__Group__0 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:160:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition274);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "rule__Statemachine__Group__0"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:174:1: rule__Statemachine__Group__0 : rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 ;
    public final void rule__Statemachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:178:1: ( rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:179:2: rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__0308);
            rule__Statemachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__0311);
            rule__Statemachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0"


    // $ANTLR start "rule__Statemachine__Group__0__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:186:1: rule__Statemachine__Group__0__Impl : ( 'statemachine' ) ;
    public final void rule__Statemachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:190:1: ( ( 'statemachine' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:191:1: ( 'statemachine' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:191:1: ( 'statemachine' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:192:1: 'statemachine'
            {
             before(grammarAccess.getStatemachineAccess().getStatemachineKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Statemachine__Group__0__Impl339); 
             after(grammarAccess.getStatemachineAccess().getStatemachineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0__Impl"


    // $ANTLR start "rule__Statemachine__Group__1"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:205:1: rule__Statemachine__Group__1 : rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 ;
    public final void rule__Statemachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:209:1: ( rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:210:2: rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__1370);
            rule__Statemachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__1373);
            rule__Statemachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1"


    // $ANTLR start "rule__Statemachine__Group__1__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:217:1: rule__Statemachine__Group__1__Impl : ( ( rule__Statemachine__NameAssignment_1 ) ) ;
    public final void rule__Statemachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:221:1: ( ( ( rule__Statemachine__NameAssignment_1 ) ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:222:1: ( ( rule__Statemachine__NameAssignment_1 ) )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:222:1: ( ( rule__Statemachine__NameAssignment_1 ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:223:1: ( rule__Statemachine__NameAssignment_1 )
            {
             before(grammarAccess.getStatemachineAccess().getNameAssignment_1()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:224:1: ( rule__Statemachine__NameAssignment_1 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:224:2: rule__Statemachine__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Statemachine__NameAssignment_1_in_rule__Statemachine__Group__1__Impl400);
            rule__Statemachine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1__Impl"


    // $ANTLR start "rule__Statemachine__Group__2"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:234:1: rule__Statemachine__Group__2 : rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 ;
    public final void rule__Statemachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:238:1: ( rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:239:2: rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__2430);
            rule__Statemachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__2433);
            rule__Statemachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2"


    // $ANTLR start "rule__Statemachine__Group__2__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:246:1: rule__Statemachine__Group__2__Impl : ( '{' ) ;
    public final void rule__Statemachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:250:1: ( ( '{' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:251:1: ( '{' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:251:1: ( '{' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:252:1: '{'
            {
             before(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Statemachine__Group__2__Impl461); 
             after(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2__Impl"


    // $ANTLR start "rule__Statemachine__Group__3"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:265:1: rule__Statemachine__Group__3 : rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 ;
    public final void rule__Statemachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:269:1: ( rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:270:2: rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__3492);
            rule__Statemachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__3495);
            rule__Statemachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__3"


    // $ANTLR start "rule__Statemachine__Group__3__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:277:1: rule__Statemachine__Group__3__Impl : ( 'states' ) ;
    public final void rule__Statemachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:281:1: ( ( 'states' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:282:1: ( 'states' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:282:1: ( 'states' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:283:1: 'states'
            {
             before(grammarAccess.getStatemachineAccess().getStatesKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Statemachine__Group__3__Impl523); 
             after(grammarAccess.getStatemachineAccess().getStatesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__3__Impl"


    // $ANTLR start "rule__Statemachine__Group__4"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:296:1: rule__Statemachine__Group__4 : rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5 ;
    public final void rule__Statemachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:300:1: ( rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:301:2: rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__4554);
            rule__Statemachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__5_in_rule__Statemachine__Group__4557);
            rule__Statemachine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__4"


    // $ANTLR start "rule__Statemachine__Group__4__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:308:1: rule__Statemachine__Group__4__Impl : ( '{' ) ;
    public final void rule__Statemachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:312:1: ( ( '{' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:313:1: ( '{' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:313:1: ( '{' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:314:1: '{'
            {
             before(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__Statemachine__Group__4__Impl585); 
             after(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__4__Impl"


    // $ANTLR start "rule__Statemachine__Group__5"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:327:1: rule__Statemachine__Group__5 : rule__Statemachine__Group__5__Impl rule__Statemachine__Group__6 ;
    public final void rule__Statemachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:331:1: ( rule__Statemachine__Group__5__Impl rule__Statemachine__Group__6 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:332:2: rule__Statemachine__Group__5__Impl rule__Statemachine__Group__6
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__5__Impl_in_rule__Statemachine__Group__5616);
            rule__Statemachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__6_in_rule__Statemachine__Group__5619);
            rule__Statemachine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__5"


    // $ANTLR start "rule__Statemachine__Group__5__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:339:1: rule__Statemachine__Group__5__Impl : ( ( rule__Statemachine__StatesAssignment_5 )* ) ;
    public final void rule__Statemachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:343:1: ( ( ( rule__Statemachine__StatesAssignment_5 )* ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:344:1: ( ( rule__Statemachine__StatesAssignment_5 )* )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:344:1: ( ( rule__Statemachine__StatesAssignment_5 )* )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:345:1: ( rule__Statemachine__StatesAssignment_5 )*
            {
             before(grammarAccess.getStatemachineAccess().getStatesAssignment_5()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:346:1: ( rule__Statemachine__StatesAssignment_5 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:346:2: rule__Statemachine__StatesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__StatesAssignment_5_in_rule__Statemachine__Group__5__Impl646);
            	    rule__Statemachine__StatesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getStatesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__5__Impl"


    // $ANTLR start "rule__Statemachine__Group__6"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:356:1: rule__Statemachine__Group__6 : rule__Statemachine__Group__6__Impl rule__Statemachine__Group__7 ;
    public final void rule__Statemachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:360:1: ( rule__Statemachine__Group__6__Impl rule__Statemachine__Group__7 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:361:2: rule__Statemachine__Group__6__Impl rule__Statemachine__Group__7
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__6__Impl_in_rule__Statemachine__Group__6677);
            rule__Statemachine__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__7_in_rule__Statemachine__Group__6680);
            rule__Statemachine__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__6"


    // $ANTLR start "rule__Statemachine__Group__6__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:368:1: rule__Statemachine__Group__6__Impl : ( '}' ) ;
    public final void rule__Statemachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:372:1: ( ( '}' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:373:1: ( '}' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:373:1: ( '}' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:374:1: '}'
            {
             before(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Statemachine__Group__6__Impl708); 
             after(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__6__Impl"


    // $ANTLR start "rule__Statemachine__Group__7"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:387:1: rule__Statemachine__Group__7 : rule__Statemachine__Group__7__Impl rule__Statemachine__Group__8 ;
    public final void rule__Statemachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:391:1: ( rule__Statemachine__Group__7__Impl rule__Statemachine__Group__8 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:392:2: rule__Statemachine__Group__7__Impl rule__Statemachine__Group__8
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__7__Impl_in_rule__Statemachine__Group__7739);
            rule__Statemachine__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__8_in_rule__Statemachine__Group__7742);
            rule__Statemachine__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__7"


    // $ANTLR start "rule__Statemachine__Group__7__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:399:1: rule__Statemachine__Group__7__Impl : ( 'events' ) ;
    public final void rule__Statemachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:403:1: ( ( 'events' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:404:1: ( 'events' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:404:1: ( 'events' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:405:1: 'events'
            {
             before(grammarAccess.getStatemachineAccess().getEventsKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__Statemachine__Group__7__Impl770); 
             after(grammarAccess.getStatemachineAccess().getEventsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__7__Impl"


    // $ANTLR start "rule__Statemachine__Group__8"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:418:1: rule__Statemachine__Group__8 : rule__Statemachine__Group__8__Impl rule__Statemachine__Group__9 ;
    public final void rule__Statemachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:422:1: ( rule__Statemachine__Group__8__Impl rule__Statemachine__Group__9 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:423:2: rule__Statemachine__Group__8__Impl rule__Statemachine__Group__9
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__8__Impl_in_rule__Statemachine__Group__8801);
            rule__Statemachine__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__9_in_rule__Statemachine__Group__8804);
            rule__Statemachine__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__8"


    // $ANTLR start "rule__Statemachine__Group__8__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:430:1: rule__Statemachine__Group__8__Impl : ( '{' ) ;
    public final void rule__Statemachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:434:1: ( ( '{' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:435:1: ( '{' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:435:1: ( '{' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:436:1: '{'
            {
             before(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,12,FOLLOW_12_in_rule__Statemachine__Group__8__Impl832); 
             after(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__8__Impl"


    // $ANTLR start "rule__Statemachine__Group__9"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:449:1: rule__Statemachine__Group__9 : rule__Statemachine__Group__9__Impl rule__Statemachine__Group__10 ;
    public final void rule__Statemachine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:453:1: ( rule__Statemachine__Group__9__Impl rule__Statemachine__Group__10 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:454:2: rule__Statemachine__Group__9__Impl rule__Statemachine__Group__10
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__9__Impl_in_rule__Statemachine__Group__9863);
            rule__Statemachine__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__10_in_rule__Statemachine__Group__9866);
            rule__Statemachine__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__9"


    // $ANTLR start "rule__Statemachine__Group__9__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:461:1: rule__Statemachine__Group__9__Impl : ( ( rule__Statemachine__EventsAssignment_9 )* ) ;
    public final void rule__Statemachine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:465:1: ( ( ( rule__Statemachine__EventsAssignment_9 )* ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:466:1: ( ( rule__Statemachine__EventsAssignment_9 )* )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:466:1: ( ( rule__Statemachine__EventsAssignment_9 )* )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:467:1: ( rule__Statemachine__EventsAssignment_9 )*
            {
             before(grammarAccess.getStatemachineAccess().getEventsAssignment_9()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:468:1: ( rule__Statemachine__EventsAssignment_9 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:468:2: rule__Statemachine__EventsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__EventsAssignment_9_in_rule__Statemachine__Group__9__Impl893);
            	    rule__Statemachine__EventsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getEventsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__9__Impl"


    // $ANTLR start "rule__Statemachine__Group__10"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:478:1: rule__Statemachine__Group__10 : rule__Statemachine__Group__10__Impl rule__Statemachine__Group__11 ;
    public final void rule__Statemachine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:482:1: ( rule__Statemachine__Group__10__Impl rule__Statemachine__Group__11 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:483:2: rule__Statemachine__Group__10__Impl rule__Statemachine__Group__11
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__10__Impl_in_rule__Statemachine__Group__10924);
            rule__Statemachine__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__11_in_rule__Statemachine__Group__10927);
            rule__Statemachine__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__10"


    // $ANTLR start "rule__Statemachine__Group__10__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:490:1: rule__Statemachine__Group__10__Impl : ( '}' ) ;
    public final void rule__Statemachine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:494:1: ( ( '}' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:495:1: ( '}' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:495:1: ( '}' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:496:1: '}'
            {
             before(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_10()); 
            match(input,14,FOLLOW_14_in_rule__Statemachine__Group__10__Impl955); 
             after(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__10__Impl"


    // $ANTLR start "rule__Statemachine__Group__11"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:509:1: rule__Statemachine__Group__11 : rule__Statemachine__Group__11__Impl rule__Statemachine__Group__12 ;
    public final void rule__Statemachine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:513:1: ( rule__Statemachine__Group__11__Impl rule__Statemachine__Group__12 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:514:2: rule__Statemachine__Group__11__Impl rule__Statemachine__Group__12
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__11__Impl_in_rule__Statemachine__Group__11986);
            rule__Statemachine__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__12_in_rule__Statemachine__Group__11989);
            rule__Statemachine__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__11"


    // $ANTLR start "rule__Statemachine__Group__11__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:521:1: rule__Statemachine__Group__11__Impl : ( 'transitions' ) ;
    public final void rule__Statemachine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:525:1: ( ( 'transitions' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:526:1: ( 'transitions' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:526:1: ( 'transitions' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:527:1: 'transitions'
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsKeyword_11()); 
            match(input,16,FOLLOW_16_in_rule__Statemachine__Group__11__Impl1017); 
             after(grammarAccess.getStatemachineAccess().getTransitionsKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__11__Impl"


    // $ANTLR start "rule__Statemachine__Group__12"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:540:1: rule__Statemachine__Group__12 : rule__Statemachine__Group__12__Impl rule__Statemachine__Group__13 ;
    public final void rule__Statemachine__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:544:1: ( rule__Statemachine__Group__12__Impl rule__Statemachine__Group__13 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:545:2: rule__Statemachine__Group__12__Impl rule__Statemachine__Group__13
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__12__Impl_in_rule__Statemachine__Group__121048);
            rule__Statemachine__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__13_in_rule__Statemachine__Group__121051);
            rule__Statemachine__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__12"


    // $ANTLR start "rule__Statemachine__Group__12__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:552:1: rule__Statemachine__Group__12__Impl : ( '{' ) ;
    public final void rule__Statemachine__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:556:1: ( ( '{' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:557:1: ( '{' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:557:1: ( '{' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:558:1: '{'
            {
             before(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,12,FOLLOW_12_in_rule__Statemachine__Group__12__Impl1079); 
             after(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__12__Impl"


    // $ANTLR start "rule__Statemachine__Group__13"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:571:1: rule__Statemachine__Group__13 : rule__Statemachine__Group__13__Impl rule__Statemachine__Group__14 ;
    public final void rule__Statemachine__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:575:1: ( rule__Statemachine__Group__13__Impl rule__Statemachine__Group__14 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:576:2: rule__Statemachine__Group__13__Impl rule__Statemachine__Group__14
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__13__Impl_in_rule__Statemachine__Group__131110);
            rule__Statemachine__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__14_in_rule__Statemachine__Group__131113);
            rule__Statemachine__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__13"


    // $ANTLR start "rule__Statemachine__Group__13__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:583:1: rule__Statemachine__Group__13__Impl : ( ( rule__Statemachine__TransitionsAssignment_13 )* ) ;
    public final void rule__Statemachine__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:587:1: ( ( ( rule__Statemachine__TransitionsAssignment_13 )* ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:588:1: ( ( rule__Statemachine__TransitionsAssignment_13 )* )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:588:1: ( ( rule__Statemachine__TransitionsAssignment_13 )* )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:589:1: ( rule__Statemachine__TransitionsAssignment_13 )*
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsAssignment_13()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:590:1: ( rule__Statemachine__TransitionsAssignment_13 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:590:2: rule__Statemachine__TransitionsAssignment_13
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__TransitionsAssignment_13_in_rule__Statemachine__Group__13__Impl1140);
            	    rule__Statemachine__TransitionsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getTransitionsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__13__Impl"


    // $ANTLR start "rule__Statemachine__Group__14"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:600:1: rule__Statemachine__Group__14 : rule__Statemachine__Group__14__Impl rule__Statemachine__Group__15 ;
    public final void rule__Statemachine__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:604:1: ( rule__Statemachine__Group__14__Impl rule__Statemachine__Group__15 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:605:2: rule__Statemachine__Group__14__Impl rule__Statemachine__Group__15
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__14__Impl_in_rule__Statemachine__Group__141171);
            rule__Statemachine__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__15_in_rule__Statemachine__Group__141174);
            rule__Statemachine__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__14"


    // $ANTLR start "rule__Statemachine__Group__14__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:612:1: rule__Statemachine__Group__14__Impl : ( '}' ) ;
    public final void rule__Statemachine__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:616:1: ( ( '}' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:617:1: ( '}' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:617:1: ( '}' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:618:1: '}'
            {
             before(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_14()); 
            match(input,14,FOLLOW_14_in_rule__Statemachine__Group__14__Impl1202); 
             after(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__14__Impl"


    // $ANTLR start "rule__Statemachine__Group__15"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:631:1: rule__Statemachine__Group__15 : rule__Statemachine__Group__15__Impl rule__Statemachine__Group__16 ;
    public final void rule__Statemachine__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:635:1: ( rule__Statemachine__Group__15__Impl rule__Statemachine__Group__16 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:636:2: rule__Statemachine__Group__15__Impl rule__Statemachine__Group__16
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__15__Impl_in_rule__Statemachine__Group__151233);
            rule__Statemachine__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__16_in_rule__Statemachine__Group__151236);
            rule__Statemachine__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__15"


    // $ANTLR start "rule__Statemachine__Group__15__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:643:1: rule__Statemachine__Group__15__Impl : ( 'initialState' ) ;
    public final void rule__Statemachine__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:647:1: ( ( 'initialState' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:648:1: ( 'initialState' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:648:1: ( 'initialState' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:649:1: 'initialState'
            {
             before(grammarAccess.getStatemachineAccess().getInitialStateKeyword_15()); 
            match(input,17,FOLLOW_17_in_rule__Statemachine__Group__15__Impl1264); 
             after(grammarAccess.getStatemachineAccess().getInitialStateKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__15__Impl"


    // $ANTLR start "rule__Statemachine__Group__16"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:662:1: rule__Statemachine__Group__16 : rule__Statemachine__Group__16__Impl rule__Statemachine__Group__17 ;
    public final void rule__Statemachine__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:666:1: ( rule__Statemachine__Group__16__Impl rule__Statemachine__Group__17 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:667:2: rule__Statemachine__Group__16__Impl rule__Statemachine__Group__17
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__16__Impl_in_rule__Statemachine__Group__161295);
            rule__Statemachine__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__17_in_rule__Statemachine__Group__161298);
            rule__Statemachine__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__16"


    // $ANTLR start "rule__Statemachine__Group__16__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:674:1: rule__Statemachine__Group__16__Impl : ( ( rule__Statemachine__InitialiStateAssignment_16 ) ) ;
    public final void rule__Statemachine__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:678:1: ( ( ( rule__Statemachine__InitialiStateAssignment_16 ) ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:679:1: ( ( rule__Statemachine__InitialiStateAssignment_16 ) )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:679:1: ( ( rule__Statemachine__InitialiStateAssignment_16 ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:680:1: ( rule__Statemachine__InitialiStateAssignment_16 )
            {
             before(grammarAccess.getStatemachineAccess().getInitialiStateAssignment_16()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:681:1: ( rule__Statemachine__InitialiStateAssignment_16 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:681:2: rule__Statemachine__InitialiStateAssignment_16
            {
            pushFollow(FOLLOW_rule__Statemachine__InitialiStateAssignment_16_in_rule__Statemachine__Group__16__Impl1325);
            rule__Statemachine__InitialiStateAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getInitialiStateAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__16__Impl"


    // $ANTLR start "rule__Statemachine__Group__17"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:691:1: rule__Statemachine__Group__17 : rule__Statemachine__Group__17__Impl ;
    public final void rule__Statemachine__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:695:1: ( rule__Statemachine__Group__17__Impl )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:696:2: rule__Statemachine__Group__17__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__17__Impl_in_rule__Statemachine__Group__171355);
            rule__Statemachine__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__17"


    // $ANTLR start "rule__Statemachine__Group__17__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:702:1: rule__Statemachine__Group__17__Impl : ( '}' ) ;
    public final void rule__Statemachine__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:706:1: ( ( '}' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:707:1: ( '}' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:707:1: ( '}' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:708:1: '}'
            {
             before(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_17()); 
            match(input,14,FOLLOW_14_in_rule__Statemachine__Group__17__Impl1383); 
             after(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__17__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:757:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:761:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:762:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01450);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01453);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:769:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__FromAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:773:1: ( ( ( rule__Transition__FromAssignment_0 ) ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:774:1: ( ( rule__Transition__FromAssignment_0 ) )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:774:1: ( ( rule__Transition__FromAssignment_0 ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:775:1: ( rule__Transition__FromAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getFromAssignment_0()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:776:1: ( rule__Transition__FromAssignment_0 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:776:2: rule__Transition__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__FromAssignment_0_in_rule__Transition__Group__0__Impl1480);
            rule__Transition__FromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:786:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:790:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:791:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11510);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11513);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:798:1: rule__Transition__Group__1__Impl : ( '*' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:802:1: ( ( '*' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:803:1: ( '*' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:803:1: ( '*' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:804:1: '*'
            {
             before(grammarAccess.getTransitionAccess().getAsteriskKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Transition__Group__1__Impl1541); 
             after(grammarAccess.getTransitionAccess().getAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:817:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:821:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:822:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__21572);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__21575);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:829:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__EventAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:833:1: ( ( ( rule__Transition__EventAssignment_2 ) ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:834:1: ( ( rule__Transition__EventAssignment_2 ) )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:834:1: ( ( rule__Transition__EventAssignment_2 ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:835:1: ( rule__Transition__EventAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_2()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:836:1: ( rule__Transition__EventAssignment_2 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:836:2: rule__Transition__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_2_in_rule__Transition__Group__2__Impl1602);
            rule__Transition__EventAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:846:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:850:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:851:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__31632);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__31635);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:858:1: rule__Transition__Group__3__Impl : ( '->' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:862:1: ( ( '->' ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:863:1: ( '->' )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:863:1: ( '->' )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:864:1: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Transition__Group__3__Impl1663); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:877:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:881:1: ( rule__Transition__Group__4__Impl )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:882:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__41694);
            rule__Transition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:888:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__ToAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:892:1: ( ( ( rule__Transition__ToAssignment_4 ) ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:893:1: ( ( rule__Transition__ToAssignment_4 ) )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:893:1: ( ( rule__Transition__ToAssignment_4 ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:894:1: ( rule__Transition__ToAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getToAssignment_4()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:895:1: ( rule__Transition__ToAssignment_4 )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:895:2: rule__Transition__ToAssignment_4
            {
            pushFollow(FOLLOW_rule__Transition__ToAssignment_4_in_rule__Transition__Group__4__Impl1721);
            rule__Transition__ToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getToAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Statemachine__NameAssignment_1"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:916:1: rule__Statemachine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Statemachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:920:1: ( ( RULE_ID ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:921:1: ( RULE_ID )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:921:1: ( RULE_ID )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:922:1: RULE_ID
            {
             before(grammarAccess.getStatemachineAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statemachine__NameAssignment_11766); 
             after(grammarAccess.getStatemachineAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__NameAssignment_1"


    // $ANTLR start "rule__Statemachine__StatesAssignment_5"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:931:1: rule__Statemachine__StatesAssignment_5 : ( ruleState ) ;
    public final void rule__Statemachine__StatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:935:1: ( ( ruleState ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:936:1: ( ruleState )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:936:1: ( ruleState )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:937:1: ruleState
            {
             before(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Statemachine__StatesAssignment_51797);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__StatesAssignment_5"


    // $ANTLR start "rule__Statemachine__EventsAssignment_9"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:946:1: rule__Statemachine__EventsAssignment_9 : ( ruleEvent ) ;
    public final void rule__Statemachine__EventsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:950:1: ( ( ruleEvent ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:951:1: ( ruleEvent )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:951:1: ( ruleEvent )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:952:1: ruleEvent
            {
             before(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Statemachine__EventsAssignment_91828);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__EventsAssignment_9"


    // $ANTLR start "rule__Statemachine__TransitionsAssignment_13"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:961:1: rule__Statemachine__TransitionsAssignment_13 : ( ruleTransition ) ;
    public final void rule__Statemachine__TransitionsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:965:1: ( ( ruleTransition ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:966:1: ( ruleTransition )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:966:1: ( ruleTransition )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:967:1: ruleTransition
            {
             before(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_131859);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getTransitionsTransitionParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__TransitionsAssignment_13"


    // $ANTLR start "rule__Statemachine__InitialiStateAssignment_16"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:976:1: rule__Statemachine__InitialiStateAssignment_16 : ( ( RULE_ID ) ) ;
    public final void rule__Statemachine__InitialiStateAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:980:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:981:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:981:1: ( ( RULE_ID ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:982:1: ( RULE_ID )
            {
             before(grammarAccess.getStatemachineAccess().getInitialiStateStateCrossReference_16_0()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:983:1: ( RULE_ID )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:984:1: RULE_ID
            {
             before(grammarAccess.getStatemachineAccess().getInitialiStateStateIDTerminalRuleCall_16_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statemachine__InitialiStateAssignment_161894); 
             after(grammarAccess.getStatemachineAccess().getInitialiStateStateIDTerminalRuleCall_16_0_1()); 

            }

             after(grammarAccess.getStatemachineAccess().getInitialiStateStateCrossReference_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__InitialiStateAssignment_16"


    // $ANTLR start "rule__State__NameAssignment"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:995:1: rule__State__NameAssignment : ( RULE_ID ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:999:1: ( ( RULE_ID ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1000:1: ( RULE_ID )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1000:1: ( RULE_ID )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1001:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment1929); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment"


    // $ANTLR start "rule__Event__NameAssignment"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1010:1: rule__Event__NameAssignment : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1014:1: ( ( RULE_ID ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1015:1: ( RULE_ID )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1015:1: ( RULE_ID )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1016:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment1960); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment"


    // $ANTLR start "rule__Transition__FromAssignment_0"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1025:1: rule__Transition__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1029:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1030:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1030:1: ( ( RULE_ID ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1031:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1032:1: ( RULE_ID )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1033:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getFromStateIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__FromAssignment_01995); 
             after(grammarAccess.getTransitionAccess().getFromStateIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__FromAssignment_0"


    // $ANTLR start "rule__Transition__EventAssignment_2"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1044:1: rule__Transition__EventAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1048:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1049:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1049:1: ( ( RULE_ID ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1050:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getEventEventCrossReference_2_0()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1051:1: ( RULE_ID )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1052:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__EventAssignment_22034); 
             after(grammarAccess.getTransitionAccess().getEventEventIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getEventEventCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EventAssignment_2"


    // $ANTLR start "rule__Transition__ToAssignment_4"
    // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1063:1: rule__Transition__ToAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__ToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1067:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1068:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1068:1: ( ( RULE_ID ) )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1069:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getToStateCrossReference_4_0()); 
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1070:1: ( RULE_ID )
            // ../org.xtext.example.statemachine.ui/src-gen/org/xtext/example/statemachine/ui/contentassist/antlr/internal/InternalStatemachine.g:1071:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getToStateIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__ToAssignment_42073); 
             after(grammarAccess.getTransitionAccess().getToStateIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getToStateCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ToAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_in_ruleState154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_in_ruleEvent214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__0308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__0311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Statemachine__Group__0__Impl339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__1370 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__NameAssignment_1_in_rule__Statemachine__Group__1__Impl400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__2430 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Statemachine__Group__2__Impl461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__3492 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Statemachine__Group__3__Impl523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__4554 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__5_in_rule__Statemachine__Group__4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Statemachine__Group__4__Impl585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__5__Impl_in_rule__Statemachine__Group__5616 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__6_in_rule__Statemachine__Group__5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__StatesAssignment_5_in_rule__Statemachine__Group__5__Impl646 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__6__Impl_in_rule__Statemachine__Group__6677 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__7_in_rule__Statemachine__Group__6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Statemachine__Group__6__Impl708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__7__Impl_in_rule__Statemachine__Group__7739 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__8_in_rule__Statemachine__Group__7742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Statemachine__Group__7__Impl770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__8__Impl_in_rule__Statemachine__Group__8801 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__9_in_rule__Statemachine__Group__8804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Statemachine__Group__8__Impl832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__9__Impl_in_rule__Statemachine__Group__9863 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__10_in_rule__Statemachine__Group__9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__EventsAssignment_9_in_rule__Statemachine__Group__9__Impl893 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__10__Impl_in_rule__Statemachine__Group__10924 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__11_in_rule__Statemachine__Group__10927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Statemachine__Group__10__Impl955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__11__Impl_in_rule__Statemachine__Group__11986 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__12_in_rule__Statemachine__Group__11989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Statemachine__Group__11__Impl1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__12__Impl_in_rule__Statemachine__Group__121048 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__13_in_rule__Statemachine__Group__121051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Statemachine__Group__12__Impl1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__13__Impl_in_rule__Statemachine__Group__131110 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__14_in_rule__Statemachine__Group__131113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__TransitionsAssignment_13_in_rule__Statemachine__Group__13__Impl1140 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__14__Impl_in_rule__Statemachine__Group__141171 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__15_in_rule__Statemachine__Group__141174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Statemachine__Group__14__Impl1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__15__Impl_in_rule__Statemachine__Group__151233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__16_in_rule__Statemachine__Group__151236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Statemachine__Group__15__Impl1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__16__Impl_in_rule__Statemachine__Group__161295 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__17_in_rule__Statemachine__Group__161298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__InitialiStateAssignment_16_in_rule__Statemachine__Group__16__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__17__Impl_in_rule__Statemachine__Group__171355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Statemachine__Group__17__Impl1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01450 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__FromAssignment_0_in_rule__Transition__Group__0__Impl1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Transition__Group__1__Impl1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__21572 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__21575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_2_in_rule__Transition__Group__2__Impl1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__31632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__31635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Transition__Group__3__Impl1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__41694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__ToAssignment_4_in_rule__Transition__Group__4__Impl1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statemachine__NameAssignment_11766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Statemachine__StatesAssignment_51797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Statemachine__EventsAssignment_91828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Statemachine__TransitionsAssignment_131859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statemachine__InitialiStateAssignment_161894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__FromAssignment_01995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__EventAssignment_22034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__ToAssignment_42073 = new BitSet(new long[]{0x0000000000000002L});

}