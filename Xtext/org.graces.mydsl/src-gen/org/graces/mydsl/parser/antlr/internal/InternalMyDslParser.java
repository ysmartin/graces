package org.graces.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.graces.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_OPENDECL", "RULE_CLOSEDECL", "RULE_CLOSELINE", "RULE_VISIBILITY", "RULE_OPENARG", "RULE_CLOSEARG", "RULE_LOWERCASE", "RULE_UPPERACASE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'class'", "':'", "'operation'", "','", "'return'", "'in'", "'out'"
    };
    public static final int RULE_WORD=4;
    public static final int RULE_CLOSELINE=7;
    public static final int RULE_VISIBILITY=8;
    public static final int RULE_STRING=15;
    public static final int RULE_OPENARG=9;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_CLOSEARG=10;
    public static final int RULE_LOWERCASE=11;
    public static final int EOF=-1;
    public static final int RULE_ID=14;
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int RULE_UPPERACASE=12;
    public static final int T__26=26;
    public static final int RULE_CLOSEDECL=6;
    public static final int T__27=27;
    public static final int RULE_OPENDECL=5;
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ModelDefinition";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModelDefinition"
    // InternalMyDsl.g:64:1: entryRuleModelDefinition returns [EObject current=null] : iv_ruleModelDefinition= ruleModelDefinition EOF ;
    public final EObject entryRuleModelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelDefinition = null;


        try {
            // InternalMyDsl.g:64:56: (iv_ruleModelDefinition= ruleModelDefinition EOF )
            // InternalMyDsl.g:65:2: iv_ruleModelDefinition= ruleModelDefinition EOF
            {
             newCompositeNode(grammarAccess.getModelDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelDefinition=ruleModelDefinition();

            state._fsp--;

             current =iv_ruleModelDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModelDefinition"


    // $ANTLR start "ruleModelDefinition"
    // InternalMyDsl.g:71:1: ruleModelDefinition returns [EObject current=null] : (otherlv_0= 'model' ( (lv_modelname_1_0= RULE_WORD ) ) this_OPENDECL_2= RULE_OPENDECL this_ClassDecl_3= ruleClassDecl this_CLOSEDECL_4= RULE_CLOSEDECL ) ;
    public final EObject ruleModelDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_modelname_1_0=null;
        Token this_OPENDECL_2=null;
        Token this_CLOSEDECL_4=null;
        EObject this_ClassDecl_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'model' ( (lv_modelname_1_0= RULE_WORD ) ) this_OPENDECL_2= RULE_OPENDECL this_ClassDecl_3= ruleClassDecl this_CLOSEDECL_4= RULE_CLOSEDECL ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'model' ( (lv_modelname_1_0= RULE_WORD ) ) this_OPENDECL_2= RULE_OPENDECL this_ClassDecl_3= ruleClassDecl this_CLOSEDECL_4= RULE_CLOSEDECL )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'model' ( (lv_modelname_1_0= RULE_WORD ) ) this_OPENDECL_2= RULE_OPENDECL this_ClassDecl_3= ruleClassDecl this_CLOSEDECL_4= RULE_CLOSEDECL )
            // InternalMyDsl.g:79:3: otherlv_0= 'model' ( (lv_modelname_1_0= RULE_WORD ) ) this_OPENDECL_2= RULE_OPENDECL this_ClassDecl_3= ruleClassDecl this_CLOSEDECL_4= RULE_CLOSEDECL
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelDefinitionAccess().getModelKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_modelname_1_0= RULE_WORD ) )
            // InternalMyDsl.g:84:4: (lv_modelname_1_0= RULE_WORD )
            {
            // InternalMyDsl.g:84:4: (lv_modelname_1_0= RULE_WORD )
            // InternalMyDsl.g:85:5: lv_modelname_1_0= RULE_WORD
            {
            lv_modelname_1_0=(Token)match(input,RULE_WORD,FOLLOW_4); 

            					newLeafNode(lv_modelname_1_0, grammarAccess.getModelDefinitionAccess().getModelnameWORDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"modelname",
            						lv_modelname_1_0,
            						"org.graces.mydsl.MyDsl.WORD");
            				

            }


            }

            this_OPENDECL_2=(Token)match(input,RULE_OPENDECL,FOLLOW_5); 

            			newLeafNode(this_OPENDECL_2, grammarAccess.getModelDefinitionAccess().getOPENDECLTerminalRuleCall_2());
            		

            			newCompositeNode(grammarAccess.getModelDefinitionAccess().getClassDeclParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_ClassDecl_3=ruleClassDecl();

            state._fsp--;


            			current = this_ClassDecl_3;
            			afterParserOrEnumRuleCall();
            		
            this_CLOSEDECL_4=(Token)match(input,RULE_CLOSEDECL,FOLLOW_2); 

            			newLeafNode(this_CLOSEDECL_4, grammarAccess.getModelDefinitionAccess().getCLOSEDECLTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleModelDefinition"


    // $ANTLR start "entryRuleClassDecl"
    // InternalMyDsl.g:121:1: entryRuleClassDecl returns [EObject current=null] : iv_ruleClassDecl= ruleClassDecl EOF ;
    public final EObject entryRuleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDecl = null;


        try {
            // InternalMyDsl.g:121:50: (iv_ruleClassDecl= ruleClassDecl EOF )
            // InternalMyDsl.g:122:2: iv_ruleClassDecl= ruleClassDecl EOF
            {
             newCompositeNode(grammarAccess.getClassDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDecl=ruleClassDecl();

            state._fsp--;

             current =iv_ruleClassDecl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassDecl"


    // $ANTLR start "ruleClassDecl"
    // InternalMyDsl.g:128:1: ruleClassDecl returns [EObject current=null] : ( ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) ) ) ;
    public final EObject ruleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:134:2: ( ( ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) ) ) )
            // InternalMyDsl.g:135:2: ( ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) ) )
            {
            // InternalMyDsl.g:135:2: ( ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) ) )
            // InternalMyDsl.g:136:3: ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) )
            {
            // InternalMyDsl.g:136:3: ( (lv_header_0_0= ruleClassHeader ) )
            // InternalMyDsl.g:137:4: (lv_header_0_0= ruleClassHeader )
            {
            // InternalMyDsl.g:137:4: (lv_header_0_0= ruleClassHeader )
            // InternalMyDsl.g:138:5: lv_header_0_0= ruleClassHeader
            {

            					newCompositeNode(grammarAccess.getClassDeclAccess().getHeaderClassHeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_header_0_0=ruleClassHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDeclRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_0_0,
            						"org.graces.mydsl.MyDsl.ClassHeader");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:155:3: ( (lv_body_1_0= ruleClassBody ) )
            // InternalMyDsl.g:156:4: (lv_body_1_0= ruleClassBody )
            {
            // InternalMyDsl.g:156:4: (lv_body_1_0= ruleClassBody )
            // InternalMyDsl.g:157:5: lv_body_1_0= ruleClassBody
            {

            					newCompositeNode(grammarAccess.getClassDeclAccess().getBodyClassBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleClassBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDeclRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"org.graces.mydsl.MyDsl.ClassBody");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleClassDecl"


    // $ANTLR start "entryRuleClassHeader"
    // InternalMyDsl.g:178:1: entryRuleClassHeader returns [EObject current=null] : iv_ruleClassHeader= ruleClassHeader EOF ;
    public final EObject entryRuleClassHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassHeader = null;


        try {
            // InternalMyDsl.g:178:52: (iv_ruleClassHeader= ruleClassHeader EOF )
            // InternalMyDsl.g:179:2: iv_ruleClassHeader= ruleClassHeader EOF
            {
             newCompositeNode(grammarAccess.getClassHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassHeader=ruleClassHeader();

            state._fsp--;

             current =iv_ruleClassHeader; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassHeader"


    // $ANTLR start "ruleClassHeader"
    // InternalMyDsl.g:185:1: ruleClassHeader returns [EObject current=null] : (otherlv_0= 'class' ( (lv_classname_1_0= RULE_WORD ) ) ) ;
    public final EObject ruleClassHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_classname_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:191:2: ( (otherlv_0= 'class' ( (lv_classname_1_0= RULE_WORD ) ) ) )
            // InternalMyDsl.g:192:2: (otherlv_0= 'class' ( (lv_classname_1_0= RULE_WORD ) ) )
            {
            // InternalMyDsl.g:192:2: (otherlv_0= 'class' ( (lv_classname_1_0= RULE_WORD ) ) )
            // InternalMyDsl.g:193:3: otherlv_0= 'class' ( (lv_classname_1_0= RULE_WORD ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClassHeaderAccess().getClassKeyword_0());
            		
            // InternalMyDsl.g:197:3: ( (lv_classname_1_0= RULE_WORD ) )
            // InternalMyDsl.g:198:4: (lv_classname_1_0= RULE_WORD )
            {
            // InternalMyDsl.g:198:4: (lv_classname_1_0= RULE_WORD )
            // InternalMyDsl.g:199:5: lv_classname_1_0= RULE_WORD
            {
            lv_classname_1_0=(Token)match(input,RULE_WORD,FOLLOW_2); 

            					newLeafNode(lv_classname_1_0, grammarAccess.getClassHeaderAccess().getClassnameWORDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"classname",
            						lv_classname_1_0,
            						"org.graces.mydsl.MyDsl.WORD");
            				

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
    // $ANTLR end "ruleClassHeader"


    // $ANTLR start "entryRuleClassBody"
    // InternalMyDsl.g:219:1: entryRuleClassBody returns [EObject current=null] : iv_ruleClassBody= ruleClassBody EOF ;
    public final EObject entryRuleClassBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassBody = null;


        try {
            // InternalMyDsl.g:219:50: (iv_ruleClassBody= ruleClassBody EOF )
            // InternalMyDsl.g:220:2: iv_ruleClassBody= ruleClassBody EOF
            {
             newCompositeNode(grammarAccess.getClassBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassBody=ruleClassBody();

            state._fsp--;

             current =iv_ruleClassBody; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassBody"


    // $ANTLR start "ruleClassBody"
    // InternalMyDsl.g:226:1: ruleClassBody returns [EObject current=null] : (this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL ) ;
    public final EObject ruleClassBody() throws RecognitionException {
        EObject current = null;

        Token this_OPENDECL_0=null;
        Token this_CLOSELINE_2=null;
        Token this_CLOSELINE_4=null;
        Token this_CLOSEDECL_5=null;
        EObject lv_attributes_1_0 = null;

        EObject lv_operations_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:232:2: ( (this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL ) )
            // InternalMyDsl.g:233:2: (this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL )
            {
            // InternalMyDsl.g:233:2: (this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL )
            // InternalMyDsl.g:234:3: this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL
            {
            this_OPENDECL_0=(Token)match(input,RULE_OPENDECL,FOLLOW_7); 

            			newLeafNode(this_OPENDECL_0, grammarAccess.getClassBodyAccess().getOPENDECLTerminalRuleCall_0());
            		
            // InternalMyDsl.g:238:3: ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_VISIBILITY) ) {
                    alt1=1;
                }
                else if ( (LA1_0==23) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:239:4: ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE )
            	    {
            	    // InternalMyDsl.g:239:4: ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE )
            	    // InternalMyDsl.g:240:5: ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE
            	    {
            	    // InternalMyDsl.g:240:5: ( (lv_attributes_1_0= ruleAttrBody ) )
            	    // InternalMyDsl.g:241:6: (lv_attributes_1_0= ruleAttrBody )
            	    {
            	    // InternalMyDsl.g:241:6: (lv_attributes_1_0= ruleAttrBody )
            	    // InternalMyDsl.g:242:7: lv_attributes_1_0= ruleAttrBody
            	    {

            	    							newCompositeNode(grammarAccess.getClassBodyAccess().getAttributesAttrBodyParserRuleCall_1_0_0_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_attributes_1_0=ruleAttrBody();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getClassBodyRule());
            	    							}
            	    							add(
            	    								current,
            	    								"attributes",
            	    								lv_attributes_1_0,
            	    								"org.graces.mydsl.MyDsl.AttrBody");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    this_CLOSELINE_2=(Token)match(input,RULE_CLOSELINE,FOLLOW_7); 

            	    					newLeafNode(this_CLOSELINE_2, grammarAccess.getClassBodyAccess().getCLOSELINETerminalRuleCall_1_0_1());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:265:4: ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE )
            	    {
            	    // InternalMyDsl.g:265:4: ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE )
            	    // InternalMyDsl.g:266:5: ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE
            	    {
            	    // InternalMyDsl.g:266:5: ( (lv_operations_3_0= ruleOpBody ) )
            	    // InternalMyDsl.g:267:6: (lv_operations_3_0= ruleOpBody )
            	    {
            	    // InternalMyDsl.g:267:6: (lv_operations_3_0= ruleOpBody )
            	    // InternalMyDsl.g:268:7: lv_operations_3_0= ruleOpBody
            	    {

            	    							newCompositeNode(grammarAccess.getClassBodyAccess().getOperationsOpBodyParserRuleCall_1_1_0_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_operations_3_0=ruleOpBody();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getClassBodyRule());
            	    							}
            	    							add(
            	    								current,
            	    								"operations",
            	    								lv_operations_3_0,
            	    								"org.graces.mydsl.MyDsl.OpBody");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    this_CLOSELINE_4=(Token)match(input,RULE_CLOSELINE,FOLLOW_7); 

            	    					newLeafNode(this_CLOSELINE_4, grammarAccess.getClassBodyAccess().getCLOSELINETerminalRuleCall_1_1_1());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_CLOSEDECL_5=(Token)match(input,RULE_CLOSEDECL,FOLLOW_2); 

            			newLeafNode(this_CLOSEDECL_5, grammarAccess.getClassBodyAccess().getCLOSEDECLTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleClassBody"


    // $ANTLR start "entryRuleAttrBody"
    // InternalMyDsl.g:299:1: entryRuleAttrBody returns [EObject current=null] : iv_ruleAttrBody= ruleAttrBody EOF ;
    public final EObject entryRuleAttrBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrBody = null;


        try {
            // InternalMyDsl.g:299:49: (iv_ruleAttrBody= ruleAttrBody EOF )
            // InternalMyDsl.g:300:2: iv_ruleAttrBody= ruleAttrBody EOF
            {
             newCompositeNode(grammarAccess.getAttrBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttrBody=ruleAttrBody();

            state._fsp--;

             current =iv_ruleAttrBody; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttrBody"


    // $ANTLR start "ruleAttrBody"
    // InternalMyDsl.g:306:1: ruleAttrBody returns [EObject current=null] : (this_VISIBILITY_0= RULE_VISIBILITY ( ( (lv_attrname_1_0= RULE_WORD ) ) otherlv_2= ':' ( (lv_attrtype_3_0= RULE_WORD ) ) ) ) ;
    public final EObject ruleAttrBody() throws RecognitionException {
        EObject current = null;

        Token this_VISIBILITY_0=null;
        Token lv_attrname_1_0=null;
        Token otherlv_2=null;
        Token lv_attrtype_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:312:2: ( (this_VISIBILITY_0= RULE_VISIBILITY ( ( (lv_attrname_1_0= RULE_WORD ) ) otherlv_2= ':' ( (lv_attrtype_3_0= RULE_WORD ) ) ) ) )
            // InternalMyDsl.g:313:2: (this_VISIBILITY_0= RULE_VISIBILITY ( ( (lv_attrname_1_0= RULE_WORD ) ) otherlv_2= ':' ( (lv_attrtype_3_0= RULE_WORD ) ) ) )
            {
            // InternalMyDsl.g:313:2: (this_VISIBILITY_0= RULE_VISIBILITY ( ( (lv_attrname_1_0= RULE_WORD ) ) otherlv_2= ':' ( (lv_attrtype_3_0= RULE_WORD ) ) ) )
            // InternalMyDsl.g:314:3: this_VISIBILITY_0= RULE_VISIBILITY ( ( (lv_attrname_1_0= RULE_WORD ) ) otherlv_2= ':' ( (lv_attrtype_3_0= RULE_WORD ) ) )
            {
            this_VISIBILITY_0=(Token)match(input,RULE_VISIBILITY,FOLLOW_3); 

            			newLeafNode(this_VISIBILITY_0, grammarAccess.getAttrBodyAccess().getVISIBILITYTerminalRuleCall_0());
            		
            // InternalMyDsl.g:318:3: ( ( (lv_attrname_1_0= RULE_WORD ) ) otherlv_2= ':' ( (lv_attrtype_3_0= RULE_WORD ) ) )
            // InternalMyDsl.g:319:4: ( (lv_attrname_1_0= RULE_WORD ) ) otherlv_2= ':' ( (lv_attrtype_3_0= RULE_WORD ) )
            {
            // InternalMyDsl.g:319:4: ( (lv_attrname_1_0= RULE_WORD ) )
            // InternalMyDsl.g:320:5: (lv_attrname_1_0= RULE_WORD )
            {
            // InternalMyDsl.g:320:5: (lv_attrname_1_0= RULE_WORD )
            // InternalMyDsl.g:321:6: lv_attrname_1_0= RULE_WORD
            {
            lv_attrname_1_0=(Token)match(input,RULE_WORD,FOLLOW_9); 

            						newLeafNode(lv_attrname_1_0, grammarAccess.getAttrBodyAccess().getAttrnameWORDTerminalRuleCall_1_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getAttrBodyRule());
            						}
            						setWithLastConsumed(
            							current,
            							"attrname",
            							lv_attrname_1_0,
            							"org.graces.mydsl.MyDsl.WORD");
            					

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getAttrBodyAccess().getColonKeyword_1_1());
            			
            // InternalMyDsl.g:341:4: ( (lv_attrtype_3_0= RULE_WORD ) )
            // InternalMyDsl.g:342:5: (lv_attrtype_3_0= RULE_WORD )
            {
            // InternalMyDsl.g:342:5: (lv_attrtype_3_0= RULE_WORD )
            // InternalMyDsl.g:343:6: lv_attrtype_3_0= RULE_WORD
            {
            lv_attrtype_3_0=(Token)match(input,RULE_WORD,FOLLOW_2); 

            						newLeafNode(lv_attrtype_3_0, grammarAccess.getAttrBodyAccess().getAttrtypeWORDTerminalRuleCall_1_2_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getAttrBodyRule());
            						}
            						setWithLastConsumed(
            							current,
            							"attrtype",
            							lv_attrtype_3_0,
            							"org.graces.mydsl.MyDsl.WORD");
            					

            }


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
    // $ANTLR end "ruleAttrBody"


    // $ANTLR start "entryRuleOpBody"
    // InternalMyDsl.g:364:1: entryRuleOpBody returns [EObject current=null] : iv_ruleOpBody= ruleOpBody EOF ;
    public final EObject entryRuleOpBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpBody = null;


        try {
            // InternalMyDsl.g:364:47: (iv_ruleOpBody= ruleOpBody EOF )
            // InternalMyDsl.g:365:2: iv_ruleOpBody= ruleOpBody EOF
            {
             newCompositeNode(grammarAccess.getOpBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpBody=ruleOpBody();

            state._fsp--;

             current =iv_ruleOpBody; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOpBody"


    // $ANTLR start "ruleOpBody"
    // InternalMyDsl.g:371:1: ruleOpBody returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_opname_1_0= RULE_WORD ) ) (this_OPENARG_2= RULE_OPENARG ( ( (lv_args_3_0= ruleArgBody ) ) | ( ( (lv_args_4_0= ruleArgBody ) ) otherlv_5= ',' ) )+ this_CLOSEARG_6= RULE_CLOSEARG )? (otherlv_7= 'return' ( (lv_returntype_8_0= RULE_WORD ) ) )? ) ;
    public final EObject ruleOpBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_opname_1_0=null;
        Token this_OPENARG_2=null;
        Token otherlv_5=null;
        Token this_CLOSEARG_6=null;
        Token otherlv_7=null;
        Token lv_returntype_8_0=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:377:2: ( (otherlv_0= 'operation' ( (lv_opname_1_0= RULE_WORD ) ) (this_OPENARG_2= RULE_OPENARG ( ( (lv_args_3_0= ruleArgBody ) ) | ( ( (lv_args_4_0= ruleArgBody ) ) otherlv_5= ',' ) )+ this_CLOSEARG_6= RULE_CLOSEARG )? (otherlv_7= 'return' ( (lv_returntype_8_0= RULE_WORD ) ) )? ) )
            // InternalMyDsl.g:378:2: (otherlv_0= 'operation' ( (lv_opname_1_0= RULE_WORD ) ) (this_OPENARG_2= RULE_OPENARG ( ( (lv_args_3_0= ruleArgBody ) ) | ( ( (lv_args_4_0= ruleArgBody ) ) otherlv_5= ',' ) )+ this_CLOSEARG_6= RULE_CLOSEARG )? (otherlv_7= 'return' ( (lv_returntype_8_0= RULE_WORD ) ) )? )
            {
            // InternalMyDsl.g:378:2: (otherlv_0= 'operation' ( (lv_opname_1_0= RULE_WORD ) ) (this_OPENARG_2= RULE_OPENARG ( ( (lv_args_3_0= ruleArgBody ) ) | ( ( (lv_args_4_0= ruleArgBody ) ) otherlv_5= ',' ) )+ this_CLOSEARG_6= RULE_CLOSEARG )? (otherlv_7= 'return' ( (lv_returntype_8_0= RULE_WORD ) ) )? )
            // InternalMyDsl.g:379:3: otherlv_0= 'operation' ( (lv_opname_1_0= RULE_WORD ) ) (this_OPENARG_2= RULE_OPENARG ( ( (lv_args_3_0= ruleArgBody ) ) | ( ( (lv_args_4_0= ruleArgBody ) ) otherlv_5= ',' ) )+ this_CLOSEARG_6= RULE_CLOSEARG )? (otherlv_7= 'return' ( (lv_returntype_8_0= RULE_WORD ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpBodyAccess().getOperationKeyword_0());
            		
            // InternalMyDsl.g:383:3: ( (lv_opname_1_0= RULE_WORD ) )
            // InternalMyDsl.g:384:4: (lv_opname_1_0= RULE_WORD )
            {
            // InternalMyDsl.g:384:4: (lv_opname_1_0= RULE_WORD )
            // InternalMyDsl.g:385:5: lv_opname_1_0= RULE_WORD
            {
            lv_opname_1_0=(Token)match(input,RULE_WORD,FOLLOW_10); 

            					newLeafNode(lv_opname_1_0, grammarAccess.getOpBodyAccess().getOpnameWORDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpBodyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"opname",
            						lv_opname_1_0,
            						"org.graces.mydsl.MyDsl.WORD");
            				

            }


            }

            // InternalMyDsl.g:401:3: (this_OPENARG_2= RULE_OPENARG ( ( (lv_args_3_0= ruleArgBody ) ) | ( ( (lv_args_4_0= ruleArgBody ) ) otherlv_5= ',' ) )+ this_CLOSEARG_6= RULE_CLOSEARG )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_OPENARG) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:402:4: this_OPENARG_2= RULE_OPENARG ( ( (lv_args_3_0= ruleArgBody ) ) | ( ( (lv_args_4_0= ruleArgBody ) ) otherlv_5= ',' ) )+ this_CLOSEARG_6= RULE_CLOSEARG
                    {
                    this_OPENARG_2=(Token)match(input,RULE_OPENARG,FOLLOW_11); 

                    				newLeafNode(this_OPENARG_2, grammarAccess.getOpBodyAccess().getOPENARGTerminalRuleCall_2_0());
                    			
                    // InternalMyDsl.g:406:4: ( ( (lv_args_3_0= ruleArgBody ) ) | ( ( (lv_args_4_0= ruleArgBody ) ) otherlv_5= ',' ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==26) ) {
                            int LA2_2 = input.LA(2);

                            if ( (LA2_2==RULE_WORD) ) {
                                int LA2_4 = input.LA(3);

                                if ( (LA2_4==22) ) {
                                    int LA2_5 = input.LA(4);

                                    if ( (LA2_5==RULE_WORD) ) {
                                        int LA2_6 = input.LA(5);

                                        if ( (LA2_6==24) ) {
                                            alt2=2;
                                        }
                                        else if ( (LA2_6==RULE_CLOSEARG||(LA2_6>=26 && LA2_6<=27)) ) {
                                            alt2=1;
                                        }


                                    }


                                }


                            }


                        }
                        else if ( (LA2_0==27) ) {
                            int LA2_3 = input.LA(2);

                            if ( (LA2_3==RULE_WORD) ) {
                                int LA2_4 = input.LA(3);

                                if ( (LA2_4==22) ) {
                                    int LA2_5 = input.LA(4);

                                    if ( (LA2_5==RULE_WORD) ) {
                                        int LA2_6 = input.LA(5);

                                        if ( (LA2_6==24) ) {
                                            alt2=2;
                                        }
                                        else if ( (LA2_6==RULE_CLOSEARG||(LA2_6>=26 && LA2_6<=27)) ) {
                                            alt2=1;
                                        }


                                    }


                                }


                            }


                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:407:5: ( (lv_args_3_0= ruleArgBody ) )
                    	    {
                    	    // InternalMyDsl.g:407:5: ( (lv_args_3_0= ruleArgBody ) )
                    	    // InternalMyDsl.g:408:6: (lv_args_3_0= ruleArgBody )
                    	    {
                    	    // InternalMyDsl.g:408:6: (lv_args_3_0= ruleArgBody )
                    	    // InternalMyDsl.g:409:7: lv_args_3_0= ruleArgBody
                    	    {

                    	    							newCompositeNode(grammarAccess.getOpBodyAccess().getArgsArgBodyParserRuleCall_2_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_args_3_0=ruleArgBody();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOpBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_3_0,
                    	    								"org.graces.mydsl.MyDsl.ArgBody");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:427:5: ( ( (lv_args_4_0= ruleArgBody ) ) otherlv_5= ',' )
                    	    {
                    	    // InternalMyDsl.g:427:5: ( ( (lv_args_4_0= ruleArgBody ) ) otherlv_5= ',' )
                    	    // InternalMyDsl.g:428:6: ( (lv_args_4_0= ruleArgBody ) ) otherlv_5= ','
                    	    {
                    	    // InternalMyDsl.g:428:6: ( (lv_args_4_0= ruleArgBody ) )
                    	    // InternalMyDsl.g:429:7: (lv_args_4_0= ruleArgBody )
                    	    {
                    	    // InternalMyDsl.g:429:7: (lv_args_4_0= ruleArgBody )
                    	    // InternalMyDsl.g:430:8: lv_args_4_0= ruleArgBody
                    	    {

                    	    								newCompositeNode(grammarAccess.getOpBodyAccess().getArgsArgBodyParserRuleCall_2_1_1_0_0());
                    	    							
                    	    pushFollow(FOLLOW_13);
                    	    lv_args_4_0=ruleArgBody();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getOpBodyRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"args",
                    	    									lv_args_4_0,
                    	    									"org.graces.mydsl.MyDsl.ArgBody");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    otherlv_5=(Token)match(input,24,FOLLOW_12); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getOpBodyAccess().getCommaKeyword_2_1_1_1());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    this_CLOSEARG_6=(Token)match(input,RULE_CLOSEARG,FOLLOW_14); 

                    				newLeafNode(this_CLOSEARG_6, grammarAccess.getOpBodyAccess().getCLOSEARGTerminalRuleCall_2_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:458:3: (otherlv_7= 'return' ( (lv_returntype_8_0= RULE_WORD ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:459:4: otherlv_7= 'return' ( (lv_returntype_8_0= RULE_WORD ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getOpBodyAccess().getReturnKeyword_3_0());
                    			
                    // InternalMyDsl.g:463:4: ( (lv_returntype_8_0= RULE_WORD ) )
                    // InternalMyDsl.g:464:5: (lv_returntype_8_0= RULE_WORD )
                    {
                    // InternalMyDsl.g:464:5: (lv_returntype_8_0= RULE_WORD )
                    // InternalMyDsl.g:465:6: lv_returntype_8_0= RULE_WORD
                    {
                    lv_returntype_8_0=(Token)match(input,RULE_WORD,FOLLOW_2); 

                    						newLeafNode(lv_returntype_8_0, grammarAccess.getOpBodyAccess().getReturntypeWORDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpBodyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"returntype",
                    							lv_returntype_8_0,
                    							"org.graces.mydsl.MyDsl.WORD");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleOpBody"


    // $ANTLR start "entryRuleArgBody"
    // InternalMyDsl.g:486:1: entryRuleArgBody returns [EObject current=null] : iv_ruleArgBody= ruleArgBody EOF ;
    public final EObject entryRuleArgBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgBody = null;


        try {
            // InternalMyDsl.g:486:48: (iv_ruleArgBody= ruleArgBody EOF )
            // InternalMyDsl.g:487:2: iv_ruleArgBody= ruleArgBody EOF
            {
             newCompositeNode(grammarAccess.getArgBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgBody=ruleArgBody();

            state._fsp--;

             current =iv_ruleArgBody; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArgBody"


    // $ANTLR start "ruleArgBody"
    // InternalMyDsl.g:493:1: ruleArgBody returns [EObject current=null] : ( (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_argname_2_0= RULE_WORD ) ) otherlv_3= ':' ( (lv_argtype_4_0= RULE_WORD ) ) ) ) ;
    public final EObject ruleArgBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_argname_2_0=null;
        Token otherlv_3=null;
        Token lv_argtype_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:499:2: ( ( (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_argname_2_0= RULE_WORD ) ) otherlv_3= ':' ( (lv_argtype_4_0= RULE_WORD ) ) ) ) )
            // InternalMyDsl.g:500:2: ( (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_argname_2_0= RULE_WORD ) ) otherlv_3= ':' ( (lv_argtype_4_0= RULE_WORD ) ) ) )
            {
            // InternalMyDsl.g:500:2: ( (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_argname_2_0= RULE_WORD ) ) otherlv_3= ':' ( (lv_argtype_4_0= RULE_WORD ) ) ) )
            // InternalMyDsl.g:501:3: (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_argname_2_0= RULE_WORD ) ) otherlv_3= ':' ( (lv_argtype_4_0= RULE_WORD ) ) )
            {
            // InternalMyDsl.g:501:3: (otherlv_0= 'in' | otherlv_1= 'out' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:502:4: otherlv_0= 'in'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getArgBodyAccess().getInKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:507:4: otherlv_1= 'out'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getArgBodyAccess().getOutKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:512:3: ( ( (lv_argname_2_0= RULE_WORD ) ) otherlv_3= ':' ( (lv_argtype_4_0= RULE_WORD ) ) )
            // InternalMyDsl.g:513:4: ( (lv_argname_2_0= RULE_WORD ) ) otherlv_3= ':' ( (lv_argtype_4_0= RULE_WORD ) )
            {
            // InternalMyDsl.g:513:4: ( (lv_argname_2_0= RULE_WORD ) )
            // InternalMyDsl.g:514:5: (lv_argname_2_0= RULE_WORD )
            {
            // InternalMyDsl.g:514:5: (lv_argname_2_0= RULE_WORD )
            // InternalMyDsl.g:515:6: lv_argname_2_0= RULE_WORD
            {
            lv_argname_2_0=(Token)match(input,RULE_WORD,FOLLOW_9); 

            						newLeafNode(lv_argname_2_0, grammarAccess.getArgBodyAccess().getArgnameWORDTerminalRuleCall_1_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getArgBodyRule());
            						}
            						setWithLastConsumed(
            							current,
            							"argname",
            							lv_argname_2_0,
            							"org.graces.mydsl.MyDsl.WORD");
            					

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getArgBodyAccess().getColonKeyword_1_1());
            			
            // InternalMyDsl.g:535:4: ( (lv_argtype_4_0= RULE_WORD ) )
            // InternalMyDsl.g:536:5: (lv_argtype_4_0= RULE_WORD )
            {
            // InternalMyDsl.g:536:5: (lv_argtype_4_0= RULE_WORD )
            // InternalMyDsl.g:537:6: lv_argtype_4_0= RULE_WORD
            {
            lv_argtype_4_0=(Token)match(input,RULE_WORD,FOLLOW_2); 

            						newLeafNode(lv_argtype_4_0, grammarAccess.getArgBodyAccess().getArgtypeWORDTerminalRuleCall_1_2_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getArgBodyRule());
            						}
            						setWithLastConsumed(
            							current,
            							"argtype",
            							lv_argtype_4_0,
            							"org.graces.mydsl.MyDsl.WORD");
            					

            }


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
    // $ANTLR end "ruleArgBody"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800140L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000202L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000C000400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000002L});

}