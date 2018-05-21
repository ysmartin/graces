package org.graces.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.graces.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPENDECL", "RULE_CLOSEDECL", "RULE_CLOSELINE", "RULE_VISIBILITY", "RULE_OPENARG", "RULE_CLOSEARG", "RULE_WORD", "RULE_LOWERCASE", "RULE_UPPERACASE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'in'", "'out'", "'model'", "'class'", "':'", "'operation'", "','", "'return'"
    };
    public static final int RULE_CLOSELINE=6;
    public static final int RULE_VISIBILITY=7;
    public static final int RULE_WORD=10;
    public static final int RULE_STRING=15;
    public static final int RULE_OPENARG=8;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_CLOSEARG=9;
    public static final int RULE_LOWERCASE=11;
    public static final int EOF=-1;
    public static final int RULE_ID=14;
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int RULE_UPPERACASE=12;
    public static final int T__26=26;
    public static final int RULE_CLOSEDECL=5;
    public static final int T__27=27;
    public static final int RULE_OPENDECL=4;
    public static final int RULE_INT=13;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModelDefinition"
    // InternalMyDsl.g:53:1: entryRuleModelDefinition : ruleModelDefinition EOF ;
    public final void entryRuleModelDefinition() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModelDefinition EOF )
            // InternalMyDsl.g:55:1: ruleModelDefinition EOF
            {
             before(grammarAccess.getModelDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleModelDefinition();

            state._fsp--;

             after(grammarAccess.getModelDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModelDefinition"


    // $ANTLR start "ruleModelDefinition"
    // InternalMyDsl.g:62:1: ruleModelDefinition : ( ( rule__ModelDefinition__Group__0 ) ) ;
    public final void ruleModelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__ModelDefinition__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__ModelDefinition__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__ModelDefinition__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__ModelDefinition__Group__0 )
            {
             before(grammarAccess.getModelDefinitionAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__ModelDefinition__Group__0 )
            // InternalMyDsl.g:69:4: rule__ModelDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleModelDefinition"


    // $ANTLR start "entryRuleClassDecl"
    // InternalMyDsl.g:78:1: entryRuleClassDecl : ruleClassDecl EOF ;
    public final void entryRuleClassDecl() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleClassDecl EOF )
            // InternalMyDsl.g:80:1: ruleClassDecl EOF
            {
             before(grammarAccess.getClassDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDecl();

            state._fsp--;

             after(grammarAccess.getClassDeclRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassDecl"


    // $ANTLR start "ruleClassDecl"
    // InternalMyDsl.g:87:1: ruleClassDecl : ( ( rule__ClassDecl__Group__0 ) ) ;
    public final void ruleClassDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__ClassDecl__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__ClassDecl__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__ClassDecl__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__ClassDecl__Group__0 )
            {
             before(grammarAccess.getClassDeclAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__ClassDecl__Group__0 )
            // InternalMyDsl.g:94:4: rule__ClassDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclAccess().getGroup()); 

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
    // $ANTLR end "ruleClassDecl"


    // $ANTLR start "entryRuleClassHeader"
    // InternalMyDsl.g:103:1: entryRuleClassHeader : ruleClassHeader EOF ;
    public final void entryRuleClassHeader() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleClassHeader EOF )
            // InternalMyDsl.g:105:1: ruleClassHeader EOF
            {
             before(grammarAccess.getClassHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleClassHeader();

            state._fsp--;

             after(grammarAccess.getClassHeaderRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassHeader"


    // $ANTLR start "ruleClassHeader"
    // InternalMyDsl.g:112:1: ruleClassHeader : ( ( rule__ClassHeader__Group__0 ) ) ;
    public final void ruleClassHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__ClassHeader__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__ClassHeader__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__ClassHeader__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__ClassHeader__Group__0 )
            {
             before(grammarAccess.getClassHeaderAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__ClassHeader__Group__0 )
            // InternalMyDsl.g:119:4: rule__ClassHeader__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassHeader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassHeaderAccess().getGroup()); 

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
    // $ANTLR end "ruleClassHeader"


    // $ANTLR start "entryRuleClassBody"
    // InternalMyDsl.g:128:1: entryRuleClassBody : ruleClassBody EOF ;
    public final void entryRuleClassBody() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleClassBody EOF )
            // InternalMyDsl.g:130:1: ruleClassBody EOF
            {
             before(grammarAccess.getClassBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleClassBody();

            state._fsp--;

             after(grammarAccess.getClassBodyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassBody"


    // $ANTLR start "ruleClassBody"
    // InternalMyDsl.g:137:1: ruleClassBody : ( ( rule__ClassBody__Group__0 ) ) ;
    public final void ruleClassBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__ClassBody__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__ClassBody__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__ClassBody__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__ClassBody__Group__0 )
            {
             before(grammarAccess.getClassBodyAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__ClassBody__Group__0 )
            // InternalMyDsl.g:144:4: rule__ClassBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassBodyAccess().getGroup()); 

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
    // $ANTLR end "ruleClassBody"


    // $ANTLR start "entryRuleAttrBody"
    // InternalMyDsl.g:153:1: entryRuleAttrBody : ruleAttrBody EOF ;
    public final void entryRuleAttrBody() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleAttrBody EOF )
            // InternalMyDsl.g:155:1: ruleAttrBody EOF
            {
             before(grammarAccess.getAttrBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleAttrBody();

            state._fsp--;

             after(grammarAccess.getAttrBodyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttrBody"


    // $ANTLR start "ruleAttrBody"
    // InternalMyDsl.g:162:1: ruleAttrBody : ( ( rule__AttrBody__Group__0 ) ) ;
    public final void ruleAttrBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__AttrBody__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__AttrBody__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__AttrBody__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__AttrBody__Group__0 )
            {
             before(grammarAccess.getAttrBodyAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__AttrBody__Group__0 )
            // InternalMyDsl.g:169:4: rule__AttrBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttrBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttrBodyAccess().getGroup()); 

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
    // $ANTLR end "ruleAttrBody"


    // $ANTLR start "entryRuleOpBody"
    // InternalMyDsl.g:178:1: entryRuleOpBody : ruleOpBody EOF ;
    public final void entryRuleOpBody() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleOpBody EOF )
            // InternalMyDsl.g:180:1: ruleOpBody EOF
            {
             before(grammarAccess.getOpBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleOpBody();

            state._fsp--;

             after(grammarAccess.getOpBodyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOpBody"


    // $ANTLR start "ruleOpBody"
    // InternalMyDsl.g:187:1: ruleOpBody : ( ( rule__OpBody__Group__0 ) ) ;
    public final void ruleOpBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__OpBody__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__OpBody__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__OpBody__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__OpBody__Group__0 )
            {
             before(grammarAccess.getOpBodyAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__OpBody__Group__0 )
            // InternalMyDsl.g:194:4: rule__OpBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpBodyAccess().getGroup()); 

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
    // $ANTLR end "ruleOpBody"


    // $ANTLR start "entryRuleArgBody"
    // InternalMyDsl.g:203:1: entryRuleArgBody : ruleArgBody EOF ;
    public final void entryRuleArgBody() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleArgBody EOF )
            // InternalMyDsl.g:205:1: ruleArgBody EOF
            {
             before(grammarAccess.getArgBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleArgBody();

            state._fsp--;

             after(grammarAccess.getArgBodyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArgBody"


    // $ANTLR start "ruleArgBody"
    // InternalMyDsl.g:212:1: ruleArgBody : ( ( rule__ArgBody__Group__0 ) ) ;
    public final void ruleArgBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__ArgBody__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__ArgBody__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__ArgBody__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__ArgBody__Group__0 )
            {
             before(grammarAccess.getArgBodyAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__ArgBody__Group__0 )
            // InternalMyDsl.g:219:4: rule__ArgBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArgBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgBodyAccess().getGroup()); 

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
    // $ANTLR end "ruleArgBody"


    // $ANTLR start "rule__ClassBody__Alternatives_1"
    // InternalMyDsl.g:227:1: rule__ClassBody__Alternatives_1 : ( ( ( rule__ClassBody__Group_1_0__0 ) ) | ( ( rule__ClassBody__Group_1_1__0 ) ) );
    public final void rule__ClassBody__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:231:1: ( ( ( rule__ClassBody__Group_1_0__0 ) ) | ( ( rule__ClassBody__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_VISIBILITY) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:232:2: ( ( rule__ClassBody__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:232:2: ( ( rule__ClassBody__Group_1_0__0 ) )
                    // InternalMyDsl.g:233:3: ( rule__ClassBody__Group_1_0__0 )
                    {
                     before(grammarAccess.getClassBodyAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:234:3: ( rule__ClassBody__Group_1_0__0 )
                    // InternalMyDsl.g:234:4: rule__ClassBody__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassBody__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassBodyAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:238:2: ( ( rule__ClassBody__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:238:2: ( ( rule__ClassBody__Group_1_1__0 ) )
                    // InternalMyDsl.g:239:3: ( rule__ClassBody__Group_1_1__0 )
                    {
                     before(grammarAccess.getClassBodyAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:240:3: ( rule__ClassBody__Group_1_1__0 )
                    // InternalMyDsl.g:240:4: rule__ClassBody__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassBody__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassBodyAccess().getGroup_1_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ClassBody__Alternatives_1"


    // $ANTLR start "rule__OpBody__Alternatives_2_1"
    // InternalMyDsl.g:248:1: rule__OpBody__Alternatives_2_1 : ( ( ( rule__OpBody__ArgsAssignment_2_1_0 ) ) | ( ( rule__OpBody__Group_2_1_1__0 ) ) );
    public final void rule__OpBody__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:252:1: ( ( ( rule__OpBody__ArgsAssignment_2_1_0 ) ) | ( ( rule__OpBody__Group_2_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_WORD) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==24) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==RULE_WORD) ) {
                            int LA2_5 = input.LA(5);

                            if ( (LA2_5==26) ) {
                                alt2=2;
                            }
                            else if ( (LA2_5==RULE_CLOSEARG||(LA2_5>=20 && LA2_5<=21)) ) {
                                alt2=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==21) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_WORD) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==24) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==RULE_WORD) ) {
                            int LA2_5 = input.LA(5);

                            if ( (LA2_5==26) ) {
                                alt2=2;
                            }
                            else if ( (LA2_5==RULE_CLOSEARG||(LA2_5>=20 && LA2_5<=21)) ) {
                                alt2=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:253:2: ( ( rule__OpBody__ArgsAssignment_2_1_0 ) )
                    {
                    // InternalMyDsl.g:253:2: ( ( rule__OpBody__ArgsAssignment_2_1_0 ) )
                    // InternalMyDsl.g:254:3: ( rule__OpBody__ArgsAssignment_2_1_0 )
                    {
                     before(grammarAccess.getOpBodyAccess().getArgsAssignment_2_1_0()); 
                    // InternalMyDsl.g:255:3: ( rule__OpBody__ArgsAssignment_2_1_0 )
                    // InternalMyDsl.g:255:4: rule__OpBody__ArgsAssignment_2_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpBody__ArgsAssignment_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpBodyAccess().getArgsAssignment_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:259:2: ( ( rule__OpBody__Group_2_1_1__0 ) )
                    {
                    // InternalMyDsl.g:259:2: ( ( rule__OpBody__Group_2_1_1__0 ) )
                    // InternalMyDsl.g:260:3: ( rule__OpBody__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getOpBodyAccess().getGroup_2_1_1()); 
                    // InternalMyDsl.g:261:3: ( rule__OpBody__Group_2_1_1__0 )
                    // InternalMyDsl.g:261:4: rule__OpBody__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpBody__Group_2_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpBodyAccess().getGroup_2_1_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__OpBody__Alternatives_2_1"


    // $ANTLR start "rule__ArgBody__Alternatives_0"
    // InternalMyDsl.g:269:1: rule__ArgBody__Alternatives_0 : ( ( 'in' ) | ( 'out' ) );
    public final void rule__ArgBody__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:273:1: ( ( 'in' ) | ( 'out' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:274:2: ( 'in' )
                    {
                    // InternalMyDsl.g:274:2: ( 'in' )
                    // InternalMyDsl.g:275:3: 'in'
                    {
                     before(grammarAccess.getArgBodyAccess().getInKeyword_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getArgBodyAccess().getInKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:280:2: ( 'out' )
                    {
                    // InternalMyDsl.g:280:2: ( 'out' )
                    // InternalMyDsl.g:281:3: 'out'
                    {
                     before(grammarAccess.getArgBodyAccess().getOutKeyword_0_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getArgBodyAccess().getOutKeyword_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ArgBody__Alternatives_0"


    // $ANTLR start "rule__ModelDefinition__Group__0"
    // InternalMyDsl.g:290:1: rule__ModelDefinition__Group__0 : rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1 ;
    public final void rule__ModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:294:1: ( rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1 )
            // InternalMyDsl.g:295:2: rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelDefinition__Group__1();

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
    // $ANTLR end "rule__ModelDefinition__Group__0"


    // $ANTLR start "rule__ModelDefinition__Group__0__Impl"
    // InternalMyDsl.g:302:1: rule__ModelDefinition__Group__0__Impl : ( 'model' ) ;
    public final void rule__ModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( ( 'model' ) )
            // InternalMyDsl.g:307:1: ( 'model' )
            {
            // InternalMyDsl.g:307:1: ( 'model' )
            // InternalMyDsl.g:308:2: 'model'
            {
             before(grammarAccess.getModelDefinitionAccess().getModelKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModelDefinitionAccess().getModelKeyword_0()); 

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
    // $ANTLR end "rule__ModelDefinition__Group__0__Impl"


    // $ANTLR start "rule__ModelDefinition__Group__1"
    // InternalMyDsl.g:317:1: rule__ModelDefinition__Group__1 : rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2 ;
    public final void rule__ModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:321:1: ( rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2 )
            // InternalMyDsl.g:322:2: rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelDefinition__Group__2();

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
    // $ANTLR end "rule__ModelDefinition__Group__1"


    // $ANTLR start "rule__ModelDefinition__Group__1__Impl"
    // InternalMyDsl.g:329:1: rule__ModelDefinition__Group__1__Impl : ( ( rule__ModelDefinition__ModelnameAssignment_1 ) ) ;
    public final void rule__ModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:333:1: ( ( ( rule__ModelDefinition__ModelnameAssignment_1 ) ) )
            // InternalMyDsl.g:334:1: ( ( rule__ModelDefinition__ModelnameAssignment_1 ) )
            {
            // InternalMyDsl.g:334:1: ( ( rule__ModelDefinition__ModelnameAssignment_1 ) )
            // InternalMyDsl.g:335:2: ( rule__ModelDefinition__ModelnameAssignment_1 )
            {
             before(grammarAccess.getModelDefinitionAccess().getModelnameAssignment_1()); 
            // InternalMyDsl.g:336:2: ( rule__ModelDefinition__ModelnameAssignment_1 )
            // InternalMyDsl.g:336:3: rule__ModelDefinition__ModelnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelDefinition__ModelnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelDefinitionAccess().getModelnameAssignment_1()); 

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
    // $ANTLR end "rule__ModelDefinition__Group__1__Impl"


    // $ANTLR start "rule__ModelDefinition__Group__2"
    // InternalMyDsl.g:344:1: rule__ModelDefinition__Group__2 : rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3 ;
    public final void rule__ModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:1: ( rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3 )
            // InternalMyDsl.g:349:2: rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ModelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelDefinition__Group__3();

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
    // $ANTLR end "rule__ModelDefinition__Group__2"


    // $ANTLR start "rule__ModelDefinition__Group__2__Impl"
    // InternalMyDsl.g:356:1: rule__ModelDefinition__Group__2__Impl : ( RULE_OPENDECL ) ;
    public final void rule__ModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:360:1: ( ( RULE_OPENDECL ) )
            // InternalMyDsl.g:361:1: ( RULE_OPENDECL )
            {
            // InternalMyDsl.g:361:1: ( RULE_OPENDECL )
            // InternalMyDsl.g:362:2: RULE_OPENDECL
            {
             before(grammarAccess.getModelDefinitionAccess().getOPENDECLTerminalRuleCall_2()); 
            match(input,RULE_OPENDECL,FOLLOW_2); 
             after(grammarAccess.getModelDefinitionAccess().getOPENDECLTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__ModelDefinition__Group__2__Impl"


    // $ANTLR start "rule__ModelDefinition__Group__3"
    // InternalMyDsl.g:371:1: rule__ModelDefinition__Group__3 : rule__ModelDefinition__Group__3__Impl rule__ModelDefinition__Group__4 ;
    public final void rule__ModelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:375:1: ( rule__ModelDefinition__Group__3__Impl rule__ModelDefinition__Group__4 )
            // InternalMyDsl.g:376:2: rule__ModelDefinition__Group__3__Impl rule__ModelDefinition__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ModelDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelDefinition__Group__4();

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
    // $ANTLR end "rule__ModelDefinition__Group__3"


    // $ANTLR start "rule__ModelDefinition__Group__3__Impl"
    // InternalMyDsl.g:383:1: rule__ModelDefinition__Group__3__Impl : ( ruleClassDecl ) ;
    public final void rule__ModelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:387:1: ( ( ruleClassDecl ) )
            // InternalMyDsl.g:388:1: ( ruleClassDecl )
            {
            // InternalMyDsl.g:388:1: ( ruleClassDecl )
            // InternalMyDsl.g:389:2: ruleClassDecl
            {
             before(grammarAccess.getModelDefinitionAccess().getClassDeclParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleClassDecl();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getClassDeclParserRuleCall_3()); 

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
    // $ANTLR end "rule__ModelDefinition__Group__3__Impl"


    // $ANTLR start "rule__ModelDefinition__Group__4"
    // InternalMyDsl.g:398:1: rule__ModelDefinition__Group__4 : rule__ModelDefinition__Group__4__Impl ;
    public final void rule__ModelDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:402:1: ( rule__ModelDefinition__Group__4__Impl )
            // InternalMyDsl.g:403:2: rule__ModelDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__ModelDefinition__Group__4"


    // $ANTLR start "rule__ModelDefinition__Group__4__Impl"
    // InternalMyDsl.g:409:1: rule__ModelDefinition__Group__4__Impl : ( RULE_CLOSEDECL ) ;
    public final void rule__ModelDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:413:1: ( ( RULE_CLOSEDECL ) )
            // InternalMyDsl.g:414:1: ( RULE_CLOSEDECL )
            {
            // InternalMyDsl.g:414:1: ( RULE_CLOSEDECL )
            // InternalMyDsl.g:415:2: RULE_CLOSEDECL
            {
             before(grammarAccess.getModelDefinitionAccess().getCLOSEDECLTerminalRuleCall_4()); 
            match(input,RULE_CLOSEDECL,FOLLOW_2); 
             after(grammarAccess.getModelDefinitionAccess().getCLOSEDECLTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__ModelDefinition__Group__4__Impl"


    // $ANTLR start "rule__ClassDecl__Group__0"
    // InternalMyDsl.g:425:1: rule__ClassDecl__Group__0 : rule__ClassDecl__Group__0__Impl rule__ClassDecl__Group__1 ;
    public final void rule__ClassDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:429:1: ( rule__ClassDecl__Group__0__Impl rule__ClassDecl__Group__1 )
            // InternalMyDsl.g:430:2: rule__ClassDecl__Group__0__Impl rule__ClassDecl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ClassDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group__1();

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
    // $ANTLR end "rule__ClassDecl__Group__0"


    // $ANTLR start "rule__ClassDecl__Group__0__Impl"
    // InternalMyDsl.g:437:1: rule__ClassDecl__Group__0__Impl : ( ( rule__ClassDecl__HeaderAssignment_0 ) ) ;
    public final void rule__ClassDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:1: ( ( ( rule__ClassDecl__HeaderAssignment_0 ) ) )
            // InternalMyDsl.g:442:1: ( ( rule__ClassDecl__HeaderAssignment_0 ) )
            {
            // InternalMyDsl.g:442:1: ( ( rule__ClassDecl__HeaderAssignment_0 ) )
            // InternalMyDsl.g:443:2: ( rule__ClassDecl__HeaderAssignment_0 )
            {
             before(grammarAccess.getClassDeclAccess().getHeaderAssignment_0()); 
            // InternalMyDsl.g:444:2: ( rule__ClassDecl__HeaderAssignment_0 )
            // InternalMyDsl.g:444:3: rule__ClassDecl__HeaderAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDecl__HeaderAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclAccess().getHeaderAssignment_0()); 

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
    // $ANTLR end "rule__ClassDecl__Group__0__Impl"


    // $ANTLR start "rule__ClassDecl__Group__1"
    // InternalMyDsl.g:452:1: rule__ClassDecl__Group__1 : rule__ClassDecl__Group__1__Impl ;
    public final void rule__ClassDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:456:1: ( rule__ClassDecl__Group__1__Impl )
            // InternalMyDsl.g:457:2: rule__ClassDecl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group__1__Impl();

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
    // $ANTLR end "rule__ClassDecl__Group__1"


    // $ANTLR start "rule__ClassDecl__Group__1__Impl"
    // InternalMyDsl.g:463:1: rule__ClassDecl__Group__1__Impl : ( ( rule__ClassDecl__BodyAssignment_1 ) ) ;
    public final void rule__ClassDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:467:1: ( ( ( rule__ClassDecl__BodyAssignment_1 ) ) )
            // InternalMyDsl.g:468:1: ( ( rule__ClassDecl__BodyAssignment_1 ) )
            {
            // InternalMyDsl.g:468:1: ( ( rule__ClassDecl__BodyAssignment_1 ) )
            // InternalMyDsl.g:469:2: ( rule__ClassDecl__BodyAssignment_1 )
            {
             before(grammarAccess.getClassDeclAccess().getBodyAssignment_1()); 
            // InternalMyDsl.g:470:2: ( rule__ClassDecl__BodyAssignment_1 )
            // InternalMyDsl.g:470:3: rule__ClassDecl__BodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDecl__BodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclAccess().getBodyAssignment_1()); 

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
    // $ANTLR end "rule__ClassDecl__Group__1__Impl"


    // $ANTLR start "rule__ClassHeader__Group__0"
    // InternalMyDsl.g:479:1: rule__ClassHeader__Group__0 : rule__ClassHeader__Group__0__Impl rule__ClassHeader__Group__1 ;
    public final void rule__ClassHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:483:1: ( rule__ClassHeader__Group__0__Impl rule__ClassHeader__Group__1 )
            // InternalMyDsl.g:484:2: rule__ClassHeader__Group__0__Impl rule__ClassHeader__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassHeader__Group__1();

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
    // $ANTLR end "rule__ClassHeader__Group__0"


    // $ANTLR start "rule__ClassHeader__Group__0__Impl"
    // InternalMyDsl.g:491:1: rule__ClassHeader__Group__0__Impl : ( 'class' ) ;
    public final void rule__ClassHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:495:1: ( ( 'class' ) )
            // InternalMyDsl.g:496:1: ( 'class' )
            {
            // InternalMyDsl.g:496:1: ( 'class' )
            // InternalMyDsl.g:497:2: 'class'
            {
             before(grammarAccess.getClassHeaderAccess().getClassKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClassHeaderAccess().getClassKeyword_0()); 

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
    // $ANTLR end "rule__ClassHeader__Group__0__Impl"


    // $ANTLR start "rule__ClassHeader__Group__1"
    // InternalMyDsl.g:506:1: rule__ClassHeader__Group__1 : rule__ClassHeader__Group__1__Impl ;
    public final void rule__ClassHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:510:1: ( rule__ClassHeader__Group__1__Impl )
            // InternalMyDsl.g:511:2: rule__ClassHeader__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassHeader__Group__1__Impl();

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
    // $ANTLR end "rule__ClassHeader__Group__1"


    // $ANTLR start "rule__ClassHeader__Group__1__Impl"
    // InternalMyDsl.g:517:1: rule__ClassHeader__Group__1__Impl : ( ( rule__ClassHeader__ClassnameAssignment_1 ) ) ;
    public final void rule__ClassHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:521:1: ( ( ( rule__ClassHeader__ClassnameAssignment_1 ) ) )
            // InternalMyDsl.g:522:1: ( ( rule__ClassHeader__ClassnameAssignment_1 ) )
            {
            // InternalMyDsl.g:522:1: ( ( rule__ClassHeader__ClassnameAssignment_1 ) )
            // InternalMyDsl.g:523:2: ( rule__ClassHeader__ClassnameAssignment_1 )
            {
             before(grammarAccess.getClassHeaderAccess().getClassnameAssignment_1()); 
            // InternalMyDsl.g:524:2: ( rule__ClassHeader__ClassnameAssignment_1 )
            // InternalMyDsl.g:524:3: rule__ClassHeader__ClassnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassHeader__ClassnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassHeaderAccess().getClassnameAssignment_1()); 

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
    // $ANTLR end "rule__ClassHeader__Group__1__Impl"


    // $ANTLR start "rule__ClassBody__Group__0"
    // InternalMyDsl.g:533:1: rule__ClassBody__Group__0 : rule__ClassBody__Group__0__Impl rule__ClassBody__Group__1 ;
    public final void rule__ClassBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:537:1: ( rule__ClassBody__Group__0__Impl rule__ClassBody__Group__1 )
            // InternalMyDsl.g:538:2: rule__ClassBody__Group__0__Impl rule__ClassBody__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ClassBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassBody__Group__1();

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
    // $ANTLR end "rule__ClassBody__Group__0"


    // $ANTLR start "rule__ClassBody__Group__0__Impl"
    // InternalMyDsl.g:545:1: rule__ClassBody__Group__0__Impl : ( RULE_OPENDECL ) ;
    public final void rule__ClassBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:549:1: ( ( RULE_OPENDECL ) )
            // InternalMyDsl.g:550:1: ( RULE_OPENDECL )
            {
            // InternalMyDsl.g:550:1: ( RULE_OPENDECL )
            // InternalMyDsl.g:551:2: RULE_OPENDECL
            {
             before(grammarAccess.getClassBodyAccess().getOPENDECLTerminalRuleCall_0()); 
            match(input,RULE_OPENDECL,FOLLOW_2); 
             after(grammarAccess.getClassBodyAccess().getOPENDECLTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ClassBody__Group__0__Impl"


    // $ANTLR start "rule__ClassBody__Group__1"
    // InternalMyDsl.g:560:1: rule__ClassBody__Group__1 : rule__ClassBody__Group__1__Impl rule__ClassBody__Group__2 ;
    public final void rule__ClassBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:564:1: ( rule__ClassBody__Group__1__Impl rule__ClassBody__Group__2 )
            // InternalMyDsl.g:565:2: rule__ClassBody__Group__1__Impl rule__ClassBody__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ClassBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassBody__Group__2();

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
    // $ANTLR end "rule__ClassBody__Group__1"


    // $ANTLR start "rule__ClassBody__Group__1__Impl"
    // InternalMyDsl.g:572:1: rule__ClassBody__Group__1__Impl : ( ( rule__ClassBody__Alternatives_1 )* ) ;
    public final void rule__ClassBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:576:1: ( ( ( rule__ClassBody__Alternatives_1 )* ) )
            // InternalMyDsl.g:577:1: ( ( rule__ClassBody__Alternatives_1 )* )
            {
            // InternalMyDsl.g:577:1: ( ( rule__ClassBody__Alternatives_1 )* )
            // InternalMyDsl.g:578:2: ( rule__ClassBody__Alternatives_1 )*
            {
             before(grammarAccess.getClassBodyAccess().getAlternatives_1()); 
            // InternalMyDsl.g:579:2: ( rule__ClassBody__Alternatives_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_VISIBILITY||LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:579:3: rule__ClassBody__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ClassBody__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getClassBodyAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__ClassBody__Group__1__Impl"


    // $ANTLR start "rule__ClassBody__Group__2"
    // InternalMyDsl.g:587:1: rule__ClassBody__Group__2 : rule__ClassBody__Group__2__Impl ;
    public final void rule__ClassBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:1: ( rule__ClassBody__Group__2__Impl )
            // InternalMyDsl.g:592:2: rule__ClassBody__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassBody__Group__2__Impl();

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
    // $ANTLR end "rule__ClassBody__Group__2"


    // $ANTLR start "rule__ClassBody__Group__2__Impl"
    // InternalMyDsl.g:598:1: rule__ClassBody__Group__2__Impl : ( RULE_CLOSEDECL ) ;
    public final void rule__ClassBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:602:1: ( ( RULE_CLOSEDECL ) )
            // InternalMyDsl.g:603:1: ( RULE_CLOSEDECL )
            {
            // InternalMyDsl.g:603:1: ( RULE_CLOSEDECL )
            // InternalMyDsl.g:604:2: RULE_CLOSEDECL
            {
             before(grammarAccess.getClassBodyAccess().getCLOSEDECLTerminalRuleCall_2()); 
            match(input,RULE_CLOSEDECL,FOLLOW_2); 
             after(grammarAccess.getClassBodyAccess().getCLOSEDECLTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__ClassBody__Group__2__Impl"


    // $ANTLR start "rule__ClassBody__Group_1_0__0"
    // InternalMyDsl.g:614:1: rule__ClassBody__Group_1_0__0 : rule__ClassBody__Group_1_0__0__Impl rule__ClassBody__Group_1_0__1 ;
    public final void rule__ClassBody__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:618:1: ( rule__ClassBody__Group_1_0__0__Impl rule__ClassBody__Group_1_0__1 )
            // InternalMyDsl.g:619:2: rule__ClassBody__Group_1_0__0__Impl rule__ClassBody__Group_1_0__1
            {
            pushFollow(FOLLOW_9);
            rule__ClassBody__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassBody__Group_1_0__1();

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
    // $ANTLR end "rule__ClassBody__Group_1_0__0"


    // $ANTLR start "rule__ClassBody__Group_1_0__0__Impl"
    // InternalMyDsl.g:626:1: rule__ClassBody__Group_1_0__0__Impl : ( ( rule__ClassBody__AttributesAssignment_1_0_0 ) ) ;
    public final void rule__ClassBody__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:1: ( ( ( rule__ClassBody__AttributesAssignment_1_0_0 ) ) )
            // InternalMyDsl.g:631:1: ( ( rule__ClassBody__AttributesAssignment_1_0_0 ) )
            {
            // InternalMyDsl.g:631:1: ( ( rule__ClassBody__AttributesAssignment_1_0_0 ) )
            // InternalMyDsl.g:632:2: ( rule__ClassBody__AttributesAssignment_1_0_0 )
            {
             before(grammarAccess.getClassBodyAccess().getAttributesAssignment_1_0_0()); 
            // InternalMyDsl.g:633:2: ( rule__ClassBody__AttributesAssignment_1_0_0 )
            // InternalMyDsl.g:633:3: rule__ClassBody__AttributesAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassBody__AttributesAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getClassBodyAccess().getAttributesAssignment_1_0_0()); 

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
    // $ANTLR end "rule__ClassBody__Group_1_0__0__Impl"


    // $ANTLR start "rule__ClassBody__Group_1_0__1"
    // InternalMyDsl.g:641:1: rule__ClassBody__Group_1_0__1 : rule__ClassBody__Group_1_0__1__Impl ;
    public final void rule__ClassBody__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:645:1: ( rule__ClassBody__Group_1_0__1__Impl )
            // InternalMyDsl.g:646:2: rule__ClassBody__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassBody__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__ClassBody__Group_1_0__1"


    // $ANTLR start "rule__ClassBody__Group_1_0__1__Impl"
    // InternalMyDsl.g:652:1: rule__ClassBody__Group_1_0__1__Impl : ( RULE_CLOSELINE ) ;
    public final void rule__ClassBody__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:656:1: ( ( RULE_CLOSELINE ) )
            // InternalMyDsl.g:657:1: ( RULE_CLOSELINE )
            {
            // InternalMyDsl.g:657:1: ( RULE_CLOSELINE )
            // InternalMyDsl.g:658:2: RULE_CLOSELINE
            {
             before(grammarAccess.getClassBodyAccess().getCLOSELINETerminalRuleCall_1_0_1()); 
            match(input,RULE_CLOSELINE,FOLLOW_2); 
             after(grammarAccess.getClassBodyAccess().getCLOSELINETerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__ClassBody__Group_1_0__1__Impl"


    // $ANTLR start "rule__ClassBody__Group_1_1__0"
    // InternalMyDsl.g:668:1: rule__ClassBody__Group_1_1__0 : rule__ClassBody__Group_1_1__0__Impl rule__ClassBody__Group_1_1__1 ;
    public final void rule__ClassBody__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:672:1: ( rule__ClassBody__Group_1_1__0__Impl rule__ClassBody__Group_1_1__1 )
            // InternalMyDsl.g:673:2: rule__ClassBody__Group_1_1__0__Impl rule__ClassBody__Group_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ClassBody__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassBody__Group_1_1__1();

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
    // $ANTLR end "rule__ClassBody__Group_1_1__0"


    // $ANTLR start "rule__ClassBody__Group_1_1__0__Impl"
    // InternalMyDsl.g:680:1: rule__ClassBody__Group_1_1__0__Impl : ( ( rule__ClassBody__OperationsAssignment_1_1_0 ) ) ;
    public final void rule__ClassBody__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:684:1: ( ( ( rule__ClassBody__OperationsAssignment_1_1_0 ) ) )
            // InternalMyDsl.g:685:1: ( ( rule__ClassBody__OperationsAssignment_1_1_0 ) )
            {
            // InternalMyDsl.g:685:1: ( ( rule__ClassBody__OperationsAssignment_1_1_0 ) )
            // InternalMyDsl.g:686:2: ( rule__ClassBody__OperationsAssignment_1_1_0 )
            {
             before(grammarAccess.getClassBodyAccess().getOperationsAssignment_1_1_0()); 
            // InternalMyDsl.g:687:2: ( rule__ClassBody__OperationsAssignment_1_1_0 )
            // InternalMyDsl.g:687:3: rule__ClassBody__OperationsAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassBody__OperationsAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClassBodyAccess().getOperationsAssignment_1_1_0()); 

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
    // $ANTLR end "rule__ClassBody__Group_1_1__0__Impl"


    // $ANTLR start "rule__ClassBody__Group_1_1__1"
    // InternalMyDsl.g:695:1: rule__ClassBody__Group_1_1__1 : rule__ClassBody__Group_1_1__1__Impl ;
    public final void rule__ClassBody__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:699:1: ( rule__ClassBody__Group_1_1__1__Impl )
            // InternalMyDsl.g:700:2: rule__ClassBody__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassBody__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ClassBody__Group_1_1__1"


    // $ANTLR start "rule__ClassBody__Group_1_1__1__Impl"
    // InternalMyDsl.g:706:1: rule__ClassBody__Group_1_1__1__Impl : ( RULE_CLOSELINE ) ;
    public final void rule__ClassBody__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:710:1: ( ( RULE_CLOSELINE ) )
            // InternalMyDsl.g:711:1: ( RULE_CLOSELINE )
            {
            // InternalMyDsl.g:711:1: ( RULE_CLOSELINE )
            // InternalMyDsl.g:712:2: RULE_CLOSELINE
            {
             before(grammarAccess.getClassBodyAccess().getCLOSELINETerminalRuleCall_1_1_1()); 
            match(input,RULE_CLOSELINE,FOLLOW_2); 
             after(grammarAccess.getClassBodyAccess().getCLOSELINETerminalRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__ClassBody__Group_1_1__1__Impl"


    // $ANTLR start "rule__AttrBody__Group__0"
    // InternalMyDsl.g:722:1: rule__AttrBody__Group__0 : rule__AttrBody__Group__0__Impl rule__AttrBody__Group__1 ;
    public final void rule__AttrBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:726:1: ( rule__AttrBody__Group__0__Impl rule__AttrBody__Group__1 )
            // InternalMyDsl.g:727:2: rule__AttrBody__Group__0__Impl rule__AttrBody__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AttrBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrBody__Group__1();

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
    // $ANTLR end "rule__AttrBody__Group__0"


    // $ANTLR start "rule__AttrBody__Group__0__Impl"
    // InternalMyDsl.g:734:1: rule__AttrBody__Group__0__Impl : ( RULE_VISIBILITY ) ;
    public final void rule__AttrBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:738:1: ( ( RULE_VISIBILITY ) )
            // InternalMyDsl.g:739:1: ( RULE_VISIBILITY )
            {
            // InternalMyDsl.g:739:1: ( RULE_VISIBILITY )
            // InternalMyDsl.g:740:2: RULE_VISIBILITY
            {
             before(grammarAccess.getAttrBodyAccess().getVISIBILITYTerminalRuleCall_0()); 
            match(input,RULE_VISIBILITY,FOLLOW_2); 
             after(grammarAccess.getAttrBodyAccess().getVISIBILITYTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__AttrBody__Group__0__Impl"


    // $ANTLR start "rule__AttrBody__Group__1"
    // InternalMyDsl.g:749:1: rule__AttrBody__Group__1 : rule__AttrBody__Group__1__Impl ;
    public final void rule__AttrBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:753:1: ( rule__AttrBody__Group__1__Impl )
            // InternalMyDsl.g:754:2: rule__AttrBody__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrBody__Group__1__Impl();

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
    // $ANTLR end "rule__AttrBody__Group__1"


    // $ANTLR start "rule__AttrBody__Group__1__Impl"
    // InternalMyDsl.g:760:1: rule__AttrBody__Group__1__Impl : ( ( rule__AttrBody__Group_1__0 ) ) ;
    public final void rule__AttrBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:764:1: ( ( ( rule__AttrBody__Group_1__0 ) ) )
            // InternalMyDsl.g:765:1: ( ( rule__AttrBody__Group_1__0 ) )
            {
            // InternalMyDsl.g:765:1: ( ( rule__AttrBody__Group_1__0 ) )
            // InternalMyDsl.g:766:2: ( rule__AttrBody__Group_1__0 )
            {
             before(grammarAccess.getAttrBodyAccess().getGroup_1()); 
            // InternalMyDsl.g:767:2: ( rule__AttrBody__Group_1__0 )
            // InternalMyDsl.g:767:3: rule__AttrBody__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__AttrBody__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAttrBodyAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AttrBody__Group__1__Impl"


    // $ANTLR start "rule__AttrBody__Group_1__0"
    // InternalMyDsl.g:776:1: rule__AttrBody__Group_1__0 : rule__AttrBody__Group_1__0__Impl rule__AttrBody__Group_1__1 ;
    public final void rule__AttrBody__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:780:1: ( rule__AttrBody__Group_1__0__Impl rule__AttrBody__Group_1__1 )
            // InternalMyDsl.g:781:2: rule__AttrBody__Group_1__0__Impl rule__AttrBody__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__AttrBody__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrBody__Group_1__1();

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
    // $ANTLR end "rule__AttrBody__Group_1__0"


    // $ANTLR start "rule__AttrBody__Group_1__0__Impl"
    // InternalMyDsl.g:788:1: rule__AttrBody__Group_1__0__Impl : ( ( rule__AttrBody__AttrnameAssignment_1_0 ) ) ;
    public final void rule__AttrBody__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:792:1: ( ( ( rule__AttrBody__AttrnameAssignment_1_0 ) ) )
            // InternalMyDsl.g:793:1: ( ( rule__AttrBody__AttrnameAssignment_1_0 ) )
            {
            // InternalMyDsl.g:793:1: ( ( rule__AttrBody__AttrnameAssignment_1_0 ) )
            // InternalMyDsl.g:794:2: ( rule__AttrBody__AttrnameAssignment_1_0 )
            {
             before(grammarAccess.getAttrBodyAccess().getAttrnameAssignment_1_0()); 
            // InternalMyDsl.g:795:2: ( rule__AttrBody__AttrnameAssignment_1_0 )
            // InternalMyDsl.g:795:3: rule__AttrBody__AttrnameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AttrBody__AttrnameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttrBodyAccess().getAttrnameAssignment_1_0()); 

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
    // $ANTLR end "rule__AttrBody__Group_1__0__Impl"


    // $ANTLR start "rule__AttrBody__Group_1__1"
    // InternalMyDsl.g:803:1: rule__AttrBody__Group_1__1 : rule__AttrBody__Group_1__1__Impl rule__AttrBody__Group_1__2 ;
    public final void rule__AttrBody__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:807:1: ( rule__AttrBody__Group_1__1__Impl rule__AttrBody__Group_1__2 )
            // InternalMyDsl.g:808:2: rule__AttrBody__Group_1__1__Impl rule__AttrBody__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__AttrBody__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrBody__Group_1__2();

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
    // $ANTLR end "rule__AttrBody__Group_1__1"


    // $ANTLR start "rule__AttrBody__Group_1__1__Impl"
    // InternalMyDsl.g:815:1: rule__AttrBody__Group_1__1__Impl : ( ':' ) ;
    public final void rule__AttrBody__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:819:1: ( ( ':' ) )
            // InternalMyDsl.g:820:1: ( ':' )
            {
            // InternalMyDsl.g:820:1: ( ':' )
            // InternalMyDsl.g:821:2: ':'
            {
             before(grammarAccess.getAttrBodyAccess().getColonKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttrBodyAccess().getColonKeyword_1_1()); 

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
    // $ANTLR end "rule__AttrBody__Group_1__1__Impl"


    // $ANTLR start "rule__AttrBody__Group_1__2"
    // InternalMyDsl.g:830:1: rule__AttrBody__Group_1__2 : rule__AttrBody__Group_1__2__Impl ;
    public final void rule__AttrBody__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:834:1: ( rule__AttrBody__Group_1__2__Impl )
            // InternalMyDsl.g:835:2: rule__AttrBody__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrBody__Group_1__2__Impl();

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
    // $ANTLR end "rule__AttrBody__Group_1__2"


    // $ANTLR start "rule__AttrBody__Group_1__2__Impl"
    // InternalMyDsl.g:841:1: rule__AttrBody__Group_1__2__Impl : ( ( rule__AttrBody__AttrtypeAssignment_1_2 ) ) ;
    public final void rule__AttrBody__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:845:1: ( ( ( rule__AttrBody__AttrtypeAssignment_1_2 ) ) )
            // InternalMyDsl.g:846:1: ( ( rule__AttrBody__AttrtypeAssignment_1_2 ) )
            {
            // InternalMyDsl.g:846:1: ( ( rule__AttrBody__AttrtypeAssignment_1_2 ) )
            // InternalMyDsl.g:847:2: ( rule__AttrBody__AttrtypeAssignment_1_2 )
            {
             before(grammarAccess.getAttrBodyAccess().getAttrtypeAssignment_1_2()); 
            // InternalMyDsl.g:848:2: ( rule__AttrBody__AttrtypeAssignment_1_2 )
            // InternalMyDsl.g:848:3: rule__AttrBody__AttrtypeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AttrBody__AttrtypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAttrBodyAccess().getAttrtypeAssignment_1_2()); 

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
    // $ANTLR end "rule__AttrBody__Group_1__2__Impl"


    // $ANTLR start "rule__OpBody__Group__0"
    // InternalMyDsl.g:857:1: rule__OpBody__Group__0 : rule__OpBody__Group__0__Impl rule__OpBody__Group__1 ;
    public final void rule__OpBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:861:1: ( rule__OpBody__Group__0__Impl rule__OpBody__Group__1 )
            // InternalMyDsl.g:862:2: rule__OpBody__Group__0__Impl rule__OpBody__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__OpBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpBody__Group__1();

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
    // $ANTLR end "rule__OpBody__Group__0"


    // $ANTLR start "rule__OpBody__Group__0__Impl"
    // InternalMyDsl.g:869:1: rule__OpBody__Group__0__Impl : ( 'operation' ) ;
    public final void rule__OpBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:873:1: ( ( 'operation' ) )
            // InternalMyDsl.g:874:1: ( 'operation' )
            {
            // InternalMyDsl.g:874:1: ( 'operation' )
            // InternalMyDsl.g:875:2: 'operation'
            {
             before(grammarAccess.getOpBodyAccess().getOperationKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOpBodyAccess().getOperationKeyword_0()); 

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
    // $ANTLR end "rule__OpBody__Group__0__Impl"


    // $ANTLR start "rule__OpBody__Group__1"
    // InternalMyDsl.g:884:1: rule__OpBody__Group__1 : rule__OpBody__Group__1__Impl rule__OpBody__Group__2 ;
    public final void rule__OpBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:888:1: ( rule__OpBody__Group__1__Impl rule__OpBody__Group__2 )
            // InternalMyDsl.g:889:2: rule__OpBody__Group__1__Impl rule__OpBody__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OpBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpBody__Group__2();

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
    // $ANTLR end "rule__OpBody__Group__1"


    // $ANTLR start "rule__OpBody__Group__1__Impl"
    // InternalMyDsl.g:896:1: rule__OpBody__Group__1__Impl : ( ( rule__OpBody__OpnameAssignment_1 ) ) ;
    public final void rule__OpBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:900:1: ( ( ( rule__OpBody__OpnameAssignment_1 ) ) )
            // InternalMyDsl.g:901:1: ( ( rule__OpBody__OpnameAssignment_1 ) )
            {
            // InternalMyDsl.g:901:1: ( ( rule__OpBody__OpnameAssignment_1 ) )
            // InternalMyDsl.g:902:2: ( rule__OpBody__OpnameAssignment_1 )
            {
             before(grammarAccess.getOpBodyAccess().getOpnameAssignment_1()); 
            // InternalMyDsl.g:903:2: ( rule__OpBody__OpnameAssignment_1 )
            // InternalMyDsl.g:903:3: rule__OpBody__OpnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OpBody__OpnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpBodyAccess().getOpnameAssignment_1()); 

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
    // $ANTLR end "rule__OpBody__Group__1__Impl"


    // $ANTLR start "rule__OpBody__Group__2"
    // InternalMyDsl.g:911:1: rule__OpBody__Group__2 : rule__OpBody__Group__2__Impl rule__OpBody__Group__3 ;
    public final void rule__OpBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:915:1: ( rule__OpBody__Group__2__Impl rule__OpBody__Group__3 )
            // InternalMyDsl.g:916:2: rule__OpBody__Group__2__Impl rule__OpBody__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__OpBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpBody__Group__3();

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
    // $ANTLR end "rule__OpBody__Group__2"


    // $ANTLR start "rule__OpBody__Group__2__Impl"
    // InternalMyDsl.g:923:1: rule__OpBody__Group__2__Impl : ( ( rule__OpBody__Group_2__0 )? ) ;
    public final void rule__OpBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:927:1: ( ( ( rule__OpBody__Group_2__0 )? ) )
            // InternalMyDsl.g:928:1: ( ( rule__OpBody__Group_2__0 )? )
            {
            // InternalMyDsl.g:928:1: ( ( rule__OpBody__Group_2__0 )? )
            // InternalMyDsl.g:929:2: ( rule__OpBody__Group_2__0 )?
            {
             before(grammarAccess.getOpBodyAccess().getGroup_2()); 
            // InternalMyDsl.g:930:2: ( rule__OpBody__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_OPENARG) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:930:3: rule__OpBody__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpBody__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpBodyAccess().getGroup_2()); 

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
    // $ANTLR end "rule__OpBody__Group__2__Impl"


    // $ANTLR start "rule__OpBody__Group__3"
    // InternalMyDsl.g:938:1: rule__OpBody__Group__3 : rule__OpBody__Group__3__Impl ;
    public final void rule__OpBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:942:1: ( rule__OpBody__Group__3__Impl )
            // InternalMyDsl.g:943:2: rule__OpBody__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpBody__Group__3__Impl();

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
    // $ANTLR end "rule__OpBody__Group__3"


    // $ANTLR start "rule__OpBody__Group__3__Impl"
    // InternalMyDsl.g:949:1: rule__OpBody__Group__3__Impl : ( ( rule__OpBody__Group_3__0 )? ) ;
    public final void rule__OpBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( ( ( rule__OpBody__Group_3__0 )? ) )
            // InternalMyDsl.g:954:1: ( ( rule__OpBody__Group_3__0 )? )
            {
            // InternalMyDsl.g:954:1: ( ( rule__OpBody__Group_3__0 )? )
            // InternalMyDsl.g:955:2: ( rule__OpBody__Group_3__0 )?
            {
             before(grammarAccess.getOpBodyAccess().getGroup_3()); 
            // InternalMyDsl.g:956:2: ( rule__OpBody__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:956:3: rule__OpBody__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpBody__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpBodyAccess().getGroup_3()); 

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
    // $ANTLR end "rule__OpBody__Group__3__Impl"


    // $ANTLR start "rule__OpBody__Group_2__0"
    // InternalMyDsl.g:965:1: rule__OpBody__Group_2__0 : rule__OpBody__Group_2__0__Impl rule__OpBody__Group_2__1 ;
    public final void rule__OpBody__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:969:1: ( rule__OpBody__Group_2__0__Impl rule__OpBody__Group_2__1 )
            // InternalMyDsl.g:970:2: rule__OpBody__Group_2__0__Impl rule__OpBody__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__OpBody__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpBody__Group_2__1();

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
    // $ANTLR end "rule__OpBody__Group_2__0"


    // $ANTLR start "rule__OpBody__Group_2__0__Impl"
    // InternalMyDsl.g:977:1: rule__OpBody__Group_2__0__Impl : ( RULE_OPENARG ) ;
    public final void rule__OpBody__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:981:1: ( ( RULE_OPENARG ) )
            // InternalMyDsl.g:982:1: ( RULE_OPENARG )
            {
            // InternalMyDsl.g:982:1: ( RULE_OPENARG )
            // InternalMyDsl.g:983:2: RULE_OPENARG
            {
             before(grammarAccess.getOpBodyAccess().getOPENARGTerminalRuleCall_2_0()); 
            match(input,RULE_OPENARG,FOLLOW_2); 
             after(grammarAccess.getOpBodyAccess().getOPENARGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__OpBody__Group_2__0__Impl"


    // $ANTLR start "rule__OpBody__Group_2__1"
    // InternalMyDsl.g:992:1: rule__OpBody__Group_2__1 : rule__OpBody__Group_2__1__Impl rule__OpBody__Group_2__2 ;
    public final void rule__OpBody__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:996:1: ( rule__OpBody__Group_2__1__Impl rule__OpBody__Group_2__2 )
            // InternalMyDsl.g:997:2: rule__OpBody__Group_2__1__Impl rule__OpBody__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__OpBody__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpBody__Group_2__2();

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
    // $ANTLR end "rule__OpBody__Group_2__1"


    // $ANTLR start "rule__OpBody__Group_2__1__Impl"
    // InternalMyDsl.g:1004:1: rule__OpBody__Group_2__1__Impl : ( ( ( rule__OpBody__Alternatives_2_1 ) ) ( ( rule__OpBody__Alternatives_2_1 )* ) ) ;
    public final void rule__OpBody__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1008:1: ( ( ( ( rule__OpBody__Alternatives_2_1 ) ) ( ( rule__OpBody__Alternatives_2_1 )* ) ) )
            // InternalMyDsl.g:1009:1: ( ( ( rule__OpBody__Alternatives_2_1 ) ) ( ( rule__OpBody__Alternatives_2_1 )* ) )
            {
            // InternalMyDsl.g:1009:1: ( ( ( rule__OpBody__Alternatives_2_1 ) ) ( ( rule__OpBody__Alternatives_2_1 )* ) )
            // InternalMyDsl.g:1010:2: ( ( rule__OpBody__Alternatives_2_1 ) ) ( ( rule__OpBody__Alternatives_2_1 )* )
            {
            // InternalMyDsl.g:1010:2: ( ( rule__OpBody__Alternatives_2_1 ) )
            // InternalMyDsl.g:1011:3: ( rule__OpBody__Alternatives_2_1 )
            {
             before(grammarAccess.getOpBodyAccess().getAlternatives_2_1()); 
            // InternalMyDsl.g:1012:3: ( rule__OpBody__Alternatives_2_1 )
            // InternalMyDsl.g:1012:4: rule__OpBody__Alternatives_2_1
            {
            pushFollow(FOLLOW_14);
            rule__OpBody__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpBodyAccess().getAlternatives_2_1()); 

            }

            // InternalMyDsl.g:1015:2: ( ( rule__OpBody__Alternatives_2_1 )* )
            // InternalMyDsl.g:1016:3: ( rule__OpBody__Alternatives_2_1 )*
            {
             before(grammarAccess.getOpBodyAccess().getAlternatives_2_1()); 
            // InternalMyDsl.g:1017:3: ( rule__OpBody__Alternatives_2_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1017:4: rule__OpBody__Alternatives_2_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__OpBody__Alternatives_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getOpBodyAccess().getAlternatives_2_1()); 

            }


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
    // $ANTLR end "rule__OpBody__Group_2__1__Impl"


    // $ANTLR start "rule__OpBody__Group_2__2"
    // InternalMyDsl.g:1026:1: rule__OpBody__Group_2__2 : rule__OpBody__Group_2__2__Impl ;
    public final void rule__OpBody__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( rule__OpBody__Group_2__2__Impl )
            // InternalMyDsl.g:1031:2: rule__OpBody__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpBody__Group_2__2__Impl();

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
    // $ANTLR end "rule__OpBody__Group_2__2"


    // $ANTLR start "rule__OpBody__Group_2__2__Impl"
    // InternalMyDsl.g:1037:1: rule__OpBody__Group_2__2__Impl : ( RULE_CLOSEARG ) ;
    public final void rule__OpBody__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( ( RULE_CLOSEARG ) )
            // InternalMyDsl.g:1042:1: ( RULE_CLOSEARG )
            {
            // InternalMyDsl.g:1042:1: ( RULE_CLOSEARG )
            // InternalMyDsl.g:1043:2: RULE_CLOSEARG
            {
             before(grammarAccess.getOpBodyAccess().getCLOSEARGTerminalRuleCall_2_2()); 
            match(input,RULE_CLOSEARG,FOLLOW_2); 
             after(grammarAccess.getOpBodyAccess().getCLOSEARGTerminalRuleCall_2_2()); 

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
    // $ANTLR end "rule__OpBody__Group_2__2__Impl"


    // $ANTLR start "rule__OpBody__Group_2_1_1__0"
    // InternalMyDsl.g:1053:1: rule__OpBody__Group_2_1_1__0 : rule__OpBody__Group_2_1_1__0__Impl rule__OpBody__Group_2_1_1__1 ;
    public final void rule__OpBody__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( rule__OpBody__Group_2_1_1__0__Impl rule__OpBody__Group_2_1_1__1 )
            // InternalMyDsl.g:1058:2: rule__OpBody__Group_2_1_1__0__Impl rule__OpBody__Group_2_1_1__1
            {
            pushFollow(FOLLOW_15);
            rule__OpBody__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpBody__Group_2_1_1__1();

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
    // $ANTLR end "rule__OpBody__Group_2_1_1__0"


    // $ANTLR start "rule__OpBody__Group_2_1_1__0__Impl"
    // InternalMyDsl.g:1065:1: rule__OpBody__Group_2_1_1__0__Impl : ( ( rule__OpBody__ArgsAssignment_2_1_1_0 ) ) ;
    public final void rule__OpBody__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1069:1: ( ( ( rule__OpBody__ArgsAssignment_2_1_1_0 ) ) )
            // InternalMyDsl.g:1070:1: ( ( rule__OpBody__ArgsAssignment_2_1_1_0 ) )
            {
            // InternalMyDsl.g:1070:1: ( ( rule__OpBody__ArgsAssignment_2_1_1_0 ) )
            // InternalMyDsl.g:1071:2: ( rule__OpBody__ArgsAssignment_2_1_1_0 )
            {
             before(grammarAccess.getOpBodyAccess().getArgsAssignment_2_1_1_0()); 
            // InternalMyDsl.g:1072:2: ( rule__OpBody__ArgsAssignment_2_1_1_0 )
            // InternalMyDsl.g:1072:3: rule__OpBody__ArgsAssignment_2_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__OpBody__ArgsAssignment_2_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOpBodyAccess().getArgsAssignment_2_1_1_0()); 

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
    // $ANTLR end "rule__OpBody__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__OpBody__Group_2_1_1__1"
    // InternalMyDsl.g:1080:1: rule__OpBody__Group_2_1_1__1 : rule__OpBody__Group_2_1_1__1__Impl ;
    public final void rule__OpBody__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1084:1: ( rule__OpBody__Group_2_1_1__1__Impl )
            // InternalMyDsl.g:1085:2: rule__OpBody__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpBody__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__OpBody__Group_2_1_1__1"


    // $ANTLR start "rule__OpBody__Group_2_1_1__1__Impl"
    // InternalMyDsl.g:1091:1: rule__OpBody__Group_2_1_1__1__Impl : ( ',' ) ;
    public final void rule__OpBody__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( ( ',' ) )
            // InternalMyDsl.g:1096:1: ( ',' )
            {
            // InternalMyDsl.g:1096:1: ( ',' )
            // InternalMyDsl.g:1097:2: ','
            {
             before(grammarAccess.getOpBodyAccess().getCommaKeyword_2_1_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOpBodyAccess().getCommaKeyword_2_1_1_1()); 

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
    // $ANTLR end "rule__OpBody__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__OpBody__Group_3__0"
    // InternalMyDsl.g:1107:1: rule__OpBody__Group_3__0 : rule__OpBody__Group_3__0__Impl rule__OpBody__Group_3__1 ;
    public final void rule__OpBody__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( rule__OpBody__Group_3__0__Impl rule__OpBody__Group_3__1 )
            // InternalMyDsl.g:1112:2: rule__OpBody__Group_3__0__Impl rule__OpBody__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__OpBody__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpBody__Group_3__1();

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
    // $ANTLR end "rule__OpBody__Group_3__0"


    // $ANTLR start "rule__OpBody__Group_3__0__Impl"
    // InternalMyDsl.g:1119:1: rule__OpBody__Group_3__0__Impl : ( 'return' ) ;
    public final void rule__OpBody__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1123:1: ( ( 'return' ) )
            // InternalMyDsl.g:1124:1: ( 'return' )
            {
            // InternalMyDsl.g:1124:1: ( 'return' )
            // InternalMyDsl.g:1125:2: 'return'
            {
             before(grammarAccess.getOpBodyAccess().getReturnKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOpBodyAccess().getReturnKeyword_3_0()); 

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
    // $ANTLR end "rule__OpBody__Group_3__0__Impl"


    // $ANTLR start "rule__OpBody__Group_3__1"
    // InternalMyDsl.g:1134:1: rule__OpBody__Group_3__1 : rule__OpBody__Group_3__1__Impl ;
    public final void rule__OpBody__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( rule__OpBody__Group_3__1__Impl )
            // InternalMyDsl.g:1139:2: rule__OpBody__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpBody__Group_3__1__Impl();

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
    // $ANTLR end "rule__OpBody__Group_3__1"


    // $ANTLR start "rule__OpBody__Group_3__1__Impl"
    // InternalMyDsl.g:1145:1: rule__OpBody__Group_3__1__Impl : ( ( rule__OpBody__ReturntypeAssignment_3_1 ) ) ;
    public final void rule__OpBody__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1149:1: ( ( ( rule__OpBody__ReturntypeAssignment_3_1 ) ) )
            // InternalMyDsl.g:1150:1: ( ( rule__OpBody__ReturntypeAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1150:1: ( ( rule__OpBody__ReturntypeAssignment_3_1 ) )
            // InternalMyDsl.g:1151:2: ( rule__OpBody__ReturntypeAssignment_3_1 )
            {
             before(grammarAccess.getOpBodyAccess().getReturntypeAssignment_3_1()); 
            // InternalMyDsl.g:1152:2: ( rule__OpBody__ReturntypeAssignment_3_1 )
            // InternalMyDsl.g:1152:3: rule__OpBody__ReturntypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OpBody__ReturntypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpBodyAccess().getReturntypeAssignment_3_1()); 

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
    // $ANTLR end "rule__OpBody__Group_3__1__Impl"


    // $ANTLR start "rule__ArgBody__Group__0"
    // InternalMyDsl.g:1161:1: rule__ArgBody__Group__0 : rule__ArgBody__Group__0__Impl rule__ArgBody__Group__1 ;
    public final void rule__ArgBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1165:1: ( rule__ArgBody__Group__0__Impl rule__ArgBody__Group__1 )
            // InternalMyDsl.g:1166:2: rule__ArgBody__Group__0__Impl rule__ArgBody__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ArgBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgBody__Group__1();

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
    // $ANTLR end "rule__ArgBody__Group__0"


    // $ANTLR start "rule__ArgBody__Group__0__Impl"
    // InternalMyDsl.g:1173:1: rule__ArgBody__Group__0__Impl : ( ( rule__ArgBody__Alternatives_0 ) ) ;
    public final void rule__ArgBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( ( ( rule__ArgBody__Alternatives_0 ) ) )
            // InternalMyDsl.g:1178:1: ( ( rule__ArgBody__Alternatives_0 ) )
            {
            // InternalMyDsl.g:1178:1: ( ( rule__ArgBody__Alternatives_0 ) )
            // InternalMyDsl.g:1179:2: ( rule__ArgBody__Alternatives_0 )
            {
             before(grammarAccess.getArgBodyAccess().getAlternatives_0()); 
            // InternalMyDsl.g:1180:2: ( rule__ArgBody__Alternatives_0 )
            // InternalMyDsl.g:1180:3: rule__ArgBody__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ArgBody__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getArgBodyAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__ArgBody__Group__0__Impl"


    // $ANTLR start "rule__ArgBody__Group__1"
    // InternalMyDsl.g:1188:1: rule__ArgBody__Group__1 : rule__ArgBody__Group__1__Impl ;
    public final void rule__ArgBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( rule__ArgBody__Group__1__Impl )
            // InternalMyDsl.g:1193:2: rule__ArgBody__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArgBody__Group__1__Impl();

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
    // $ANTLR end "rule__ArgBody__Group__1"


    // $ANTLR start "rule__ArgBody__Group__1__Impl"
    // InternalMyDsl.g:1199:1: rule__ArgBody__Group__1__Impl : ( ( rule__ArgBody__Group_1__0 ) ) ;
    public final void rule__ArgBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1203:1: ( ( ( rule__ArgBody__Group_1__0 ) ) )
            // InternalMyDsl.g:1204:1: ( ( rule__ArgBody__Group_1__0 ) )
            {
            // InternalMyDsl.g:1204:1: ( ( rule__ArgBody__Group_1__0 ) )
            // InternalMyDsl.g:1205:2: ( rule__ArgBody__Group_1__0 )
            {
             before(grammarAccess.getArgBodyAccess().getGroup_1()); 
            // InternalMyDsl.g:1206:2: ( rule__ArgBody__Group_1__0 )
            // InternalMyDsl.g:1206:3: rule__ArgBody__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ArgBody__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getArgBodyAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ArgBody__Group__1__Impl"


    // $ANTLR start "rule__ArgBody__Group_1__0"
    // InternalMyDsl.g:1215:1: rule__ArgBody__Group_1__0 : rule__ArgBody__Group_1__0__Impl rule__ArgBody__Group_1__1 ;
    public final void rule__ArgBody__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( rule__ArgBody__Group_1__0__Impl rule__ArgBody__Group_1__1 )
            // InternalMyDsl.g:1220:2: rule__ArgBody__Group_1__0__Impl rule__ArgBody__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ArgBody__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgBody__Group_1__1();

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
    // $ANTLR end "rule__ArgBody__Group_1__0"


    // $ANTLR start "rule__ArgBody__Group_1__0__Impl"
    // InternalMyDsl.g:1227:1: rule__ArgBody__Group_1__0__Impl : ( ( rule__ArgBody__ArgnameAssignment_1_0 ) ) ;
    public final void rule__ArgBody__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( ( ( rule__ArgBody__ArgnameAssignment_1_0 ) ) )
            // InternalMyDsl.g:1232:1: ( ( rule__ArgBody__ArgnameAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1232:1: ( ( rule__ArgBody__ArgnameAssignment_1_0 ) )
            // InternalMyDsl.g:1233:2: ( rule__ArgBody__ArgnameAssignment_1_0 )
            {
             before(grammarAccess.getArgBodyAccess().getArgnameAssignment_1_0()); 
            // InternalMyDsl.g:1234:2: ( rule__ArgBody__ArgnameAssignment_1_0 )
            // InternalMyDsl.g:1234:3: rule__ArgBody__ArgnameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ArgBody__ArgnameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getArgBodyAccess().getArgnameAssignment_1_0()); 

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
    // $ANTLR end "rule__ArgBody__Group_1__0__Impl"


    // $ANTLR start "rule__ArgBody__Group_1__1"
    // InternalMyDsl.g:1242:1: rule__ArgBody__Group_1__1 : rule__ArgBody__Group_1__1__Impl rule__ArgBody__Group_1__2 ;
    public final void rule__ArgBody__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1246:1: ( rule__ArgBody__Group_1__1__Impl rule__ArgBody__Group_1__2 )
            // InternalMyDsl.g:1247:2: rule__ArgBody__Group_1__1__Impl rule__ArgBody__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__ArgBody__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgBody__Group_1__2();

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
    // $ANTLR end "rule__ArgBody__Group_1__1"


    // $ANTLR start "rule__ArgBody__Group_1__1__Impl"
    // InternalMyDsl.g:1254:1: rule__ArgBody__Group_1__1__Impl : ( ':' ) ;
    public final void rule__ArgBody__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( ( ':' ) )
            // InternalMyDsl.g:1259:1: ( ':' )
            {
            // InternalMyDsl.g:1259:1: ( ':' )
            // InternalMyDsl.g:1260:2: ':'
            {
             before(grammarAccess.getArgBodyAccess().getColonKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getArgBodyAccess().getColonKeyword_1_1()); 

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
    // $ANTLR end "rule__ArgBody__Group_1__1__Impl"


    // $ANTLR start "rule__ArgBody__Group_1__2"
    // InternalMyDsl.g:1269:1: rule__ArgBody__Group_1__2 : rule__ArgBody__Group_1__2__Impl ;
    public final void rule__ArgBody__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( rule__ArgBody__Group_1__2__Impl )
            // InternalMyDsl.g:1274:2: rule__ArgBody__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArgBody__Group_1__2__Impl();

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
    // $ANTLR end "rule__ArgBody__Group_1__2"


    // $ANTLR start "rule__ArgBody__Group_1__2__Impl"
    // InternalMyDsl.g:1280:1: rule__ArgBody__Group_1__2__Impl : ( ( rule__ArgBody__ArgtypeAssignment_1_2 ) ) ;
    public final void rule__ArgBody__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( ( ( rule__ArgBody__ArgtypeAssignment_1_2 ) ) )
            // InternalMyDsl.g:1285:1: ( ( rule__ArgBody__ArgtypeAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1285:1: ( ( rule__ArgBody__ArgtypeAssignment_1_2 ) )
            // InternalMyDsl.g:1286:2: ( rule__ArgBody__ArgtypeAssignment_1_2 )
            {
             before(grammarAccess.getArgBodyAccess().getArgtypeAssignment_1_2()); 
            // InternalMyDsl.g:1287:2: ( rule__ArgBody__ArgtypeAssignment_1_2 )
            // InternalMyDsl.g:1287:3: rule__ArgBody__ArgtypeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ArgBody__ArgtypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getArgBodyAccess().getArgtypeAssignment_1_2()); 

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
    // $ANTLR end "rule__ArgBody__Group_1__2__Impl"


    // $ANTLR start "rule__ModelDefinition__ModelnameAssignment_1"
    // InternalMyDsl.g:1296:1: rule__ModelDefinition__ModelnameAssignment_1 : ( RULE_WORD ) ;
    public final void rule__ModelDefinition__ModelnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1300:1: ( ( RULE_WORD ) )
            // InternalMyDsl.g:1301:2: ( RULE_WORD )
            {
            // InternalMyDsl.g:1301:2: ( RULE_WORD )
            // InternalMyDsl.g:1302:3: RULE_WORD
            {
             before(grammarAccess.getModelDefinitionAccess().getModelnameWORDTerminalRuleCall_1_0()); 
            match(input,RULE_WORD,FOLLOW_2); 
             after(grammarAccess.getModelDefinitionAccess().getModelnameWORDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ModelDefinition__ModelnameAssignment_1"


    // $ANTLR start "rule__ClassDecl__HeaderAssignment_0"
    // InternalMyDsl.g:1311:1: rule__ClassDecl__HeaderAssignment_0 : ( ruleClassHeader ) ;
    public final void rule__ClassDecl__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( ( ruleClassHeader ) )
            // InternalMyDsl.g:1316:2: ( ruleClassHeader )
            {
            // InternalMyDsl.g:1316:2: ( ruleClassHeader )
            // InternalMyDsl.g:1317:3: ruleClassHeader
            {
             before(grammarAccess.getClassDeclAccess().getHeaderClassHeaderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClassHeader();

            state._fsp--;

             after(grammarAccess.getClassDeclAccess().getHeaderClassHeaderParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ClassDecl__HeaderAssignment_0"


    // $ANTLR start "rule__ClassDecl__BodyAssignment_1"
    // InternalMyDsl.g:1326:1: rule__ClassDecl__BodyAssignment_1 : ( ruleClassBody ) ;
    public final void rule__ClassDecl__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1330:1: ( ( ruleClassBody ) )
            // InternalMyDsl.g:1331:2: ( ruleClassBody )
            {
            // InternalMyDsl.g:1331:2: ( ruleClassBody )
            // InternalMyDsl.g:1332:3: ruleClassBody
            {
             before(grammarAccess.getClassDeclAccess().getBodyClassBodyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassBody();

            state._fsp--;

             after(grammarAccess.getClassDeclAccess().getBodyClassBodyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ClassDecl__BodyAssignment_1"


    // $ANTLR start "rule__ClassHeader__ClassnameAssignment_1"
    // InternalMyDsl.g:1341:1: rule__ClassHeader__ClassnameAssignment_1 : ( RULE_WORD ) ;
    public final void rule__ClassHeader__ClassnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1345:1: ( ( RULE_WORD ) )
            // InternalMyDsl.g:1346:2: ( RULE_WORD )
            {
            // InternalMyDsl.g:1346:2: ( RULE_WORD )
            // InternalMyDsl.g:1347:3: RULE_WORD
            {
             before(grammarAccess.getClassHeaderAccess().getClassnameWORDTerminalRuleCall_1_0()); 
            match(input,RULE_WORD,FOLLOW_2); 
             after(grammarAccess.getClassHeaderAccess().getClassnameWORDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ClassHeader__ClassnameAssignment_1"


    // $ANTLR start "rule__ClassBody__AttributesAssignment_1_0_0"
    // InternalMyDsl.g:1356:1: rule__ClassBody__AttributesAssignment_1_0_0 : ( ruleAttrBody ) ;
    public final void rule__ClassBody__AttributesAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1360:1: ( ( ruleAttrBody ) )
            // InternalMyDsl.g:1361:2: ( ruleAttrBody )
            {
            // InternalMyDsl.g:1361:2: ( ruleAttrBody )
            // InternalMyDsl.g:1362:3: ruleAttrBody
            {
             before(grammarAccess.getClassBodyAccess().getAttributesAttrBodyParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttrBody();

            state._fsp--;

             after(grammarAccess.getClassBodyAccess().getAttributesAttrBodyParserRuleCall_1_0_0_0()); 

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
    // $ANTLR end "rule__ClassBody__AttributesAssignment_1_0_0"


    // $ANTLR start "rule__ClassBody__OperationsAssignment_1_1_0"
    // InternalMyDsl.g:1371:1: rule__ClassBody__OperationsAssignment_1_1_0 : ( ruleOpBody ) ;
    public final void rule__ClassBody__OperationsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( ( ruleOpBody ) )
            // InternalMyDsl.g:1376:2: ( ruleOpBody )
            {
            // InternalMyDsl.g:1376:2: ( ruleOpBody )
            // InternalMyDsl.g:1377:3: ruleOpBody
            {
             before(grammarAccess.getClassBodyAccess().getOperationsOpBodyParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOpBody();

            state._fsp--;

             after(grammarAccess.getClassBodyAccess().getOperationsOpBodyParserRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__ClassBody__OperationsAssignment_1_1_0"


    // $ANTLR start "rule__AttrBody__AttrnameAssignment_1_0"
    // InternalMyDsl.g:1386:1: rule__AttrBody__AttrnameAssignment_1_0 : ( RULE_WORD ) ;
    public final void rule__AttrBody__AttrnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1390:1: ( ( RULE_WORD ) )
            // InternalMyDsl.g:1391:2: ( RULE_WORD )
            {
            // InternalMyDsl.g:1391:2: ( RULE_WORD )
            // InternalMyDsl.g:1392:3: RULE_WORD
            {
             before(grammarAccess.getAttrBodyAccess().getAttrnameWORDTerminalRuleCall_1_0_0()); 
            match(input,RULE_WORD,FOLLOW_2); 
             after(grammarAccess.getAttrBodyAccess().getAttrnameWORDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__AttrBody__AttrnameAssignment_1_0"


    // $ANTLR start "rule__AttrBody__AttrtypeAssignment_1_2"
    // InternalMyDsl.g:1401:1: rule__AttrBody__AttrtypeAssignment_1_2 : ( RULE_WORD ) ;
    public final void rule__AttrBody__AttrtypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1405:1: ( ( RULE_WORD ) )
            // InternalMyDsl.g:1406:2: ( RULE_WORD )
            {
            // InternalMyDsl.g:1406:2: ( RULE_WORD )
            // InternalMyDsl.g:1407:3: RULE_WORD
            {
             before(grammarAccess.getAttrBodyAccess().getAttrtypeWORDTerminalRuleCall_1_2_0()); 
            match(input,RULE_WORD,FOLLOW_2); 
             after(grammarAccess.getAttrBodyAccess().getAttrtypeWORDTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AttrBody__AttrtypeAssignment_1_2"


    // $ANTLR start "rule__OpBody__OpnameAssignment_1"
    // InternalMyDsl.g:1416:1: rule__OpBody__OpnameAssignment_1 : ( RULE_WORD ) ;
    public final void rule__OpBody__OpnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( ( RULE_WORD ) )
            // InternalMyDsl.g:1421:2: ( RULE_WORD )
            {
            // InternalMyDsl.g:1421:2: ( RULE_WORD )
            // InternalMyDsl.g:1422:3: RULE_WORD
            {
             before(grammarAccess.getOpBodyAccess().getOpnameWORDTerminalRuleCall_1_0()); 
            match(input,RULE_WORD,FOLLOW_2); 
             after(grammarAccess.getOpBodyAccess().getOpnameWORDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__OpBody__OpnameAssignment_1"


    // $ANTLR start "rule__OpBody__ArgsAssignment_2_1_0"
    // InternalMyDsl.g:1431:1: rule__OpBody__ArgsAssignment_2_1_0 : ( ruleArgBody ) ;
    public final void rule__OpBody__ArgsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1435:1: ( ( ruleArgBody ) )
            // InternalMyDsl.g:1436:2: ( ruleArgBody )
            {
            // InternalMyDsl.g:1436:2: ( ruleArgBody )
            // InternalMyDsl.g:1437:3: ruleArgBody
            {
             before(grammarAccess.getOpBodyAccess().getArgsArgBodyParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgBody();

            state._fsp--;

             after(grammarAccess.getOpBodyAccess().getArgsArgBodyParserRuleCall_2_1_0_0()); 

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
    // $ANTLR end "rule__OpBody__ArgsAssignment_2_1_0"


    // $ANTLR start "rule__OpBody__ArgsAssignment_2_1_1_0"
    // InternalMyDsl.g:1446:1: rule__OpBody__ArgsAssignment_2_1_1_0 : ( ruleArgBody ) ;
    public final void rule__OpBody__ArgsAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1450:1: ( ( ruleArgBody ) )
            // InternalMyDsl.g:1451:2: ( ruleArgBody )
            {
            // InternalMyDsl.g:1451:2: ( ruleArgBody )
            // InternalMyDsl.g:1452:3: ruleArgBody
            {
             before(grammarAccess.getOpBodyAccess().getArgsArgBodyParserRuleCall_2_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleArgBody();

            state._fsp--;

             after(grammarAccess.getOpBodyAccess().getArgsArgBodyParserRuleCall_2_1_1_0_0()); 

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
    // $ANTLR end "rule__OpBody__ArgsAssignment_2_1_1_0"


    // $ANTLR start "rule__OpBody__ReturntypeAssignment_3_1"
    // InternalMyDsl.g:1461:1: rule__OpBody__ReturntypeAssignment_3_1 : ( RULE_WORD ) ;
    public final void rule__OpBody__ReturntypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1465:1: ( ( RULE_WORD ) )
            // InternalMyDsl.g:1466:2: ( RULE_WORD )
            {
            // InternalMyDsl.g:1466:2: ( RULE_WORD )
            // InternalMyDsl.g:1467:3: RULE_WORD
            {
             before(grammarAccess.getOpBodyAccess().getReturntypeWORDTerminalRuleCall_3_1_0()); 
            match(input,RULE_WORD,FOLLOW_2); 
             after(grammarAccess.getOpBodyAccess().getReturntypeWORDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__OpBody__ReturntypeAssignment_3_1"


    // $ANTLR start "rule__ArgBody__ArgnameAssignment_1_0"
    // InternalMyDsl.g:1476:1: rule__ArgBody__ArgnameAssignment_1_0 : ( RULE_WORD ) ;
    public final void rule__ArgBody__ArgnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1480:1: ( ( RULE_WORD ) )
            // InternalMyDsl.g:1481:2: ( RULE_WORD )
            {
            // InternalMyDsl.g:1481:2: ( RULE_WORD )
            // InternalMyDsl.g:1482:3: RULE_WORD
            {
             before(grammarAccess.getArgBodyAccess().getArgnameWORDTerminalRuleCall_1_0_0()); 
            match(input,RULE_WORD,FOLLOW_2); 
             after(grammarAccess.getArgBodyAccess().getArgnameWORDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ArgBody__ArgnameAssignment_1_0"


    // $ANTLR start "rule__ArgBody__ArgtypeAssignment_1_2"
    // InternalMyDsl.g:1491:1: rule__ArgBody__ArgtypeAssignment_1_2 : ( RULE_WORD ) ;
    public final void rule__ArgBody__ArgtypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( ( RULE_WORD ) )
            // InternalMyDsl.g:1496:2: ( RULE_WORD )
            {
            // InternalMyDsl.g:1496:2: ( RULE_WORD )
            // InternalMyDsl.g:1497:3: RULE_WORD
            {
             before(grammarAccess.getArgBodyAccess().getArgtypeWORDTerminalRuleCall_1_2_0()); 
            match(input,RULE_WORD,FOLLOW_2); 
             after(grammarAccess.getArgBodyAccess().getArgtypeWORDTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ArgBody__ArgtypeAssignment_1_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000020000A0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000082L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});

}