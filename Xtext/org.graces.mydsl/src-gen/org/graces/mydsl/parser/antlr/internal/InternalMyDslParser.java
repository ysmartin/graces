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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_OPENDECL", "RULE_CLOSEDECL", "RULE_CLOSELINE", "RULE_VISIBILITY", "RULE_OPENARG", "RULE_CLOSEARG", "RULE_COMPKEYWORD", "RULE_AGGRKEYWORD", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'class'", "':'", "'operation'", "','", "'return'", "'in'", "'out'", "'relationship'", "'to'", "'any'"
    };
    public static final int RULE_CLOSELINE=7;
    public static final int RULE_VISIBILITY=8;
    public static final int RULE_STRING=14;
    public static final int RULE_OPENARG=9;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int RULE_CLOSEARG=10;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=17;
    public static final int RULE_AGGRKEYWORD=12;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__26=26;
    public static final int RULE_CLOSEDECL=6;
    public static final int T__27=27;
    public static final int RULE_OPENDECL=5;
    public static final int T__28=28;
    public static final int RULE_COMPKEYWORD=11;
    public static final int RULE_INT=13;
    public static final int T__29=29;
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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) this_OPENDECL_2= RULE_OPENDECL ( (lv_clazzes_3_0= ruleClass ) )* ( (lv_relationships_4_0= ruleGenericAssociation ) )* this_CLOSEDECL_5= RULE_CLOSEDECL ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_OPENDECL_2=null;
        Token this_CLOSEDECL_5=null;
        EObject lv_clazzes_3_0 = null;

        EObject lv_relationships_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) this_OPENDECL_2= RULE_OPENDECL ( (lv_clazzes_3_0= ruleClass ) )* ( (lv_relationships_4_0= ruleGenericAssociation ) )* this_CLOSEDECL_5= RULE_CLOSEDECL ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) this_OPENDECL_2= RULE_OPENDECL ( (lv_clazzes_3_0= ruleClass ) )* ( (lv_relationships_4_0= ruleGenericAssociation ) )* this_CLOSEDECL_5= RULE_CLOSEDECL )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) this_OPENDECL_2= RULE_OPENDECL ( (lv_clazzes_3_0= ruleClass ) )* ( (lv_relationships_4_0= ruleGenericAssociation ) )* this_CLOSEDECL_5= RULE_CLOSEDECL )
            // InternalMyDsl.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) this_OPENDECL_2= RULE_OPENDECL ( (lv_clazzes_3_0= ruleClass ) )* ( (lv_relationships_4_0= ruleGenericAssociation ) )* this_CLOSEDECL_5= RULE_CLOSEDECL
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
            						"org.graces.mydsl.MyDsl.ID");
            				

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

            // InternalMyDsl.g:124:3: ( (lv_relationships_4_0= ruleGenericAssociation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:125:4: (lv_relationships_4_0= ruleGenericAssociation )
            	    {
            	    // InternalMyDsl.g:125:4: (lv_relationships_4_0= ruleGenericAssociation )
            	    // InternalMyDsl.g:126:5: lv_relationships_4_0= ruleGenericAssociation
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRelationshipsGenericAssociationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_relationships_4_0=ruleGenericAssociation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relationships",
            	    						lv_relationships_4_0,
            	    						"org.graces.mydsl.MyDsl.GenericAssociation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_CLOSEDECL_5=(Token)match(input,RULE_CLOSEDECL,FOLLOW_2); 

            			newLeafNode(this_CLOSEDECL_5, grammarAccess.getModelAccess().getCLOSEDECLTerminalRuleCall_5());
            		

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
    // InternalMyDsl.g:151:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalMyDsl.g:151:46: (iv_ruleClass= ruleClass EOF )
            // InternalMyDsl.g:152:2: iv_ruleClass= ruleClass EOF
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
    // InternalMyDsl.g:158:1: ruleClass returns [EObject current=null] : ( ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:164:2: ( ( ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) ) ) )
            // InternalMyDsl.g:165:2: ( ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) ) )
            {
            // InternalMyDsl.g:165:2: ( ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) ) )
            // InternalMyDsl.g:166:3: ( (lv_header_0_0= ruleClassHeader ) ) ( (lv_body_1_0= ruleClassBody ) )
            {
            // InternalMyDsl.g:166:3: ( (lv_header_0_0= ruleClassHeader ) )
            // InternalMyDsl.g:167:4: (lv_header_0_0= ruleClassHeader )
            {
            // InternalMyDsl.g:167:4: (lv_header_0_0= ruleClassHeader )
            // InternalMyDsl.g:168:5: lv_header_0_0= ruleClassHeader
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

            // InternalMyDsl.g:185:3: ( (lv_body_1_0= ruleClassBody ) )
            // InternalMyDsl.g:186:4: (lv_body_1_0= ruleClassBody )
            {
            // InternalMyDsl.g:186:4: (lv_body_1_0= ruleClassBody )
            // InternalMyDsl.g:187:5: lv_body_1_0= ruleClassBody
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
    // InternalMyDsl.g:208:1: entryRuleClassHeader returns [EObject current=null] : iv_ruleClassHeader= ruleClassHeader EOF ;
    public final EObject entryRuleClassHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassHeader = null;


        try {
            // InternalMyDsl.g:208:52: (iv_ruleClassHeader= ruleClassHeader EOF )
            // InternalMyDsl.g:209:2: iv_ruleClassHeader= ruleClassHeader EOF
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
    // InternalMyDsl.g:215:1: ruleClassHeader returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClassHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:221:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:222:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:222:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:223:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClassHeaderAccess().getClassKeyword_0());
            		
            // InternalMyDsl.g:227:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:228:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:228:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:229:5: lv_name_1_0= RULE_ID
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
            						"org.graces.mydsl.MyDsl.ID");
            				

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
    // InternalMyDsl.g:249:1: entryRuleClassBody returns [EObject current=null] : iv_ruleClassBody= ruleClassBody EOF ;
    public final EObject entryRuleClassBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassBody = null;


        try {
            // InternalMyDsl.g:249:50: (iv_ruleClassBody= ruleClassBody EOF )
            // InternalMyDsl.g:250:2: iv_ruleClassBody= ruleClassBody EOF
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
    // InternalMyDsl.g:256:1: ruleClassBody returns [EObject current=null] : (this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL ) ;
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
            // InternalMyDsl.g:262:2: ( (this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL ) )
            // InternalMyDsl.g:263:2: (this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL )
            {
            // InternalMyDsl.g:263:2: (this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL )
            // InternalMyDsl.g:264:3: this_OPENDECL_0= RULE_OPENDECL ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )* this_CLOSEDECL_5= RULE_CLOSEDECL
            {
            this_OPENDECL_0=(Token)match(input,RULE_OPENDECL,FOLLOW_7); 

            			newLeafNode(this_OPENDECL_0, grammarAccess.getClassBodyAccess().getOPENDECLTerminalRuleCall_0());
            		
            // InternalMyDsl.g:268:3: ( ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE ) | ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_VISIBILITY) ) {
                    alt3=1;
                }
                else if ( (LA3_0==22) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:269:4: ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE )
            	    {
            	    // InternalMyDsl.g:269:4: ( ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE )
            	    // InternalMyDsl.g:270:5: ( (lv_attributes_1_0= ruleAttrBody ) ) this_CLOSELINE_2= RULE_CLOSELINE
            	    {
            	    // InternalMyDsl.g:270:5: ( (lv_attributes_1_0= ruleAttrBody ) )
            	    // InternalMyDsl.g:271:6: (lv_attributes_1_0= ruleAttrBody )
            	    {
            	    // InternalMyDsl.g:271:6: (lv_attributes_1_0= ruleAttrBody )
            	    // InternalMyDsl.g:272:7: lv_attributes_1_0= ruleAttrBody
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
            	    // InternalMyDsl.g:295:4: ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE )
            	    {
            	    // InternalMyDsl.g:295:4: ( ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE )
            	    // InternalMyDsl.g:296:5: ( (lv_operations_3_0= ruleOpBody ) ) this_CLOSELINE_4= RULE_CLOSELINE
            	    {
            	    // InternalMyDsl.g:296:5: ( (lv_operations_3_0= ruleOpBody ) )
            	    // InternalMyDsl.g:297:6: (lv_operations_3_0= ruleOpBody )
            	    {
            	    // InternalMyDsl.g:297:6: (lv_operations_3_0= ruleOpBody )
            	    // InternalMyDsl.g:298:7: lv_operations_3_0= ruleOpBody
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
            	    break loop3;
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
    // InternalMyDsl.g:329:1: entryRuleAttrBody returns [EObject current=null] : iv_ruleAttrBody= ruleAttrBody EOF ;
    public final EObject entryRuleAttrBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrBody = null;


        try {
            // InternalMyDsl.g:329:49: (iv_ruleAttrBody= ruleAttrBody EOF )
            // InternalMyDsl.g:330:2: iv_ruleAttrBody= ruleAttrBody EOF
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
    // InternalMyDsl.g:336:1: ruleAttrBody returns [EObject current=null] : ( ( (lv_visibility_0_0= RULE_VISIBILITY ) ) ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAttrBody() throws RecognitionException {
        EObject current = null;

        Token lv_visibility_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:342:2: ( ( ( (lv_visibility_0_0= RULE_VISIBILITY ) ) ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) ) ) )
            // InternalMyDsl.g:343:2: ( ( (lv_visibility_0_0= RULE_VISIBILITY ) ) ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) ) )
            {
            // InternalMyDsl.g:343:2: ( ( (lv_visibility_0_0= RULE_VISIBILITY ) ) ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:344:3: ( (lv_visibility_0_0= RULE_VISIBILITY ) ) ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:344:3: ( (lv_visibility_0_0= RULE_VISIBILITY ) )
            // InternalMyDsl.g:345:4: (lv_visibility_0_0= RULE_VISIBILITY )
            {
            // InternalMyDsl.g:345:4: (lv_visibility_0_0= RULE_VISIBILITY )
            // InternalMyDsl.g:346:5: lv_visibility_0_0= RULE_VISIBILITY
            {
            lv_visibility_0_0=(Token)match(input,RULE_VISIBILITY,FOLLOW_3); 

            					newLeafNode(lv_visibility_0_0, grammarAccess.getAttrBodyAccess().getVisibilityVISIBILITYTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttrBodyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"visibility",
            						lv_visibility_0_0,
            						"org.graces.mydsl.MyDsl.VISIBILITY");
            				

            }


            }

            // InternalMyDsl.g:362:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )
            // InternalMyDsl.g:363:4: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) )
            {
            // InternalMyDsl.g:363:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:364:5: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:364:5: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:365:6: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            						newLeafNode(lv_name_1_0, grammarAccess.getAttrBodyAccess().getNameIDTerminalRuleCall_1_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getAttrBodyRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_1_0,
            							"org.graces.mydsl.MyDsl.ID");
            					

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getAttrBodyAccess().getColonKeyword_1_1());
            			
            // InternalMyDsl.g:385:4: ( (lv_type_3_0= RULE_ID ) )
            // InternalMyDsl.g:386:5: (lv_type_3_0= RULE_ID )
            {
            // InternalMyDsl.g:386:5: (lv_type_3_0= RULE_ID )
            // InternalMyDsl.g:387:6: lv_type_3_0= RULE_ID
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
            							"org.graces.mydsl.MyDsl.ID");
            					

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
    // InternalMyDsl.g:408:1: entryRuleOpBody returns [EObject current=null] : iv_ruleOpBody= ruleOpBody EOF ;
    public final EObject entryRuleOpBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpBody = null;


        try {
            // InternalMyDsl.g:408:47: (iv_ruleOpBody= ruleOpBody EOF )
            // InternalMyDsl.g:409:2: iv_ruleOpBody= ruleOpBody EOF
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
    // InternalMyDsl.g:415:1: ruleOpBody returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) this_OPENARG_2= RULE_OPENARG ( ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )* ( (lv_args_5_0= ruleArgBody ) ) )? this_CLOSEARG_6= RULE_CLOSEARG ( (lv_return_7_0= ruleReturnBody ) )? ) ;
    public final EObject ruleOpBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_OPENARG_2=null;
        Token otherlv_4=null;
        Token this_CLOSEARG_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_return_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:421:2: ( (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) this_OPENARG_2= RULE_OPENARG ( ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )* ( (lv_args_5_0= ruleArgBody ) ) )? this_CLOSEARG_6= RULE_CLOSEARG ( (lv_return_7_0= ruleReturnBody ) )? ) )
            // InternalMyDsl.g:422:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) this_OPENARG_2= RULE_OPENARG ( ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )* ( (lv_args_5_0= ruleArgBody ) ) )? this_CLOSEARG_6= RULE_CLOSEARG ( (lv_return_7_0= ruleReturnBody ) )? )
            {
            // InternalMyDsl.g:422:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) this_OPENARG_2= RULE_OPENARG ( ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )* ( (lv_args_5_0= ruleArgBody ) ) )? this_CLOSEARG_6= RULE_CLOSEARG ( (lv_return_7_0= ruleReturnBody ) )? )
            // InternalMyDsl.g:423:3: otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) this_OPENARG_2= RULE_OPENARG ( ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )* ( (lv_args_5_0= ruleArgBody ) ) )? this_CLOSEARG_6= RULE_CLOSEARG ( (lv_return_7_0= ruleReturnBody ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpBodyAccess().getOperationKeyword_0());
            		
            // InternalMyDsl.g:427:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:428:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:428:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:429:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOpBodyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpBodyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.graces.mydsl.MyDsl.ID");
            				

            }


            }

            this_OPENARG_2=(Token)match(input,RULE_OPENARG,FOLLOW_11); 

            			newLeafNode(this_OPENARG_2, grammarAccess.getOpBodyAccess().getOPENARGTerminalRuleCall_2());
            		
            // InternalMyDsl.g:449:3: ( ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )* ( (lv_args_5_0= ruleArgBody ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=25 && LA5_0<=26)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:450:4: ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )* ( (lv_args_5_0= ruleArgBody ) )
                    {
                    // InternalMyDsl.g:450:4: ( ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ',' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==25) ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1==RULE_ID) ) {
                                int LA4_3 = input.LA(3);

                                if ( (LA4_3==21) ) {
                                    int LA4_4 = input.LA(4);

                                    if ( (LA4_4==RULE_ID) ) {
                                        int LA4_5 = input.LA(5);

                                        if ( (LA4_5==23) ) {
                                            alt4=1;
                                        }


                                    }


                                }


                            }


                        }
                        else if ( (LA4_0==26) ) {
                            int LA4_2 = input.LA(2);

                            if ( (LA4_2==RULE_ID) ) {
                                int LA4_3 = input.LA(3);

                                if ( (LA4_3==21) ) {
                                    int LA4_4 = input.LA(4);

                                    if ( (LA4_4==RULE_ID) ) {
                                        int LA4_5 = input.LA(5);

                                        if ( (LA4_5==23) ) {
                                            alt4=1;
                                        }


                                    }


                                }


                            }


                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:451:5: ( (lv_args_3_0= ruleArgBody ) ) otherlv_4= ','
                    	    {
                    	    // InternalMyDsl.g:451:5: ( (lv_args_3_0= ruleArgBody ) )
                    	    // InternalMyDsl.g:452:6: (lv_args_3_0= ruleArgBody )
                    	    {
                    	    // InternalMyDsl.g:452:6: (lv_args_3_0= ruleArgBody )
                    	    // InternalMyDsl.g:453:7: lv_args_3_0= ruleArgBody
                    	    {

                    	    							newCompositeNode(grammarAccess.getOpBodyAccess().getArgsArgBodyParserRuleCall_3_0_0_0());
                    	    						
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

                    	    otherlv_4=(Token)match(input,23,FOLLOW_13); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getOpBodyAccess().getCommaKeyword_3_0_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // InternalMyDsl.g:475:4: ( (lv_args_5_0= ruleArgBody ) )
                    // InternalMyDsl.g:476:5: (lv_args_5_0= ruleArgBody )
                    {
                    // InternalMyDsl.g:476:5: (lv_args_5_0= ruleArgBody )
                    // InternalMyDsl.g:477:6: lv_args_5_0= ruleArgBody
                    {

                    						newCompositeNode(grammarAccess.getOpBodyAccess().getArgsArgBodyParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            this_CLOSEARG_6=(Token)match(input,RULE_CLOSEARG,FOLLOW_15); 

            			newLeafNode(this_CLOSEARG_6, grammarAccess.getOpBodyAccess().getCLOSEARGTerminalRuleCall_4());
            		
            // InternalMyDsl.g:499:3: ( (lv_return_7_0= ruleReturnBody ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:500:4: (lv_return_7_0= ruleReturnBody )
                    {
                    // InternalMyDsl.g:500:4: (lv_return_7_0= ruleReturnBody )
                    // InternalMyDsl.g:501:5: lv_return_7_0= ruleReturnBody
                    {

                    					newCompositeNode(grammarAccess.getOpBodyAccess().getReturnReturnBodyParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_return_7_0=ruleReturnBody();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOpBodyRule());
                    					}
                    					set(
                    						current,
                    						"return",
                    						lv_return_7_0,
                    						"org.graces.mydsl.MyDsl.ReturnBody");
                    					afterParserOrEnumRuleCall();
                    				

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


    // $ANTLR start "entryRuleReturnBody"
    // InternalMyDsl.g:522:1: entryRuleReturnBody returns [EObject current=null] : iv_ruleReturnBody= ruleReturnBody EOF ;
    public final EObject entryRuleReturnBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnBody = null;


        try {
            // InternalMyDsl.g:522:51: (iv_ruleReturnBody= ruleReturnBody EOF )
            // InternalMyDsl.g:523:2: iv_ruleReturnBody= ruleReturnBody EOF
            {
             newCompositeNode(grammarAccess.getReturnBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnBody=ruleReturnBody();

            state._fsp--;

             current =iv_ruleReturnBody; 
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
    // $ANTLR end "entryRuleReturnBody"


    // $ANTLR start "ruleReturnBody"
    // InternalMyDsl.g:529:1: ruleReturnBody returns [EObject current=null] : (otherlv_0= 'return' ( (lv_type_1_0= RULE_ID ) ) ) ;
    public final EObject ruleReturnBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:535:2: ( (otherlv_0= 'return' ( (lv_type_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:536:2: (otherlv_0= 'return' ( (lv_type_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:536:2: (otherlv_0= 'return' ( (lv_type_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:537:3: otherlv_0= 'return' ( (lv_type_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnBodyAccess().getReturnKeyword_0());
            		
            // InternalMyDsl.g:541:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalMyDsl.g:542:4: (lv_type_1_0= RULE_ID )
            {
            // InternalMyDsl.g:542:4: (lv_type_1_0= RULE_ID )
            // InternalMyDsl.g:543:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_1_0, grammarAccess.getReturnBodyAccess().getTypeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReturnBodyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.graces.mydsl.MyDsl.ID");
            				

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
    // $ANTLR end "ruleReturnBody"


    // $ANTLR start "entryRuleArgBody"
    // InternalMyDsl.g:563:1: entryRuleArgBody returns [EObject current=null] : iv_ruleArgBody= ruleArgBody EOF ;
    public final EObject entryRuleArgBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgBody = null;


        try {
            // InternalMyDsl.g:563:48: (iv_ruleArgBody= ruleArgBody EOF )
            // InternalMyDsl.g:564:2: iv_ruleArgBody= ruleArgBody EOF
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
    // InternalMyDsl.g:570:1: ruleArgBody returns [EObject current=null] : ( (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) ) ) ;
    public final EObject ruleArgBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:576:2: ( ( (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) ) ) )
            // InternalMyDsl.g:577:2: ( (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) ) )
            {
            // InternalMyDsl.g:577:2: ( (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:578:3: (otherlv_0= 'in' | otherlv_1= 'out' ) ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:578:3: (otherlv_0= 'in' | otherlv_1= 'out' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:579:4: otherlv_0= 'in'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getArgBodyAccess().getInKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:584:4: otherlv_1= 'out'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getArgBodyAccess().getOutKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:589:3: ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) ) )
            // InternalMyDsl.g:590:4: ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= RULE_ID ) )
            {
            // InternalMyDsl.g:590:4: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:591:5: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:591:5: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:592:6: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            						newLeafNode(lv_name_2_0, grammarAccess.getArgBodyAccess().getNameIDTerminalRuleCall_1_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getArgBodyRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_2_0,
            							"org.graces.mydsl.MyDsl.ID");
            					

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getArgBodyAccess().getColonKeyword_1_1());
            			
            // InternalMyDsl.g:612:4: ( (lv_type_4_0= RULE_ID ) )
            // InternalMyDsl.g:613:5: (lv_type_4_0= RULE_ID )
            {
            // InternalMyDsl.g:613:5: (lv_type_4_0= RULE_ID )
            // InternalMyDsl.g:614:6: lv_type_4_0= RULE_ID
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
            							"org.graces.mydsl.MyDsl.ID");
            					

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


    // $ANTLR start "entryRuleGenericAssociation"
    // InternalMyDsl.g:635:1: entryRuleGenericAssociation returns [EObject current=null] : iv_ruleGenericAssociation= ruleGenericAssociation EOF ;
    public final EObject entryRuleGenericAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericAssociation = null;


        try {
            // InternalMyDsl.g:635:59: (iv_ruleGenericAssociation= ruleGenericAssociation EOF )
            // InternalMyDsl.g:636:2: iv_ruleGenericAssociation= ruleGenericAssociation EOF
            {
             newCompositeNode(grammarAccess.getGenericAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenericAssociation=ruleGenericAssociation();

            state._fsp--;

             current =iv_ruleGenericAssociation; 
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
    // $ANTLR end "entryRuleGenericAssociation"


    // $ANTLR start "ruleGenericAssociation"
    // InternalMyDsl.g:642:1: ruleGenericAssociation returns [EObject current=null] : (this_Composition_0= ruleComposition | this_Aggregation_1= ruleAggregation | this_Association_2= ruleAssociation ) ;
    public final EObject ruleGenericAssociation() throws RecognitionException {
        EObject current = null;

        EObject this_Composition_0 = null;

        EObject this_Aggregation_1 = null;

        EObject this_Association_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:648:2: ( (this_Composition_0= ruleComposition | this_Aggregation_1= ruleAggregation | this_Association_2= ruleAssociation ) )
            // InternalMyDsl.g:649:2: (this_Composition_0= ruleComposition | this_Aggregation_1= ruleAggregation | this_Association_2= ruleAssociation )
            {
            // InternalMyDsl.g:649:2: (this_Composition_0= ruleComposition | this_Aggregation_1= ruleAggregation | this_Association_2= ruleAssociation )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:650:3: this_Composition_0= ruleComposition
                    {

                    			newCompositeNode(grammarAccess.getGenericAssociationAccess().getCompositionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Composition_0=ruleComposition();

                    state._fsp--;


                    			current = this_Composition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:659:3: this_Aggregation_1= ruleAggregation
                    {

                    			newCompositeNode(grammarAccess.getGenericAssociationAccess().getAggregationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Aggregation_1=ruleAggregation();

                    state._fsp--;


                    			current = this_Aggregation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:668:3: this_Association_2= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getGenericAssociationAccess().getAssociationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_2=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleGenericAssociation"


    // $ANTLR start "entryRuleComposition"
    // InternalMyDsl.g:680:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalMyDsl.g:680:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalMyDsl.g:681:2: iv_ruleComposition= ruleComposition EOF
            {
             newCompositeNode(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposition=ruleComposition();

            state._fsp--;

             current =iv_ruleComposition; 
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
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalMyDsl.g:687:1: ruleComposition returns [EObject current=null] : ( ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleCompositionBody ) ) ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_header_0_0 = null;

        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:693:2: ( ( ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleCompositionBody ) ) ) )
            // InternalMyDsl.g:694:2: ( ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleCompositionBody ) ) )
            {
            // InternalMyDsl.g:694:2: ( ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleCompositionBody ) ) )
            // InternalMyDsl.g:695:3: ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleCompositionBody ) )
            {
            // InternalMyDsl.g:695:3: ( (lv_header_0_0= ruleRelationshipHeader ) )
            // InternalMyDsl.g:696:4: (lv_header_0_0= ruleRelationshipHeader )
            {
            // InternalMyDsl.g:696:4: (lv_header_0_0= ruleRelationshipHeader )
            // InternalMyDsl.g:697:5: lv_header_0_0= ruleRelationshipHeader
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getHeaderRelationshipHeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_header_0_0=ruleRelationshipHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_0_0,
            						"org.graces.mydsl.MyDsl.RelationshipHeader");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:714:3: ( (lv_body_1_0= ruleCompositionBody ) )
            // InternalMyDsl.g:715:4: (lv_body_1_0= ruleCompositionBody )
            {
            // InternalMyDsl.g:715:4: (lv_body_1_0= ruleCompositionBody )
            // InternalMyDsl.g:716:5: lv_body_1_0= ruleCompositionBody
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getBodyCompositionBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleCompositionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"org.graces.mydsl.MyDsl.CompositionBody");
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
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleCompositionBody"
    // InternalMyDsl.g:737:1: entryRuleCompositionBody returns [EObject current=null] : iv_ruleCompositionBody= ruleCompositionBody EOF ;
    public final EObject entryRuleCompositionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionBody = null;


        try {
            // InternalMyDsl.g:737:56: (iv_ruleCompositionBody= ruleCompositionBody EOF )
            // InternalMyDsl.g:738:2: iv_ruleCompositionBody= ruleCompositionBody EOF
            {
             newCompositeNode(grammarAccess.getCompositionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositionBody=ruleCompositionBody();

            state._fsp--;

             current =iv_ruleCompositionBody; 
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
    // $ANTLR end "entryRuleCompositionBody"


    // $ANTLR start "ruleCompositionBody"
    // InternalMyDsl.g:744:1: ruleCompositionBody returns [EObject current=null] : (this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_COMPKEYWORD ) ) ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL ) ;
    public final EObject ruleCompositionBody() throws RecognitionException {
        EObject current = null;

        Token this_OPENDECL_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_5=null;
        Token this_CLOSEDECL_6=null;
        EObject lv_firstendmult_1_0 = null;

        EObject lv_secondendmult_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:750:2: ( (this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_COMPKEYWORD ) ) ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL ) )
            // InternalMyDsl.g:751:2: (this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_COMPKEYWORD ) ) ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL )
            {
            // InternalMyDsl.g:751:2: (this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_COMPKEYWORD ) ) ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL )
            // InternalMyDsl.g:752:3: this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_COMPKEYWORD ) ) ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL
            {
            this_OPENDECL_0=(Token)match(input,RULE_OPENDECL,FOLLOW_16); 

            			newLeafNode(this_OPENDECL_0, grammarAccess.getCompositionBodyAccess().getOPENDECLTerminalRuleCall_0());
            		
            // InternalMyDsl.g:756:3: ( (lv_firstendmult_1_0= ruleMulti ) )
            // InternalMyDsl.g:757:4: (lv_firstendmult_1_0= ruleMulti )
            {
            // InternalMyDsl.g:757:4: (lv_firstendmult_1_0= ruleMulti )
            // InternalMyDsl.g:758:5: lv_firstendmult_1_0= ruleMulti
            {

            					newCompositeNode(grammarAccess.getCompositionBodyAccess().getFirstendmultMultiParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_firstendmult_1_0=ruleMulti();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionBodyRule());
            					}
            					set(
            						current,
            						"firstendmult",
            						lv_firstendmult_1_0,
            						"org.graces.mydsl.MyDsl.Multi");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:775:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:776:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:776:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:777:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionBodyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_2, grammarAccess.getCompositionBodyAccess().getFirstendClassHeaderCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:788:3: ( (lv_description_3_0= RULE_COMPKEYWORD ) )
            // InternalMyDsl.g:789:4: (lv_description_3_0= RULE_COMPKEYWORD )
            {
            // InternalMyDsl.g:789:4: (lv_description_3_0= RULE_COMPKEYWORD )
            // InternalMyDsl.g:790:5: lv_description_3_0= RULE_COMPKEYWORD
            {
            lv_description_3_0=(Token)match(input,RULE_COMPKEYWORD,FOLLOW_16); 

            					newLeafNode(lv_description_3_0, grammarAccess.getCompositionBodyAccess().getDescriptionCOMPKEYWORDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionBodyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.graces.mydsl.MyDsl.COMPKEYWORD");
            				

            }


            }

            // InternalMyDsl.g:806:3: ( (lv_secondendmult_4_0= ruleMulti ) )
            // InternalMyDsl.g:807:4: (lv_secondendmult_4_0= ruleMulti )
            {
            // InternalMyDsl.g:807:4: (lv_secondendmult_4_0= ruleMulti )
            // InternalMyDsl.g:808:5: lv_secondendmult_4_0= ruleMulti
            {

            					newCompositeNode(grammarAccess.getCompositionBodyAccess().getSecondendmultMultiParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_3);
            lv_secondendmult_4_0=ruleMulti();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionBodyRule());
            					}
            					set(
            						current,
            						"secondendmult",
            						lv_secondendmult_4_0,
            						"org.graces.mydsl.MyDsl.Multi");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:825:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:826:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:826:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:827:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionBodyRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_5, grammarAccess.getCompositionBodyAccess().getSecondendClassHeaderCrossReference_5_0());
            				

            }


            }

            this_CLOSEDECL_6=(Token)match(input,RULE_CLOSEDECL,FOLLOW_2); 

            			newLeafNode(this_CLOSEDECL_6, grammarAccess.getCompositionBodyAccess().getCLOSEDECLTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleCompositionBody"


    // $ANTLR start "entryRuleAggregation"
    // InternalMyDsl.g:846:1: entryRuleAggregation returns [EObject current=null] : iv_ruleAggregation= ruleAggregation EOF ;
    public final EObject entryRuleAggregation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregation = null;


        try {
            // InternalMyDsl.g:846:52: (iv_ruleAggregation= ruleAggregation EOF )
            // InternalMyDsl.g:847:2: iv_ruleAggregation= ruleAggregation EOF
            {
             newCompositeNode(grammarAccess.getAggregationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAggregation=ruleAggregation();

            state._fsp--;

             current =iv_ruleAggregation; 
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
    // $ANTLR end "entryRuleAggregation"


    // $ANTLR start "ruleAggregation"
    // InternalMyDsl.g:853:1: ruleAggregation returns [EObject current=null] : ( ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleAggregationBody ) ) ) ;
    public final EObject ruleAggregation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_header_0_0 = null;

        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:859:2: ( ( ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleAggregationBody ) ) ) )
            // InternalMyDsl.g:860:2: ( ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleAggregationBody ) ) )
            {
            // InternalMyDsl.g:860:2: ( ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleAggregationBody ) ) )
            // InternalMyDsl.g:861:3: ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleAggregationBody ) )
            {
            // InternalMyDsl.g:861:3: ( (lv_header_0_0= ruleRelationshipHeader ) )
            // InternalMyDsl.g:862:4: (lv_header_0_0= ruleRelationshipHeader )
            {
            // InternalMyDsl.g:862:4: (lv_header_0_0= ruleRelationshipHeader )
            // InternalMyDsl.g:863:5: lv_header_0_0= ruleRelationshipHeader
            {

            					newCompositeNode(grammarAccess.getAggregationAccess().getHeaderRelationshipHeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_header_0_0=ruleRelationshipHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregationRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_0_0,
            						"org.graces.mydsl.MyDsl.RelationshipHeader");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:880:3: ( (lv_body_1_0= ruleAggregationBody ) )
            // InternalMyDsl.g:881:4: (lv_body_1_0= ruleAggregationBody )
            {
            // InternalMyDsl.g:881:4: (lv_body_1_0= ruleAggregationBody )
            // InternalMyDsl.g:882:5: lv_body_1_0= ruleAggregationBody
            {

            					newCompositeNode(grammarAccess.getAggregationAccess().getBodyAggregationBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleAggregationBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregationRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"org.graces.mydsl.MyDsl.AggregationBody");
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
    // $ANTLR end "ruleAggregation"


    // $ANTLR start "entryRuleAggregationBody"
    // InternalMyDsl.g:903:1: entryRuleAggregationBody returns [EObject current=null] : iv_ruleAggregationBody= ruleAggregationBody EOF ;
    public final EObject entryRuleAggregationBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregationBody = null;


        try {
            // InternalMyDsl.g:903:56: (iv_ruleAggregationBody= ruleAggregationBody EOF )
            // InternalMyDsl.g:904:2: iv_ruleAggregationBody= ruleAggregationBody EOF
            {
             newCompositeNode(grammarAccess.getAggregationBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAggregationBody=ruleAggregationBody();

            state._fsp--;

             current =iv_ruleAggregationBody; 
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
    // $ANTLR end "entryRuleAggregationBody"


    // $ANTLR start "ruleAggregationBody"
    // InternalMyDsl.g:910:1: ruleAggregationBody returns [EObject current=null] : (this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_AGGRKEYWORD ) ) ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL ) ;
    public final EObject ruleAggregationBody() throws RecognitionException {
        EObject current = null;

        Token this_OPENDECL_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_5=null;
        Token this_CLOSEDECL_6=null;
        EObject lv_firstendmult_1_0 = null;

        EObject lv_secondendmult_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:916:2: ( (this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_AGGRKEYWORD ) ) ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL ) )
            // InternalMyDsl.g:917:2: (this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_AGGRKEYWORD ) ) ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL )
            {
            // InternalMyDsl.g:917:2: (this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_AGGRKEYWORD ) ) ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL )
            // InternalMyDsl.g:918:3: this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_AGGRKEYWORD ) ) ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL
            {
            this_OPENDECL_0=(Token)match(input,RULE_OPENDECL,FOLLOW_16); 

            			newLeafNode(this_OPENDECL_0, grammarAccess.getAggregationBodyAccess().getOPENDECLTerminalRuleCall_0());
            		
            // InternalMyDsl.g:922:3: ( (lv_firstendmult_1_0= ruleMulti ) )
            // InternalMyDsl.g:923:4: (lv_firstendmult_1_0= ruleMulti )
            {
            // InternalMyDsl.g:923:4: (lv_firstendmult_1_0= ruleMulti )
            // InternalMyDsl.g:924:5: lv_firstendmult_1_0= ruleMulti
            {

            					newCompositeNode(grammarAccess.getAggregationBodyAccess().getFirstendmultMultiParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_firstendmult_1_0=ruleMulti();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregationBodyRule());
            					}
            					set(
            						current,
            						"firstendmult",
            						lv_firstendmult_1_0,
            						"org.graces.mydsl.MyDsl.Multi");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:941:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:942:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:942:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:943:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregationBodyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_2, grammarAccess.getAggregationBodyAccess().getFirstendClassHeaderCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:954:3: ( (lv_description_3_0= RULE_AGGRKEYWORD ) )
            // InternalMyDsl.g:955:4: (lv_description_3_0= RULE_AGGRKEYWORD )
            {
            // InternalMyDsl.g:955:4: (lv_description_3_0= RULE_AGGRKEYWORD )
            // InternalMyDsl.g:956:5: lv_description_3_0= RULE_AGGRKEYWORD
            {
            lv_description_3_0=(Token)match(input,RULE_AGGRKEYWORD,FOLLOW_16); 

            					newLeafNode(lv_description_3_0, grammarAccess.getAggregationBodyAccess().getDescriptionAGGRKEYWORDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregationBodyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.graces.mydsl.MyDsl.AGGRKEYWORD");
            				

            }


            }

            // InternalMyDsl.g:972:3: ( (lv_secondendmult_4_0= ruleMulti ) )
            // InternalMyDsl.g:973:4: (lv_secondendmult_4_0= ruleMulti )
            {
            // InternalMyDsl.g:973:4: (lv_secondendmult_4_0= ruleMulti )
            // InternalMyDsl.g:974:5: lv_secondendmult_4_0= ruleMulti
            {

            					newCompositeNode(grammarAccess.getAggregationBodyAccess().getSecondendmultMultiParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_3);
            lv_secondendmult_4_0=ruleMulti();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregationBodyRule());
            					}
            					set(
            						current,
            						"secondendmult",
            						lv_secondendmult_4_0,
            						"org.graces.mydsl.MyDsl.Multi");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:991:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:992:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:992:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:993:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregationBodyRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_5, grammarAccess.getAggregationBodyAccess().getSecondendClassHeaderCrossReference_5_0());
            				

            }


            }

            this_CLOSEDECL_6=(Token)match(input,RULE_CLOSEDECL,FOLLOW_2); 

            			newLeafNode(this_CLOSEDECL_6, grammarAccess.getAggregationBodyAccess().getCLOSEDECLTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleAggregationBody"


    // $ANTLR start "entryRuleAssociation"
    // InternalMyDsl.g:1012:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalMyDsl.g:1012:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalMyDsl.g:1013:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalMyDsl.g:1019:1: ruleAssociation returns [EObject current=null] : ( ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleAssociationBody ) ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_header_0_0 = null;

        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1025:2: ( ( ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleAssociationBody ) ) ) )
            // InternalMyDsl.g:1026:2: ( ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleAssociationBody ) ) )
            {
            // InternalMyDsl.g:1026:2: ( ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleAssociationBody ) ) )
            // InternalMyDsl.g:1027:3: ( (lv_header_0_0= ruleRelationshipHeader ) ) ( (lv_body_1_0= ruleAssociationBody ) )
            {
            // InternalMyDsl.g:1027:3: ( (lv_header_0_0= ruleRelationshipHeader ) )
            // InternalMyDsl.g:1028:4: (lv_header_0_0= ruleRelationshipHeader )
            {
            // InternalMyDsl.g:1028:4: (lv_header_0_0= ruleRelationshipHeader )
            // InternalMyDsl.g:1029:5: lv_header_0_0= ruleRelationshipHeader
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getHeaderRelationshipHeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_header_0_0=ruleRelationshipHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_0_0,
            						"org.graces.mydsl.MyDsl.RelationshipHeader");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1046:3: ( (lv_body_1_0= ruleAssociationBody ) )
            // InternalMyDsl.g:1047:4: (lv_body_1_0= ruleAssociationBody )
            {
            // InternalMyDsl.g:1047:4: (lv_body_1_0= ruleAssociationBody )
            // InternalMyDsl.g:1048:5: lv_body_1_0= ruleAssociationBody
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getBodyAssociationBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleAssociationBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"org.graces.mydsl.MyDsl.AssociationBody");
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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleAssociationBody"
    // InternalMyDsl.g:1069:1: entryRuleAssociationBody returns [EObject current=null] : iv_ruleAssociationBody= ruleAssociationBody EOF ;
    public final EObject entryRuleAssociationBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationBody = null;


        try {
            // InternalMyDsl.g:1069:56: (iv_ruleAssociationBody= ruleAssociationBody EOF )
            // InternalMyDsl.g:1070:2: iv_ruleAssociationBody= ruleAssociationBody EOF
            {
             newCompositeNode(grammarAccess.getAssociationBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationBody=ruleAssociationBody();

            state._fsp--;

             current =iv_ruleAssociationBody; 
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
    // $ANTLR end "entryRuleAssociationBody"


    // $ANTLR start "ruleAssociationBody"
    // InternalMyDsl.g:1076:1: ruleAssociationBody returns [EObject current=null] : (this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_ID ) )? ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL ) ;
    public final EObject ruleAssociationBody() throws RecognitionException {
        EObject current = null;

        Token this_OPENDECL_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_5=null;
        Token this_CLOSEDECL_6=null;
        EObject lv_firstendmult_1_0 = null;

        EObject lv_secondendmult_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1082:2: ( (this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_ID ) )? ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL ) )
            // InternalMyDsl.g:1083:2: (this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_ID ) )? ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL )
            {
            // InternalMyDsl.g:1083:2: (this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_ID ) )? ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL )
            // InternalMyDsl.g:1084:3: this_OPENDECL_0= RULE_OPENDECL ( (lv_firstendmult_1_0= ruleMulti ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_description_3_0= RULE_ID ) )? ( (lv_secondendmult_4_0= ruleMulti ) ) ( (otherlv_5= RULE_ID ) ) this_CLOSEDECL_6= RULE_CLOSEDECL
            {
            this_OPENDECL_0=(Token)match(input,RULE_OPENDECL,FOLLOW_16); 

            			newLeafNode(this_OPENDECL_0, grammarAccess.getAssociationBodyAccess().getOPENDECLTerminalRuleCall_0());
            		
            // InternalMyDsl.g:1088:3: ( (lv_firstendmult_1_0= ruleMulti ) )
            // InternalMyDsl.g:1089:4: (lv_firstendmult_1_0= ruleMulti )
            {
            // InternalMyDsl.g:1089:4: (lv_firstendmult_1_0= ruleMulti )
            // InternalMyDsl.g:1090:5: lv_firstendmult_1_0= ruleMulti
            {

            					newCompositeNode(grammarAccess.getAssociationBodyAccess().getFirstendmultMultiParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_firstendmult_1_0=ruleMulti();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationBodyRule());
            					}
            					set(
            						current,
            						"firstendmult",
            						lv_firstendmult_1_0,
            						"org.graces.mydsl.MyDsl.Multi");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1107:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1108:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1108:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1109:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationBodyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getAssociationBodyAccess().getFirstendClassHeaderCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:1120:3: ( (lv_description_3_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1121:4: (lv_description_3_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1121:4: (lv_description_3_0= RULE_ID )
                    // InternalMyDsl.g:1122:5: lv_description_3_0= RULE_ID
                    {
                    lv_description_3_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    					newLeafNode(lv_description_3_0, grammarAccess.getAssociationBodyAccess().getDescriptionIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationBodyRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_3_0,
                    						"org.graces.mydsl.MyDsl.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1138:3: ( (lv_secondendmult_4_0= ruleMulti ) )
            // InternalMyDsl.g:1139:4: (lv_secondendmult_4_0= ruleMulti )
            {
            // InternalMyDsl.g:1139:4: (lv_secondendmult_4_0= ruleMulti )
            // InternalMyDsl.g:1140:5: lv_secondendmult_4_0= ruleMulti
            {

            					newCompositeNode(grammarAccess.getAssociationBodyAccess().getSecondendmultMultiParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_3);
            lv_secondendmult_4_0=ruleMulti();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationBodyRule());
            					}
            					set(
            						current,
            						"secondendmult",
            						lv_secondendmult_4_0,
            						"org.graces.mydsl.MyDsl.Multi");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1157:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1158:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1158:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1159:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationBodyRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_5, grammarAccess.getAssociationBodyAccess().getSecondendClassHeaderCrossReference_5_0());
            				

            }


            }

            this_CLOSEDECL_6=(Token)match(input,RULE_CLOSEDECL,FOLLOW_2); 

            			newLeafNode(this_CLOSEDECL_6, grammarAccess.getAssociationBodyAccess().getCLOSEDECLTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleAssociationBody"


    // $ANTLR start "entryRuleRelationshipHeader"
    // InternalMyDsl.g:1178:1: entryRuleRelationshipHeader returns [String current=null] : iv_ruleRelationshipHeader= ruleRelationshipHeader EOF ;
    public final String entryRuleRelationshipHeader() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationshipHeader = null;


        try {
            // InternalMyDsl.g:1178:58: (iv_ruleRelationshipHeader= ruleRelationshipHeader EOF )
            // InternalMyDsl.g:1179:2: iv_ruleRelationshipHeader= ruleRelationshipHeader EOF
            {
             newCompositeNode(grammarAccess.getRelationshipHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationshipHeader=ruleRelationshipHeader();

            state._fsp--;

             current =iv_ruleRelationshipHeader.getText(); 
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
    // $ANTLR end "entryRuleRelationshipHeader"


    // $ANTLR start "ruleRelationshipHeader"
    // InternalMyDsl.g:1185:1: ruleRelationshipHeader returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'relationship' ;
    public final AntlrDatatypeRuleToken ruleRelationshipHeader() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1191:2: (kw= 'relationship' )
            // InternalMyDsl.g:1192:2: kw= 'relationship'
            {
            kw=(Token)match(input,27,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getRelationshipHeaderAccess().getRelationshipKeyword());
            	

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
    // $ANTLR end "ruleRelationshipHeader"


    // $ANTLR start "entryRuleMulti"
    // InternalMyDsl.g:1200:1: entryRuleMulti returns [EObject current=null] : iv_ruleMulti= ruleMulti EOF ;
    public final EObject entryRuleMulti() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulti = null;


        try {
            // InternalMyDsl.g:1200:46: (iv_ruleMulti= ruleMulti EOF )
            // InternalMyDsl.g:1201:2: iv_ruleMulti= ruleMulti EOF
            {
             newCompositeNode(grammarAccess.getMultiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulti=ruleMulti();

            state._fsp--;

             current =iv_ruleMulti; 
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
    // $ANTLR end "entryRuleMulti"


    // $ANTLR start "ruleMulti"
    // InternalMyDsl.g:1207:1: ruleMulti returns [EObject current=null] : ( ( ( (lv_multlow_0_0= RULE_INT ) ) otherlv_1= 'to' ( ( (lv_multup_2_0= RULE_INT ) ) | ( (lv_multupunbound_3_0= 'any' ) ) ) ) | ( (lv_multlow_4_0= RULE_INT ) ) | ( (lv_multdownunbound_5_0= 'any' ) ) ) ;
    public final EObject ruleMulti() throws RecognitionException {
        EObject current = null;

        Token lv_multlow_0_0=null;
        Token otherlv_1=null;
        Token lv_multup_2_0=null;
        Token lv_multupunbound_3_0=null;
        Token lv_multlow_4_0=null;
        Token lv_multdownunbound_5_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1213:2: ( ( ( ( (lv_multlow_0_0= RULE_INT ) ) otherlv_1= 'to' ( ( (lv_multup_2_0= RULE_INT ) ) | ( (lv_multupunbound_3_0= 'any' ) ) ) ) | ( (lv_multlow_4_0= RULE_INT ) ) | ( (lv_multdownunbound_5_0= 'any' ) ) ) )
            // InternalMyDsl.g:1214:2: ( ( ( (lv_multlow_0_0= RULE_INT ) ) otherlv_1= 'to' ( ( (lv_multup_2_0= RULE_INT ) ) | ( (lv_multupunbound_3_0= 'any' ) ) ) ) | ( (lv_multlow_4_0= RULE_INT ) ) | ( (lv_multdownunbound_5_0= 'any' ) ) )
            {
            // InternalMyDsl.g:1214:2: ( ( ( (lv_multlow_0_0= RULE_INT ) ) otherlv_1= 'to' ( ( (lv_multup_2_0= RULE_INT ) ) | ( (lv_multupunbound_3_0= 'any' ) ) ) ) | ( (lv_multlow_4_0= RULE_INT ) ) | ( (lv_multdownunbound_5_0= 'any' ) ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==28) ) {
                    alt11=1;
                }
                else if ( (LA11_1==EOF||LA11_1==RULE_ID) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==29) ) {
                alt11=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1215:3: ( ( (lv_multlow_0_0= RULE_INT ) ) otherlv_1= 'to' ( ( (lv_multup_2_0= RULE_INT ) ) | ( (lv_multupunbound_3_0= 'any' ) ) ) )
                    {
                    // InternalMyDsl.g:1215:3: ( ( (lv_multlow_0_0= RULE_INT ) ) otherlv_1= 'to' ( ( (lv_multup_2_0= RULE_INT ) ) | ( (lv_multupunbound_3_0= 'any' ) ) ) )
                    // InternalMyDsl.g:1216:4: ( (lv_multlow_0_0= RULE_INT ) ) otherlv_1= 'to' ( ( (lv_multup_2_0= RULE_INT ) ) | ( (lv_multupunbound_3_0= 'any' ) ) )
                    {
                    // InternalMyDsl.g:1216:4: ( (lv_multlow_0_0= RULE_INT ) )
                    // InternalMyDsl.g:1217:5: (lv_multlow_0_0= RULE_INT )
                    {
                    // InternalMyDsl.g:1217:5: (lv_multlow_0_0= RULE_INT )
                    // InternalMyDsl.g:1218:6: lv_multlow_0_0= RULE_INT
                    {
                    lv_multlow_0_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                    						newLeafNode(lv_multlow_0_0, grammarAccess.getMultiAccess().getMultlowINTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultiRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"multlow",
                    							lv_multlow_0_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getMultiAccess().getToKeyword_0_1());
                    			
                    // InternalMyDsl.g:1238:4: ( ( (lv_multup_2_0= RULE_INT ) ) | ( (lv_multupunbound_3_0= 'any' ) ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_INT) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==29) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyDsl.g:1239:5: ( (lv_multup_2_0= RULE_INT ) )
                            {
                            // InternalMyDsl.g:1239:5: ( (lv_multup_2_0= RULE_INT ) )
                            // InternalMyDsl.g:1240:6: (lv_multup_2_0= RULE_INT )
                            {
                            // InternalMyDsl.g:1240:6: (lv_multup_2_0= RULE_INT )
                            // InternalMyDsl.g:1241:7: lv_multup_2_0= RULE_INT
                            {
                            lv_multup_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                            							newLeafNode(lv_multup_2_0, grammarAccess.getMultiAccess().getMultupINTTerminalRuleCall_0_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMultiRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"multup",
                            								lv_multup_2_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1258:5: ( (lv_multupunbound_3_0= 'any' ) )
                            {
                            // InternalMyDsl.g:1258:5: ( (lv_multupunbound_3_0= 'any' ) )
                            // InternalMyDsl.g:1259:6: (lv_multupunbound_3_0= 'any' )
                            {
                            // InternalMyDsl.g:1259:6: (lv_multupunbound_3_0= 'any' )
                            // InternalMyDsl.g:1260:7: lv_multupunbound_3_0= 'any'
                            {
                            lv_multupunbound_3_0=(Token)match(input,29,FOLLOW_2); 

                            							newLeafNode(lv_multupunbound_3_0, grammarAccess.getMultiAccess().getMultupunboundAnyKeyword_0_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMultiRule());
                            							}
                            							setWithLastConsumed(current, "multupunbound", lv_multupunbound_3_0, "any");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1275:3: ( (lv_multlow_4_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:1275:3: ( (lv_multlow_4_0= RULE_INT ) )
                    // InternalMyDsl.g:1276:4: (lv_multlow_4_0= RULE_INT )
                    {
                    // InternalMyDsl.g:1276:4: (lv_multlow_4_0= RULE_INT )
                    // InternalMyDsl.g:1277:5: lv_multlow_4_0= RULE_INT
                    {
                    lv_multlow_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_multlow_4_0, grammarAccess.getMultiAccess().getMultlowINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMultiRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"multlow",
                    						lv_multlow_4_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1294:3: ( (lv_multdownunbound_5_0= 'any' ) )
                    {
                    // InternalMyDsl.g:1294:3: ( (lv_multdownunbound_5_0= 'any' ) )
                    // InternalMyDsl.g:1295:4: (lv_multdownunbound_5_0= 'any' )
                    {
                    // InternalMyDsl.g:1295:4: (lv_multdownunbound_5_0= 'any' )
                    // InternalMyDsl.g:1296:5: lv_multdownunbound_5_0= 'any'
                    {
                    lv_multdownunbound_5_0=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_multdownunbound_5_0, grammarAccess.getMultiAccess().getMultdownunboundAnyKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMultiRule());
                    					}
                    					setWithLastConsumed(current, "multdownunbound", lv_multdownunbound_5_0, "any");
                    				

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleMulti"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\33\1\5\1\15\2\4\1\15\3\4\3\uffff";
    static final String dfa_3s = "\1\33\1\5\1\35\1\34\1\4\2\35\2\4\3\uffff";
    static final String dfa_4s = "\11\uffff\1\1\1\3\1\2";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3\17\uffff\1\4",
            "\1\6\27\uffff\1\5",
            "\1\6",
            "\1\7\17\uffff\1\10",
            "\1\12\6\uffff\1\11\1\13\1\12\17\uffff\1\12",
            "\1\6",
            "\1\6",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "649:2: (this_Composition_0= ruleComposition | this_Aggregation_1= ruleAggregation | this_Association_2= ruleAssociation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008100040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400140L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020002010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});

}