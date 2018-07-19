package org.graces.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_CLOSELINE=6;
    public static final int RULE_VISIBILITY=10;
    public static final int RULE_STRING=14;
    public static final int RULE_OPENARG=7;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int RULE_CLOSEARG=8;
    public static final int EOF=-1;
    public static final int RULE_ID=9;
    public static final int RULE_WS=17;
    public static final int RULE_AGGRKEYWORD=12;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__26=26;
    public static final int RULE_CLOSEDECL=5;
    public static final int T__27=27;
    public static final int RULE_OPENDECL=4;
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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'relationship' )
            // InternalMyDsl.g:11:9: 'relationship'
            {
            match("relationship"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( 'in' )
            // InternalMyDsl.g:12:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'out' )
            // InternalMyDsl.g:13:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'model' )
            // InternalMyDsl.g:14:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'class' )
            // InternalMyDsl.g:15:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( ':' )
            // InternalMyDsl.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( 'operation' )
            // InternalMyDsl.g:17:9: 'operation'
            {
            match("operation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( ',' )
            // InternalMyDsl.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'return' )
            // InternalMyDsl.g:19:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'to' )
            // InternalMyDsl.g:20:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'any' )
            // InternalMyDsl.g:21:9: 'any'
            {
            match("any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "RULE_VISIBILITY"
    public final void mRULE_VISIBILITY() throws RecognitionException {
        try {
            int _type = RULE_VISIBILITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3149:17: ( ( 'public' | 'private' | 'protected' | 'package' ) )
            // InternalMyDsl.g:3149:19: ( 'public' | 'private' | 'protected' | 'package' )
            {
            // InternalMyDsl.g:3149:19: ( 'public' | 'private' | 'protected' | 'package' )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='p') ) {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt1=1;
                    }
                    break;
                case 'r':
                    {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3=='i') ) {
                        alt1=2;
                    }
                    else if ( (LA1_3=='o') ) {
                        alt1=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'a':
                    {
                    alt1=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:3149:20: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3149:29: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3149:39: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3149:51: 'package'
                    {
                    match("package"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VISIBILITY"

    // $ANTLR start "RULE_OPENDECL"
    public final void mRULE_OPENDECL() throws RecognitionException {
        try {
            int _type = RULE_OPENDECL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3151:15: ( '{' )
            // InternalMyDsl.g:3151:17: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPENDECL"

    // $ANTLR start "RULE_CLOSEDECL"
    public final void mRULE_CLOSEDECL() throws RecognitionException {
        try {
            int _type = RULE_CLOSEDECL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3153:16: ( '}' )
            // InternalMyDsl.g:3153:18: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSEDECL"

    // $ANTLR start "RULE_CLOSELINE"
    public final void mRULE_CLOSELINE() throws RecognitionException {
        try {
            int _type = RULE_CLOSELINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3155:16: ( ';' )
            // InternalMyDsl.g:3155:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSELINE"

    // $ANTLR start "RULE_OPENARG"
    public final void mRULE_OPENARG() throws RecognitionException {
        try {
            int _type = RULE_OPENARG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3157:14: ( '(' )
            // InternalMyDsl.g:3157:16: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPENARG"

    // $ANTLR start "RULE_CLOSEARG"
    public final void mRULE_CLOSEARG() throws RecognitionException {
        try {
            int _type = RULE_CLOSEARG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3159:15: ( ')' )
            // InternalMyDsl.g:3159:17: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSEARG"

    // $ANTLR start "RULE_AGGRKEYWORD"
    public final void mRULE_AGGRKEYWORD() throws RecognitionException {
        try {
            int _type = RULE_AGGRKEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3161:18: ( 'have' )
            // InternalMyDsl.g:3161:20: 'have'
            {
            match("have"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AGGRKEYWORD"

    // $ANTLR start "RULE_COMPKEYWORD"
    public final void mRULE_COMPKEYWORD() throws RecognitionException {
        try {
            int _type = RULE_COMPKEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3163:18: ( 'compose of' )
            // InternalMyDsl.g:3163:20: 'compose of'
            {
            match("compose of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMPKEYWORD"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3165:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:3165:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:3165:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\'') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:3165:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:3165:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:3165:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:3165:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3165:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:3165:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:3165:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:3165:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3167:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:3167:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:3167:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3169:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:3169:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:3169:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:3169:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3171:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:3171:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:3171:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:3171:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3173:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:3173:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:3173:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:3173:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyDsl.g:3173:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:3173:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:3173:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:3173:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3175:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:3175:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:3175:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:3177:16: ( . )
            // InternalMyDsl.g:3177:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_VISIBILITY | RULE_OPENDECL | RULE_CLOSEDECL | RULE_CLOSELINE | RULE_OPENARG | RULE_CLOSEARG | RULE_AGGRKEYWORD | RULE_COMPKEYWORD | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=26;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalMyDsl.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: RULE_VISIBILITY
                {
                mRULE_VISIBILITY(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:92: RULE_OPENDECL
                {
                mRULE_OPENDECL(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:106: RULE_CLOSEDECL
                {
                mRULE_CLOSEDECL(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:121: RULE_CLOSELINE
                {
                mRULE_CLOSELINE(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:136: RULE_OPENARG
                {
                mRULE_OPENARG(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:149: RULE_CLOSEARG
                {
                mRULE_CLOSEARG(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:163: RULE_AGGRKEYWORD
                {
                mRULE_AGGRKEYWORD(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:180: RULE_COMPKEYWORD
                {
                mRULE_COMPKEYWORD(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:197: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:209: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:217: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:226: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:242: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:258: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:266: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\5\31\2\uffff\3\31\5\uffff\1\31\2\27\2\uffff\1\27\2\uffff\1\31\1\uffff\1\64\5\31\2\uffff\1\72\4\31\5\uffff\1\31\5\uffff\2\31\1\uffff\1\103\4\31\1\uffff\1\110\7\31\1\uffff\4\31\1\uffff\4\31\1\130\3\31\1\134\1\135\5\31\1\uffff\1\31\1\144\1\31\2\uffff\1\31\1\147\4\31\1\uffff\2\31\1\uffff\1\147\1\31\1\147\2\31\1\uffff\2\31\1\163\1\147\1\31\1\uffff\1\31\1\166\1\uffff";
    static final String DFA12_eofS =
        "\167\uffff";
    static final String DFA12_minS =
        "\1\0\1\145\1\156\1\160\1\157\1\154\2\uffff\1\157\1\156\1\141\5\uffff\1\141\2\0\2\uffff\1\52\2\uffff\1\154\1\uffff\1\60\1\164\1\145\1\144\1\141\1\155\2\uffff\1\60\1\171\1\142\1\151\1\143\5\uffff\1\166\5\uffff\1\141\1\165\1\uffff\1\60\1\162\1\145\1\163\1\160\1\uffff\1\60\1\154\1\166\1\164\1\153\1\145\1\164\1\162\1\uffff\1\141\1\154\1\163\1\157\1\uffff\1\151\1\141\1\145\1\141\1\60\1\151\1\156\1\164\2\60\1\163\1\143\1\164\1\143\1\147\1\uffff\1\157\1\60\1\151\2\uffff\1\145\1\60\1\145\1\164\1\145\1\156\1\uffff\1\157\1\40\1\uffff\1\60\1\145\1\60\1\163\1\156\1\uffff\1\144\1\150\2\60\1\151\1\uffff\1\160\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\145\1\156\1\165\2\157\2\uffff\1\157\1\156\1\165\5\uffff\1\141\2\uffff\2\uffff\1\57\2\uffff\1\164\1\uffff\1\172\1\164\1\145\1\144\1\141\1\155\2\uffff\1\172\1\171\1\142\1\157\1\143\5\uffff\1\166\5\uffff\1\141\1\165\1\uffff\1\172\1\162\1\145\1\163\1\160\1\uffff\1\172\1\154\1\166\1\164\1\153\1\145\1\164\1\162\1\uffff\1\141\1\154\1\163\1\157\1\uffff\1\151\1\141\1\145\1\141\1\172\1\151\1\156\1\164\2\172\1\163\1\143\1\164\1\143\1\147\1\uffff\1\157\1\172\1\151\2\uffff\1\145\1\172\1\145\1\164\1\145\1\156\1\uffff\1\157\1\40\1\uffff\1\172\1\145\1\172\1\163\1\156\1\uffff\1\144\1\150\2\172\1\151\1\uffff\1\160\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\6\uffff\1\6\1\10\3\uffff\1\15\1\16\1\17\1\20\1\21\3\uffff\1\25\1\26\1\uffff\1\31\1\32\1\uffff\1\25\6\uffff\1\6\1\10\5\uffff\1\15\1\16\1\17\1\20\1\21\1\uffff\1\24\1\26\1\27\1\30\1\31\2\uffff\1\2\5\uffff\1\12\10\uffff\1\3\4\uffff\1\13\17\uffff\1\22\3\uffff\1\4\1\5\6\uffff\1\11\2\uffff\1\14\5\uffff\1\23\5\uffff\1\7\2\uffff\1\1";
    static final String DFA12_specialS =
        "\1\0\20\uffff\1\2\1\1\144\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\21\4\27\1\22\1\16\1\17\2\27\1\7\2\27\1\25\12\24\1\6\1\15\5\27\32\23\4\27\1\23\1\27\1\11\1\23\1\5\4\23\1\20\1\2\3\23\1\4\1\23\1\3\1\12\1\23\1\1\1\23\1\10\6\23\1\13\1\27\1\14\uff82\27",
            "\1\30",
            "\1\32",
            "\1\34\4\uffff\1\33",
            "\1\35",
            "\1\36\2\uffff\1\37",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\46\20\uffff\1\45\2\uffff\1\44",
            "",
            "",
            "",
            "",
            "",
            "\1\54",
            "\0\55",
            "\0\55",
            "",
            "",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\1\62\7\uffff\1\63",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\73",
            "\1\74",
            "\1\75\5\uffff\1\76",
            "\1\77",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\145",
            "",
            "",
            "\1\146",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\156",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\164",
            "",
            "\1\165",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_VISIBILITY | RULE_OPENDECL | RULE_CLOSEDECL | RULE_CLOSELINE | RULE_OPENARG | RULE_CLOSEARG | RULE_AGGRKEYWORD | RULE_COMPKEYWORD | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='r') ) {s = 1;}

                        else if ( (LA12_0=='i') ) {s = 2;}

                        else if ( (LA12_0=='o') ) {s = 3;}

                        else if ( (LA12_0=='m') ) {s = 4;}

                        else if ( (LA12_0=='c') ) {s = 5;}

                        else if ( (LA12_0==':') ) {s = 6;}

                        else if ( (LA12_0==',') ) {s = 7;}

                        else if ( (LA12_0=='t') ) {s = 8;}

                        else if ( (LA12_0=='a') ) {s = 9;}

                        else if ( (LA12_0=='p') ) {s = 10;}

                        else if ( (LA12_0=='{') ) {s = 11;}

                        else if ( (LA12_0=='}') ) {s = 12;}

                        else if ( (LA12_0==';') ) {s = 13;}

                        else if ( (LA12_0=='(') ) {s = 14;}

                        else if ( (LA12_0==')') ) {s = 15;}

                        else if ( (LA12_0=='h') ) {s = 16;}

                        else if ( (LA12_0=='\"') ) {s = 17;}

                        else if ( (LA12_0=='\'') ) {s = 18;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='d' && LA12_0<='g')||(LA12_0>='j' && LA12_0<='l')||LA12_0=='n'||LA12_0=='q'||LA12_0=='s'||(LA12_0>='u' && LA12_0<='z')) ) {s = 19;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 20;}

                        else if ( (LA12_0=='/') ) {s = 21;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 22;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<='^')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 45;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( ((LA12_17>='\u0000' && LA12_17<='\uFFFF')) ) {s = 45;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}