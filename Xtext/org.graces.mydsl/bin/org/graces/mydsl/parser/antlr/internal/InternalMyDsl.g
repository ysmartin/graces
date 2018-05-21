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
    	return "ModelDefinition";
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

// Entry rule entryRuleModelDefinition
entryRuleModelDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelDefinitionRule()); }
	iv_ruleModelDefinition=ruleModelDefinition
	{ $current=$iv_ruleModelDefinition.current; }
	EOF;

// Rule ModelDefinition
ruleModelDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='model'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelDefinitionAccess().getModelKeyword_0());
		}
		(
			(
				lv_modelname_1_0=RULE_WORD
				{
					newLeafNode(lv_modelname_1_0, grammarAccess.getModelDefinitionAccess().getModelnameWORDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"modelname",
						lv_modelname_1_0,
						"org.graces.mydsl.MyDsl.WORD");
				}
			)
		)
		this_OPENDECL_2=RULE_OPENDECL
		{
			newLeafNode(this_OPENDECL_2, grammarAccess.getModelDefinitionAccess().getOPENDECLTerminalRuleCall_2());
		}
		{
			newCompositeNode(grammarAccess.getModelDefinitionAccess().getClassDeclParserRuleCall_3());
		}
		this_ClassDecl_3=ruleClassDecl
		{
			$current = $this_ClassDecl_3.current;
			afterParserOrEnumRuleCall();
		}
		this_CLOSEDECL_4=RULE_CLOSEDECL
		{
			newLeafNode(this_CLOSEDECL_4, grammarAccess.getModelDefinitionAccess().getCLOSEDECLTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleClassDecl
entryRuleClassDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassDeclRule()); }
	iv_ruleClassDecl=ruleClassDecl
	{ $current=$iv_ruleClassDecl.current; }
	EOF;

// Rule ClassDecl
ruleClassDecl returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getClassDeclAccess().getHeaderClassHeaderParserRuleCall_0_0());
				}
				lv_header_0_0=ruleClassHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassDeclRule());
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
					newCompositeNode(grammarAccess.getClassDeclAccess().getBodyClassBodyParserRuleCall_1_0());
				}
				lv_body_1_0=ruleClassBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassDeclRule());
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
				lv_classname_1_0=RULE_WORD
				{
					newLeafNode(lv_classname_1_0, grammarAccess.getClassHeaderAccess().getClassnameWORDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassHeaderRule());
					}
					setWithLastConsumed(
						$current,
						"classname",
						lv_classname_1_0,
						"org.graces.mydsl.MyDsl.WORD");
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
					lv_attrname_1_0=RULE_WORD
					{
						newLeafNode(lv_attrname_1_0, grammarAccess.getAttrBodyAccess().getAttrnameWORDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAttrBodyRule());
						}
						setWithLastConsumed(
							$current,
							"attrname",
							lv_attrname_1_0,
							"org.graces.mydsl.MyDsl.WORD");
					}
				)
			)
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getAttrBodyAccess().getColonKeyword_1_1());
			}
			(
				(
					lv_attrtype_3_0=RULE_WORD
					{
						newLeafNode(lv_attrtype_3_0, grammarAccess.getAttrBodyAccess().getAttrtypeWORDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAttrBodyRule());
						}
						setWithLastConsumed(
							$current,
							"attrtype",
							lv_attrtype_3_0,
							"org.graces.mydsl.MyDsl.WORD");
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
				lv_opname_1_0=RULE_WORD
				{
					newLeafNode(lv_opname_1_0, grammarAccess.getOpBodyAccess().getOpnameWORDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOpBodyRule());
					}
					setWithLastConsumed(
						$current,
						"opname",
						lv_opname_1_0,
						"org.graces.mydsl.MyDsl.WORD");
				}
			)
		)
		(
			this_OPENARG_2=RULE_OPENARG
			{
				newLeafNode(this_OPENARG_2, grammarAccess.getOpBodyAccess().getOPENARGTerminalRuleCall_2_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getOpBodyAccess().getArgsArgBodyParserRuleCall_2_1_0_0());
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
				    |
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getOpBodyAccess().getArgsArgBodyParserRuleCall_2_1_1_0_0());
							}
							lv_args_4_0=ruleArgBody
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getOpBodyRule());
								}
								add(
									$current,
									"args",
									lv_args_4_0,
									"org.graces.mydsl.MyDsl.ArgBody");
								afterParserOrEnumRuleCall();
							}
						)
					)
					otherlv_5=','
					{
						newLeafNode(otherlv_5, grammarAccess.getOpBodyAccess().getCommaKeyword_2_1_1_1());
					}
				)
			)+
			this_CLOSEARG_6=RULE_CLOSEARG
			{
				newLeafNode(this_CLOSEARG_6, grammarAccess.getOpBodyAccess().getCLOSEARGTerminalRuleCall_2_2());
			}
		)?
		(
			otherlv_7='return'
			{
				newLeafNode(otherlv_7, grammarAccess.getOpBodyAccess().getReturnKeyword_3_0());
			}
			(
				(
					lv_returntype_8_0=RULE_WORD
					{
						newLeafNode(lv_returntype_8_0, grammarAccess.getOpBodyAccess().getReturntypeWORDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOpBodyRule());
						}
						setWithLastConsumed(
							$current,
							"returntype",
							lv_returntype_8_0,
							"org.graces.mydsl.MyDsl.WORD");
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
					lv_argname_2_0=RULE_WORD
					{
						newLeafNode(lv_argname_2_0, grammarAccess.getArgBodyAccess().getArgnameWORDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getArgBodyRule());
						}
						setWithLastConsumed(
							$current,
							"argname",
							lv_argname_2_0,
							"org.graces.mydsl.MyDsl.WORD");
					}
				)
			)
			otherlv_3=':'
			{
				newLeafNode(otherlv_3, grammarAccess.getArgBodyAccess().getColonKeyword_1_1());
			}
			(
				(
					lv_argtype_4_0=RULE_WORD
					{
						newLeafNode(lv_argtype_4_0, grammarAccess.getArgBodyAccess().getArgtypeWORDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getArgBodyRule());
						}
						setWithLastConsumed(
							$current,
							"argtype",
							lv_argtype_4_0,
							"org.graces.mydsl.MyDsl.WORD");
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

RULE_WORD : (RULE_LOWERCASE|RULE_UPPERACASE|RULE_INT)+;

fragment RULE_LOWERCASE : 'a'..'z';

fragment RULE_UPPERACASE : 'A'..'Z';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
