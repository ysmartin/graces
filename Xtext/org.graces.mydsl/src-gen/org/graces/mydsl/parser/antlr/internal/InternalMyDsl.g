/*
 * generated by Xtext 2.13.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.graces.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='model'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		this_OPENDECL_2=RULE_OPENDECL
		{
			newLeafNode(this_OPENDECL_2, grammarAccess.getModelAccess().getOPENDECLTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getClazzesClassParserRuleCall_3_0());
				}
				lv_clazzes_3_0=ruleClass
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"clazzes",
						lv_clazzes_3_0,
						"org.graces.mydsl.MyDsl.Class");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_CLOSEDECL_4=RULE_CLOSEDECL
		{
			newLeafNode(this_CLOSEDECL_4, grammarAccess.getModelAccess().getCLOSEDECLTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	iv_ruleClass=ruleClass
	{ $current=$iv_ruleClass.current; }
	EOF;

// Rule Class
ruleClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getClassAccess().getHeaderClassHeaderParserRuleCall_0_0());
				}
				lv_header_0_0=ruleClassHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassRule());
					}
					set(
						$current,
						"header",
						lv_header_0_0,
						"org.graces.mydsl.MyDsl.ClassHeader");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getClassAccess().getBodyClassBodyParserRuleCall_1_0());
				}
				lv_body_1_0=ruleClassBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassRule());
					}
					set(
						$current,
						"body",
						lv_body_1_0,
						"org.graces.mydsl.MyDsl.ClassBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleClassHeader
entryRuleClassHeader returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassHeaderRule()); }
	iv_ruleClassHeader=ruleClassHeader
	{ $current=$iv_ruleClassHeader.current; }
	EOF;

// Rule ClassHeader
ruleClassHeader returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='class'
		{
			newLeafNode(otherlv_0, grammarAccess.getClassHeaderAccess().getClassKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getClassHeaderAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassHeaderRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleClassBody
entryRuleClassBody returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassBodyRule()); }
	iv_ruleClassBody=ruleClassBody
	{ $current=$iv_ruleClassBody.current; }
	EOF;

// Rule ClassBody
ruleClassBody returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_OPENDECL_0=RULE_OPENDECL
		{
			newLeafNode(this_OPENDECL_0, grammarAccess.getClassBodyAccess().getOPENDECLTerminalRuleCall_0());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getClassBodyAccess().getAttributesAttrBodyParserRuleCall_1_0_0_0());
						}
						lv_attributes_1_0=ruleAttrBody
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClassBodyRule());
							}
							add(
								$current,
								"attributes",
								lv_attributes_1_0,
								"org.graces.mydsl.MyDsl.AttrBody");
							afterParserOrEnumRuleCall();
						}
					)
				)
				this_CLOSELINE_2=RULE_CLOSELINE
				{
					newLeafNode(this_CLOSELINE_2, grammarAccess.getClassBodyAccess().getCLOSELINETerminalRuleCall_1_0_1());
				}
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getClassBodyAccess().getOperationsOpBodyParserRuleCall_1_1_0_0());
						}
						lv_operations_3_0=ruleOpBody
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClassBodyRule());
							}
							add(
								$current,
								"operations",
								lv_operations_3_0,
								"org.graces.mydsl.MyDsl.OpBody");
							afterParserOrEnumRuleCall();
						}
					)
				)
				this_CLOSELINE_4=RULE_CLOSELINE
				{
					newLeafNode(this_CLOSELINE_4, grammarAccess.getClassBodyAccess().getCLOSELINETerminalRuleCall_1_1_1());
				}
			)
		)*
		this_CLOSEDECL_5=RULE_CLOSEDECL
		{
			newLeafNode(this_CLOSEDECL_5, grammarAccess.getClassBodyAccess().getCLOSEDECLTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleAttrBody
entryRuleAttrBody returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttrBodyRule()); }
	iv_ruleAttrBody=ruleAttrBody
	{ $current=$iv_ruleAttrBody.current; }
	EOF;

// Rule AttrBody
ruleAttrBody returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_VISIBILITY_0=RULE_VISIBILITY
		{
			newLeafNode(this_VISIBILITY_0, grammarAccess.getAttrBodyAccess().getVISIBILITYTerminalRuleCall_0());
		}
		(
			(
				(
					lv_name_1_0=RULE_ID
					{
						newLeafNode(lv_name_1_0, grammarAccess.getAttrBodyAccess().getNameIDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAttrBodyRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getAttrBodyAccess().getColonKeyword_1_1());
			}
			(
				(
					lv_type_3_0=RULE_ID
					{
						newLeafNode(lv_type_3_0, grammarAccess.getAttrBodyAccess().getTypeIDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAttrBodyRule());
						}
						setWithLastConsumed(
							$current,
							"type",
							lv_type_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleOpBody
entryRuleOpBody returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOpBodyRule()); }
	iv_ruleOpBody=ruleOpBody
	{ $current=$iv_ruleOpBody.current; }
	EOF;

// Rule OpBody
ruleOpBody returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='operation'
		{
			newLeafNode(otherlv_0, grammarAccess.getOpBodyAccess().getOperationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getOpBodyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOpBodyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		this_OPENARG_2=RULE_OPENARG
		{
			newLeafNode(this_OPENARG_2, grammarAccess.getOpBodyAccess().getOPENARGTerminalRuleCall_2());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getOpBodyAccess().getArgsArgBodyParserRuleCall_3_0_0_0());
						}
						lv_args_3_0=ruleArgBody
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getOpBodyRule());
							}
							add(
								$current,
								"args",
								lv_args_3_0,
								"org.graces.mydsl.MyDsl.ArgBody");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getOpBodyAccess().getCommaKeyword_3_0_1());
				}
			)*
			(
				(
					{
						newCompositeNode(grammarAccess.getOpBodyAccess().getArgsArgBodyParserRuleCall_3_1_0());
					}
					lv_args_5_0=ruleArgBody
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOpBodyRule());
						}
						add(
							$current,
							"args",
							lv_args_5_0,
							"org.graces.mydsl.MyDsl.ArgBody");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		this_CLOSEARG_6=RULE_CLOSEARG
		{
			newLeafNode(this_CLOSEARG_6, grammarAccess.getOpBodyAccess().getCLOSEARGTerminalRuleCall_4());
		}
		(
			otherlv_7='return'
			{
				newLeafNode(otherlv_7, grammarAccess.getOpBodyAccess().getReturnKeyword_5_0());
			}
			(
				(
					lv_type_8_0=RULE_ID
					{
						newLeafNode(lv_type_8_0, grammarAccess.getOpBodyAccess().getTypeIDTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOpBodyRule());
						}
						setWithLastConsumed(
							$current,
							"type",
							lv_type_8_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleArgBody
entryRuleArgBody returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArgBodyRule()); }
	iv_ruleArgBody=ruleArgBody
	{ $current=$iv_ruleArgBody.current; }
	EOF;

// Rule ArgBody
ruleArgBody returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='in'
			{
				newLeafNode(otherlv_0, grammarAccess.getArgBodyAccess().getInKeyword_0_0());
			}
			    |
			otherlv_1='out'
			{
				newLeafNode(otherlv_1, grammarAccess.getArgBodyAccess().getOutKeyword_0_1());
			}
		)
		(
			(
				(
					lv_name_2_0=RULE_ID
					{
						newLeafNode(lv_name_2_0, grammarAccess.getArgBodyAccess().getNameIDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getArgBodyRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_2_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_3=':'
			{
				newLeafNode(otherlv_3, grammarAccess.getArgBodyAccess().getColonKeyword_1_1());
			}
			(
				(
					lv_type_4_0=RULE_ID
					{
						newLeafNode(lv_type_4_0, grammarAccess.getArgBodyAccess().getTypeIDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getArgBodyRule());
						}
						setWithLastConsumed(
							$current,
							"type",
							lv_type_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
	)
;

RULE_VISIBILITY : ('public'|'private'|'protected'|'package');

RULE_OPENDECL : '{';

RULE_CLOSEDECL : '}';

RULE_CLOSELINE : ';';

RULE_OPENARG : '(';

RULE_CLOSEARG : ')';

fragment RULE_LOWERCASE : 'a'..'z';

fragment RULE_UPPERCASE : 'A'..'Z';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;