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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_OPENDECL", "RULE_CLOSEDECL", "RULE_CLOSELINE", "RULE_VISIBILITY", "RULE_OPENARG", "RULE_CLOSEARG", "RULE_LOWERCASE", "RULE_UPPERCASE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'class'", "':'", "'operation'", "','", "'return'", "'in'", "'out'"
    };
    public static final int RULE_CLOSELINE=7;
    public static final int RULE_VISIBILITY=8;
    public static final int RULE_STRING=14;
    public static final int RULE_OPENARG=9;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int RULE_CLOSEARG=10;
    public static final int RULE_LOWERCASE=11;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__26=26;
    public static final int RULE_CLOSEDECL=6;
    public static final int RULE_OPENDECL=5;
    public static final int RULE_INT=13;
    public static final int RULE_UPPERCASE=12;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
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
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) this_OPENDECL_2= RULE_OPENDECL ( (lv_clazzes_3_0= ruleClass ) )* this_CLOSEDECL_4= RULE_CLOSEDECL ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_OPENDECL_2=null;
        Token this_CLOSEDECL_4=null;
        EObject lv_clazzes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) this_OPENDECL_2= RULE_OPENDECL ( (lv_clazzes_3_0= ruleClass ) )* this_CLOSEDECL_4= RULE_CLOSEDECL ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) this_OPENDECL_2= RULE_OPENDECL ( (lv_clazzes_3_0= ruleClass ) )* this_CLOSEDECL_4= RULE_CLOSEDECL )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) this_OPENDECL_2= RULE_OPENDECL ( (lv_clazzes_3_0= ruleClass ) )* this_CLOSEDECL_4= RULE_CLOSEDECL )
            // InternalMyDsl.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) this_OPENDECL_2= RULE_OPENDECL ( (lv_clazzes_3_0= ruleClass ) )* this_CLOSEDECL_4= RULE_CLOSEDECL
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_OPENDECL_2=(Token)match(input,RULE_OPENDECL,FOLLOW_5); 

            			newLeafNode(this_OPENDECL_2, grammarAccess.getModelAccess().getOPENDECLTerminalRuleCall_2());
            		
            // InternalMyDsl.g:105:3: ( (lv_clazzes_3_0= ruleClass ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:106:4: (lv_clazzes_3_0= ruleClass )
            	    {
            	    // InternalMyDsl.g:106:4: (lv_clazzes_3_0= ruleClass )
            	    // InternalMyDsl.g:107:5: lv_clazzes_3_0= ruleClass
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getClazzesClassParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_clazzes_3_0=ruleClass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clazzes",
            	    						lv_clazzes_3_0,
            	    						"org.graces.mydsl.MyDsl.Class");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_CLOSEDECL_4=(Token)match(input,RULE_CLOSEDECL,FOLLOW_2); 

            			newLeafNode(this_CLOSEDECL_4, grammarAccess.getModelAccess().getCLOSEDECLTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleClass"
    // InternalMyDsl.g:132:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalMyDsl.g:132:46: (iv_ruleClass= ruleClass EOF )
            // InternalMyDsl.g:133:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalMyDsl.g:139:1: ruleClass returns [EObject current=null] : ( ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:145:2: ( ( ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) ) ) )
            // InternalMyDsl.g:146:2: ( ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) ) )
            {
            // InternalMyDsl.g:146:2: ( ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) ) )
            // InternalMyDsl.g:147:3: ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) )
            {
            // InternalMyDsl.g:147:3: ( (lv_header_0_0= ruleClassHeader ) )
            // InternalMyDsl.g:148:4: (lv_header_0_0= ruleClassHeader )
            {
            // InternalMyDsl.g:148:4: (lv_header_0_0= ruleClassHeader )
            // InternalMyDsl.g:149:5: lv_header_0_0= ruleClassHeader
            {

            					newCompositeNode(grammarAccess.getClassAccess().getHeaderClassHeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_header_0_0=ruleClassHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_0_0,
            						"org.graces.mydsl.MyDsl.ClassHeader");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:166:3: ( (lv_body_1_0= ruleClassBody ) )
            // InternalMyDsl.g:167:4: (lv_body_1_0= ruleClassBody )
            {
            // InternalMyDsl.g:167:4: (lv_body_1_0= ruleClassBody )
            // InternalMyDsl.g:168:5: lv_body_1_0= ruleClassBody
            {

            					newCompositeNode(grammarAccess.getClassAccess().getBodyClassBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleClassBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleClassHeader"
    // InternalMyDsl.g:189:1: entryRuleClassHeader returns [EObject current=null] : iv_ruleClassHeader= ruleClassHeader EOF ;
    public final EObject entryRuleClassHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassHeader = null;


        try {
            // InternalMyDsl.g:189:52: (iv_ruleClassHeader= ruleClassHeader EOF )
            // InternalMyDsl.g:190:2: iv_ruleClassHeader= ruleClassHeader EOF
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
    // InternalMyDsl.g:196:1: ruleClassHeader returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClassHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:202:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:203:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:203:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:204:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClassHeaderAccess().getClassKeyword_0());
            		
            // InternalMyDsl.g:208:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:209:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:209:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:210:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClassHeaderAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalMyDsl.g:230:1: entryRuleClassBody returns [EObject current=null] : iv_ruleClassBody= ruleClassBody EOF ;
    public final EObject entryRuleClassBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassBody = null;


        try {
            // InternalMyDsl.g:230:50: (iv_ruleClassBody= ruleClassBody EOF )
            // InternalMyDsl.g:231:2: iv_ruleClassBody= ruleClassBody EOF
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
    // InternalMyDsl.g:237:1: ruleClassBody returns [EObject current=null] : (this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL ) ;
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
            // InternalMyDsl.g:243:2: ( (this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL ) )
            // InternalMyDsl.g:244:2: (this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL )
            {
            // InternalMyDsl.g:244:2: (this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL )
            // InternalMyDsl.g:245:3: this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL
            {
            this_OPENDECL_0=(Token)match(input,RULE_OPENDECL,FOLLOW_6); 

            			newLeafNode(this_OPENDECL_0, grammarAccess.getClassBodyAccess().getOPENDECLTerminalRuleCall_0());
            		
            // InternalMyDsl.g:249:3: ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_VISIBILITY) ) {
                    alt2=1;
                }
                else if ( (LA2_0==22) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:250:4: ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE )
            	    {
            	    // InternalMyDsl.g:250:4: ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE )
            	    // InternalMyDsl.g:251:5: ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE
            	    {
            	    // InternalMyDsl.g:251:5: ( (lv_attributes_1_0= ruleAttrBody ) )
            	    // InternalMyDsl.g:252:6: (lv_attributes_1_0= ruleAttrBody )
            	    {
            	    // InternalMyDsl.g:252:6: (lv_attributes_1_0= ruleAttrBody )
            	    // InternalMyDsl.g:253:7: lv_attributes_1_0= ruleAttrBody
            	    {

            	    							newCompositeNode(grammarAccess.getClassBodyAccess().getAttributesAttrBodyParserRuleCall_1_0_0_0());
            	    						
            	    pushFollow(FOLLOW_7);
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

            	    this_CLOSELINE_2=(Token)match(input,RULE_CLOSELINE,FOLLOW_6); 

            	    					newLeafNode(this_CLOSELINE_2, grammarAccess.getClassBodyAccess().getCLOSELINETerminalRuleCall_1_0_1());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:276:4: ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE )
            	    {
            	    // InternalMyDsl.g:276:4: ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE )
            	    // InternalMyDsl.g:277:5: ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE
            	    {
            	    // InternalMyDsl.g:277:5: ( (lv_operations_3_0= ruleOpBody ) )
            	    // InternalMyDsl.g:278:6: (lv_operations_3_0= ruleOpBody )
            	    {
            	    // InternalMyDsl.g:278:6: (lv_operations_3_0= ruleOpBody )
            	    // InternalMyDsl.g:279:7: lv_operations_3_0= ruleOpBody
            	    {

            	    							newCompositeNode(grammarAccess.getClassBodyAccess().getOperationsOpBodyParserRuleCall_1_1_0_0());
            	    						
            	    pushFollow(FOLLOW_7);
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

            	    this_CLOSELINE_4=(Token)match(input,RULE_CLOSELINE,FOLLOW_6); 

            	    					newLeafNode(this_CLOSELINE_4, grammarAccess.getClassBodyAccess().getCLOSELINETerminalRuleCall_1_1_1());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalMyDsl.g:310:1: entryRuleAttrBody returns [EObject current=null] : iv_ruleAttrBody= ruleAttrBody EOF ;
    public final EObject entryRuleAttrBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrBody = null;


        try {
            // InternalMyDsl.g:310:49: (iv_ruleAttrBody= ruleAttrBody EOF )
            // InternalMyDsl.g:311:2: iv_ruleAttrBody= ruleAttrBody EOF
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
    // InternalMyDsl.g:317:1: ruleAttrBody returns [EObject current=null] : (this_VISIBILITY_0= RULE_VISIBILITY ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAttrBody() throws RecognitionException {
        EObject current = null;

        Token this_VISIBILITY_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:323:2: ( (this_VISIBILITY_0= RULE_VISIBILITY ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) ) ) )
            // InternalMyDsl.g:324:2: (this_VISIBILITY_0= RULE_VISIBILITY ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) ) )
            {
            // InternalMyDsl.g:324:2: (this_VISIBILITY_0= RULE_VISIBILITY ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:325:3: this_VISIBILITY_0= RULE_VISIBILITY ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )
            {
            this_VISIBILITY_0=(Token)match(input,RULE_VISIBILITY,FOLLOW_3); 

            			newLeafNode(this_VISIBILITY_0, grammarAccess.getAttrBodyAccess().getVISIBILITYTerminalRuleCall_0());
            		
            // InternalMyDsl.g:329:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )
            // InternalMyDsl.g:330:4: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) )
            {
            // InternalMyDsl.g:330:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:331:5: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:331:5: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:332:6: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            						newLeafNode(lv_name_1_0, grammarAccess.getAttrBodyAccess().getNameIDTerminalRuleCall_1_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getAttrBodyRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_1_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getAttrBodyAccess().getColonKeyword_1_1());
            			
            // InternalMyDsl.g:352:4: ( (lv_type_3_0= RULE_ID ) )
            // InternalMyDsl.g:353:5: (lv_type_3_0= RULE_ID )
            {
            // InternalMyDsl.g:353:5: (lv_type_3_0= RULE_ID )
            // InternalMyDsl.g:354:6: lv_type_3_0= RULE_ID
            {
            lv_type_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            						newLeafNode(lv_type_3_0, grammarAccess.getAttrBodyAccess().getTypeIDTerminalRuleCall_1_2_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getAttrBodyRule());
            						}
            						setWithLastConsumed(
            							current,
            							"type",
            							lv_type_3_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

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
    // InternalMyDsl.g:375:1: entryRuleOpBody returns [EObject current=null] : iv_ruleOpBody= ruleOpBody EOF ;
    public final EObject entryRuleOpBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpBody = null;


        try {
            // InternalMyDsl.g:375:47: (iv_ruleOpBody= ruleOpBody EOF )
            // InternalMyDsl.g:376:2: iv_ruleOpBody= ruleOpBody EOF
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
    // InternalMyDsl.g:382:1: ruleOpBody returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) this_OPENARG_2= RULE_OPENARG ( ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )* ( (lv_args_5_0= ruleArgBody ) ) )? this_CLOSEARG_6= RULE_CLOSEARG (otherlv_7= 'return' ( (lv_type_8_0= RULE_ID ) ) )? ) ;
    public final EObject ruleOpBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_OPENARG_2=null;
        Token otherlv_4=null;
        Token this_CLOSEARG_6=null;
        Token otherlv_7=null;
        Token lv_type_8_0=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:388:2: ( (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) this_OPENARG_2= RULE_OPENARG ( ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )* ( (lv_args_5_0= ruleArgBody ) ) )? this_CLOSEARG_6= RULE_CLOSEARG (otherlv_7= 'return' ( (lv_type_8_0= RULE_ID ) ) )? ) )
            // InternalMyDsl.g:389:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) this_OPENARG_2= RULE_OPENARG ( ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )* ( (lv_args_5_0= ruleArgBody ) ) )? this_CLOSEARG_6= RULE_CLOSEARG (otherlv_7= 'return' ( (lv_type_8_0= RULE_ID ) ) )? )
            {
            // InternalMyDsl.g:389:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) this_OPENARG_2= RULE_OPENARG ( ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )* ( (lv_args_5_0= ruleArgBody ) ) )? this_CLOSEARG_6= RULE_CLOSEARG (otherlv_7= 'return' ( (lv_type_8_0= RULE_ID ) ) )? )
            // InternalMyDsl.g:390:3: otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) this_OPENARG_2= RULE_OPENARG ( ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )* ( (lv_args_5_0= ruleArgBody ) ) )? this_CLOSEARG_6= RULE_CLOSEARG (otherlv_7= 'return' ( (lv_type_8_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpBodyAccess().getOperationKeyword_0());
            		
            // InternalMyDsl.g:394:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:395:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:395:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:396:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOpBodyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpBodyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            this_OPENARG_2=(Token)match(input,RULE_OPENARG,FOLLOW_10); 

            			newLeafNode(this_OPENARG_2, grammarAccess.getOpBodyAccess().getOPENARGTerminalRuleCall_2());
            		
            // InternalMyDsl.g:416:3: ( ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )* ( (lv_args_5_0= ruleArgBody ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=25 && LA4_0<=26)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:417:4: ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )* ( (lv_args_5_0= ruleArgBody ) )
                    {
                    // InternalMyDsl.g:417:4: ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==25) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==RULE_ID) ) {
                                int LA3_3 = input.LA(3);

                                if ( (LA3_3==21) ) {
                                    int LA3_4 = input.LA(4);

                                    if ( (LA3_4==RULE_ID) ) {
                                        int LA3_5 = input.LA(5);

                                        if ( (LA3_5==23) ) {
                                            alt3=1;
                                        }


                                    }


                                }


                            }


                        }
                        else if ( (LA3_0==26) ) {
                            int LA3_2 = input.LA(2);

                            if ( (LA3_2==RULE_ID) ) {
                                int LA3_3 = input.LA(3);

                                if ( (LA3_3==21) ) {
                                    int LA3_4 = input.LA(4);

                                    if ( (LA3_4==RULE_ID) ) {
                                        int LA3_5 = input.LA(5);

                                        if ( (LA3_5==23) ) {
                                            alt3=1;
                                        }


                                    }


                                }


                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:418:5: ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ','
                    	    {
                    	    // InternalMyDsl.g:418:5: ( (lv_args_3_0= ruleArgBody ) )
                    	    // InternalMyDsl.g:419:6: (lv_args_3_0= ruleArgBody )
                    	    {
                    	    // InternalMyDsl.g:419:6: (lv_args_3_0= ruleArgBody )
                    	    // InternalMyDsl.g:420:7: lv_args_3_0= ruleArgBody
                    	    {

                    	    							newCompositeNode(grammarAccess.getOpBodyAccess().getArgsArgBodyParserRuleCall_3_0_0_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
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

                    	    otherlv_4=(Token)match(input,23,FOLLOW_12); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getOpBodyAccess().getCommaKeyword_3_0_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // InternalMyDsl.g:442:4: ( (lv_args_5_0= ruleArgBody ) )
                    // InternalMyDsl.g:443:5: (lv_args_5_0= ruleArgBody )
                    {
                    // InternalMyDsl.g:443:5: (lv_args_5_0= ruleArgBody )
                    // InternalMyDsl.g:444:6: lv_args_5_0= ruleArgBody
                    {

                    						newCompositeNode(grammarAccess.getOpBodyAccess().getArgsArgBodyParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_args_5_0=ruleArgBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpBodyRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_5_0,
                    							"org.graces.mydsl.MyDsl.ArgBody");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_CLOSEARG_6=(Token)match(input,RULE_CLOSEARG,FOLLOW_14); 

            			newLeafNode(this_CLOSEARG_6, grammarAccess.getOpBodyAccess().getCLOSEARGTerminalRuleCall_4());
            		
            // InternalMyDsl.g:466:3: (otherlv_7= 'return' ( (lv_type_8_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:467:4: otherlv_7= 'return' ( (lv_type_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getOpBodyAccess().getReturnKeyword_5_0());
                    			
                    // InternalMyDsl.g:471:4: ( (lv_type_8_0= RULE_ID ) )
                    // InternalMyDsl.g:472:5: (lv_type_8_0= RULE_ID )
                    {
                    // InternalMyDsl.g:472:5: (lv_type_8_0= RULE_ID )
                    // InternalMyDsl.g:473:6: lv_type_8_0= RULE_ID
                    {
                    lv_type_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_type_8_0, grammarAccess.getOpBodyAccess().getTypeIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpBodyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

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
    // InternalMyDsl.g:494:1: entryRuleArgBody returns [EObject current=null] : iv_ruleArgBody= ruleArgBody EOF ;
    public final EObject entryRuleArgBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgBody = null;


        try {
            // InternalMyDsl.g:494:48: (iv_ruleArgBody= ruleArgBody EOF )
            // InternalMyDsl.g:495:2: iv_ruleArgBody= ruleArgBody EOF
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
    // InternalMyDsl.g:501:1: ruleArgBody returns [EObject current=null] : ( (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) ) ) ;
    public final EObject ruleArgBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:507:2: ( ( (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) ) ) )
            // InternalMyDsl.g:508:2: ( (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) ) )
            {
            // InternalMyDsl.g:508:2: ( (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:509:3: (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:509:3: (otherlv_0= 'in' | otherlv_1= 'out' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            else if ( (LA6_0==26) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:510:4: otherlv_0= 'in'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getArgBodyAccess().getInKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:515:4: otherlv_1= 'out'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getArgBodyAccess().getOutKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:520:3: ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) )
            // InternalMyDsl.g:521:4: ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) )
            {
            // InternalMyDsl.g:521:4: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:522:5: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:522:5: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:523:6: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            						newLeafNode(lv_name_2_0, grammarAccess.getArgBodyAccess().getNameIDTerminalRuleCall_1_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getArgBodyRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_2_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getArgBodyAccess().getColonKeyword_1_1());
            			
            // InternalMyDsl.g:543:4: ( (lv_type_4_0= RULE_ID ) )
            // InternalMyDsl.g:544:5: (lv_type_4_0= RULE_ID )
            {
            // InternalMyDsl.g:544:5: (lv_type_4_0= RULE_ID )
            // InternalMyDsl.g:545:6: lv_type_4_0= RULE_ID
            {
            lv_type_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            						newLeafNode(lv_type_4_0, grammarAccess.getArgBodyAccess().getTypeIDTerminalRuleCall_1_2_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getArgBodyRule());
            						}
            						setWithLastConsumed(
            							current,
            							"type",
            							lv_type_4_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400140L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000006000400L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});

}