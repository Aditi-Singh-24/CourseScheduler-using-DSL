package org.aditi.course.scheduler.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCourseSchedulerLexer extends Lexer {
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int RULE_TIME=6;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalCourseSchedulerLexer() {;} 
    public InternalCourseSchedulerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCourseSchedulerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCourseScheduler.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:11:7: ( 'course' )
            // InternalCourseScheduler.g:11:9: 'course'
            {
            match("course"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:12:7: ( 'teacher' )
            // InternalCourseScheduler.g:12:9: 'teacher'
            {
            match("teacher"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:13:7: ( 'teacher_id' )
            // InternalCourseScheduler.g:13:9: 'teacher_id'
            {
            match("teacher_id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:14:7: ( 'duration' )
            // InternalCourseScheduler.g:14:9: 'duration'
            {
            match("duration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:15:7: ( 'h' )
            // InternalCourseScheduler.g:15:9: 'h'
            {
            match('h'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:16:7: ( 'sessions' )
            // InternalCourseScheduler.g:16:9: 'sessions'
            {
            match("sessions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:17:7: ( 'student_count' )
            // InternalCourseScheduler.g:17:9: 'student_count'
            {
            match("student_count"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:18:7: ( 'day' )
            // InternalCourseScheduler.g:18:9: 'day'
            {
            match("day"); 


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
            // InternalCourseScheduler.g:19:7: ( 'batches' )
            // InternalCourseScheduler.g:19:9: 'batches'
            {
            match("batches"); 


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
            // InternalCourseScheduler.g:20:7: ( '[' )
            // InternalCourseScheduler.g:20:9: '['
            {
            match('['); 

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
            // InternalCourseScheduler.g:21:7: ( ',' )
            // InternalCourseScheduler.g:21:9: ','
            {
            match(','); 

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
            // InternalCourseScheduler.g:22:7: ( ']' )
            // InternalCourseScheduler.g:22:9: ']'
            {
            match(']'); 

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
            // InternalCourseScheduler.g:23:7: ( 'prefers' )
            // InternalCourseScheduler.g:23:9: 'prefers'
            {
            match("prefers"); 


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
            // InternalCourseScheduler.g:24:7: ( 'preferred_sessions' )
            // InternalCourseScheduler.g:24:9: 'preferred_sessions'
            {
            match("preferred_sessions"); 


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
            // InternalCourseScheduler.g:25:7: ( 'room' )
            // InternalCourseScheduler.g:25:9: 'room'
            {
            match("room"); 


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
            // InternalCourseScheduler.g:26:7: ( 'capacity' )
            // InternalCourseScheduler.g:26:9: 'capacity'
            {
            match("capacity"); 


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
            // InternalCourseScheduler.g:27:7: ( 'available' )
            // InternalCourseScheduler.g:27:9: 'available'
            {
            match("available"); 


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
            // InternalCourseScheduler.g:28:7: ( '-' )
            // InternalCourseScheduler.g:28:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:29:7: ( 'time_slot' )
            // InternalCourseScheduler.g:29:9: 'time_slot'
            {
            match("time_slot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:30:7: ( 'schedule' )
            // InternalCourseScheduler.g:30:9: 'schedule'
            {
            match("schedule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:31:7: ( 'auto' )
            // InternalCourseScheduler.g:31:9: 'auto'
            {
            match("auto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:32:7: ( 'Mon' )
            // InternalCourseScheduler.g:32:9: 'Mon'
            {
            match("Mon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:33:7: ( 'Tue' )
            // InternalCourseScheduler.g:33:9: 'Tue'
            {
            match("Tue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:34:7: ( 'Wed' )
            // InternalCourseScheduler.g:34:9: 'Wed'
            {
            match("Wed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:35:7: ( 'Thu' )
            // InternalCourseScheduler.g:35:9: 'Thu'
            {
            match("Thu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:36:7: ( 'Fri' )
            // InternalCourseScheduler.g:36:9: 'Fri'
            {
            match("Fri"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:37:7: ( 'Sat' )
            // InternalCourseScheduler.g:37:9: 'Sat'
            {
            match("Sat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:38:7: ( 'Sun' )
            // InternalCourseScheduler.g:38:9: 'Sun'
            {
            match("Sun"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_TIME"
    public final void mRULE_TIME() throws RecognitionException {
        try {
            int _type = RULE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:869:11: ( '0' .. '2' '0' .. '9' ':' '0' .. '5' '0' .. '9' )
            // InternalCourseScheduler.g:869:13: '0' .. '2' '0' .. '9' ':' '0' .. '5' '0' .. '9'
            {
            matchRange('0','2'); 
            matchRange('0','9'); 
            match(':'); 
            matchRange('0','5'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCourseScheduler.g:871:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCourseScheduler.g:871:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCourseScheduler.g:871:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCourseScheduler.g:871:11: '^'
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

            // InternalCourseScheduler.g:871:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCourseScheduler.g:
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
            	    break loop2;
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
            // InternalCourseScheduler.g:873:10: ( ( '0' .. '9' )+ )
            // InternalCourseScheduler.g:873:12: ( '0' .. '9' )+
            {
            // InternalCourseScheduler.g:873:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCourseScheduler.g:873:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
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
            // InternalCourseScheduler.g:875:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCourseScheduler.g:875:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCourseScheduler.g:875:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCourseScheduler.g:875:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCourseScheduler.g:875:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCourseScheduler.g:875:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCourseScheduler.g:875:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCourseScheduler.g:875:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCourseScheduler.g:875:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCourseScheduler.g:875:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCourseScheduler.g:875:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalCourseScheduler.g:877:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCourseScheduler.g:877:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCourseScheduler.g:877:24: ( options {greedy=false; } : . )*
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
            	    // InternalCourseScheduler.g:877:52: .
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
            // InternalCourseScheduler.g:879:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCourseScheduler.g:879:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCourseScheduler.g:879:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCourseScheduler.g:879:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalCourseScheduler.g:879:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCourseScheduler.g:879:41: ( '\\r' )? '\\n'
                    {
                    // InternalCourseScheduler.g:879:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCourseScheduler.g:879:41: '\\r'
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
            // InternalCourseScheduler.g:881:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCourseScheduler.g:881:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCourseScheduler.g:881:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalCourseScheduler.g:
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
            // InternalCourseScheduler.g:883:16: ( . )
            // InternalCourseScheduler.g:883:18: .
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
        // InternalCourseScheduler.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_TIME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=36;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalCourseScheduler.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalCourseScheduler.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalCourseScheduler.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalCourseScheduler.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalCourseScheduler.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalCourseScheduler.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalCourseScheduler.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalCourseScheduler.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalCourseScheduler.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalCourseScheduler.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalCourseScheduler.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalCourseScheduler.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalCourseScheduler.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalCourseScheduler.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalCourseScheduler.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalCourseScheduler.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalCourseScheduler.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalCourseScheduler.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalCourseScheduler.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalCourseScheduler.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalCourseScheduler.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalCourseScheduler.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalCourseScheduler.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalCourseScheduler.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalCourseScheduler.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalCourseScheduler.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalCourseScheduler.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalCourseScheduler.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalCourseScheduler.g:1:178: RULE_TIME
                {
                mRULE_TIME(); 

                }
                break;
            case 30 :
                // InternalCourseScheduler.g:1:188: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalCourseScheduler.g:1:196: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // InternalCourseScheduler.g:1:205: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalCourseScheduler.g:1:217: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalCourseScheduler.g:1:233: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // InternalCourseScheduler.g:1:249: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalCourseScheduler.g:1:257: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\3\36\1\43\2\36\3\uffff\3\36\1\uffff\5\36\1\70\1\33\2\uffff\3\33\2\uffff\2\36\1\uffff\4\36\1\uffff\4\36\3\uffff\4\36\1\uffff\7\36\1\70\5\uffff\5\36\1\130\10\36\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\uffff\5\36\1\uffff\5\36\1\162\1\36\1\164\7\uffff\12\36\1\uffff\1\36\1\uffff\1\u0080\12\36\1\uffff\1\36\1\u008e\5\36\1\u0094\1\u0095\2\36\1\u0098\1\36\1\uffff\1\36\1\u009b\1\u009c\1\36\1\u009e\2\uffff\2\36\1\uffff\1\36\1\u00a2\2\uffff\1\36\1\uffff\1\36\1\u00a5\1\u00a6\1\uffff\2\36\2\uffff\4\36\1\u00ad\1\36\1\uffff\4\36\1\u00b3\1\uffff";
    static final String DFA12_eofS =
        "\u00b4\uffff";
    static final String DFA12_minS =
        "\1\0\1\141\1\145\1\141\1\60\1\143\1\141\3\uffff\1\162\1\157\1\165\1\uffff\1\157\1\150\1\145\1\162\1\141\1\60\1\101\2\uffff\2\0\1\52\2\uffff\1\165\1\160\1\uffff\1\141\1\155\1\162\1\171\1\uffff\1\163\1\165\1\150\1\164\3\uffff\1\145\1\157\1\141\1\164\1\uffff\1\156\1\145\1\165\1\144\1\151\1\164\1\156\1\72\5\uffff\1\162\1\141\1\143\1\145\1\141\1\60\1\163\1\144\1\145\1\143\1\146\1\155\1\151\1\157\7\60\1\uffff\1\163\1\143\1\150\1\137\1\164\1\uffff\1\151\1\145\1\144\1\150\1\145\1\60\1\154\1\60\7\uffff\1\145\1\151\1\145\1\163\1\151\1\157\1\156\1\165\1\145\1\162\1\uffff\1\141\1\uffff\1\60\1\164\1\162\1\154\1\157\1\156\1\164\1\154\1\163\1\162\1\142\1\uffff\1\171\1\60\1\157\1\156\1\163\1\137\1\145\2\60\1\145\1\154\1\60\1\151\1\uffff\1\164\2\60\1\143\1\60\2\uffff\1\144\1\145\1\uffff\1\144\1\60\2\uffff\1\157\1\uffff\1\137\2\60\1\uffff\1\165\1\163\2\uffff\1\156\1\145\1\164\1\163\1\60\1\163\1\uffff\1\151\1\157\1\156\1\163\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\1\151\1\165\1\172\1\164\1\141\3\uffff\1\162\1\157\1\166\1\uffff\1\157\1\165\1\145\1\162\1\165\1\71\1\172\2\uffff\2\uffff\1\57\2\uffff\1\165\1\160\1\uffff\1\141\1\155\1\162\1\171\1\uffff\1\163\1\165\1\150\1\164\3\uffff\1\145\1\157\1\141\1\164\1\uffff\1\156\1\145\1\165\1\144\1\151\1\164\1\156\1\72\5\uffff\1\162\1\141\1\143\1\145\1\141\1\172\1\163\1\144\1\145\1\143\1\146\1\155\1\151\1\157\7\172\1\uffff\1\163\1\143\1\150\1\137\1\164\1\uffff\1\151\1\145\1\144\1\150\1\145\1\172\1\154\1\172\7\uffff\1\145\1\151\1\145\1\163\1\151\1\157\1\156\1\165\1\145\1\162\1\uffff\1\141\1\uffff\1\172\1\164\1\162\1\154\1\157\1\156\1\164\1\154\2\163\1\142\1\uffff\1\171\1\172\1\157\1\156\1\163\1\137\1\145\2\172\1\145\1\154\1\172\1\151\1\uffff\1\164\2\172\1\143\1\172\2\uffff\1\144\1\145\1\uffff\1\144\1\172\2\uffff\1\157\1\uffff\1\137\2\172\1\uffff\1\165\1\163\2\uffff\1\156\1\145\1\164\1\163\1\172\1\163\1\uffff\1\151\1\157\1\156\1\163\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\7\uffff\1\12\1\13\1\14\3\uffff\1\22\7\uffff\1\36\1\37\3\uffff\1\43\1\44\2\uffff\1\36\4\uffff\1\5\4\uffff\1\12\1\13\1\14\4\uffff\1\22\10\uffff\1\37\1\40\1\41\1\42\1\43\25\uffff\1\35\5\uffff\1\10\10\uffff\1\26\1\27\1\31\1\30\1\32\1\33\1\34\12\uffff\1\17\1\uffff\1\25\13\uffff\1\1\15\uffff\1\2\5\uffff\1\11\1\15\2\uffff\1\20\2\uffff\1\4\1\6\1\uffff\1\24\3\uffff\1\23\2\uffff\1\21\1\3\6\uffff\1\7\5\uffff\1\16";
    static final String DFA12_specialS =
        "\1\1\26\uffff\1\2\1\0\u009b\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\27\4\33\1\30\4\33\1\10\1\15\1\33\1\31\3\23\7\26\7\33\5\25\1\21\6\25\1\16\5\25\1\22\1\17\2\25\1\20\3\25\1\7\1\33\1\11\1\24\1\25\1\33\1\14\1\6\1\1\1\3\3\25\1\4\7\25\1\12\1\25\1\13\1\5\1\2\6\25\uff85\33",
            "\1\35\15\uffff\1\34",
            "\1\37\3\uffff\1\40",
            "\1\42\23\uffff\1\41",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\46\1\uffff\1\44\16\uffff\1\45",
            "\1\47",
            "",
            "",
            "",
            "\1\53",
            "\1\54",
            "\1\56\1\55",
            "",
            "\1\60",
            "\1\62\14\uffff\1\61",
            "\1\63",
            "\1\64",
            "\1\65\23\uffff\1\66",
            "\12\67",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\0\71",
            "\0\71",
            "\1\72\4\uffff\1\73",
            "",
            "",
            "\1\75",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\163",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u008a\1\u0089",
            "\1\u008b",
            "",
            "\1\u008c",
            "\12\36\7\uffff\32\36\4\uffff\1\u008d\1\uffff\32\36",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0096",
            "\1\u0097",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0099",
            "",
            "\1\u009a",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u009d",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_TIME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFF')) ) {s = 57;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='c') ) {s = 1;}

                        else if ( (LA12_0=='t') ) {s = 2;}

                        else if ( (LA12_0=='d') ) {s = 3;}

                        else if ( (LA12_0=='h') ) {s = 4;}

                        else if ( (LA12_0=='s') ) {s = 5;}

                        else if ( (LA12_0=='b') ) {s = 6;}

                        else if ( (LA12_0=='[') ) {s = 7;}

                        else if ( (LA12_0==',') ) {s = 8;}

                        else if ( (LA12_0==']') ) {s = 9;}

                        else if ( (LA12_0=='p') ) {s = 10;}

                        else if ( (LA12_0=='r') ) {s = 11;}

                        else if ( (LA12_0=='a') ) {s = 12;}

                        else if ( (LA12_0=='-') ) {s = 13;}

                        else if ( (LA12_0=='M') ) {s = 14;}

                        else if ( (LA12_0=='T') ) {s = 15;}

                        else if ( (LA12_0=='W') ) {s = 16;}

                        else if ( (LA12_0=='F') ) {s = 17;}

                        else if ( (LA12_0=='S') ) {s = 18;}

                        else if ( ((LA12_0>='0' && LA12_0<='2')) ) {s = 19;}

                        else if ( (LA12_0=='^') ) {s = 20;}

                        else if ( ((LA12_0>='A' && LA12_0<='E')||(LA12_0>='G' && LA12_0<='L')||(LA12_0>='N' && LA12_0<='R')||(LA12_0>='U' && LA12_0<='V')||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='e' && LA12_0<='g')||(LA12_0>='i' && LA12_0<='o')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='z')) ) {s = 21;}

                        else if ( ((LA12_0>='3' && LA12_0<='9')) ) {s = 22;}

                        else if ( (LA12_0=='\"') ) {s = 23;}

                        else if ( (LA12_0=='\'') ) {s = 24;}

                        else if ( (LA12_0=='/') ) {s = 25;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 26;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0=='.'||(LA12_0>=':' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFF')) ) {s = 57;}

                        else s = 27;

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