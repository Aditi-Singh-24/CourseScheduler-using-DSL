package org.aditi.course.scheduler.ide.contentassist.antlr.internal;

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
import org.aditi.course.scheduler.services.CourseSchedulerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCourseSchedulerParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_TIME", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mon'", "'Tue'", "'Wed'", "'Thu'", "'Fri'", "'Sat'", "'Sun'", "'course'", "'teacher'", "'teacher_id'", "'duration'", "'h'", "'sessions'", "'student_count'", "'day'", "'batches'", "'['", "']'", "'prefers'", "'preferred_sessions'", "','", "'room'", "'capacity'", "'available'", "'-'", "'time_slot'", "'schedule'", "'auto'"
    };
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


        public InternalCourseSchedulerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCourseSchedulerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCourseSchedulerParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCourseScheduler.g"; }


    	private CourseSchedulerGrammarAccess grammarAccess;

    	public void setGrammarAccess(CourseSchedulerGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCourseScheduler"
    // InternalCourseScheduler.g:53:1: entryRuleCourseScheduler : ruleCourseScheduler EOF ;
    public final void entryRuleCourseScheduler() throws RecognitionException {
        try {
            // InternalCourseScheduler.g:54:1: ( ruleCourseScheduler EOF )
            // InternalCourseScheduler.g:55:1: ruleCourseScheduler EOF
            {
             before(grammarAccess.getCourseSchedulerRule()); 
            pushFollow(FOLLOW_1);
            ruleCourseScheduler();

            state._fsp--;

             after(grammarAccess.getCourseSchedulerRule()); 
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
    // $ANTLR end "entryRuleCourseScheduler"


    // $ANTLR start "ruleCourseScheduler"
    // InternalCourseScheduler.g:62:1: ruleCourseScheduler : ( ( rule__CourseScheduler__ElementsAssignment )* ) ;
    public final void ruleCourseScheduler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:66:2: ( ( ( rule__CourseScheduler__ElementsAssignment )* ) )
            // InternalCourseScheduler.g:67:2: ( ( rule__CourseScheduler__ElementsAssignment )* )
            {
            // InternalCourseScheduler.g:67:2: ( ( rule__CourseScheduler__ElementsAssignment )* )
            // InternalCourseScheduler.g:68:3: ( rule__CourseScheduler__ElementsAssignment )*
            {
             before(grammarAccess.getCourseSchedulerAccess().getElementsAssignment()); 
            // InternalCourseScheduler.g:69:3: ( rule__CourseScheduler__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19||LA1_0==33||(LA1_0>=37 && LA1_0<=38)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCourseScheduler.g:69:4: rule__CourseScheduler__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__CourseScheduler__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getCourseSchedulerAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleCourseScheduler"


    // $ANTLR start "entryRuleElement"
    // InternalCourseScheduler.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalCourseScheduler.g:79:1: ( ruleElement EOF )
            // InternalCourseScheduler.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalCourseScheduler.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalCourseScheduler.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalCourseScheduler.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalCourseScheduler.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalCourseScheduler.g:94:3: ( rule__Element__Alternatives )
            // InternalCourseScheduler.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleCourse"
    // InternalCourseScheduler.g:103:1: entryRuleCourse : ruleCourse EOF ;
    public final void entryRuleCourse() throws RecognitionException {
        try {
            // InternalCourseScheduler.g:104:1: ( ruleCourse EOF )
            // InternalCourseScheduler.g:105:1: ruleCourse EOF
            {
             before(grammarAccess.getCourseRule()); 
            pushFollow(FOLLOW_1);
            ruleCourse();

            state._fsp--;

             after(grammarAccess.getCourseRule()); 
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
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // InternalCourseScheduler.g:112:1: ruleCourse : ( ( rule__Course__Group__0 ) ) ;
    public final void ruleCourse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:116:2: ( ( ( rule__Course__Group__0 ) ) )
            // InternalCourseScheduler.g:117:2: ( ( rule__Course__Group__0 ) )
            {
            // InternalCourseScheduler.g:117:2: ( ( rule__Course__Group__0 ) )
            // InternalCourseScheduler.g:118:3: ( rule__Course__Group__0 )
            {
             before(grammarAccess.getCourseAccess().getGroup()); 
            // InternalCourseScheduler.g:119:3: ( rule__Course__Group__0 )
            // InternalCourseScheduler.g:119:4: rule__Course__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getGroup()); 

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
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleRoom"
    // InternalCourseScheduler.g:128:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalCourseScheduler.g:129:1: ( ruleRoom EOF )
            // InternalCourseScheduler.g:130:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalCourseScheduler.g:137:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:141:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalCourseScheduler.g:142:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalCourseScheduler.g:142:2: ( ( rule__Room__Group__0 ) )
            // InternalCourseScheduler.g:143:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalCourseScheduler.g:144:3: ( rule__Room__Group__0 )
            // InternalCourseScheduler.g:144:4: rule__Room__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getGroup()); 

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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleAvailability"
    // InternalCourseScheduler.g:153:1: entryRuleAvailability : ruleAvailability EOF ;
    public final void entryRuleAvailability() throws RecognitionException {
        try {
            // InternalCourseScheduler.g:154:1: ( ruleAvailability EOF )
            // InternalCourseScheduler.g:155:1: ruleAvailability EOF
            {
             before(grammarAccess.getAvailabilityRule()); 
            pushFollow(FOLLOW_1);
            ruleAvailability();

            state._fsp--;

             after(grammarAccess.getAvailabilityRule()); 
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
    // $ANTLR end "entryRuleAvailability"


    // $ANTLR start "ruleAvailability"
    // InternalCourseScheduler.g:162:1: ruleAvailability : ( ( rule__Availability__Group__0 ) ) ;
    public final void ruleAvailability() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:166:2: ( ( ( rule__Availability__Group__0 ) ) )
            // InternalCourseScheduler.g:167:2: ( ( rule__Availability__Group__0 ) )
            {
            // InternalCourseScheduler.g:167:2: ( ( rule__Availability__Group__0 ) )
            // InternalCourseScheduler.g:168:3: ( rule__Availability__Group__0 )
            {
             before(grammarAccess.getAvailabilityAccess().getGroup()); 
            // InternalCourseScheduler.g:169:3: ( rule__Availability__Group__0 )
            // InternalCourseScheduler.g:169:4: rule__Availability__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Availability__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAvailabilityAccess().getGroup()); 

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
    // $ANTLR end "ruleAvailability"


    // $ANTLR start "entryRuleTimeSlot"
    // InternalCourseScheduler.g:178:1: entryRuleTimeSlot : ruleTimeSlot EOF ;
    public final void entryRuleTimeSlot() throws RecognitionException {
        try {
            // InternalCourseScheduler.g:179:1: ( ruleTimeSlot EOF )
            // InternalCourseScheduler.g:180:1: ruleTimeSlot EOF
            {
             before(grammarAccess.getTimeSlotRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeSlot();

            state._fsp--;

             after(grammarAccess.getTimeSlotRule()); 
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
    // $ANTLR end "entryRuleTimeSlot"


    // $ANTLR start "ruleTimeSlot"
    // InternalCourseScheduler.g:187:1: ruleTimeSlot : ( ( rule__TimeSlot__Group__0 ) ) ;
    public final void ruleTimeSlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:191:2: ( ( ( rule__TimeSlot__Group__0 ) ) )
            // InternalCourseScheduler.g:192:2: ( ( rule__TimeSlot__Group__0 ) )
            {
            // InternalCourseScheduler.g:192:2: ( ( rule__TimeSlot__Group__0 ) )
            // InternalCourseScheduler.g:193:3: ( rule__TimeSlot__Group__0 )
            {
             before(grammarAccess.getTimeSlotAccess().getGroup()); 
            // InternalCourseScheduler.g:194:3: ( rule__TimeSlot__Group__0 )
            // InternalCourseScheduler.g:194:4: rule__TimeSlot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeSlot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSlotAccess().getGroup()); 

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
    // $ANTLR end "ruleTimeSlot"


    // $ANTLR start "entryRuleScheduleTrigger"
    // InternalCourseScheduler.g:203:1: entryRuleScheduleTrigger : ruleScheduleTrigger EOF ;
    public final void entryRuleScheduleTrigger() throws RecognitionException {
        try {
            // InternalCourseScheduler.g:204:1: ( ruleScheduleTrigger EOF )
            // InternalCourseScheduler.g:205:1: ruleScheduleTrigger EOF
            {
             before(grammarAccess.getScheduleTriggerRule()); 
            pushFollow(FOLLOW_1);
            ruleScheduleTrigger();

            state._fsp--;

             after(grammarAccess.getScheduleTriggerRule()); 
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
    // $ANTLR end "entryRuleScheduleTrigger"


    // $ANTLR start "ruleScheduleTrigger"
    // InternalCourseScheduler.g:212:1: ruleScheduleTrigger : ( ( rule__ScheduleTrigger__Group__0 ) ) ;
    public final void ruleScheduleTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:216:2: ( ( ( rule__ScheduleTrigger__Group__0 ) ) )
            // InternalCourseScheduler.g:217:2: ( ( rule__ScheduleTrigger__Group__0 ) )
            {
            // InternalCourseScheduler.g:217:2: ( ( rule__ScheduleTrigger__Group__0 ) )
            // InternalCourseScheduler.g:218:3: ( rule__ScheduleTrigger__Group__0 )
            {
             before(grammarAccess.getScheduleTriggerAccess().getGroup()); 
            // InternalCourseScheduler.g:219:3: ( rule__ScheduleTrigger__Group__0 )
            // InternalCourseScheduler.g:219:4: rule__ScheduleTrigger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScheduleTrigger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScheduleTriggerAccess().getGroup()); 

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
    // $ANTLR end "ruleScheduleTrigger"


    // $ANTLR start "ruleDay"
    // InternalCourseScheduler.g:228:1: ruleDay : ( ( rule__Day__Alternatives ) ) ;
    public final void ruleDay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:232:1: ( ( ( rule__Day__Alternatives ) ) )
            // InternalCourseScheduler.g:233:2: ( ( rule__Day__Alternatives ) )
            {
            // InternalCourseScheduler.g:233:2: ( ( rule__Day__Alternatives ) )
            // InternalCourseScheduler.g:234:3: ( rule__Day__Alternatives )
            {
             before(grammarAccess.getDayAccess().getAlternatives()); 
            // InternalCourseScheduler.g:235:3: ( rule__Day__Alternatives )
            // InternalCourseScheduler.g:235:4: rule__Day__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Day__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDayAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDay"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalCourseScheduler.g:243:1: rule__Element__Alternatives : ( ( ruleCourse ) | ( ruleRoom ) | ( ruleTimeSlot ) | ( ruleScheduleTrigger ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:247:1: ( ( ruleCourse ) | ( ruleRoom ) | ( ruleTimeSlot ) | ( ruleScheduleTrigger ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            case 38:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCourseScheduler.g:248:2: ( ruleCourse )
                    {
                    // InternalCourseScheduler.g:248:2: ( ruleCourse )
                    // InternalCourseScheduler.g:249:3: ruleCourse
                    {
                     before(grammarAccess.getElementAccess().getCourseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCourse();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCourseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCourseScheduler.g:254:2: ( ruleRoom )
                    {
                    // InternalCourseScheduler.g:254:2: ( ruleRoom )
                    // InternalCourseScheduler.g:255:3: ruleRoom
                    {
                     before(grammarAccess.getElementAccess().getRoomParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRoom();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getRoomParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCourseScheduler.g:260:2: ( ruleTimeSlot )
                    {
                    // InternalCourseScheduler.g:260:2: ( ruleTimeSlot )
                    // InternalCourseScheduler.g:261:3: ruleTimeSlot
                    {
                     before(grammarAccess.getElementAccess().getTimeSlotParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeSlot();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTimeSlotParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCourseScheduler.g:266:2: ( ruleScheduleTrigger )
                    {
                    // InternalCourseScheduler.g:266:2: ( ruleScheduleTrigger )
                    // InternalCourseScheduler.g:267:3: ruleScheduleTrigger
                    {
                     before(grammarAccess.getElementAccess().getScheduleTriggerParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleScheduleTrigger();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getScheduleTriggerParserRuleCall_3()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Day__Alternatives"
    // InternalCourseScheduler.g:276:1: rule__Day__Alternatives : ( ( ( 'Mon' ) ) | ( ( 'Tue' ) ) | ( ( 'Wed' ) ) | ( ( 'Thu' ) ) | ( ( 'Fri' ) ) | ( ( 'Sat' ) ) | ( ( 'Sun' ) ) );
    public final void rule__Day__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:280:1: ( ( ( 'Mon' ) ) | ( ( 'Tue' ) ) | ( ( 'Wed' ) ) | ( ( 'Thu' ) ) | ( ( 'Fri' ) ) | ( ( 'Sat' ) ) | ( ( 'Sun' ) ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCourseScheduler.g:281:2: ( ( 'Mon' ) )
                    {
                    // InternalCourseScheduler.g:281:2: ( ( 'Mon' ) )
                    // InternalCourseScheduler.g:282:3: ( 'Mon' )
                    {
                     before(grammarAccess.getDayAccess().getMonEnumLiteralDeclaration_0()); 
                    // InternalCourseScheduler.g:283:3: ( 'Mon' )
                    // InternalCourseScheduler.g:283:4: 'Mon'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayAccess().getMonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCourseScheduler.g:287:2: ( ( 'Tue' ) )
                    {
                    // InternalCourseScheduler.g:287:2: ( ( 'Tue' ) )
                    // InternalCourseScheduler.g:288:3: ( 'Tue' )
                    {
                     before(grammarAccess.getDayAccess().getTueEnumLiteralDeclaration_1()); 
                    // InternalCourseScheduler.g:289:3: ( 'Tue' )
                    // InternalCourseScheduler.g:289:4: 'Tue'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayAccess().getTueEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCourseScheduler.g:293:2: ( ( 'Wed' ) )
                    {
                    // InternalCourseScheduler.g:293:2: ( ( 'Wed' ) )
                    // InternalCourseScheduler.g:294:3: ( 'Wed' )
                    {
                     before(grammarAccess.getDayAccess().getWedEnumLiteralDeclaration_2()); 
                    // InternalCourseScheduler.g:295:3: ( 'Wed' )
                    // InternalCourseScheduler.g:295:4: 'Wed'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayAccess().getWedEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCourseScheduler.g:299:2: ( ( 'Thu' ) )
                    {
                    // InternalCourseScheduler.g:299:2: ( ( 'Thu' ) )
                    // InternalCourseScheduler.g:300:3: ( 'Thu' )
                    {
                     before(grammarAccess.getDayAccess().getThuEnumLiteralDeclaration_3()); 
                    // InternalCourseScheduler.g:301:3: ( 'Thu' )
                    // InternalCourseScheduler.g:301:4: 'Thu'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayAccess().getThuEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCourseScheduler.g:305:2: ( ( 'Fri' ) )
                    {
                    // InternalCourseScheduler.g:305:2: ( ( 'Fri' ) )
                    // InternalCourseScheduler.g:306:3: ( 'Fri' )
                    {
                     before(grammarAccess.getDayAccess().getFriEnumLiteralDeclaration_4()); 
                    // InternalCourseScheduler.g:307:3: ( 'Fri' )
                    // InternalCourseScheduler.g:307:4: 'Fri'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayAccess().getFriEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCourseScheduler.g:311:2: ( ( 'Sat' ) )
                    {
                    // InternalCourseScheduler.g:311:2: ( ( 'Sat' ) )
                    // InternalCourseScheduler.g:312:3: ( 'Sat' )
                    {
                     before(grammarAccess.getDayAccess().getSatEnumLiteralDeclaration_5()); 
                    // InternalCourseScheduler.g:313:3: ( 'Sat' )
                    // InternalCourseScheduler.g:313:4: 'Sat'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayAccess().getSatEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCourseScheduler.g:317:2: ( ( 'Sun' ) )
                    {
                    // InternalCourseScheduler.g:317:2: ( ( 'Sun' ) )
                    // InternalCourseScheduler.g:318:3: ( 'Sun' )
                    {
                     before(grammarAccess.getDayAccess().getSunEnumLiteralDeclaration_6()); 
                    // InternalCourseScheduler.g:319:3: ( 'Sun' )
                    // InternalCourseScheduler.g:319:4: 'Sun'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDayAccess().getSunEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__Day__Alternatives"


    // $ANTLR start "rule__Course__Group__0"
    // InternalCourseScheduler.g:327:1: rule__Course__Group__0 : rule__Course__Group__0__Impl rule__Course__Group__1 ;
    public final void rule__Course__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:331:1: ( rule__Course__Group__0__Impl rule__Course__Group__1 )
            // InternalCourseScheduler.g:332:2: rule__Course__Group__0__Impl rule__Course__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Course__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__1();

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
    // $ANTLR end "rule__Course__Group__0"


    // $ANTLR start "rule__Course__Group__0__Impl"
    // InternalCourseScheduler.g:339:1: rule__Course__Group__0__Impl : ( 'course' ) ;
    public final void rule__Course__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:343:1: ( ( 'course' ) )
            // InternalCourseScheduler.g:344:1: ( 'course' )
            {
            // InternalCourseScheduler.g:344:1: ( 'course' )
            // InternalCourseScheduler.g:345:2: 'course'
            {
             before(grammarAccess.getCourseAccess().getCourseKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCourseKeyword_0()); 

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
    // $ANTLR end "rule__Course__Group__0__Impl"


    // $ANTLR start "rule__Course__Group__1"
    // InternalCourseScheduler.g:354:1: rule__Course__Group__1 : rule__Course__Group__1__Impl rule__Course__Group__2 ;
    public final void rule__Course__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:358:1: ( rule__Course__Group__1__Impl rule__Course__Group__2 )
            // InternalCourseScheduler.g:359:2: rule__Course__Group__1__Impl rule__Course__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Course__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__2();

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
    // $ANTLR end "rule__Course__Group__1"


    // $ANTLR start "rule__Course__Group__1__Impl"
    // InternalCourseScheduler.g:366:1: rule__Course__Group__1__Impl : ( ( rule__Course__NameAssignment_1 ) ) ;
    public final void rule__Course__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:370:1: ( ( ( rule__Course__NameAssignment_1 ) ) )
            // InternalCourseScheduler.g:371:1: ( ( rule__Course__NameAssignment_1 ) )
            {
            // InternalCourseScheduler.g:371:1: ( ( rule__Course__NameAssignment_1 ) )
            // InternalCourseScheduler.g:372:2: ( rule__Course__NameAssignment_1 )
            {
             before(grammarAccess.getCourseAccess().getNameAssignment_1()); 
            // InternalCourseScheduler.g:373:2: ( rule__Course__NameAssignment_1 )
            // InternalCourseScheduler.g:373:3: rule__Course__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Course__Group__1__Impl"


    // $ANTLR start "rule__Course__Group__2"
    // InternalCourseScheduler.g:381:1: rule__Course__Group__2 : rule__Course__Group__2__Impl rule__Course__Group__3 ;
    public final void rule__Course__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:385:1: ( rule__Course__Group__2__Impl rule__Course__Group__3 )
            // InternalCourseScheduler.g:386:2: rule__Course__Group__2__Impl rule__Course__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Course__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__3();

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
    // $ANTLR end "rule__Course__Group__2"


    // $ANTLR start "rule__Course__Group__2__Impl"
    // InternalCourseScheduler.g:393:1: rule__Course__Group__2__Impl : ( 'teacher' ) ;
    public final void rule__Course__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:397:1: ( ( 'teacher' ) )
            // InternalCourseScheduler.g:398:1: ( 'teacher' )
            {
            // InternalCourseScheduler.g:398:1: ( 'teacher' )
            // InternalCourseScheduler.g:399:2: 'teacher'
            {
             before(grammarAccess.getCourseAccess().getTeacherKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getTeacherKeyword_2()); 

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
    // $ANTLR end "rule__Course__Group__2__Impl"


    // $ANTLR start "rule__Course__Group__3"
    // InternalCourseScheduler.g:408:1: rule__Course__Group__3 : rule__Course__Group__3__Impl rule__Course__Group__4 ;
    public final void rule__Course__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:412:1: ( rule__Course__Group__3__Impl rule__Course__Group__4 )
            // InternalCourseScheduler.g:413:2: rule__Course__Group__3__Impl rule__Course__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Course__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__4();

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
    // $ANTLR end "rule__Course__Group__3"


    // $ANTLR start "rule__Course__Group__3__Impl"
    // InternalCourseScheduler.g:420:1: rule__Course__Group__3__Impl : ( ( rule__Course__TeacherNameAssignment_3 ) ) ;
    public final void rule__Course__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:424:1: ( ( ( rule__Course__TeacherNameAssignment_3 ) ) )
            // InternalCourseScheduler.g:425:1: ( ( rule__Course__TeacherNameAssignment_3 ) )
            {
            // InternalCourseScheduler.g:425:1: ( ( rule__Course__TeacherNameAssignment_3 ) )
            // InternalCourseScheduler.g:426:2: ( rule__Course__TeacherNameAssignment_3 )
            {
             before(grammarAccess.getCourseAccess().getTeacherNameAssignment_3()); 
            // InternalCourseScheduler.g:427:2: ( rule__Course__TeacherNameAssignment_3 )
            // InternalCourseScheduler.g:427:3: rule__Course__TeacherNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Course__TeacherNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getTeacherNameAssignment_3()); 

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
    // $ANTLR end "rule__Course__Group__3__Impl"


    // $ANTLR start "rule__Course__Group__4"
    // InternalCourseScheduler.g:435:1: rule__Course__Group__4 : rule__Course__Group__4__Impl rule__Course__Group__5 ;
    public final void rule__Course__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:439:1: ( rule__Course__Group__4__Impl rule__Course__Group__5 )
            // InternalCourseScheduler.g:440:2: rule__Course__Group__4__Impl rule__Course__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Course__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__5();

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
    // $ANTLR end "rule__Course__Group__4"


    // $ANTLR start "rule__Course__Group__4__Impl"
    // InternalCourseScheduler.g:447:1: rule__Course__Group__4__Impl : ( 'teacher_id' ) ;
    public final void rule__Course__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:451:1: ( ( 'teacher_id' ) )
            // InternalCourseScheduler.g:452:1: ( 'teacher_id' )
            {
            // InternalCourseScheduler.g:452:1: ( 'teacher_id' )
            // InternalCourseScheduler.g:453:2: 'teacher_id'
            {
             before(grammarAccess.getCourseAccess().getTeacher_idKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getTeacher_idKeyword_4()); 

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
    // $ANTLR end "rule__Course__Group__4__Impl"


    // $ANTLR start "rule__Course__Group__5"
    // InternalCourseScheduler.g:462:1: rule__Course__Group__5 : rule__Course__Group__5__Impl rule__Course__Group__6 ;
    public final void rule__Course__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:466:1: ( rule__Course__Group__5__Impl rule__Course__Group__6 )
            // InternalCourseScheduler.g:467:2: rule__Course__Group__5__Impl rule__Course__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Course__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__6();

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
    // $ANTLR end "rule__Course__Group__5"


    // $ANTLR start "rule__Course__Group__5__Impl"
    // InternalCourseScheduler.g:474:1: rule__Course__Group__5__Impl : ( ( rule__Course__TeacherIdAssignment_5 ) ) ;
    public final void rule__Course__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:478:1: ( ( ( rule__Course__TeacherIdAssignment_5 ) ) )
            // InternalCourseScheduler.g:479:1: ( ( rule__Course__TeacherIdAssignment_5 ) )
            {
            // InternalCourseScheduler.g:479:1: ( ( rule__Course__TeacherIdAssignment_5 ) )
            // InternalCourseScheduler.g:480:2: ( rule__Course__TeacherIdAssignment_5 )
            {
             before(grammarAccess.getCourseAccess().getTeacherIdAssignment_5()); 
            // InternalCourseScheduler.g:481:2: ( rule__Course__TeacherIdAssignment_5 )
            // InternalCourseScheduler.g:481:3: rule__Course__TeacherIdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Course__TeacherIdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getTeacherIdAssignment_5()); 

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
    // $ANTLR end "rule__Course__Group__5__Impl"


    // $ANTLR start "rule__Course__Group__6"
    // InternalCourseScheduler.g:489:1: rule__Course__Group__6 : rule__Course__Group__6__Impl rule__Course__Group__7 ;
    public final void rule__Course__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:493:1: ( rule__Course__Group__6__Impl rule__Course__Group__7 )
            // InternalCourseScheduler.g:494:2: rule__Course__Group__6__Impl rule__Course__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Course__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__7();

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
    // $ANTLR end "rule__Course__Group__6"


    // $ANTLR start "rule__Course__Group__6__Impl"
    // InternalCourseScheduler.g:501:1: rule__Course__Group__6__Impl : ( 'duration' ) ;
    public final void rule__Course__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:505:1: ( ( 'duration' ) )
            // InternalCourseScheduler.g:506:1: ( 'duration' )
            {
            // InternalCourseScheduler.g:506:1: ( 'duration' )
            // InternalCourseScheduler.g:507:2: 'duration'
            {
             before(grammarAccess.getCourseAccess().getDurationKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getDurationKeyword_6()); 

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
    // $ANTLR end "rule__Course__Group__6__Impl"


    // $ANTLR start "rule__Course__Group__7"
    // InternalCourseScheduler.g:516:1: rule__Course__Group__7 : rule__Course__Group__7__Impl rule__Course__Group__8 ;
    public final void rule__Course__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:520:1: ( rule__Course__Group__7__Impl rule__Course__Group__8 )
            // InternalCourseScheduler.g:521:2: rule__Course__Group__7__Impl rule__Course__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Course__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__8();

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
    // $ANTLR end "rule__Course__Group__7"


    // $ANTLR start "rule__Course__Group__7__Impl"
    // InternalCourseScheduler.g:528:1: rule__Course__Group__7__Impl : ( ( rule__Course__DurationAssignment_7 ) ) ;
    public final void rule__Course__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:532:1: ( ( ( rule__Course__DurationAssignment_7 ) ) )
            // InternalCourseScheduler.g:533:1: ( ( rule__Course__DurationAssignment_7 ) )
            {
            // InternalCourseScheduler.g:533:1: ( ( rule__Course__DurationAssignment_7 ) )
            // InternalCourseScheduler.g:534:2: ( rule__Course__DurationAssignment_7 )
            {
             before(grammarAccess.getCourseAccess().getDurationAssignment_7()); 
            // InternalCourseScheduler.g:535:2: ( rule__Course__DurationAssignment_7 )
            // InternalCourseScheduler.g:535:3: rule__Course__DurationAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Course__DurationAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getDurationAssignment_7()); 

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
    // $ANTLR end "rule__Course__Group__7__Impl"


    // $ANTLR start "rule__Course__Group__8"
    // InternalCourseScheduler.g:543:1: rule__Course__Group__8 : rule__Course__Group__8__Impl rule__Course__Group__9 ;
    public final void rule__Course__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:547:1: ( rule__Course__Group__8__Impl rule__Course__Group__9 )
            // InternalCourseScheduler.g:548:2: rule__Course__Group__8__Impl rule__Course__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Course__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__9();

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
    // $ANTLR end "rule__Course__Group__8"


    // $ANTLR start "rule__Course__Group__8__Impl"
    // InternalCourseScheduler.g:555:1: rule__Course__Group__8__Impl : ( 'h' ) ;
    public final void rule__Course__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:559:1: ( ( 'h' ) )
            // InternalCourseScheduler.g:560:1: ( 'h' )
            {
            // InternalCourseScheduler.g:560:1: ( 'h' )
            // InternalCourseScheduler.g:561:2: 'h'
            {
             before(grammarAccess.getCourseAccess().getHKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getHKeyword_8()); 

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
    // $ANTLR end "rule__Course__Group__8__Impl"


    // $ANTLR start "rule__Course__Group__9"
    // InternalCourseScheduler.g:570:1: rule__Course__Group__9 : rule__Course__Group__9__Impl rule__Course__Group__10 ;
    public final void rule__Course__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:574:1: ( rule__Course__Group__9__Impl rule__Course__Group__10 )
            // InternalCourseScheduler.g:575:2: rule__Course__Group__9__Impl rule__Course__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Course__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__10();

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
    // $ANTLR end "rule__Course__Group__9"


    // $ANTLR start "rule__Course__Group__9__Impl"
    // InternalCourseScheduler.g:582:1: rule__Course__Group__9__Impl : ( 'sessions' ) ;
    public final void rule__Course__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:586:1: ( ( 'sessions' ) )
            // InternalCourseScheduler.g:587:1: ( 'sessions' )
            {
            // InternalCourseScheduler.g:587:1: ( 'sessions' )
            // InternalCourseScheduler.g:588:2: 'sessions'
            {
             before(grammarAccess.getCourseAccess().getSessionsKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getSessionsKeyword_9()); 

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
    // $ANTLR end "rule__Course__Group__9__Impl"


    // $ANTLR start "rule__Course__Group__10"
    // InternalCourseScheduler.g:597:1: rule__Course__Group__10 : rule__Course__Group__10__Impl rule__Course__Group__11 ;
    public final void rule__Course__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:601:1: ( rule__Course__Group__10__Impl rule__Course__Group__11 )
            // InternalCourseScheduler.g:602:2: rule__Course__Group__10__Impl rule__Course__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Course__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__11();

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
    // $ANTLR end "rule__Course__Group__10"


    // $ANTLR start "rule__Course__Group__10__Impl"
    // InternalCourseScheduler.g:609:1: rule__Course__Group__10__Impl : ( ( rule__Course__SessionsAssignment_10 ) ) ;
    public final void rule__Course__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:613:1: ( ( ( rule__Course__SessionsAssignment_10 ) ) )
            // InternalCourseScheduler.g:614:1: ( ( rule__Course__SessionsAssignment_10 ) )
            {
            // InternalCourseScheduler.g:614:1: ( ( rule__Course__SessionsAssignment_10 ) )
            // InternalCourseScheduler.g:615:2: ( rule__Course__SessionsAssignment_10 )
            {
             before(grammarAccess.getCourseAccess().getSessionsAssignment_10()); 
            // InternalCourseScheduler.g:616:2: ( rule__Course__SessionsAssignment_10 )
            // InternalCourseScheduler.g:616:3: rule__Course__SessionsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Course__SessionsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getSessionsAssignment_10()); 

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
    // $ANTLR end "rule__Course__Group__10__Impl"


    // $ANTLR start "rule__Course__Group__11"
    // InternalCourseScheduler.g:624:1: rule__Course__Group__11 : rule__Course__Group__11__Impl rule__Course__Group__12 ;
    public final void rule__Course__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:628:1: ( rule__Course__Group__11__Impl rule__Course__Group__12 )
            // InternalCourseScheduler.g:629:2: rule__Course__Group__11__Impl rule__Course__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Course__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__12();

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
    // $ANTLR end "rule__Course__Group__11"


    // $ANTLR start "rule__Course__Group__11__Impl"
    // InternalCourseScheduler.g:636:1: rule__Course__Group__11__Impl : ( 'student_count' ) ;
    public final void rule__Course__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:640:1: ( ( 'student_count' ) )
            // InternalCourseScheduler.g:641:1: ( 'student_count' )
            {
            // InternalCourseScheduler.g:641:1: ( 'student_count' )
            // InternalCourseScheduler.g:642:2: 'student_count'
            {
             before(grammarAccess.getCourseAccess().getStudent_countKeyword_11()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getStudent_countKeyword_11()); 

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
    // $ANTLR end "rule__Course__Group__11__Impl"


    // $ANTLR start "rule__Course__Group__12"
    // InternalCourseScheduler.g:651:1: rule__Course__Group__12 : rule__Course__Group__12__Impl rule__Course__Group__13 ;
    public final void rule__Course__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:655:1: ( rule__Course__Group__12__Impl rule__Course__Group__13 )
            // InternalCourseScheduler.g:656:2: rule__Course__Group__12__Impl rule__Course__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__Course__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__13();

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
    // $ANTLR end "rule__Course__Group__12"


    // $ANTLR start "rule__Course__Group__12__Impl"
    // InternalCourseScheduler.g:663:1: rule__Course__Group__12__Impl : ( ( rule__Course__StudentCountAssignment_12 ) ) ;
    public final void rule__Course__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:667:1: ( ( ( rule__Course__StudentCountAssignment_12 ) ) )
            // InternalCourseScheduler.g:668:1: ( ( rule__Course__StudentCountAssignment_12 ) )
            {
            // InternalCourseScheduler.g:668:1: ( ( rule__Course__StudentCountAssignment_12 ) )
            // InternalCourseScheduler.g:669:2: ( rule__Course__StudentCountAssignment_12 )
            {
             before(grammarAccess.getCourseAccess().getStudentCountAssignment_12()); 
            // InternalCourseScheduler.g:670:2: ( rule__Course__StudentCountAssignment_12 )
            // InternalCourseScheduler.g:670:3: rule__Course__StudentCountAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Course__StudentCountAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getStudentCountAssignment_12()); 

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
    // $ANTLR end "rule__Course__Group__12__Impl"


    // $ANTLR start "rule__Course__Group__13"
    // InternalCourseScheduler.g:678:1: rule__Course__Group__13 : rule__Course__Group__13__Impl rule__Course__Group__14 ;
    public final void rule__Course__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:682:1: ( rule__Course__Group__13__Impl rule__Course__Group__14 )
            // InternalCourseScheduler.g:683:2: rule__Course__Group__13__Impl rule__Course__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__Course__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__14();

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
    // $ANTLR end "rule__Course__Group__13"


    // $ANTLR start "rule__Course__Group__13__Impl"
    // InternalCourseScheduler.g:690:1: rule__Course__Group__13__Impl : ( 'day' ) ;
    public final void rule__Course__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:694:1: ( ( 'day' ) )
            // InternalCourseScheduler.g:695:1: ( 'day' )
            {
            // InternalCourseScheduler.g:695:1: ( 'day' )
            // InternalCourseScheduler.g:696:2: 'day'
            {
             before(grammarAccess.getCourseAccess().getDayKeyword_13()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getDayKeyword_13()); 

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
    // $ANTLR end "rule__Course__Group__13__Impl"


    // $ANTLR start "rule__Course__Group__14"
    // InternalCourseScheduler.g:705:1: rule__Course__Group__14 : rule__Course__Group__14__Impl rule__Course__Group__15 ;
    public final void rule__Course__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:709:1: ( rule__Course__Group__14__Impl rule__Course__Group__15 )
            // InternalCourseScheduler.g:710:2: rule__Course__Group__14__Impl rule__Course__Group__15
            {
            pushFollow(FOLLOW_14);
            rule__Course__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__15();

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
    // $ANTLR end "rule__Course__Group__14"


    // $ANTLR start "rule__Course__Group__14__Impl"
    // InternalCourseScheduler.g:717:1: rule__Course__Group__14__Impl : ( ( rule__Course__DayAssignment_14 ) ) ;
    public final void rule__Course__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:721:1: ( ( ( rule__Course__DayAssignment_14 ) ) )
            // InternalCourseScheduler.g:722:1: ( ( rule__Course__DayAssignment_14 ) )
            {
            // InternalCourseScheduler.g:722:1: ( ( rule__Course__DayAssignment_14 ) )
            // InternalCourseScheduler.g:723:2: ( rule__Course__DayAssignment_14 )
            {
             before(grammarAccess.getCourseAccess().getDayAssignment_14()); 
            // InternalCourseScheduler.g:724:2: ( rule__Course__DayAssignment_14 )
            // InternalCourseScheduler.g:724:3: rule__Course__DayAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Course__DayAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getDayAssignment_14()); 

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
    // $ANTLR end "rule__Course__Group__14__Impl"


    // $ANTLR start "rule__Course__Group__15"
    // InternalCourseScheduler.g:732:1: rule__Course__Group__15 : rule__Course__Group__15__Impl rule__Course__Group__16 ;
    public final void rule__Course__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:736:1: ( rule__Course__Group__15__Impl rule__Course__Group__16 )
            // InternalCourseScheduler.g:737:2: rule__Course__Group__15__Impl rule__Course__Group__16
            {
            pushFollow(FOLLOW_15);
            rule__Course__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__16();

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
    // $ANTLR end "rule__Course__Group__15"


    // $ANTLR start "rule__Course__Group__15__Impl"
    // InternalCourseScheduler.g:744:1: rule__Course__Group__15__Impl : ( 'batches' ) ;
    public final void rule__Course__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:748:1: ( ( 'batches' ) )
            // InternalCourseScheduler.g:749:1: ( 'batches' )
            {
            // InternalCourseScheduler.g:749:1: ( 'batches' )
            // InternalCourseScheduler.g:750:2: 'batches'
            {
             before(grammarAccess.getCourseAccess().getBatchesKeyword_15()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getBatchesKeyword_15()); 

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
    // $ANTLR end "rule__Course__Group__15__Impl"


    // $ANTLR start "rule__Course__Group__16"
    // InternalCourseScheduler.g:759:1: rule__Course__Group__16 : rule__Course__Group__16__Impl rule__Course__Group__17 ;
    public final void rule__Course__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:763:1: ( rule__Course__Group__16__Impl rule__Course__Group__17 )
            // InternalCourseScheduler.g:764:2: rule__Course__Group__16__Impl rule__Course__Group__17
            {
            pushFollow(FOLLOW_4);
            rule__Course__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__17();

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
    // $ANTLR end "rule__Course__Group__16"


    // $ANTLR start "rule__Course__Group__16__Impl"
    // InternalCourseScheduler.g:771:1: rule__Course__Group__16__Impl : ( '[' ) ;
    public final void rule__Course__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:775:1: ( ( '[' ) )
            // InternalCourseScheduler.g:776:1: ( '[' )
            {
            // InternalCourseScheduler.g:776:1: ( '[' )
            // InternalCourseScheduler.g:777:2: '['
            {
             before(grammarAccess.getCourseAccess().getLeftSquareBracketKeyword_16()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getLeftSquareBracketKeyword_16()); 

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
    // $ANTLR end "rule__Course__Group__16__Impl"


    // $ANTLR start "rule__Course__Group__17"
    // InternalCourseScheduler.g:786:1: rule__Course__Group__17 : rule__Course__Group__17__Impl rule__Course__Group__18 ;
    public final void rule__Course__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:790:1: ( rule__Course__Group__17__Impl rule__Course__Group__18 )
            // InternalCourseScheduler.g:791:2: rule__Course__Group__17__Impl rule__Course__Group__18
            {
            pushFollow(FOLLOW_16);
            rule__Course__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__18();

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
    // $ANTLR end "rule__Course__Group__17"


    // $ANTLR start "rule__Course__Group__17__Impl"
    // InternalCourseScheduler.g:798:1: rule__Course__Group__17__Impl : ( ( rule__Course__BatchesAssignment_17 ) ) ;
    public final void rule__Course__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:802:1: ( ( ( rule__Course__BatchesAssignment_17 ) ) )
            // InternalCourseScheduler.g:803:1: ( ( rule__Course__BatchesAssignment_17 ) )
            {
            // InternalCourseScheduler.g:803:1: ( ( rule__Course__BatchesAssignment_17 ) )
            // InternalCourseScheduler.g:804:2: ( rule__Course__BatchesAssignment_17 )
            {
             before(grammarAccess.getCourseAccess().getBatchesAssignment_17()); 
            // InternalCourseScheduler.g:805:2: ( rule__Course__BatchesAssignment_17 )
            // InternalCourseScheduler.g:805:3: rule__Course__BatchesAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Course__BatchesAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getBatchesAssignment_17()); 

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
    // $ANTLR end "rule__Course__Group__17__Impl"


    // $ANTLR start "rule__Course__Group__18"
    // InternalCourseScheduler.g:813:1: rule__Course__Group__18 : rule__Course__Group__18__Impl rule__Course__Group__19 ;
    public final void rule__Course__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:817:1: ( rule__Course__Group__18__Impl rule__Course__Group__19 )
            // InternalCourseScheduler.g:818:2: rule__Course__Group__18__Impl rule__Course__Group__19
            {
            pushFollow(FOLLOW_16);
            rule__Course__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__19();

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
    // $ANTLR end "rule__Course__Group__18"


    // $ANTLR start "rule__Course__Group__18__Impl"
    // InternalCourseScheduler.g:825:1: rule__Course__Group__18__Impl : ( ( rule__Course__Group_18__0 )* ) ;
    public final void rule__Course__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:829:1: ( ( ( rule__Course__Group_18__0 )* ) )
            // InternalCourseScheduler.g:830:1: ( ( rule__Course__Group_18__0 )* )
            {
            // InternalCourseScheduler.g:830:1: ( ( rule__Course__Group_18__0 )* )
            // InternalCourseScheduler.g:831:2: ( rule__Course__Group_18__0 )*
            {
             before(grammarAccess.getCourseAccess().getGroup_18()); 
            // InternalCourseScheduler.g:832:2: ( rule__Course__Group_18__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==32) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCourseScheduler.g:832:3: rule__Course__Group_18__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Course__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getGroup_18()); 

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
    // $ANTLR end "rule__Course__Group__18__Impl"


    // $ANTLR start "rule__Course__Group__19"
    // InternalCourseScheduler.g:840:1: rule__Course__Group__19 : rule__Course__Group__19__Impl rule__Course__Group__20 ;
    public final void rule__Course__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:844:1: ( rule__Course__Group__19__Impl rule__Course__Group__20 )
            // InternalCourseScheduler.g:845:2: rule__Course__Group__19__Impl rule__Course__Group__20
            {
            pushFollow(FOLLOW_18);
            rule__Course__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__20();

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
    // $ANTLR end "rule__Course__Group__19"


    // $ANTLR start "rule__Course__Group__19__Impl"
    // InternalCourseScheduler.g:852:1: rule__Course__Group__19__Impl : ( ']' ) ;
    public final void rule__Course__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:856:1: ( ( ']' ) )
            // InternalCourseScheduler.g:857:1: ( ']' )
            {
            // InternalCourseScheduler.g:857:1: ( ']' )
            // InternalCourseScheduler.g:858:2: ']'
            {
             before(grammarAccess.getCourseAccess().getRightSquareBracketKeyword_19()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getRightSquareBracketKeyword_19()); 

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
    // $ANTLR end "rule__Course__Group__19__Impl"


    // $ANTLR start "rule__Course__Group__20"
    // InternalCourseScheduler.g:867:1: rule__Course__Group__20 : rule__Course__Group__20__Impl rule__Course__Group__21 ;
    public final void rule__Course__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:871:1: ( rule__Course__Group__20__Impl rule__Course__Group__21 )
            // InternalCourseScheduler.g:872:2: rule__Course__Group__20__Impl rule__Course__Group__21
            {
            pushFollow(FOLLOW_15);
            rule__Course__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__21();

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
    // $ANTLR end "rule__Course__Group__20"


    // $ANTLR start "rule__Course__Group__20__Impl"
    // InternalCourseScheduler.g:879:1: rule__Course__Group__20__Impl : ( 'prefers' ) ;
    public final void rule__Course__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:883:1: ( ( 'prefers' ) )
            // InternalCourseScheduler.g:884:1: ( 'prefers' )
            {
            // InternalCourseScheduler.g:884:1: ( 'prefers' )
            // InternalCourseScheduler.g:885:2: 'prefers'
            {
             before(grammarAccess.getCourseAccess().getPrefersKeyword_20()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getPrefersKeyword_20()); 

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
    // $ANTLR end "rule__Course__Group__20__Impl"


    // $ANTLR start "rule__Course__Group__21"
    // InternalCourseScheduler.g:894:1: rule__Course__Group__21 : rule__Course__Group__21__Impl rule__Course__Group__22 ;
    public final void rule__Course__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:898:1: ( rule__Course__Group__21__Impl rule__Course__Group__22 )
            // InternalCourseScheduler.g:899:2: rule__Course__Group__21__Impl rule__Course__Group__22
            {
            pushFollow(FOLLOW_13);
            rule__Course__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__22();

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
    // $ANTLR end "rule__Course__Group__21"


    // $ANTLR start "rule__Course__Group__21__Impl"
    // InternalCourseScheduler.g:906:1: rule__Course__Group__21__Impl : ( '[' ) ;
    public final void rule__Course__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:910:1: ( ( '[' ) )
            // InternalCourseScheduler.g:911:1: ( '[' )
            {
            // InternalCourseScheduler.g:911:1: ( '[' )
            // InternalCourseScheduler.g:912:2: '['
            {
             before(grammarAccess.getCourseAccess().getLeftSquareBracketKeyword_21()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getLeftSquareBracketKeyword_21()); 

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
    // $ANTLR end "rule__Course__Group__21__Impl"


    // $ANTLR start "rule__Course__Group__22"
    // InternalCourseScheduler.g:921:1: rule__Course__Group__22 : rule__Course__Group__22__Impl rule__Course__Group__23 ;
    public final void rule__Course__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:925:1: ( rule__Course__Group__22__Impl rule__Course__Group__23 )
            // InternalCourseScheduler.g:926:2: rule__Course__Group__22__Impl rule__Course__Group__23
            {
            pushFollow(FOLLOW_16);
            rule__Course__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__23();

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
    // $ANTLR end "rule__Course__Group__22"


    // $ANTLR start "rule__Course__Group__22__Impl"
    // InternalCourseScheduler.g:933:1: rule__Course__Group__22__Impl : ( ( rule__Course__PrefersAssignment_22 ) ) ;
    public final void rule__Course__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:937:1: ( ( ( rule__Course__PrefersAssignment_22 ) ) )
            // InternalCourseScheduler.g:938:1: ( ( rule__Course__PrefersAssignment_22 ) )
            {
            // InternalCourseScheduler.g:938:1: ( ( rule__Course__PrefersAssignment_22 ) )
            // InternalCourseScheduler.g:939:2: ( rule__Course__PrefersAssignment_22 )
            {
             before(grammarAccess.getCourseAccess().getPrefersAssignment_22()); 
            // InternalCourseScheduler.g:940:2: ( rule__Course__PrefersAssignment_22 )
            // InternalCourseScheduler.g:940:3: rule__Course__PrefersAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__Course__PrefersAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getPrefersAssignment_22()); 

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
    // $ANTLR end "rule__Course__Group__22__Impl"


    // $ANTLR start "rule__Course__Group__23"
    // InternalCourseScheduler.g:948:1: rule__Course__Group__23 : rule__Course__Group__23__Impl rule__Course__Group__24 ;
    public final void rule__Course__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:952:1: ( rule__Course__Group__23__Impl rule__Course__Group__24 )
            // InternalCourseScheduler.g:953:2: rule__Course__Group__23__Impl rule__Course__Group__24
            {
            pushFollow(FOLLOW_16);
            rule__Course__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__24();

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
    // $ANTLR end "rule__Course__Group__23"


    // $ANTLR start "rule__Course__Group__23__Impl"
    // InternalCourseScheduler.g:960:1: rule__Course__Group__23__Impl : ( ( rule__Course__Group_23__0 )* ) ;
    public final void rule__Course__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:964:1: ( ( ( rule__Course__Group_23__0 )* ) )
            // InternalCourseScheduler.g:965:1: ( ( rule__Course__Group_23__0 )* )
            {
            // InternalCourseScheduler.g:965:1: ( ( rule__Course__Group_23__0 )* )
            // InternalCourseScheduler.g:966:2: ( rule__Course__Group_23__0 )*
            {
             before(grammarAccess.getCourseAccess().getGroup_23()); 
            // InternalCourseScheduler.g:967:2: ( rule__Course__Group_23__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCourseScheduler.g:967:3: rule__Course__Group_23__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Course__Group_23__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getGroup_23()); 

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
    // $ANTLR end "rule__Course__Group__23__Impl"


    // $ANTLR start "rule__Course__Group__24"
    // InternalCourseScheduler.g:975:1: rule__Course__Group__24 : rule__Course__Group__24__Impl rule__Course__Group__25 ;
    public final void rule__Course__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:979:1: ( rule__Course__Group__24__Impl rule__Course__Group__25 )
            // InternalCourseScheduler.g:980:2: rule__Course__Group__24__Impl rule__Course__Group__25
            {
            pushFollow(FOLLOW_19);
            rule__Course__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__25();

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
    // $ANTLR end "rule__Course__Group__24"


    // $ANTLR start "rule__Course__Group__24__Impl"
    // InternalCourseScheduler.g:987:1: rule__Course__Group__24__Impl : ( ']' ) ;
    public final void rule__Course__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:991:1: ( ( ']' ) )
            // InternalCourseScheduler.g:992:1: ( ']' )
            {
            // InternalCourseScheduler.g:992:1: ( ']' )
            // InternalCourseScheduler.g:993:2: ']'
            {
             before(grammarAccess.getCourseAccess().getRightSquareBracketKeyword_24()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getRightSquareBracketKeyword_24()); 

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
    // $ANTLR end "rule__Course__Group__24__Impl"


    // $ANTLR start "rule__Course__Group__25"
    // InternalCourseScheduler.g:1002:1: rule__Course__Group__25 : rule__Course__Group__25__Impl rule__Course__Group__26 ;
    public final void rule__Course__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1006:1: ( rule__Course__Group__25__Impl rule__Course__Group__26 )
            // InternalCourseScheduler.g:1007:2: rule__Course__Group__25__Impl rule__Course__Group__26
            {
            pushFollow(FOLLOW_15);
            rule__Course__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__26();

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
    // $ANTLR end "rule__Course__Group__25"


    // $ANTLR start "rule__Course__Group__25__Impl"
    // InternalCourseScheduler.g:1014:1: rule__Course__Group__25__Impl : ( 'preferred_sessions' ) ;
    public final void rule__Course__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1018:1: ( ( 'preferred_sessions' ) )
            // InternalCourseScheduler.g:1019:1: ( 'preferred_sessions' )
            {
            // InternalCourseScheduler.g:1019:1: ( 'preferred_sessions' )
            // InternalCourseScheduler.g:1020:2: 'preferred_sessions'
            {
             before(grammarAccess.getCourseAccess().getPreferred_sessionsKeyword_25()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getPreferred_sessionsKeyword_25()); 

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
    // $ANTLR end "rule__Course__Group__25__Impl"


    // $ANTLR start "rule__Course__Group__26"
    // InternalCourseScheduler.g:1029:1: rule__Course__Group__26 : rule__Course__Group__26__Impl rule__Course__Group__27 ;
    public final void rule__Course__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1033:1: ( rule__Course__Group__26__Impl rule__Course__Group__27 )
            // InternalCourseScheduler.g:1034:2: rule__Course__Group__26__Impl rule__Course__Group__27
            {
            pushFollow(FOLLOW_8);
            rule__Course__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__27();

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
    // $ANTLR end "rule__Course__Group__26"


    // $ANTLR start "rule__Course__Group__26__Impl"
    // InternalCourseScheduler.g:1041:1: rule__Course__Group__26__Impl : ( '[' ) ;
    public final void rule__Course__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1045:1: ( ( '[' ) )
            // InternalCourseScheduler.g:1046:1: ( '[' )
            {
            // InternalCourseScheduler.g:1046:1: ( '[' )
            // InternalCourseScheduler.g:1047:2: '['
            {
             before(grammarAccess.getCourseAccess().getLeftSquareBracketKeyword_26()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getLeftSquareBracketKeyword_26()); 

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
    // $ANTLR end "rule__Course__Group__26__Impl"


    // $ANTLR start "rule__Course__Group__27"
    // InternalCourseScheduler.g:1056:1: rule__Course__Group__27 : rule__Course__Group__27__Impl rule__Course__Group__28 ;
    public final void rule__Course__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1060:1: ( rule__Course__Group__27__Impl rule__Course__Group__28 )
            // InternalCourseScheduler.g:1061:2: rule__Course__Group__27__Impl rule__Course__Group__28
            {
            pushFollow(FOLLOW_16);
            rule__Course__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__28();

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
    // $ANTLR end "rule__Course__Group__27"


    // $ANTLR start "rule__Course__Group__27__Impl"
    // InternalCourseScheduler.g:1068:1: rule__Course__Group__27__Impl : ( ( rule__Course__PreferredSessionsAssignment_27 ) ) ;
    public final void rule__Course__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1072:1: ( ( ( rule__Course__PreferredSessionsAssignment_27 ) ) )
            // InternalCourseScheduler.g:1073:1: ( ( rule__Course__PreferredSessionsAssignment_27 ) )
            {
            // InternalCourseScheduler.g:1073:1: ( ( rule__Course__PreferredSessionsAssignment_27 ) )
            // InternalCourseScheduler.g:1074:2: ( rule__Course__PreferredSessionsAssignment_27 )
            {
             before(grammarAccess.getCourseAccess().getPreferredSessionsAssignment_27()); 
            // InternalCourseScheduler.g:1075:2: ( rule__Course__PreferredSessionsAssignment_27 )
            // InternalCourseScheduler.g:1075:3: rule__Course__PreferredSessionsAssignment_27
            {
            pushFollow(FOLLOW_2);
            rule__Course__PreferredSessionsAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getPreferredSessionsAssignment_27()); 

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
    // $ANTLR end "rule__Course__Group__27__Impl"


    // $ANTLR start "rule__Course__Group__28"
    // InternalCourseScheduler.g:1083:1: rule__Course__Group__28 : rule__Course__Group__28__Impl rule__Course__Group__29 ;
    public final void rule__Course__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1087:1: ( rule__Course__Group__28__Impl rule__Course__Group__29 )
            // InternalCourseScheduler.g:1088:2: rule__Course__Group__28__Impl rule__Course__Group__29
            {
            pushFollow(FOLLOW_16);
            rule__Course__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group__29();

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
    // $ANTLR end "rule__Course__Group__28"


    // $ANTLR start "rule__Course__Group__28__Impl"
    // InternalCourseScheduler.g:1095:1: rule__Course__Group__28__Impl : ( ( rule__Course__Group_28__0 )* ) ;
    public final void rule__Course__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1099:1: ( ( ( rule__Course__Group_28__0 )* ) )
            // InternalCourseScheduler.g:1100:1: ( ( rule__Course__Group_28__0 )* )
            {
            // InternalCourseScheduler.g:1100:1: ( ( rule__Course__Group_28__0 )* )
            // InternalCourseScheduler.g:1101:2: ( rule__Course__Group_28__0 )*
            {
             before(grammarAccess.getCourseAccess().getGroup_28()); 
            // InternalCourseScheduler.g:1102:2: ( rule__Course__Group_28__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==32) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCourseScheduler.g:1102:3: rule__Course__Group_28__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Course__Group_28__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getCourseAccess().getGroup_28()); 

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
    // $ANTLR end "rule__Course__Group__28__Impl"


    // $ANTLR start "rule__Course__Group__29"
    // InternalCourseScheduler.g:1110:1: rule__Course__Group__29 : rule__Course__Group__29__Impl ;
    public final void rule__Course__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1114:1: ( rule__Course__Group__29__Impl )
            // InternalCourseScheduler.g:1115:2: rule__Course__Group__29__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group__29__Impl();

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
    // $ANTLR end "rule__Course__Group__29"


    // $ANTLR start "rule__Course__Group__29__Impl"
    // InternalCourseScheduler.g:1121:1: rule__Course__Group__29__Impl : ( ']' ) ;
    public final void rule__Course__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1125:1: ( ( ']' ) )
            // InternalCourseScheduler.g:1126:1: ( ']' )
            {
            // InternalCourseScheduler.g:1126:1: ( ']' )
            // InternalCourseScheduler.g:1127:2: ']'
            {
             before(grammarAccess.getCourseAccess().getRightSquareBracketKeyword_29()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getRightSquareBracketKeyword_29()); 

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
    // $ANTLR end "rule__Course__Group__29__Impl"


    // $ANTLR start "rule__Course__Group_18__0"
    // InternalCourseScheduler.g:1137:1: rule__Course__Group_18__0 : rule__Course__Group_18__0__Impl rule__Course__Group_18__1 ;
    public final void rule__Course__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1141:1: ( rule__Course__Group_18__0__Impl rule__Course__Group_18__1 )
            // InternalCourseScheduler.g:1142:2: rule__Course__Group_18__0__Impl rule__Course__Group_18__1
            {
            pushFollow(FOLLOW_4);
            rule__Course__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_18__1();

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
    // $ANTLR end "rule__Course__Group_18__0"


    // $ANTLR start "rule__Course__Group_18__0__Impl"
    // InternalCourseScheduler.g:1149:1: rule__Course__Group_18__0__Impl : ( ',' ) ;
    public final void rule__Course__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1153:1: ( ( ',' ) )
            // InternalCourseScheduler.g:1154:1: ( ',' )
            {
            // InternalCourseScheduler.g:1154:1: ( ',' )
            // InternalCourseScheduler.g:1155:2: ','
            {
             before(grammarAccess.getCourseAccess().getCommaKeyword_18_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCommaKeyword_18_0()); 

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
    // $ANTLR end "rule__Course__Group_18__0__Impl"


    // $ANTLR start "rule__Course__Group_18__1"
    // InternalCourseScheduler.g:1164:1: rule__Course__Group_18__1 : rule__Course__Group_18__1__Impl ;
    public final void rule__Course__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1168:1: ( rule__Course__Group_18__1__Impl )
            // InternalCourseScheduler.g:1169:2: rule__Course__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group_18__1__Impl();

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
    // $ANTLR end "rule__Course__Group_18__1"


    // $ANTLR start "rule__Course__Group_18__1__Impl"
    // InternalCourseScheduler.g:1175:1: rule__Course__Group_18__1__Impl : ( ( rule__Course__BatchesAssignment_18_1 ) ) ;
    public final void rule__Course__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1179:1: ( ( ( rule__Course__BatchesAssignment_18_1 ) ) )
            // InternalCourseScheduler.g:1180:1: ( ( rule__Course__BatchesAssignment_18_1 ) )
            {
            // InternalCourseScheduler.g:1180:1: ( ( rule__Course__BatchesAssignment_18_1 ) )
            // InternalCourseScheduler.g:1181:2: ( rule__Course__BatchesAssignment_18_1 )
            {
             before(grammarAccess.getCourseAccess().getBatchesAssignment_18_1()); 
            // InternalCourseScheduler.g:1182:2: ( rule__Course__BatchesAssignment_18_1 )
            // InternalCourseScheduler.g:1182:3: rule__Course__BatchesAssignment_18_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__BatchesAssignment_18_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getBatchesAssignment_18_1()); 

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
    // $ANTLR end "rule__Course__Group_18__1__Impl"


    // $ANTLR start "rule__Course__Group_23__0"
    // InternalCourseScheduler.g:1191:1: rule__Course__Group_23__0 : rule__Course__Group_23__0__Impl rule__Course__Group_23__1 ;
    public final void rule__Course__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1195:1: ( rule__Course__Group_23__0__Impl rule__Course__Group_23__1 )
            // InternalCourseScheduler.g:1196:2: rule__Course__Group_23__0__Impl rule__Course__Group_23__1
            {
            pushFollow(FOLLOW_13);
            rule__Course__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_23__1();

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
    // $ANTLR end "rule__Course__Group_23__0"


    // $ANTLR start "rule__Course__Group_23__0__Impl"
    // InternalCourseScheduler.g:1203:1: rule__Course__Group_23__0__Impl : ( ',' ) ;
    public final void rule__Course__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1207:1: ( ( ',' ) )
            // InternalCourseScheduler.g:1208:1: ( ',' )
            {
            // InternalCourseScheduler.g:1208:1: ( ',' )
            // InternalCourseScheduler.g:1209:2: ','
            {
             before(grammarAccess.getCourseAccess().getCommaKeyword_23_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCommaKeyword_23_0()); 

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
    // $ANTLR end "rule__Course__Group_23__0__Impl"


    // $ANTLR start "rule__Course__Group_23__1"
    // InternalCourseScheduler.g:1218:1: rule__Course__Group_23__1 : rule__Course__Group_23__1__Impl ;
    public final void rule__Course__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1222:1: ( rule__Course__Group_23__1__Impl )
            // InternalCourseScheduler.g:1223:2: rule__Course__Group_23__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group_23__1__Impl();

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
    // $ANTLR end "rule__Course__Group_23__1"


    // $ANTLR start "rule__Course__Group_23__1__Impl"
    // InternalCourseScheduler.g:1229:1: rule__Course__Group_23__1__Impl : ( ( rule__Course__PrefersAssignment_23_1 ) ) ;
    public final void rule__Course__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1233:1: ( ( ( rule__Course__PrefersAssignment_23_1 ) ) )
            // InternalCourseScheduler.g:1234:1: ( ( rule__Course__PrefersAssignment_23_1 ) )
            {
            // InternalCourseScheduler.g:1234:1: ( ( rule__Course__PrefersAssignment_23_1 ) )
            // InternalCourseScheduler.g:1235:2: ( rule__Course__PrefersAssignment_23_1 )
            {
             before(grammarAccess.getCourseAccess().getPrefersAssignment_23_1()); 
            // InternalCourseScheduler.g:1236:2: ( rule__Course__PrefersAssignment_23_1 )
            // InternalCourseScheduler.g:1236:3: rule__Course__PrefersAssignment_23_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__PrefersAssignment_23_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getPrefersAssignment_23_1()); 

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
    // $ANTLR end "rule__Course__Group_23__1__Impl"


    // $ANTLR start "rule__Course__Group_28__0"
    // InternalCourseScheduler.g:1245:1: rule__Course__Group_28__0 : rule__Course__Group_28__0__Impl rule__Course__Group_28__1 ;
    public final void rule__Course__Group_28__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1249:1: ( rule__Course__Group_28__0__Impl rule__Course__Group_28__1 )
            // InternalCourseScheduler.g:1250:2: rule__Course__Group_28__0__Impl rule__Course__Group_28__1
            {
            pushFollow(FOLLOW_8);
            rule__Course__Group_28__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Course__Group_28__1();

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
    // $ANTLR end "rule__Course__Group_28__0"


    // $ANTLR start "rule__Course__Group_28__0__Impl"
    // InternalCourseScheduler.g:1257:1: rule__Course__Group_28__0__Impl : ( ',' ) ;
    public final void rule__Course__Group_28__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1261:1: ( ( ',' ) )
            // InternalCourseScheduler.g:1262:1: ( ',' )
            {
            // InternalCourseScheduler.g:1262:1: ( ',' )
            // InternalCourseScheduler.g:1263:2: ','
            {
             before(grammarAccess.getCourseAccess().getCommaKeyword_28_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getCommaKeyword_28_0()); 

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
    // $ANTLR end "rule__Course__Group_28__0__Impl"


    // $ANTLR start "rule__Course__Group_28__1"
    // InternalCourseScheduler.g:1272:1: rule__Course__Group_28__1 : rule__Course__Group_28__1__Impl ;
    public final void rule__Course__Group_28__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1276:1: ( rule__Course__Group_28__1__Impl )
            // InternalCourseScheduler.g:1277:2: rule__Course__Group_28__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Course__Group_28__1__Impl();

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
    // $ANTLR end "rule__Course__Group_28__1"


    // $ANTLR start "rule__Course__Group_28__1__Impl"
    // InternalCourseScheduler.g:1283:1: rule__Course__Group_28__1__Impl : ( ( rule__Course__PreferredSessionsAssignment_28_1 ) ) ;
    public final void rule__Course__Group_28__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1287:1: ( ( ( rule__Course__PreferredSessionsAssignment_28_1 ) ) )
            // InternalCourseScheduler.g:1288:1: ( ( rule__Course__PreferredSessionsAssignment_28_1 ) )
            {
            // InternalCourseScheduler.g:1288:1: ( ( rule__Course__PreferredSessionsAssignment_28_1 ) )
            // InternalCourseScheduler.g:1289:2: ( rule__Course__PreferredSessionsAssignment_28_1 )
            {
             before(grammarAccess.getCourseAccess().getPreferredSessionsAssignment_28_1()); 
            // InternalCourseScheduler.g:1290:2: ( rule__Course__PreferredSessionsAssignment_28_1 )
            // InternalCourseScheduler.g:1290:3: rule__Course__PreferredSessionsAssignment_28_1
            {
            pushFollow(FOLLOW_2);
            rule__Course__PreferredSessionsAssignment_28_1();

            state._fsp--;


            }

             after(grammarAccess.getCourseAccess().getPreferredSessionsAssignment_28_1()); 

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
    // $ANTLR end "rule__Course__Group_28__1__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalCourseScheduler.g:1299:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1303:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalCourseScheduler.g:1304:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Room__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__1();

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
    // $ANTLR end "rule__Room__Group__0"


    // $ANTLR start "rule__Room__Group__0__Impl"
    // InternalCourseScheduler.g:1311:1: rule__Room__Group__0__Impl : ( 'room' ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1315:1: ( ( 'room' ) )
            // InternalCourseScheduler.g:1316:1: ( 'room' )
            {
            // InternalCourseScheduler.g:1316:1: ( 'room' )
            // InternalCourseScheduler.g:1317:2: 'room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRoomKeyword_0()); 

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
    // $ANTLR end "rule__Room__Group__0__Impl"


    // $ANTLR start "rule__Room__Group__1"
    // InternalCourseScheduler.g:1326:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1330:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalCourseScheduler.g:1331:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Room__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__2();

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
    // $ANTLR end "rule__Room__Group__1"


    // $ANTLR start "rule__Room__Group__1__Impl"
    // InternalCourseScheduler.g:1338:1: rule__Room__Group__1__Impl : ( ( rule__Room__NameAssignment_1 ) ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1342:1: ( ( ( rule__Room__NameAssignment_1 ) ) )
            // InternalCourseScheduler.g:1343:1: ( ( rule__Room__NameAssignment_1 ) )
            {
            // InternalCourseScheduler.g:1343:1: ( ( rule__Room__NameAssignment_1 ) )
            // InternalCourseScheduler.g:1344:2: ( rule__Room__NameAssignment_1 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_1()); 
            // InternalCourseScheduler.g:1345:2: ( rule__Room__NameAssignment_1 )
            // InternalCourseScheduler.g:1345:3: rule__Room__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Room__Group__1__Impl"


    // $ANTLR start "rule__Room__Group__2"
    // InternalCourseScheduler.g:1353:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1357:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalCourseScheduler.g:1358:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Room__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__3();

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
    // $ANTLR end "rule__Room__Group__2"


    // $ANTLR start "rule__Room__Group__2__Impl"
    // InternalCourseScheduler.g:1365:1: rule__Room__Group__2__Impl : ( 'capacity' ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1369:1: ( ( 'capacity' ) )
            // InternalCourseScheduler.g:1370:1: ( 'capacity' )
            {
            // InternalCourseScheduler.g:1370:1: ( 'capacity' )
            // InternalCourseScheduler.g:1371:2: 'capacity'
            {
             before(grammarAccess.getRoomAccess().getCapacityKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCapacityKeyword_2()); 

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
    // $ANTLR end "rule__Room__Group__2__Impl"


    // $ANTLR start "rule__Room__Group__3"
    // InternalCourseScheduler.g:1380:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1384:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalCourseScheduler.g:1385:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Room__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__4();

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
    // $ANTLR end "rule__Room__Group__3"


    // $ANTLR start "rule__Room__Group__3__Impl"
    // InternalCourseScheduler.g:1392:1: rule__Room__Group__3__Impl : ( ( rule__Room__CapacityAssignment_3 ) ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1396:1: ( ( ( rule__Room__CapacityAssignment_3 ) ) )
            // InternalCourseScheduler.g:1397:1: ( ( rule__Room__CapacityAssignment_3 ) )
            {
            // InternalCourseScheduler.g:1397:1: ( ( rule__Room__CapacityAssignment_3 ) )
            // InternalCourseScheduler.g:1398:2: ( rule__Room__CapacityAssignment_3 )
            {
             before(grammarAccess.getRoomAccess().getCapacityAssignment_3()); 
            // InternalCourseScheduler.g:1399:2: ( rule__Room__CapacityAssignment_3 )
            // InternalCourseScheduler.g:1399:3: rule__Room__CapacityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Room__CapacityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getCapacityAssignment_3()); 

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
    // $ANTLR end "rule__Room__Group__3__Impl"


    // $ANTLR start "rule__Room__Group__4"
    // InternalCourseScheduler.g:1407:1: rule__Room__Group__4 : rule__Room__Group__4__Impl rule__Room__Group__5 ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1411:1: ( rule__Room__Group__4__Impl rule__Room__Group__5 )
            // InternalCourseScheduler.g:1412:2: rule__Room__Group__4__Impl rule__Room__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Room__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__5();

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
    // $ANTLR end "rule__Room__Group__4"


    // $ANTLR start "rule__Room__Group__4__Impl"
    // InternalCourseScheduler.g:1419:1: rule__Room__Group__4__Impl : ( 'available' ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1423:1: ( ( 'available' ) )
            // InternalCourseScheduler.g:1424:1: ( 'available' )
            {
            // InternalCourseScheduler.g:1424:1: ( 'available' )
            // InternalCourseScheduler.g:1425:2: 'available'
            {
             before(grammarAccess.getRoomAccess().getAvailableKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getAvailableKeyword_4()); 

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
    // $ANTLR end "rule__Room__Group__4__Impl"


    // $ANTLR start "rule__Room__Group__5"
    // InternalCourseScheduler.g:1434:1: rule__Room__Group__5 : rule__Room__Group__5__Impl rule__Room__Group__6 ;
    public final void rule__Room__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1438:1: ( rule__Room__Group__5__Impl rule__Room__Group__6 )
            // InternalCourseScheduler.g:1439:2: rule__Room__Group__5__Impl rule__Room__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Room__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__6();

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
    // $ANTLR end "rule__Room__Group__5"


    // $ANTLR start "rule__Room__Group__5__Impl"
    // InternalCourseScheduler.g:1446:1: rule__Room__Group__5__Impl : ( '[' ) ;
    public final void rule__Room__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1450:1: ( ( '[' ) )
            // InternalCourseScheduler.g:1451:1: ( '[' )
            {
            // InternalCourseScheduler.g:1451:1: ( '[' )
            // InternalCourseScheduler.g:1452:2: '['
            {
             before(grammarAccess.getRoomAccess().getLeftSquareBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Room__Group__5__Impl"


    // $ANTLR start "rule__Room__Group__6"
    // InternalCourseScheduler.g:1461:1: rule__Room__Group__6 : rule__Room__Group__6__Impl rule__Room__Group__7 ;
    public final void rule__Room__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1465:1: ( rule__Room__Group__6__Impl rule__Room__Group__7 )
            // InternalCourseScheduler.g:1466:2: rule__Room__Group__6__Impl rule__Room__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Room__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__7();

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
    // $ANTLR end "rule__Room__Group__6"


    // $ANTLR start "rule__Room__Group__6__Impl"
    // InternalCourseScheduler.g:1473:1: rule__Room__Group__6__Impl : ( ( rule__Room__AvailabilityAssignment_6 ) ) ;
    public final void rule__Room__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1477:1: ( ( ( rule__Room__AvailabilityAssignment_6 ) ) )
            // InternalCourseScheduler.g:1478:1: ( ( rule__Room__AvailabilityAssignment_6 ) )
            {
            // InternalCourseScheduler.g:1478:1: ( ( rule__Room__AvailabilityAssignment_6 ) )
            // InternalCourseScheduler.g:1479:2: ( rule__Room__AvailabilityAssignment_6 )
            {
             before(grammarAccess.getRoomAccess().getAvailabilityAssignment_6()); 
            // InternalCourseScheduler.g:1480:2: ( rule__Room__AvailabilityAssignment_6 )
            // InternalCourseScheduler.g:1480:3: rule__Room__AvailabilityAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Room__AvailabilityAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getAvailabilityAssignment_6()); 

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
    // $ANTLR end "rule__Room__Group__6__Impl"


    // $ANTLR start "rule__Room__Group__7"
    // InternalCourseScheduler.g:1488:1: rule__Room__Group__7 : rule__Room__Group__7__Impl rule__Room__Group__8 ;
    public final void rule__Room__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1492:1: ( rule__Room__Group__7__Impl rule__Room__Group__8 )
            // InternalCourseScheduler.g:1493:2: rule__Room__Group__7__Impl rule__Room__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Room__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__8();

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
    // $ANTLR end "rule__Room__Group__7"


    // $ANTLR start "rule__Room__Group__7__Impl"
    // InternalCourseScheduler.g:1500:1: rule__Room__Group__7__Impl : ( ( rule__Room__Group_7__0 )* ) ;
    public final void rule__Room__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1504:1: ( ( ( rule__Room__Group_7__0 )* ) )
            // InternalCourseScheduler.g:1505:1: ( ( rule__Room__Group_7__0 )* )
            {
            // InternalCourseScheduler.g:1505:1: ( ( rule__Room__Group_7__0 )* )
            // InternalCourseScheduler.g:1506:2: ( rule__Room__Group_7__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_7()); 
            // InternalCourseScheduler.g:1507:2: ( rule__Room__Group_7__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCourseScheduler.g:1507:3: rule__Room__Group_7__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Room__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Room__Group__7__Impl"


    // $ANTLR start "rule__Room__Group__8"
    // InternalCourseScheduler.g:1515:1: rule__Room__Group__8 : rule__Room__Group__8__Impl ;
    public final void rule__Room__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1519:1: ( rule__Room__Group__8__Impl )
            // InternalCourseScheduler.g:1520:2: rule__Room__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__8__Impl();

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
    // $ANTLR end "rule__Room__Group__8"


    // $ANTLR start "rule__Room__Group__8__Impl"
    // InternalCourseScheduler.g:1526:1: rule__Room__Group__8__Impl : ( ']' ) ;
    public final void rule__Room__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1530:1: ( ( ']' ) )
            // InternalCourseScheduler.g:1531:1: ( ']' )
            {
            // InternalCourseScheduler.g:1531:1: ( ']' )
            // InternalCourseScheduler.g:1532:2: ']'
            {
             before(grammarAccess.getRoomAccess().getRightSquareBracketKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightSquareBracketKeyword_8()); 

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
    // $ANTLR end "rule__Room__Group__8__Impl"


    // $ANTLR start "rule__Room__Group_7__0"
    // InternalCourseScheduler.g:1542:1: rule__Room__Group_7__0 : rule__Room__Group_7__0__Impl rule__Room__Group_7__1 ;
    public final void rule__Room__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1546:1: ( rule__Room__Group_7__0__Impl rule__Room__Group_7__1 )
            // InternalCourseScheduler.g:1547:2: rule__Room__Group_7__0__Impl rule__Room__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__Room__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_7__1();

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
    // $ANTLR end "rule__Room__Group_7__0"


    // $ANTLR start "rule__Room__Group_7__0__Impl"
    // InternalCourseScheduler.g:1554:1: rule__Room__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Room__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1558:1: ( ( ',' ) )
            // InternalCourseScheduler.g:1559:1: ( ',' )
            {
            // InternalCourseScheduler.g:1559:1: ( ',' )
            // InternalCourseScheduler.g:1560:2: ','
            {
             before(grammarAccess.getRoomAccess().getCommaKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__Room__Group_7__0__Impl"


    // $ANTLR start "rule__Room__Group_7__1"
    // InternalCourseScheduler.g:1569:1: rule__Room__Group_7__1 : rule__Room__Group_7__1__Impl ;
    public final void rule__Room__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1573:1: ( rule__Room__Group_7__1__Impl )
            // InternalCourseScheduler.g:1574:2: rule__Room__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_7__1__Impl();

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
    // $ANTLR end "rule__Room__Group_7__1"


    // $ANTLR start "rule__Room__Group_7__1__Impl"
    // InternalCourseScheduler.g:1580:1: rule__Room__Group_7__1__Impl : ( ( rule__Room__AvailabilityAssignment_7_1 ) ) ;
    public final void rule__Room__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1584:1: ( ( ( rule__Room__AvailabilityAssignment_7_1 ) ) )
            // InternalCourseScheduler.g:1585:1: ( ( rule__Room__AvailabilityAssignment_7_1 ) )
            {
            // InternalCourseScheduler.g:1585:1: ( ( rule__Room__AvailabilityAssignment_7_1 ) )
            // InternalCourseScheduler.g:1586:2: ( rule__Room__AvailabilityAssignment_7_1 )
            {
             before(grammarAccess.getRoomAccess().getAvailabilityAssignment_7_1()); 
            // InternalCourseScheduler.g:1587:2: ( rule__Room__AvailabilityAssignment_7_1 )
            // InternalCourseScheduler.g:1587:3: rule__Room__AvailabilityAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__AvailabilityAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getAvailabilityAssignment_7_1()); 

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
    // $ANTLR end "rule__Room__Group_7__1__Impl"


    // $ANTLR start "rule__Availability__Group__0"
    // InternalCourseScheduler.g:1596:1: rule__Availability__Group__0 : rule__Availability__Group__0__Impl rule__Availability__Group__1 ;
    public final void rule__Availability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1600:1: ( rule__Availability__Group__0__Impl rule__Availability__Group__1 )
            // InternalCourseScheduler.g:1601:2: rule__Availability__Group__0__Impl rule__Availability__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Availability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Availability__Group__1();

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
    // $ANTLR end "rule__Availability__Group__0"


    // $ANTLR start "rule__Availability__Group__0__Impl"
    // InternalCourseScheduler.g:1608:1: rule__Availability__Group__0__Impl : ( ( rule__Availability__DayAssignment_0 ) ) ;
    public final void rule__Availability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1612:1: ( ( ( rule__Availability__DayAssignment_0 ) ) )
            // InternalCourseScheduler.g:1613:1: ( ( rule__Availability__DayAssignment_0 ) )
            {
            // InternalCourseScheduler.g:1613:1: ( ( rule__Availability__DayAssignment_0 ) )
            // InternalCourseScheduler.g:1614:2: ( rule__Availability__DayAssignment_0 )
            {
             before(grammarAccess.getAvailabilityAccess().getDayAssignment_0()); 
            // InternalCourseScheduler.g:1615:2: ( rule__Availability__DayAssignment_0 )
            // InternalCourseScheduler.g:1615:3: rule__Availability__DayAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Availability__DayAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAvailabilityAccess().getDayAssignment_0()); 

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
    // $ANTLR end "rule__Availability__Group__0__Impl"


    // $ANTLR start "rule__Availability__Group__1"
    // InternalCourseScheduler.g:1623:1: rule__Availability__Group__1 : rule__Availability__Group__1__Impl rule__Availability__Group__2 ;
    public final void rule__Availability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1627:1: ( rule__Availability__Group__1__Impl rule__Availability__Group__2 )
            // InternalCourseScheduler.g:1628:2: rule__Availability__Group__1__Impl rule__Availability__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Availability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Availability__Group__2();

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
    // $ANTLR end "rule__Availability__Group__1"


    // $ANTLR start "rule__Availability__Group__1__Impl"
    // InternalCourseScheduler.g:1635:1: rule__Availability__Group__1__Impl : ( ( rule__Availability__StartAssignment_1 ) ) ;
    public final void rule__Availability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1639:1: ( ( ( rule__Availability__StartAssignment_1 ) ) )
            // InternalCourseScheduler.g:1640:1: ( ( rule__Availability__StartAssignment_1 ) )
            {
            // InternalCourseScheduler.g:1640:1: ( ( rule__Availability__StartAssignment_1 ) )
            // InternalCourseScheduler.g:1641:2: ( rule__Availability__StartAssignment_1 )
            {
             before(grammarAccess.getAvailabilityAccess().getStartAssignment_1()); 
            // InternalCourseScheduler.g:1642:2: ( rule__Availability__StartAssignment_1 )
            // InternalCourseScheduler.g:1642:3: rule__Availability__StartAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Availability__StartAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAvailabilityAccess().getStartAssignment_1()); 

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
    // $ANTLR end "rule__Availability__Group__1__Impl"


    // $ANTLR start "rule__Availability__Group__2"
    // InternalCourseScheduler.g:1650:1: rule__Availability__Group__2 : rule__Availability__Group__2__Impl rule__Availability__Group__3 ;
    public final void rule__Availability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1654:1: ( rule__Availability__Group__2__Impl rule__Availability__Group__3 )
            // InternalCourseScheduler.g:1655:2: rule__Availability__Group__2__Impl rule__Availability__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Availability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Availability__Group__3();

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
    // $ANTLR end "rule__Availability__Group__2"


    // $ANTLR start "rule__Availability__Group__2__Impl"
    // InternalCourseScheduler.g:1662:1: rule__Availability__Group__2__Impl : ( '-' ) ;
    public final void rule__Availability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1666:1: ( ( '-' ) )
            // InternalCourseScheduler.g:1667:1: ( '-' )
            {
            // InternalCourseScheduler.g:1667:1: ( '-' )
            // InternalCourseScheduler.g:1668:2: '-'
            {
             before(grammarAccess.getAvailabilityAccess().getHyphenMinusKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAvailabilityAccess().getHyphenMinusKeyword_2()); 

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
    // $ANTLR end "rule__Availability__Group__2__Impl"


    // $ANTLR start "rule__Availability__Group__3"
    // InternalCourseScheduler.g:1677:1: rule__Availability__Group__3 : rule__Availability__Group__3__Impl ;
    public final void rule__Availability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1681:1: ( rule__Availability__Group__3__Impl )
            // InternalCourseScheduler.g:1682:2: rule__Availability__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Availability__Group__3__Impl();

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
    // $ANTLR end "rule__Availability__Group__3"


    // $ANTLR start "rule__Availability__Group__3__Impl"
    // InternalCourseScheduler.g:1688:1: rule__Availability__Group__3__Impl : ( ( rule__Availability__EndAssignment_3 ) ) ;
    public final void rule__Availability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1692:1: ( ( ( rule__Availability__EndAssignment_3 ) ) )
            // InternalCourseScheduler.g:1693:1: ( ( rule__Availability__EndAssignment_3 ) )
            {
            // InternalCourseScheduler.g:1693:1: ( ( rule__Availability__EndAssignment_3 ) )
            // InternalCourseScheduler.g:1694:2: ( rule__Availability__EndAssignment_3 )
            {
             before(grammarAccess.getAvailabilityAccess().getEndAssignment_3()); 
            // InternalCourseScheduler.g:1695:2: ( rule__Availability__EndAssignment_3 )
            // InternalCourseScheduler.g:1695:3: rule__Availability__EndAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Availability__EndAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAvailabilityAccess().getEndAssignment_3()); 

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
    // $ANTLR end "rule__Availability__Group__3__Impl"


    // $ANTLR start "rule__TimeSlot__Group__0"
    // InternalCourseScheduler.g:1704:1: rule__TimeSlot__Group__0 : rule__TimeSlot__Group__0__Impl rule__TimeSlot__Group__1 ;
    public final void rule__TimeSlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1708:1: ( rule__TimeSlot__Group__0__Impl rule__TimeSlot__Group__1 )
            // InternalCourseScheduler.g:1709:2: rule__TimeSlot__Group__0__Impl rule__TimeSlot__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TimeSlot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSlot__Group__1();

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
    // $ANTLR end "rule__TimeSlot__Group__0"


    // $ANTLR start "rule__TimeSlot__Group__0__Impl"
    // InternalCourseScheduler.g:1716:1: rule__TimeSlot__Group__0__Impl : ( 'time_slot' ) ;
    public final void rule__TimeSlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1720:1: ( ( 'time_slot' ) )
            // InternalCourseScheduler.g:1721:1: ( 'time_slot' )
            {
            // InternalCourseScheduler.g:1721:1: ( 'time_slot' )
            // InternalCourseScheduler.g:1722:2: 'time_slot'
            {
             before(grammarAccess.getTimeSlotAccess().getTime_slotKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTimeSlotAccess().getTime_slotKeyword_0()); 

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
    // $ANTLR end "rule__TimeSlot__Group__0__Impl"


    // $ANTLR start "rule__TimeSlot__Group__1"
    // InternalCourseScheduler.g:1731:1: rule__TimeSlot__Group__1 : rule__TimeSlot__Group__1__Impl rule__TimeSlot__Group__2 ;
    public final void rule__TimeSlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1735:1: ( rule__TimeSlot__Group__1__Impl rule__TimeSlot__Group__2 )
            // InternalCourseScheduler.g:1736:2: rule__TimeSlot__Group__1__Impl rule__TimeSlot__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__TimeSlot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSlot__Group__2();

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
    // $ANTLR end "rule__TimeSlot__Group__1"


    // $ANTLR start "rule__TimeSlot__Group__1__Impl"
    // InternalCourseScheduler.g:1743:1: rule__TimeSlot__Group__1__Impl : ( ( rule__TimeSlot__NameAssignment_1 ) ) ;
    public final void rule__TimeSlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1747:1: ( ( ( rule__TimeSlot__NameAssignment_1 ) ) )
            // InternalCourseScheduler.g:1748:1: ( ( rule__TimeSlot__NameAssignment_1 ) )
            {
            // InternalCourseScheduler.g:1748:1: ( ( rule__TimeSlot__NameAssignment_1 ) )
            // InternalCourseScheduler.g:1749:2: ( rule__TimeSlot__NameAssignment_1 )
            {
             before(grammarAccess.getTimeSlotAccess().getNameAssignment_1()); 
            // InternalCourseScheduler.g:1750:2: ( rule__TimeSlot__NameAssignment_1 )
            // InternalCourseScheduler.g:1750:3: rule__TimeSlot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeSlot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeSlotAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TimeSlot__Group__1__Impl"


    // $ANTLR start "rule__TimeSlot__Group__2"
    // InternalCourseScheduler.g:1758:1: rule__TimeSlot__Group__2 : rule__TimeSlot__Group__2__Impl rule__TimeSlot__Group__3 ;
    public final void rule__TimeSlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1762:1: ( rule__TimeSlot__Group__2__Impl rule__TimeSlot__Group__3 )
            // InternalCourseScheduler.g:1763:2: rule__TimeSlot__Group__2__Impl rule__TimeSlot__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__TimeSlot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSlot__Group__3();

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
    // $ANTLR end "rule__TimeSlot__Group__2"


    // $ANTLR start "rule__TimeSlot__Group__2__Impl"
    // InternalCourseScheduler.g:1770:1: rule__TimeSlot__Group__2__Impl : ( ( rule__TimeSlot__StartAssignment_2 ) ) ;
    public final void rule__TimeSlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1774:1: ( ( ( rule__TimeSlot__StartAssignment_2 ) ) )
            // InternalCourseScheduler.g:1775:1: ( ( rule__TimeSlot__StartAssignment_2 ) )
            {
            // InternalCourseScheduler.g:1775:1: ( ( rule__TimeSlot__StartAssignment_2 ) )
            // InternalCourseScheduler.g:1776:2: ( rule__TimeSlot__StartAssignment_2 )
            {
             before(grammarAccess.getTimeSlotAccess().getStartAssignment_2()); 
            // InternalCourseScheduler.g:1777:2: ( rule__TimeSlot__StartAssignment_2 )
            // InternalCourseScheduler.g:1777:3: rule__TimeSlot__StartAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TimeSlot__StartAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeSlotAccess().getStartAssignment_2()); 

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
    // $ANTLR end "rule__TimeSlot__Group__2__Impl"


    // $ANTLR start "rule__TimeSlot__Group__3"
    // InternalCourseScheduler.g:1785:1: rule__TimeSlot__Group__3 : rule__TimeSlot__Group__3__Impl rule__TimeSlot__Group__4 ;
    public final void rule__TimeSlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1789:1: ( rule__TimeSlot__Group__3__Impl rule__TimeSlot__Group__4 )
            // InternalCourseScheduler.g:1790:2: rule__TimeSlot__Group__3__Impl rule__TimeSlot__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__TimeSlot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSlot__Group__4();

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
    // $ANTLR end "rule__TimeSlot__Group__3"


    // $ANTLR start "rule__TimeSlot__Group__3__Impl"
    // InternalCourseScheduler.g:1797:1: rule__TimeSlot__Group__3__Impl : ( '-' ) ;
    public final void rule__TimeSlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1801:1: ( ( '-' ) )
            // InternalCourseScheduler.g:1802:1: ( '-' )
            {
            // InternalCourseScheduler.g:1802:1: ( '-' )
            // InternalCourseScheduler.g:1803:2: '-'
            {
             before(grammarAccess.getTimeSlotAccess().getHyphenMinusKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTimeSlotAccess().getHyphenMinusKeyword_3()); 

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
    // $ANTLR end "rule__TimeSlot__Group__3__Impl"


    // $ANTLR start "rule__TimeSlot__Group__4"
    // InternalCourseScheduler.g:1812:1: rule__TimeSlot__Group__4 : rule__TimeSlot__Group__4__Impl ;
    public final void rule__TimeSlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1816:1: ( rule__TimeSlot__Group__4__Impl )
            // InternalCourseScheduler.g:1817:2: rule__TimeSlot__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeSlot__Group__4__Impl();

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
    // $ANTLR end "rule__TimeSlot__Group__4"


    // $ANTLR start "rule__TimeSlot__Group__4__Impl"
    // InternalCourseScheduler.g:1823:1: rule__TimeSlot__Group__4__Impl : ( ( rule__TimeSlot__EndAssignment_4 ) ) ;
    public final void rule__TimeSlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1827:1: ( ( ( rule__TimeSlot__EndAssignment_4 ) ) )
            // InternalCourseScheduler.g:1828:1: ( ( rule__TimeSlot__EndAssignment_4 ) )
            {
            // InternalCourseScheduler.g:1828:1: ( ( rule__TimeSlot__EndAssignment_4 ) )
            // InternalCourseScheduler.g:1829:2: ( rule__TimeSlot__EndAssignment_4 )
            {
             before(grammarAccess.getTimeSlotAccess().getEndAssignment_4()); 
            // InternalCourseScheduler.g:1830:2: ( rule__TimeSlot__EndAssignment_4 )
            // InternalCourseScheduler.g:1830:3: rule__TimeSlot__EndAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TimeSlot__EndAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTimeSlotAccess().getEndAssignment_4()); 

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
    // $ANTLR end "rule__TimeSlot__Group__4__Impl"


    // $ANTLR start "rule__ScheduleTrigger__Group__0"
    // InternalCourseScheduler.g:1839:1: rule__ScheduleTrigger__Group__0 : rule__ScheduleTrigger__Group__0__Impl rule__ScheduleTrigger__Group__1 ;
    public final void rule__ScheduleTrigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1843:1: ( rule__ScheduleTrigger__Group__0__Impl rule__ScheduleTrigger__Group__1 )
            // InternalCourseScheduler.g:1844:2: rule__ScheduleTrigger__Group__0__Impl rule__ScheduleTrigger__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ScheduleTrigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScheduleTrigger__Group__1();

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
    // $ANTLR end "rule__ScheduleTrigger__Group__0"


    // $ANTLR start "rule__ScheduleTrigger__Group__0__Impl"
    // InternalCourseScheduler.g:1851:1: rule__ScheduleTrigger__Group__0__Impl : ( 'schedule' ) ;
    public final void rule__ScheduleTrigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1855:1: ( ( 'schedule' ) )
            // InternalCourseScheduler.g:1856:1: ( 'schedule' )
            {
            // InternalCourseScheduler.g:1856:1: ( 'schedule' )
            // InternalCourseScheduler.g:1857:2: 'schedule'
            {
             before(grammarAccess.getScheduleTriggerAccess().getScheduleKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getScheduleTriggerAccess().getScheduleKeyword_0()); 

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
    // $ANTLR end "rule__ScheduleTrigger__Group__0__Impl"


    // $ANTLR start "rule__ScheduleTrigger__Group__1"
    // InternalCourseScheduler.g:1866:1: rule__ScheduleTrigger__Group__1 : rule__ScheduleTrigger__Group__1__Impl ;
    public final void rule__ScheduleTrigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1870:1: ( rule__ScheduleTrigger__Group__1__Impl )
            // InternalCourseScheduler.g:1871:2: rule__ScheduleTrigger__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScheduleTrigger__Group__1__Impl();

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
    // $ANTLR end "rule__ScheduleTrigger__Group__1"


    // $ANTLR start "rule__ScheduleTrigger__Group__1__Impl"
    // InternalCourseScheduler.g:1877:1: rule__ScheduleTrigger__Group__1__Impl : ( 'auto' ) ;
    public final void rule__ScheduleTrigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1881:1: ( ( 'auto' ) )
            // InternalCourseScheduler.g:1882:1: ( 'auto' )
            {
            // InternalCourseScheduler.g:1882:1: ( 'auto' )
            // InternalCourseScheduler.g:1883:2: 'auto'
            {
             before(grammarAccess.getScheduleTriggerAccess().getAutoKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getScheduleTriggerAccess().getAutoKeyword_1()); 

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
    // $ANTLR end "rule__ScheduleTrigger__Group__1__Impl"


    // $ANTLR start "rule__CourseScheduler__ElementsAssignment"
    // InternalCourseScheduler.g:1893:1: rule__CourseScheduler__ElementsAssignment : ( ruleElement ) ;
    public final void rule__CourseScheduler__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1897:1: ( ( ruleElement ) )
            // InternalCourseScheduler.g:1898:2: ( ruleElement )
            {
            // InternalCourseScheduler.g:1898:2: ( ruleElement )
            // InternalCourseScheduler.g:1899:3: ruleElement
            {
             before(grammarAccess.getCourseSchedulerAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getCourseSchedulerAccess().getElementsElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__CourseScheduler__ElementsAssignment"


    // $ANTLR start "rule__Course__NameAssignment_1"
    // InternalCourseScheduler.g:1908:1: rule__Course__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Course__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1912:1: ( ( RULE_STRING ) )
            // InternalCourseScheduler.g:1913:2: ( RULE_STRING )
            {
            // InternalCourseScheduler.g:1913:2: ( RULE_STRING )
            // InternalCourseScheduler.g:1914:3: RULE_STRING
            {
             before(grammarAccess.getCourseAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Course__NameAssignment_1"


    // $ANTLR start "rule__Course__TeacherNameAssignment_3"
    // InternalCourseScheduler.g:1923:1: rule__Course__TeacherNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Course__TeacherNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1927:1: ( ( RULE_STRING ) )
            // InternalCourseScheduler.g:1928:2: ( RULE_STRING )
            {
            // InternalCourseScheduler.g:1928:2: ( RULE_STRING )
            // InternalCourseScheduler.g:1929:3: RULE_STRING
            {
             before(grammarAccess.getCourseAccess().getTeacherNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getTeacherNameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Course__TeacherNameAssignment_3"


    // $ANTLR start "rule__Course__TeacherIdAssignment_5"
    // InternalCourseScheduler.g:1938:1: rule__Course__TeacherIdAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Course__TeacherIdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1942:1: ( ( RULE_STRING ) )
            // InternalCourseScheduler.g:1943:2: ( RULE_STRING )
            {
            // InternalCourseScheduler.g:1943:2: ( RULE_STRING )
            // InternalCourseScheduler.g:1944:3: RULE_STRING
            {
             before(grammarAccess.getCourseAccess().getTeacherIdSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getTeacherIdSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Course__TeacherIdAssignment_5"


    // $ANTLR start "rule__Course__DurationAssignment_7"
    // InternalCourseScheduler.g:1953:1: rule__Course__DurationAssignment_7 : ( RULE_INT ) ;
    public final void rule__Course__DurationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1957:1: ( ( RULE_INT ) )
            // InternalCourseScheduler.g:1958:2: ( RULE_INT )
            {
            // InternalCourseScheduler.g:1958:2: ( RULE_INT )
            // InternalCourseScheduler.g:1959:3: RULE_INT
            {
             before(grammarAccess.getCourseAccess().getDurationINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getDurationINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Course__DurationAssignment_7"


    // $ANTLR start "rule__Course__SessionsAssignment_10"
    // InternalCourseScheduler.g:1968:1: rule__Course__SessionsAssignment_10 : ( RULE_INT ) ;
    public final void rule__Course__SessionsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1972:1: ( ( RULE_INT ) )
            // InternalCourseScheduler.g:1973:2: ( RULE_INT )
            {
            // InternalCourseScheduler.g:1973:2: ( RULE_INT )
            // InternalCourseScheduler.g:1974:3: RULE_INT
            {
             before(grammarAccess.getCourseAccess().getSessionsINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getSessionsINTTerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__Course__SessionsAssignment_10"


    // $ANTLR start "rule__Course__StudentCountAssignment_12"
    // InternalCourseScheduler.g:1983:1: rule__Course__StudentCountAssignment_12 : ( RULE_INT ) ;
    public final void rule__Course__StudentCountAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:1987:1: ( ( RULE_INT ) )
            // InternalCourseScheduler.g:1988:2: ( RULE_INT )
            {
            // InternalCourseScheduler.g:1988:2: ( RULE_INT )
            // InternalCourseScheduler.g:1989:3: RULE_INT
            {
             before(grammarAccess.getCourseAccess().getStudentCountINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getStudentCountINTTerminalRuleCall_12_0()); 

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
    // $ANTLR end "rule__Course__StudentCountAssignment_12"


    // $ANTLR start "rule__Course__DayAssignment_14"
    // InternalCourseScheduler.g:1998:1: rule__Course__DayAssignment_14 : ( ruleDay ) ;
    public final void rule__Course__DayAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2002:1: ( ( ruleDay ) )
            // InternalCourseScheduler.g:2003:2: ( ruleDay )
            {
            // InternalCourseScheduler.g:2003:2: ( ruleDay )
            // InternalCourseScheduler.g:2004:3: ruleDay
            {
             before(grammarAccess.getCourseAccess().getDayDayEnumRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleDay();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getDayDayEnumRuleCall_14_0()); 

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
    // $ANTLR end "rule__Course__DayAssignment_14"


    // $ANTLR start "rule__Course__BatchesAssignment_17"
    // InternalCourseScheduler.g:2013:1: rule__Course__BatchesAssignment_17 : ( RULE_STRING ) ;
    public final void rule__Course__BatchesAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2017:1: ( ( RULE_STRING ) )
            // InternalCourseScheduler.g:2018:2: ( RULE_STRING )
            {
            // InternalCourseScheduler.g:2018:2: ( RULE_STRING )
            // InternalCourseScheduler.g:2019:3: RULE_STRING
            {
             before(grammarAccess.getCourseAccess().getBatchesSTRINGTerminalRuleCall_17_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getBatchesSTRINGTerminalRuleCall_17_0()); 

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
    // $ANTLR end "rule__Course__BatchesAssignment_17"


    // $ANTLR start "rule__Course__BatchesAssignment_18_1"
    // InternalCourseScheduler.g:2028:1: rule__Course__BatchesAssignment_18_1 : ( RULE_STRING ) ;
    public final void rule__Course__BatchesAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2032:1: ( ( RULE_STRING ) )
            // InternalCourseScheduler.g:2033:2: ( RULE_STRING )
            {
            // InternalCourseScheduler.g:2033:2: ( RULE_STRING )
            // InternalCourseScheduler.g:2034:3: RULE_STRING
            {
             before(grammarAccess.getCourseAccess().getBatchesSTRINGTerminalRuleCall_18_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getBatchesSTRINGTerminalRuleCall_18_1_0()); 

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
    // $ANTLR end "rule__Course__BatchesAssignment_18_1"


    // $ANTLR start "rule__Course__PrefersAssignment_22"
    // InternalCourseScheduler.g:2043:1: rule__Course__PrefersAssignment_22 : ( ruleDay ) ;
    public final void rule__Course__PrefersAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2047:1: ( ( ruleDay ) )
            // InternalCourseScheduler.g:2048:2: ( ruleDay )
            {
            // InternalCourseScheduler.g:2048:2: ( ruleDay )
            // InternalCourseScheduler.g:2049:3: ruleDay
            {
             before(grammarAccess.getCourseAccess().getPrefersDayEnumRuleCall_22_0()); 
            pushFollow(FOLLOW_2);
            ruleDay();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getPrefersDayEnumRuleCall_22_0()); 

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
    // $ANTLR end "rule__Course__PrefersAssignment_22"


    // $ANTLR start "rule__Course__PrefersAssignment_23_1"
    // InternalCourseScheduler.g:2058:1: rule__Course__PrefersAssignment_23_1 : ( ruleDay ) ;
    public final void rule__Course__PrefersAssignment_23_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2062:1: ( ( ruleDay ) )
            // InternalCourseScheduler.g:2063:2: ( ruleDay )
            {
            // InternalCourseScheduler.g:2063:2: ( ruleDay )
            // InternalCourseScheduler.g:2064:3: ruleDay
            {
             before(grammarAccess.getCourseAccess().getPrefersDayEnumRuleCall_23_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDay();

            state._fsp--;

             after(grammarAccess.getCourseAccess().getPrefersDayEnumRuleCall_23_1_0()); 

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
    // $ANTLR end "rule__Course__PrefersAssignment_23_1"


    // $ANTLR start "rule__Course__PreferredSessionsAssignment_27"
    // InternalCourseScheduler.g:2073:1: rule__Course__PreferredSessionsAssignment_27 : ( RULE_INT ) ;
    public final void rule__Course__PreferredSessionsAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2077:1: ( ( RULE_INT ) )
            // InternalCourseScheduler.g:2078:2: ( RULE_INT )
            {
            // InternalCourseScheduler.g:2078:2: ( RULE_INT )
            // InternalCourseScheduler.g:2079:3: RULE_INT
            {
             before(grammarAccess.getCourseAccess().getPreferredSessionsINTTerminalRuleCall_27_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getPreferredSessionsINTTerminalRuleCall_27_0()); 

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
    // $ANTLR end "rule__Course__PreferredSessionsAssignment_27"


    // $ANTLR start "rule__Course__PreferredSessionsAssignment_28_1"
    // InternalCourseScheduler.g:2088:1: rule__Course__PreferredSessionsAssignment_28_1 : ( RULE_INT ) ;
    public final void rule__Course__PreferredSessionsAssignment_28_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2092:1: ( ( RULE_INT ) )
            // InternalCourseScheduler.g:2093:2: ( RULE_INT )
            {
            // InternalCourseScheduler.g:2093:2: ( RULE_INT )
            // InternalCourseScheduler.g:2094:3: RULE_INT
            {
             before(grammarAccess.getCourseAccess().getPreferredSessionsINTTerminalRuleCall_28_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCourseAccess().getPreferredSessionsINTTerminalRuleCall_28_1_0()); 

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
    // $ANTLR end "rule__Course__PreferredSessionsAssignment_28_1"


    // $ANTLR start "rule__Room__NameAssignment_1"
    // InternalCourseScheduler.g:2103:1: rule__Room__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Room__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2107:1: ( ( RULE_STRING ) )
            // InternalCourseScheduler.g:2108:2: ( RULE_STRING )
            {
            // InternalCourseScheduler.g:2108:2: ( RULE_STRING )
            // InternalCourseScheduler.g:2109:3: RULE_STRING
            {
             before(grammarAccess.getRoomAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Room__NameAssignment_1"


    // $ANTLR start "rule__Room__CapacityAssignment_3"
    // InternalCourseScheduler.g:2118:1: rule__Room__CapacityAssignment_3 : ( RULE_INT ) ;
    public final void rule__Room__CapacityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2122:1: ( ( RULE_INT ) )
            // InternalCourseScheduler.g:2123:2: ( RULE_INT )
            {
            // InternalCourseScheduler.g:2123:2: ( RULE_INT )
            // InternalCourseScheduler.g:2124:3: RULE_INT
            {
             before(grammarAccess.getRoomAccess().getCapacityINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCapacityINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Room__CapacityAssignment_3"


    // $ANTLR start "rule__Room__AvailabilityAssignment_6"
    // InternalCourseScheduler.g:2133:1: rule__Room__AvailabilityAssignment_6 : ( ruleAvailability ) ;
    public final void rule__Room__AvailabilityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2137:1: ( ( ruleAvailability ) )
            // InternalCourseScheduler.g:2138:2: ( ruleAvailability )
            {
            // InternalCourseScheduler.g:2138:2: ( ruleAvailability )
            // InternalCourseScheduler.g:2139:3: ruleAvailability
            {
             before(grammarAccess.getRoomAccess().getAvailabilityAvailabilityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAvailability();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getAvailabilityAvailabilityParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Room__AvailabilityAssignment_6"


    // $ANTLR start "rule__Room__AvailabilityAssignment_7_1"
    // InternalCourseScheduler.g:2148:1: rule__Room__AvailabilityAssignment_7_1 : ( ruleAvailability ) ;
    public final void rule__Room__AvailabilityAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2152:1: ( ( ruleAvailability ) )
            // InternalCourseScheduler.g:2153:2: ( ruleAvailability )
            {
            // InternalCourseScheduler.g:2153:2: ( ruleAvailability )
            // InternalCourseScheduler.g:2154:3: ruleAvailability
            {
             before(grammarAccess.getRoomAccess().getAvailabilityAvailabilityParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAvailability();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getAvailabilityAvailabilityParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Room__AvailabilityAssignment_7_1"


    // $ANTLR start "rule__Availability__DayAssignment_0"
    // InternalCourseScheduler.g:2163:1: rule__Availability__DayAssignment_0 : ( ruleDay ) ;
    public final void rule__Availability__DayAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2167:1: ( ( ruleDay ) )
            // InternalCourseScheduler.g:2168:2: ( ruleDay )
            {
            // InternalCourseScheduler.g:2168:2: ( ruleDay )
            // InternalCourseScheduler.g:2169:3: ruleDay
            {
             before(grammarAccess.getAvailabilityAccess().getDayDayEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDay();

            state._fsp--;

             after(grammarAccess.getAvailabilityAccess().getDayDayEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Availability__DayAssignment_0"


    // $ANTLR start "rule__Availability__StartAssignment_1"
    // InternalCourseScheduler.g:2178:1: rule__Availability__StartAssignment_1 : ( RULE_TIME ) ;
    public final void rule__Availability__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2182:1: ( ( RULE_TIME ) )
            // InternalCourseScheduler.g:2183:2: ( RULE_TIME )
            {
            // InternalCourseScheduler.g:2183:2: ( RULE_TIME )
            // InternalCourseScheduler.g:2184:3: RULE_TIME
            {
             before(grammarAccess.getAvailabilityAccess().getStartTIMETerminalRuleCall_1_0()); 
            match(input,RULE_TIME,FOLLOW_2); 
             after(grammarAccess.getAvailabilityAccess().getStartTIMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Availability__StartAssignment_1"


    // $ANTLR start "rule__Availability__EndAssignment_3"
    // InternalCourseScheduler.g:2193:1: rule__Availability__EndAssignment_3 : ( RULE_TIME ) ;
    public final void rule__Availability__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2197:1: ( ( RULE_TIME ) )
            // InternalCourseScheduler.g:2198:2: ( RULE_TIME )
            {
            // InternalCourseScheduler.g:2198:2: ( RULE_TIME )
            // InternalCourseScheduler.g:2199:3: RULE_TIME
            {
             before(grammarAccess.getAvailabilityAccess().getEndTIMETerminalRuleCall_3_0()); 
            match(input,RULE_TIME,FOLLOW_2); 
             after(grammarAccess.getAvailabilityAccess().getEndTIMETerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Availability__EndAssignment_3"


    // $ANTLR start "rule__TimeSlot__NameAssignment_1"
    // InternalCourseScheduler.g:2208:1: rule__TimeSlot__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TimeSlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2212:1: ( ( RULE_STRING ) )
            // InternalCourseScheduler.g:2213:2: ( RULE_STRING )
            {
            // InternalCourseScheduler.g:2213:2: ( RULE_STRING )
            // InternalCourseScheduler.g:2214:3: RULE_STRING
            {
             before(grammarAccess.getTimeSlotAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTimeSlotAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TimeSlot__NameAssignment_1"


    // $ANTLR start "rule__TimeSlot__StartAssignment_2"
    // InternalCourseScheduler.g:2223:1: rule__TimeSlot__StartAssignment_2 : ( RULE_TIME ) ;
    public final void rule__TimeSlot__StartAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2227:1: ( ( RULE_TIME ) )
            // InternalCourseScheduler.g:2228:2: ( RULE_TIME )
            {
            // InternalCourseScheduler.g:2228:2: ( RULE_TIME )
            // InternalCourseScheduler.g:2229:3: RULE_TIME
            {
             before(grammarAccess.getTimeSlotAccess().getStartTIMETerminalRuleCall_2_0()); 
            match(input,RULE_TIME,FOLLOW_2); 
             after(grammarAccess.getTimeSlotAccess().getStartTIMETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TimeSlot__StartAssignment_2"


    // $ANTLR start "rule__TimeSlot__EndAssignment_4"
    // InternalCourseScheduler.g:2238:1: rule__TimeSlot__EndAssignment_4 : ( RULE_TIME ) ;
    public final void rule__TimeSlot__EndAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCourseScheduler.g:2242:1: ( ( RULE_TIME ) )
            // InternalCourseScheduler.g:2243:2: ( RULE_TIME )
            {
            // InternalCourseScheduler.g:2243:2: ( RULE_TIME )
            // InternalCourseScheduler.g:2244:3: RULE_TIME
            {
             before(grammarAccess.getTimeSlotAccess().getEndTIMETerminalRuleCall_4_0()); 
            match(input,RULE_TIME,FOLLOW_2); 
             after(grammarAccess.getTimeSlotAccess().getEndTIMETerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__TimeSlot__EndAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000006200080002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});

}