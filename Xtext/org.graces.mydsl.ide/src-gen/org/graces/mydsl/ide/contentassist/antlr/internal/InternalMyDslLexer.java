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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'in' )
            // InternalMyDsl.g:11:9: 'in'
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
            // InternalMyDsl.g:12:7: ( 'out' )
            // InternalMyDsl.g:12:9: 'out'
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
            // InternalMyDsl.g:13:7: ( 'model' )
            // InternalMyDsl.g:13:9: 'model'
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
            // InternalMyDsl.g:14:7: ( 'class' )
            // InternalMyDsl.g:14:9: 'class'
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
            // InternalMyDsl.g:15:7: ( ':' )
            // InternalMyDsl.g:15:9: ':'
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
            // InternalMyDsl.g:16:7: ( 'operation' )
            // InternalMyDsl.g:16:9: 'operation'
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
            // InternalMyDsl.g:17:7: ( ',' )
            // InternalMyDsl.g:17:9: ','
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
            // InternalMyDsl.g:18:7: ( 'return' )
            // InternalMyDsl.g:18:9: 'return'
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

    // $ANTLR start "RULE_VISIBILITY"
    public final void mRULE_VISIBILITY() throws RecognitionException {
        try {
            int _type = RULE_VISIBILITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1506:17: ( ( 'public' | 'private' | 'protected' | 'package' ) )
            // InternalMyDsl.g:1506:19: ( 'public' | 'private' | 'protected' | 'package' )
            {
            // InternalMyDsl.g:1506:19: ( 'public' | 'private' | 'protected' | 'package' )
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
                    // InternalMyDsl.g:1506:20: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1506:29: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1506:39: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1506:51: 'package'
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
            // InternalMyDsl.g:1508:15: ( '{' )
            // InternalMyDsl.g:1508:17: '{'
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
            // InternalMyDsl.g:1510:16: ( '}' )
            // InternalMyDsl.g:1510:18: '}'
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
            // InternalMyDsl.g:1512:16: ( ';' )
            // InternalMyDsl.g:1512:18: ';'
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
            // InternalMyDsl.g:1514:14: ( '(' )
            // InternalMyDsl.g:1514:16: '('
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
            // InternalMyDsl.g:1516:15: ( ')' )
            // InternalMyDsl.g:1516:17: ')'
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

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1518:11: ( ( RULE_LOWERCASE | RULE_UPPERACASE | RULE_INT )+ )
            // InternalMyDsl.g:1518:13: ( RULE_LOWERCASE | RULE_UPPERACASE | RULE_INT )+
            {
            // InternalMyDsl.g:1518:13: ( RULE_LOWERCASE | RULE_UPPERACASE | RULE_INT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt2=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt2=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:1518:14: RULE_LOWERCASE
            	    {
            	    mRULE_LOWERCASE(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:1518:29: RULE_UPPERACASE
            	    {
            	    mRULE_UPPERACASE(); 

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:1518:45: RULE_INT
            	    {
            	    mRULE_INT(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_LOWERCASE"
    public final void mRULE_LOWERCASE() throws RecognitionException {
        try {
            // InternalMyDsl.g:1520:25: ( 'a' .. 'z' )
            // InternalMyDsl.g:1520:27: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOWERCASE"

    // $ANTLR start "RULE_UPPERACASE"
    public final void mRULE_UPPERACASE() throws RecognitionException {
        try {
            // InternalMyDsl.g:1522:26: ( 'A' .. 'Z' )
            // InternalMyDsl.g:1522:28: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UPPERACASE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1524:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:1524:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:1524:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1524:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:1524:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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
            // InternalMyDsl.g:1526:19: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:1526:21: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:1526:21: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:1526:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1528:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:1528:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:1528:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1528:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:1528:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:1528:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1528:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1528:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:1528:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:1528:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1528:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1530:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:1530:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:1530:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1530:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalMyDsl.g:1532:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:1532:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:1532:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1532:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalMyDsl.g:1532:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1532:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:1532:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyDsl.g:1532:41: '\\r'
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
            // InternalMyDsl.g:1534:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:1534:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:1534:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalMyDsl.g:1536:16: ( . )
            // InternalMyDsl.g:1536:18: .
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
        // InternalMyDsl.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_VISIBILITY | RULE_OPENDECL | RULE_CLOSEDECL | RULE_CLOSELINE | RULE_OPENARG | RULE_CLOSEARG | RULE_WORD | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=21;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalMyDsl.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: RULE_VISIBILITY
                {
                mRULE_VISIBILITY(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:74: RULE_OPENDECL
                {
                mRULE_OPENDECL(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:88: RULE_CLOSEDECL
                {
                mRULE_CLOSEDECL(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:103: RULE_CLOSELINE
                {
                mRULE_CLOSELINE(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:118: RULE_OPENARG
                {
                mRULE_OPENARG(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:131: RULE_CLOSEARG
                {
                mRULE_CLOSEARG(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:145: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:155: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:163: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:175: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:191: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:207: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:215: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\4\31\2\uffff\2\31\5\uffff\2\31\1\uffff\1\27\1\uffff\3\27\2\uffff\1\61\1\uffff\3\31\1\uffff\4\31\2\uffff\4\31\12\uffff\1\73\10\31\1\uffff\11\31\1\115\1\116\6\31\2\uffff\1\125\1\126\4\31\2\uffff\1\126\1\31\1\126\2\31\1\136\1\126\1\uffff";
    static final String DFA14_eofS =
        "\137\uffff";
    static final String DFA14_minS =
        "\1\0\4\60\2\uffff\2\60\5\uffff\2\60\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\60\1\uffff\3\60\1\uffff\4\60\2\uffff\4\60\12\uffff\11\60\1\uffff\21\60\2\uffff\6\60\2\uffff\7\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\4\172\2\uffff\2\172\5\uffff\2\172\1\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\172\1\uffff\3\172\1\uffff\4\172\2\uffff\4\172\12\uffff\11\172\1\uffff\21\172\2\uffff\6\172\2\uffff\7\172\1\uffff";
    static final String DFA14_acceptS =
        "\5\uffff\1\5\1\7\2\uffff\1\12\1\13\1\14\1\15\1\16\2\uffff\1\17\1\uffff\1\20\3\uffff\1\24\1\25\1\uffff\1\17\3\uffff\1\20\4\uffff\1\5\1\7\4\uffff\1\12\1\13\1\14\1\15\1\16\1\21\1\22\1\23\1\24\1\1\11\uffff\1\2\21\uffff\1\3\1\4\6\uffff\1\10\1\11\7\uffff\1\6";
    static final String DFA14_specialS =
        "\1\1\22\uffff\1\0\1\2\112\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\23\4\27\1\24\1\14\1\15\2\27\1\6\2\27\1\25\12\20\1\5\1\13\5\27\32\17\3\27\1\21\1\22\1\27\2\16\1\4\5\16\1\1\3\16\1\3\1\16\1\2\1\10\1\16\1\7\10\16\1\11\1\27\1\12\uff82\27",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\15\32\1\30\14\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\17\32\1\37\4\32\1\36\5\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\16\32\1\40\13\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\13\32\1\41\16\32",
            "",
            "",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\4\32\1\44\25\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\1\47\20\32\1\46\2\32\1\45\5\32",
            "",
            "",
            "",
            "",
            "",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            "",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\0\55",
            "\0\55",
            "\1\56\4\uffff\1\57",
            "",
            "",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            "",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            "",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\23\32\1\62\6\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\4\32\1\63\25\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\3\32\1\64\26\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\1\65\31\32",
            "",
            "",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\23\32\1\66\6\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\1\32\1\67\30\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\10\32\1\70\5\32\1\71\13\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\2\32\1\72\27\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\21\32\1\74\10\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\4\32\1\75\25\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\22\32\1\76\7\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\24\32\1\77\5\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\13\32\1\100\16\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\25\32\1\101\4\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\23\32\1\102\6\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\12\32\1\103\17\32",
            "",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\1\104\31\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\13\32\1\105\16\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\22\32\1\106\7\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\21\32\1\107\10\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\10\32\1\110\21\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\1\111\31\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\4\32\1\112\25\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\1\113\31\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\23\32\1\114\6\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\15\32\1\117\14\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\2\32\1\120\27\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\23\32\1\121\6\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\2\32\1\122\27\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\6\32\1\123\23\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\10\32\1\124\21\32",
            "",
            "",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\4\32\1\127\25\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\23\32\1\130\6\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\4\32\1\131\25\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\16\32\1\132\13\32",
            "",
            "",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\4\32\1\133\25\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\15\32\1\134\14\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\3\32\1\135\26\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            "\12\34\7\uffff\32\33\4\uffff\1\35\1\uffff\32\32",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_VISIBILITY | RULE_OPENDECL | RULE_CLOSEDECL | RULE_CLOSELINE | RULE_OPENARG | RULE_CLOSEARG | RULE_WORD | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_19 = input.LA(1);

                        s = -1;
                        if ( ((LA14_19>='\u0000' && LA14_19<='\uFFFF')) ) {s = 45;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='i') ) {s = 1;}

                        else if ( (LA14_0=='o') ) {s = 2;}

                        else if ( (LA14_0=='m') ) {s = 3;}

                        else if ( (LA14_0=='c') ) {s = 4;}

                        else if ( (LA14_0==':') ) {s = 5;}

                        else if ( (LA14_0==',') ) {s = 6;}

                        else if ( (LA14_0=='r') ) {s = 7;}

                        else if ( (LA14_0=='p') ) {s = 8;}

                        else if ( (LA14_0=='{') ) {s = 9;}

                        else if ( (LA14_0=='}') ) {s = 10;}

                        else if ( (LA14_0==';') ) {s = 11;}

                        else if ( (LA14_0=='(') ) {s = 12;}

                        else if ( (LA14_0==')') ) {s = 13;}

                        else if ( ((LA14_0>='a' && LA14_0<='b')||(LA14_0>='d' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='l')||LA14_0=='n'||LA14_0=='q'||(LA14_0>='s' && LA14_0<='z')) ) {s = 14;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')) ) {s = 15;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 16;}

                        else if ( (LA14_0=='^') ) {s = 17;}

                        else if ( (LA14_0=='_') ) {s = 18;}

                        else if ( (LA14_0=='\"') ) {s = 19;}

                        else if ( (LA14_0=='\'') ) {s = 20;}

                        else if ( (LA14_0=='/') ) {s = 21;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 22;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>='<' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_20 = input.LA(1);

                        s = -1;
                        if ( ((LA14_20>='\u0000' && LA14_20<='\uFFFF')) ) {s = 45;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}