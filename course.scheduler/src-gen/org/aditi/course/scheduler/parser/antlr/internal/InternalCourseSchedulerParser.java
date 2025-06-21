package org.aditi.course.scheduler.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.aditi.course.scheduler.services.CourseSchedulerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCourseSchedulerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_TIME", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'course'", "'teacher'", "'teacher_id'", "'duration'", "'h'", "'sessions'", "'student_count'", "'day'", "'batches'", "'['", "','", "']'", "'prefers'", "'preferred_sessions'", "'room'", "'capacity'", "'available'", "'-'", "'time_slot'", "'schedule'", "'auto'", "'Mon'", "'Tue'", "'Wed'", "'Thu'", "'Fri'", "'Sat'", "'Sun'"
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

        public InternalCourseSchedulerParser(TokenStream input, CourseSchedulerGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CourseScheduler";
       	}

       	@Override
       	protected CourseSchedulerGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCourseScheduler"
    // InternalCourseScheduler.g:65:1: entryRuleCourseScheduler returns [EObject current=null] : iv_ruleCourseScheduler= ruleCourseScheduler EOF ;
    public final EObject entryRuleCourseScheduler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourseScheduler = null;


        try {
            // InternalCourseScheduler.g:65:56: (iv_ruleCourseScheduler= ruleCourseScheduler EOF )
            // InternalCourseScheduler.g:66:2: iv_ruleCourseScheduler= ruleCourseScheduler EOF
            {
             newCompositeNode(grammarAccess.getCourseSchedulerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCourseScheduler=ruleCourseScheduler();

            state._fsp--;

             current =iv_ruleCourseScheduler; 
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
    // $ANTLR end "entryRuleCourseScheduler"


    // $ANTLR start "ruleCourseScheduler"
    // InternalCourseScheduler.g:72:1: ruleCourseScheduler returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleCourseScheduler() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalCourseScheduler.g:78:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalCourseScheduler.g:79:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalCourseScheduler.g:79:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==26||(LA1_0>=30 && LA1_0<=31)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCourseScheduler.g:80:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalCourseScheduler.g:80:3: (lv_elements_0_0= ruleElement )
            	    // InternalCourseScheduler.g:81:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getCourseSchedulerAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getCourseSchedulerRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.aditi.course.scheduler.CourseScheduler.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleCourseScheduler"


    // $ANTLR start "entryRuleElement"
    // InternalCourseScheduler.g:101:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalCourseScheduler.g:101:48: (iv_ruleElement= ruleElement EOF )
            // InternalCourseScheduler.g:102:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalCourseScheduler.g:108:1: ruleElement returns [EObject current=null] : (this_Course_0= ruleCourse | this_Room_1= ruleRoom | this_TimeSlot_2= ruleTimeSlot | ruleScheduleTrigger ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Course_0 = null;

        EObject this_Room_1 = null;

        EObject this_TimeSlot_2 = null;



        	enterRule();

        try {
            // InternalCourseScheduler.g:114:2: ( (this_Course_0= ruleCourse | this_Room_1= ruleRoom | this_TimeSlot_2= ruleTimeSlot | ruleScheduleTrigger ) )
            // InternalCourseScheduler.g:115:2: (this_Course_0= ruleCourse | this_Room_1= ruleRoom | this_TimeSlot_2= ruleTimeSlot | ruleScheduleTrigger )
            {
            // InternalCourseScheduler.g:115:2: (this_Course_0= ruleCourse | this_Room_1= ruleRoom | this_TimeSlot_2= ruleTimeSlot | ruleScheduleTrigger )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 30:
                {
                alt2=3;
                }
                break;
            case 31:
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
                    // InternalCourseScheduler.g:116:3: this_Course_0= ruleCourse
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCourseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Course_0=ruleCourse();

                    state._fsp--;


                    			current = this_Course_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCourseScheduler.g:125:3: this_Room_1= ruleRoom
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getRoomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Room_1=ruleRoom();

                    state._fsp--;


                    			current = this_Room_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCourseScheduler.g:134:3: this_TimeSlot_2= ruleTimeSlot
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTimeSlotParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeSlot_2=ruleTimeSlot();

                    state._fsp--;


                    			current = this_TimeSlot_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCourseScheduler.g:143:3: ruleScheduleTrigger
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getScheduleTriggerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    ruleScheduleTrigger();

                    state._fsp--;


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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleCourse"
    // InternalCourseScheduler.g:154:1: entryRuleCourse returns [EObject current=null] : iv_ruleCourse= ruleCourse EOF ;
    public final EObject entryRuleCourse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourse = null;


        try {
            // InternalCourseScheduler.g:154:47: (iv_ruleCourse= ruleCourse EOF )
            // InternalCourseScheduler.g:155:2: iv_ruleCourse= ruleCourse EOF
            {
             newCompositeNode(grammarAccess.getCourseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCourse=ruleCourse();

            state._fsp--;

             current =iv_ruleCourse; 
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
    // $ANTLR end "entryRuleCourse"


    // $ANTLR start "ruleCourse"
    // InternalCourseScheduler.g:161:1: ruleCourse returns [EObject current=null] : (otherlv_0= 'course' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'teacher' ( (lv_teacherName_3_0= RULE_STRING ) ) otherlv_4= 'teacher_id' ( (lv_teacherId_5_0= RULE_STRING ) ) otherlv_6= 'duration' ( (lv_duration_7_0= RULE_INT ) ) otherlv_8= 'h' otherlv_9= 'sessions' ( (lv_sessions_10_0= RULE_INT ) ) otherlv_11= 'student_count' ( (lv_studentCount_12_0= RULE_INT ) ) otherlv_13= 'day' ( (lv_day_14_0= ruleDay ) ) otherlv_15= 'batches' otherlv_16= '[' ( (lv_batches_17_0= RULE_STRING ) ) (otherlv_18= ',' ( (lv_batches_19_0= RULE_STRING ) ) )* otherlv_20= ']' otherlv_21= 'prefers' otherlv_22= '[' ( (lv_prefers_23_0= ruleDay ) ) (otherlv_24= ',' ( (lv_prefers_25_0= ruleDay ) ) )* otherlv_26= ']' otherlv_27= 'preferred_sessions' otherlv_28= '[' ( (lv_preferredSessions_29_0= RULE_INT ) ) (otherlv_30= ',' ( (lv_preferredSessions_31_0= RULE_INT ) ) )* otherlv_32= ']' ) ;
    public final EObject ruleCourse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_teacherName_3_0=null;
        Token otherlv_4=null;
        Token lv_teacherId_5_0=null;
        Token otherlv_6=null;
        Token lv_duration_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_sessions_10_0=null;
        Token otherlv_11=null;
        Token lv_studentCount_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_batches_17_0=null;
        Token otherlv_18=null;
        Token lv_batches_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_preferredSessions_29_0=null;
        Token otherlv_30=null;
        Token lv_preferredSessions_31_0=null;
        Token otherlv_32=null;
        Enumerator lv_day_14_0 = null;

        Enumerator lv_prefers_23_0 = null;

        Enumerator lv_prefers_25_0 = null;



        	enterRule();

        try {
            // InternalCourseScheduler.g:167:2: ( (otherlv_0= 'course' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'teacher' ( (lv_teacherName_3_0= RULE_STRING ) ) otherlv_4= 'teacher_id' ( (lv_teacherId_5_0= RULE_STRING ) ) otherlv_6= 'duration' ( (lv_duration_7_0= RULE_INT ) ) otherlv_8= 'h' otherlv_9= 'sessions' ( (lv_sessions_10_0= RULE_INT ) ) otherlv_11= 'student_count' ( (lv_studentCount_12_0= RULE_INT ) ) otherlv_13= 'day' ( (lv_day_14_0= ruleDay ) ) otherlv_15= 'batches' otherlv_16= '[' ( (lv_batches_17_0= RULE_STRING ) ) (otherlv_18= ',' ( (lv_batches_19_0= RULE_STRING ) ) )* otherlv_20= ']' otherlv_21= 'prefers' otherlv_22= '[' ( (lv_prefers_23_0= ruleDay ) ) (otherlv_24= ',' ( (lv_prefers_25_0= ruleDay ) ) )* otherlv_26= ']' otherlv_27= 'preferred_sessions' otherlv_28= '[' ( (lv_preferredSessions_29_0= RULE_INT ) ) (otherlv_30= ',' ( (lv_preferredSessions_31_0= RULE_INT ) ) )* otherlv_32= ']' ) )
            // InternalCourseScheduler.g:168:2: (otherlv_0= 'course' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'teacher' ( (lv_teacherName_3_0= RULE_STRING ) ) otherlv_4= 'teacher_id' ( (lv_teacherId_5_0= RULE_STRING ) ) otherlv_6= 'duration' ( (lv_duration_7_0= RULE_INT ) ) otherlv_8= 'h' otherlv_9= 'sessions' ( (lv_sessions_10_0= RULE_INT ) ) otherlv_11= 'student_count' ( (lv_studentCount_12_0= RULE_INT ) ) otherlv_13= 'day' ( (lv_day_14_0= ruleDay ) ) otherlv_15= 'batches' otherlv_16= '[' ( (lv_batches_17_0= RULE_STRING ) ) (otherlv_18= ',' ( (lv_batches_19_0= RULE_STRING ) ) )* otherlv_20= ']' otherlv_21= 'prefers' otherlv_22= '[' ( (lv_prefers_23_0= ruleDay ) ) (otherlv_24= ',' ( (lv_prefers_25_0= ruleDay ) ) )* otherlv_26= ']' otherlv_27= 'preferred_sessions' otherlv_28= '[' ( (lv_preferredSessions_29_0= RULE_INT ) ) (otherlv_30= ',' ( (lv_preferredSessions_31_0= RULE_INT ) ) )* otherlv_32= ']' )
            {
            // InternalCourseScheduler.g:168:2: (otherlv_0= 'course' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'teacher' ( (lv_teacherName_3_0= RULE_STRING ) ) otherlv_4= 'teacher_id' ( (lv_teacherId_5_0= RULE_STRING ) ) otherlv_6= 'duration' ( (lv_duration_7_0= RULE_INT ) ) otherlv_8= 'h' otherlv_9= 'sessions' ( (lv_sessions_10_0= RULE_INT ) ) otherlv_11= 'student_count' ( (lv_studentCount_12_0= RULE_INT ) ) otherlv_13= 'day' ( (lv_day_14_0= ruleDay ) ) otherlv_15= 'batches' otherlv_16= '[' ( (lv_batches_17_0= RULE_STRING ) ) (otherlv_18= ',' ( (lv_batches_19_0= RULE_STRING ) ) )* otherlv_20= ']' otherlv_21= 'prefers' otherlv_22= '[' ( (lv_prefers_23_0= ruleDay ) ) (otherlv_24= ',' ( (lv_prefers_25_0= ruleDay ) ) )* otherlv_26= ']' otherlv_27= 'preferred_sessions' otherlv_28= '[' ( (lv_preferredSessions_29_0= RULE_INT ) ) (otherlv_30= ',' ( (lv_preferredSessions_31_0= RULE_INT ) ) )* otherlv_32= ']' )
            // InternalCourseScheduler.g:169:3: otherlv_0= 'course' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'teacher' ( (lv_teacherName_3_0= RULE_STRING ) ) otherlv_4= 'teacher_id' ( (lv_teacherId_5_0= RULE_STRING ) ) otherlv_6= 'duration' ( (lv_duration_7_0= RULE_INT ) ) otherlv_8= 'h' otherlv_9= 'sessions' ( (lv_sessions_10_0= RULE_INT ) ) otherlv_11= 'student_count' ( (lv_studentCount_12_0= RULE_INT ) ) otherlv_13= 'day' ( (lv_day_14_0= ruleDay ) ) otherlv_15= 'batches' otherlv_16= '[' ( (lv_batches_17_0= RULE_STRING ) ) (otherlv_18= ',' ( (lv_batches_19_0= RULE_STRING ) ) )* otherlv_20= ']' otherlv_21= 'prefers' otherlv_22= '[' ( (lv_prefers_23_0= ruleDay ) ) (otherlv_24= ',' ( (lv_prefers_25_0= ruleDay ) ) )* otherlv_26= ']' otherlv_27= 'preferred_sessions' otherlv_28= '[' ( (lv_preferredSessions_29_0= RULE_INT ) ) (otherlv_30= ',' ( (lv_preferredSessions_31_0= RULE_INT ) ) )* otherlv_32= ']'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCourseAccess().getCourseKeyword_0());
            		
            // InternalCourseScheduler.g:173:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalCourseScheduler.g:174:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalCourseScheduler.g:174:4: (lv_name_1_0= RULE_STRING )
            // InternalCourseScheduler.g:175:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCourseAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCourseAccess().getTeacherKeyword_2());
            		
            // InternalCourseScheduler.g:195:3: ( (lv_teacherName_3_0= RULE_STRING ) )
            // InternalCourseScheduler.g:196:4: (lv_teacherName_3_0= RULE_STRING )
            {
            // InternalCourseScheduler.g:196:4: (lv_teacherName_3_0= RULE_STRING )
            // InternalCourseScheduler.g:197:5: lv_teacherName_3_0= RULE_STRING
            {
            lv_teacherName_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_teacherName_3_0, grammarAccess.getCourseAccess().getTeacherNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"teacherName",
            						lv_teacherName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getCourseAccess().getTeacher_idKeyword_4());
            		
            // InternalCourseScheduler.g:217:3: ( (lv_teacherId_5_0= RULE_STRING ) )
            // InternalCourseScheduler.g:218:4: (lv_teacherId_5_0= RULE_STRING )
            {
            // InternalCourseScheduler.g:218:4: (lv_teacherId_5_0= RULE_STRING )
            // InternalCourseScheduler.g:219:5: lv_teacherId_5_0= RULE_STRING
            {
            lv_teacherId_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_teacherId_5_0, grammarAccess.getCourseAccess().getTeacherIdSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"teacherId",
            						lv_teacherId_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getCourseAccess().getDurationKeyword_6());
            		
            // InternalCourseScheduler.g:239:3: ( (lv_duration_7_0= RULE_INT ) )
            // InternalCourseScheduler.g:240:4: (lv_duration_7_0= RULE_INT )
            {
            // InternalCourseScheduler.g:240:4: (lv_duration_7_0= RULE_INT )
            // InternalCourseScheduler.g:241:5: lv_duration_7_0= RULE_INT
            {
            lv_duration_7_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_duration_7_0, grammarAccess.getCourseAccess().getDurationINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getCourseAccess().getHKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getCourseAccess().getSessionsKeyword_9());
            		
            // InternalCourseScheduler.g:265:3: ( (lv_sessions_10_0= RULE_INT ) )
            // InternalCourseScheduler.g:266:4: (lv_sessions_10_0= RULE_INT )
            {
            // InternalCourseScheduler.g:266:4: (lv_sessions_10_0= RULE_INT )
            // InternalCourseScheduler.g:267:5: lv_sessions_10_0= RULE_INT
            {
            lv_sessions_10_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_sessions_10_0, grammarAccess.getCourseAccess().getSessionsINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sessions",
            						lv_sessions_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getCourseAccess().getStudent_countKeyword_11());
            		
            // InternalCourseScheduler.g:287:3: ( (lv_studentCount_12_0= RULE_INT ) )
            // InternalCourseScheduler.g:288:4: (lv_studentCount_12_0= RULE_INT )
            {
            // InternalCourseScheduler.g:288:4: (lv_studentCount_12_0= RULE_INT )
            // InternalCourseScheduler.g:289:5: lv_studentCount_12_0= RULE_INT
            {
            lv_studentCount_12_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_studentCount_12_0, grammarAccess.getCourseAccess().getStudentCountINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"studentCount",
            						lv_studentCount_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getCourseAccess().getDayKeyword_13());
            		
            // InternalCourseScheduler.g:309:3: ( (lv_day_14_0= ruleDay ) )
            // InternalCourseScheduler.g:310:4: (lv_day_14_0= ruleDay )
            {
            // InternalCourseScheduler.g:310:4: (lv_day_14_0= ruleDay )
            // InternalCourseScheduler.g:311:5: lv_day_14_0= ruleDay
            {

            					newCompositeNode(grammarAccess.getCourseAccess().getDayDayEnumRuleCall_14_0());
            				
            pushFollow(FOLLOW_14);
            lv_day_14_0=ruleDay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCourseRule());
            					}
            					set(
            						current,
            						"day",
            						lv_day_14_0,
            						"org.aditi.course.scheduler.CourseScheduler.Day");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_15, grammarAccess.getCourseAccess().getBatchesKeyword_15());
            		
            otherlv_16=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_16, grammarAccess.getCourseAccess().getLeftSquareBracketKeyword_16());
            		
            // InternalCourseScheduler.g:336:3: ( (lv_batches_17_0= RULE_STRING ) )
            // InternalCourseScheduler.g:337:4: (lv_batches_17_0= RULE_STRING )
            {
            // InternalCourseScheduler.g:337:4: (lv_batches_17_0= RULE_STRING )
            // InternalCourseScheduler.g:338:5: lv_batches_17_0= RULE_STRING
            {
            lv_batches_17_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_batches_17_0, grammarAccess.getCourseAccess().getBatchesSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					addWithLastConsumed(
            						current,
            						"batches",
            						lv_batches_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCourseScheduler.g:354:3: (otherlv_18= ',' ( (lv_batches_19_0= RULE_STRING ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCourseScheduler.g:355:4: otherlv_18= ',' ( (lv_batches_19_0= RULE_STRING ) )
            	    {
            	    otherlv_18=(Token)match(input,22,FOLLOW_4); 

            	    				newLeafNode(otherlv_18, grammarAccess.getCourseAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalCourseScheduler.g:359:4: ( (lv_batches_19_0= RULE_STRING ) )
            	    // InternalCourseScheduler.g:360:5: (lv_batches_19_0= RULE_STRING )
            	    {
            	    // InternalCourseScheduler.g:360:5: (lv_batches_19_0= RULE_STRING )
            	    // InternalCourseScheduler.g:361:6: lv_batches_19_0= RULE_STRING
            	    {
            	    lv_batches_19_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    						newLeafNode(lv_batches_19_0, grammarAccess.getCourseAccess().getBatchesSTRINGTerminalRuleCall_18_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCourseRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"batches",
            	    							lv_batches_19_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_20=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_20, grammarAccess.getCourseAccess().getRightSquareBracketKeyword_19());
            		
            otherlv_21=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_21, grammarAccess.getCourseAccess().getPrefersKeyword_20());
            		
            otherlv_22=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_22, grammarAccess.getCourseAccess().getLeftSquareBracketKeyword_21());
            		
            // InternalCourseScheduler.g:390:3: ( (lv_prefers_23_0= ruleDay ) )
            // InternalCourseScheduler.g:391:4: (lv_prefers_23_0= ruleDay )
            {
            // InternalCourseScheduler.g:391:4: (lv_prefers_23_0= ruleDay )
            // InternalCourseScheduler.g:392:5: lv_prefers_23_0= ruleDay
            {

            					newCompositeNode(grammarAccess.getCourseAccess().getPrefersDayEnumRuleCall_22_0());
            				
            pushFollow(FOLLOW_16);
            lv_prefers_23_0=ruleDay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCourseRule());
            					}
            					add(
            						current,
            						"prefers",
            						lv_prefers_23_0,
            						"org.aditi.course.scheduler.CourseScheduler.Day");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCourseScheduler.g:409:3: (otherlv_24= ',' ( (lv_prefers_25_0= ruleDay ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCourseScheduler.g:410:4: otherlv_24= ',' ( (lv_prefers_25_0= ruleDay ) )
            	    {
            	    otherlv_24=(Token)match(input,22,FOLLOW_13); 

            	    				newLeafNode(otherlv_24, grammarAccess.getCourseAccess().getCommaKeyword_23_0());
            	    			
            	    // InternalCourseScheduler.g:414:4: ( (lv_prefers_25_0= ruleDay ) )
            	    // InternalCourseScheduler.g:415:5: (lv_prefers_25_0= ruleDay )
            	    {
            	    // InternalCourseScheduler.g:415:5: (lv_prefers_25_0= ruleDay )
            	    // InternalCourseScheduler.g:416:6: lv_prefers_25_0= ruleDay
            	    {

            	    						newCompositeNode(grammarAccess.getCourseAccess().getPrefersDayEnumRuleCall_23_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_prefers_25_0=ruleDay();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCourseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"prefers",
            	    							lv_prefers_25_0,
            	    							"org.aditi.course.scheduler.CourseScheduler.Day");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_26=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_26, grammarAccess.getCourseAccess().getRightSquareBracketKeyword_24());
            		
            otherlv_27=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_27, grammarAccess.getCourseAccess().getPreferred_sessionsKeyword_25());
            		
            otherlv_28=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_28, grammarAccess.getCourseAccess().getLeftSquareBracketKeyword_26());
            		
            // InternalCourseScheduler.g:446:3: ( (lv_preferredSessions_29_0= RULE_INT ) )
            // InternalCourseScheduler.g:447:4: (lv_preferredSessions_29_0= RULE_INT )
            {
            // InternalCourseScheduler.g:447:4: (lv_preferredSessions_29_0= RULE_INT )
            // InternalCourseScheduler.g:448:5: lv_preferredSessions_29_0= RULE_INT
            {
            lv_preferredSessions_29_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_preferredSessions_29_0, grammarAccess.getCourseAccess().getPreferredSessionsINTTerminalRuleCall_27_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourseRule());
            					}
            					addWithLastConsumed(
            						current,
            						"preferredSessions",
            						lv_preferredSessions_29_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalCourseScheduler.g:464:3: (otherlv_30= ',' ( (lv_preferredSessions_31_0= RULE_INT ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCourseScheduler.g:465:4: otherlv_30= ',' ( (lv_preferredSessions_31_0= RULE_INT ) )
            	    {
            	    otherlv_30=(Token)match(input,22,FOLLOW_8); 

            	    				newLeafNode(otherlv_30, grammarAccess.getCourseAccess().getCommaKeyword_28_0());
            	    			
            	    // InternalCourseScheduler.g:469:4: ( (lv_preferredSessions_31_0= RULE_INT ) )
            	    // InternalCourseScheduler.g:470:5: (lv_preferredSessions_31_0= RULE_INT )
            	    {
            	    // InternalCourseScheduler.g:470:5: (lv_preferredSessions_31_0= RULE_INT )
            	    // InternalCourseScheduler.g:471:6: lv_preferredSessions_31_0= RULE_INT
            	    {
            	    lv_preferredSessions_31_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            	    						newLeafNode(lv_preferredSessions_31_0, grammarAccess.getCourseAccess().getPreferredSessionsINTTerminalRuleCall_28_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCourseRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"preferredSessions",
            	    							lv_preferredSessions_31_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_32=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getCourseAccess().getRightSquareBracketKeyword_29());
            		

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
    // $ANTLR end "ruleCourse"


    // $ANTLR start "entryRuleRoom"
    // InternalCourseScheduler.g:496:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalCourseScheduler.g:496:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalCourseScheduler.g:497:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalCourseScheduler.g:503:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'room' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'available' otherlv_5= '[' ( (lv_availability_6_0= ruleAvailability ) ) (otherlv_7= ',' ( (lv_availability_8_0= ruleAvailability ) ) )* otherlv_9= ']' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_capacity_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_availability_6_0 = null;

        EObject lv_availability_8_0 = null;



        	enterRule();

        try {
            // InternalCourseScheduler.g:509:2: ( (otherlv_0= 'room' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'available' otherlv_5= '[' ( (lv_availability_6_0= ruleAvailability ) ) (otherlv_7= ',' ( (lv_availability_8_0= ruleAvailability ) ) )* otherlv_9= ']' ) )
            // InternalCourseScheduler.g:510:2: (otherlv_0= 'room' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'available' otherlv_5= '[' ( (lv_availability_6_0= ruleAvailability ) ) (otherlv_7= ',' ( (lv_availability_8_0= ruleAvailability ) ) )* otherlv_9= ']' )
            {
            // InternalCourseScheduler.g:510:2: (otherlv_0= 'room' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'available' otherlv_5= '[' ( (lv_availability_6_0= ruleAvailability ) ) (otherlv_7= ',' ( (lv_availability_8_0= ruleAvailability ) ) )* otherlv_9= ']' )
            // InternalCourseScheduler.g:511:3: otherlv_0= 'room' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'available' otherlv_5= '[' ( (lv_availability_6_0= ruleAvailability ) ) (otherlv_7= ',' ( (lv_availability_8_0= ruleAvailability ) ) )* otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
            		
            // InternalCourseScheduler.g:515:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalCourseScheduler.g:516:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalCourseScheduler.g:516:4: (lv_name_1_0= RULE_STRING )
            // InternalCourseScheduler.g:517:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoomAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getCapacityKeyword_2());
            		
            // InternalCourseScheduler.g:537:3: ( (lv_capacity_3_0= RULE_INT ) )
            // InternalCourseScheduler.g:538:4: (lv_capacity_3_0= RULE_INT )
            {
            // InternalCourseScheduler.g:538:4: (lv_capacity_3_0= RULE_INT )
            // InternalCourseScheduler.g:539:5: lv_capacity_3_0= RULE_INT
            {
            lv_capacity_3_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_capacity_3_0, grammarAccess.getRoomAccess().getCapacityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"capacity",
            						lv_capacity_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getRoomAccess().getAvailableKeyword_4());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalCourseScheduler.g:563:3: ( (lv_availability_6_0= ruleAvailability ) )
            // InternalCourseScheduler.g:564:4: (lv_availability_6_0= ruleAvailability )
            {
            // InternalCourseScheduler.g:564:4: (lv_availability_6_0= ruleAvailability )
            // InternalCourseScheduler.g:565:5: lv_availability_6_0= ruleAvailability
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getAvailabilityAvailabilityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_availability_6_0=ruleAvailability();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					add(
            						current,
            						"availability",
            						lv_availability_6_0,
            						"org.aditi.course.scheduler.CourseScheduler.Availability");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCourseScheduler.g:582:3: (otherlv_7= ',' ( (lv_availability_8_0= ruleAvailability ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCourseScheduler.g:583:4: otherlv_7= ',' ( (lv_availability_8_0= ruleAvailability ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_13); 

            	    				newLeafNode(otherlv_7, grammarAccess.getRoomAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCourseScheduler.g:587:4: ( (lv_availability_8_0= ruleAvailability ) )
            	    // InternalCourseScheduler.g:588:5: (lv_availability_8_0= ruleAvailability )
            	    {
            	    // InternalCourseScheduler.g:588:5: (lv_availability_8_0= ruleAvailability )
            	    // InternalCourseScheduler.g:589:6: lv_availability_8_0= ruleAvailability
            	    {

            	    						newCompositeNode(grammarAccess.getRoomAccess().getAvailabilityAvailabilityParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_availability_8_0=ruleAvailability();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRoomRule());
            	    						}
            	    						add(
            	    							current,
            	    							"availability",
            	    							lv_availability_8_0,
            	    							"org.aditi.course.scheduler.CourseScheduler.Availability");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRoomAccess().getRightSquareBracketKeyword_8());
            		

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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleAvailability"
    // InternalCourseScheduler.g:615:1: entryRuleAvailability returns [EObject current=null] : iv_ruleAvailability= ruleAvailability EOF ;
    public final EObject entryRuleAvailability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvailability = null;


        try {
            // InternalCourseScheduler.g:615:53: (iv_ruleAvailability= ruleAvailability EOF )
            // InternalCourseScheduler.g:616:2: iv_ruleAvailability= ruleAvailability EOF
            {
             newCompositeNode(grammarAccess.getAvailabilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAvailability=ruleAvailability();

            state._fsp--;

             current =iv_ruleAvailability; 
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
    // $ANTLR end "entryRuleAvailability"


    // $ANTLR start "ruleAvailability"
    // InternalCourseScheduler.g:622:1: ruleAvailability returns [EObject current=null] : ( ( (lv_day_0_0= ruleDay ) ) ( (lv_start_1_0= RULE_TIME ) ) otherlv_2= '-' ( (lv_end_3_0= RULE_TIME ) ) ) ;
    public final EObject ruleAvailability() throws RecognitionException {
        EObject current = null;

        Token lv_start_1_0=null;
        Token otherlv_2=null;
        Token lv_end_3_0=null;
        Enumerator lv_day_0_0 = null;



        	enterRule();

        try {
            // InternalCourseScheduler.g:628:2: ( ( ( (lv_day_0_0= ruleDay ) ) ( (lv_start_1_0= RULE_TIME ) ) otherlv_2= '-' ( (lv_end_3_0= RULE_TIME ) ) ) )
            // InternalCourseScheduler.g:629:2: ( ( (lv_day_0_0= ruleDay ) ) ( (lv_start_1_0= RULE_TIME ) ) otherlv_2= '-' ( (lv_end_3_0= RULE_TIME ) ) )
            {
            // InternalCourseScheduler.g:629:2: ( ( (lv_day_0_0= ruleDay ) ) ( (lv_start_1_0= RULE_TIME ) ) otherlv_2= '-' ( (lv_end_3_0= RULE_TIME ) ) )
            // InternalCourseScheduler.g:630:3: ( (lv_day_0_0= ruleDay ) ) ( (lv_start_1_0= RULE_TIME ) ) otherlv_2= '-' ( (lv_end_3_0= RULE_TIME ) )
            {
            // InternalCourseScheduler.g:630:3: ( (lv_day_0_0= ruleDay ) )
            // InternalCourseScheduler.g:631:4: (lv_day_0_0= ruleDay )
            {
            // InternalCourseScheduler.g:631:4: (lv_day_0_0= ruleDay )
            // InternalCourseScheduler.g:632:5: lv_day_0_0= ruleDay
            {

            					newCompositeNode(grammarAccess.getAvailabilityAccess().getDayDayEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_day_0_0=ruleDay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAvailabilityRule());
            					}
            					set(
            						current,
            						"day",
            						lv_day_0_0,
            						"org.aditi.course.scheduler.CourseScheduler.Day");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCourseScheduler.g:649:3: ( (lv_start_1_0= RULE_TIME ) )
            // InternalCourseScheduler.g:650:4: (lv_start_1_0= RULE_TIME )
            {
            // InternalCourseScheduler.g:650:4: (lv_start_1_0= RULE_TIME )
            // InternalCourseScheduler.g:651:5: lv_start_1_0= RULE_TIME
            {
            lv_start_1_0=(Token)match(input,RULE_TIME,FOLLOW_22); 

            					newLeafNode(lv_start_1_0, grammarAccess.getAvailabilityAccess().getStartTIMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAvailabilityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_1_0,
            						"org.aditi.course.scheduler.CourseScheduler.TIME");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getAvailabilityAccess().getHyphenMinusKeyword_2());
            		
            // InternalCourseScheduler.g:671:3: ( (lv_end_3_0= RULE_TIME ) )
            // InternalCourseScheduler.g:672:4: (lv_end_3_0= RULE_TIME )
            {
            // InternalCourseScheduler.g:672:4: (lv_end_3_0= RULE_TIME )
            // InternalCourseScheduler.g:673:5: lv_end_3_0= RULE_TIME
            {
            lv_end_3_0=(Token)match(input,RULE_TIME,FOLLOW_2); 

            					newLeafNode(lv_end_3_0, grammarAccess.getAvailabilityAccess().getEndTIMETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAvailabilityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_3_0,
            						"org.aditi.course.scheduler.CourseScheduler.TIME");
            				

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
    // $ANTLR end "ruleAvailability"


    // $ANTLR start "entryRuleTimeSlot"
    // InternalCourseScheduler.g:693:1: entryRuleTimeSlot returns [EObject current=null] : iv_ruleTimeSlot= ruleTimeSlot EOF ;
    public final EObject entryRuleTimeSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSlot = null;


        try {
            // InternalCourseScheduler.g:693:49: (iv_ruleTimeSlot= ruleTimeSlot EOF )
            // InternalCourseScheduler.g:694:2: iv_ruleTimeSlot= ruleTimeSlot EOF
            {
             newCompositeNode(grammarAccess.getTimeSlotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeSlot=ruleTimeSlot();

            state._fsp--;

             current =iv_ruleTimeSlot; 
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
    // $ANTLR end "entryRuleTimeSlot"


    // $ANTLR start "ruleTimeSlot"
    // InternalCourseScheduler.g:700:1: ruleTimeSlot returns [EObject current=null] : (otherlv_0= 'time_slot' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_start_2_0= RULE_TIME ) ) otherlv_3= '-' ( (lv_end_4_0= RULE_TIME ) ) ) ;
    public final EObject ruleTimeSlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_start_2_0=null;
        Token otherlv_3=null;
        Token lv_end_4_0=null;


        	enterRule();

        try {
            // InternalCourseScheduler.g:706:2: ( (otherlv_0= 'time_slot' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_start_2_0= RULE_TIME ) ) otherlv_3= '-' ( (lv_end_4_0= RULE_TIME ) ) ) )
            // InternalCourseScheduler.g:707:2: (otherlv_0= 'time_slot' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_start_2_0= RULE_TIME ) ) otherlv_3= '-' ( (lv_end_4_0= RULE_TIME ) ) )
            {
            // InternalCourseScheduler.g:707:2: (otherlv_0= 'time_slot' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_start_2_0= RULE_TIME ) ) otherlv_3= '-' ( (lv_end_4_0= RULE_TIME ) ) )
            // InternalCourseScheduler.g:708:3: otherlv_0= 'time_slot' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_start_2_0= RULE_TIME ) ) otherlv_3= '-' ( (lv_end_4_0= RULE_TIME ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeSlotAccess().getTime_slotKeyword_0());
            		
            // InternalCourseScheduler.g:712:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalCourseScheduler.g:713:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalCourseScheduler.g:713:4: (lv_name_1_0= RULE_STRING )
            // InternalCourseScheduler.g:714:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTimeSlotAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeSlotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCourseScheduler.g:730:3: ( (lv_start_2_0= RULE_TIME ) )
            // InternalCourseScheduler.g:731:4: (lv_start_2_0= RULE_TIME )
            {
            // InternalCourseScheduler.g:731:4: (lv_start_2_0= RULE_TIME )
            // InternalCourseScheduler.g:732:5: lv_start_2_0= RULE_TIME
            {
            lv_start_2_0=(Token)match(input,RULE_TIME,FOLLOW_22); 

            					newLeafNode(lv_start_2_0, grammarAccess.getTimeSlotAccess().getStartTIMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeSlotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_2_0,
            						"org.aditi.course.scheduler.CourseScheduler.TIME");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeSlotAccess().getHyphenMinusKeyword_3());
            		
            // InternalCourseScheduler.g:752:3: ( (lv_end_4_0= RULE_TIME ) )
            // InternalCourseScheduler.g:753:4: (lv_end_4_0= RULE_TIME )
            {
            // InternalCourseScheduler.g:753:4: (lv_end_4_0= RULE_TIME )
            // InternalCourseScheduler.g:754:5: lv_end_4_0= RULE_TIME
            {
            lv_end_4_0=(Token)match(input,RULE_TIME,FOLLOW_2); 

            					newLeafNode(lv_end_4_0, grammarAccess.getTimeSlotAccess().getEndTIMETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeSlotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.aditi.course.scheduler.CourseScheduler.TIME");
            				

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
    // $ANTLR end "ruleTimeSlot"


    // $ANTLR start "entryRuleScheduleTrigger"
    // InternalCourseScheduler.g:774:1: entryRuleScheduleTrigger returns [String current=null] : iv_ruleScheduleTrigger= ruleScheduleTrigger EOF ;
    public final String entryRuleScheduleTrigger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScheduleTrigger = null;


        try {
            // InternalCourseScheduler.g:774:55: (iv_ruleScheduleTrigger= ruleScheduleTrigger EOF )
            // InternalCourseScheduler.g:775:2: iv_ruleScheduleTrigger= ruleScheduleTrigger EOF
            {
             newCompositeNode(grammarAccess.getScheduleTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScheduleTrigger=ruleScheduleTrigger();

            state._fsp--;

             current =iv_ruleScheduleTrigger.getText(); 
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
    // $ANTLR end "entryRuleScheduleTrigger"


    // $ANTLR start "ruleScheduleTrigger"
    // InternalCourseScheduler.g:781:1: ruleScheduleTrigger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'schedule' kw= 'auto' ) ;
    public final AntlrDatatypeRuleToken ruleScheduleTrigger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCourseScheduler.g:787:2: ( (kw= 'schedule' kw= 'auto' ) )
            // InternalCourseScheduler.g:788:2: (kw= 'schedule' kw= 'auto' )
            {
            // InternalCourseScheduler.g:788:2: (kw= 'schedule' kw= 'auto' )
            // InternalCourseScheduler.g:789:3: kw= 'schedule' kw= 'auto'
            {
            kw=(Token)match(input,31,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getScheduleTriggerAccess().getScheduleKeyword_0());
            		
            kw=(Token)match(input,32,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getScheduleTriggerAccess().getAutoKeyword_1());
            		

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
    // $ANTLR end "ruleScheduleTrigger"


    // $ANTLR start "ruleDay"
    // InternalCourseScheduler.g:803:1: ruleDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Mon' ) | (enumLiteral_1= 'Tue' ) | (enumLiteral_2= 'Wed' ) | (enumLiteral_3= 'Thu' ) | (enumLiteral_4= 'Fri' ) | (enumLiteral_5= 'Sat' ) | (enumLiteral_6= 'Sun' ) ) ;
    public final Enumerator ruleDay() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalCourseScheduler.g:809:2: ( ( (enumLiteral_0= 'Mon' ) | (enumLiteral_1= 'Tue' ) | (enumLiteral_2= 'Wed' ) | (enumLiteral_3= 'Thu' ) | (enumLiteral_4= 'Fri' ) | (enumLiteral_5= 'Sat' ) | (enumLiteral_6= 'Sun' ) ) )
            // InternalCourseScheduler.g:810:2: ( (enumLiteral_0= 'Mon' ) | (enumLiteral_1= 'Tue' ) | (enumLiteral_2= 'Wed' ) | (enumLiteral_3= 'Thu' ) | (enumLiteral_4= 'Fri' ) | (enumLiteral_5= 'Sat' ) | (enumLiteral_6= 'Sun' ) )
            {
            // InternalCourseScheduler.g:810:2: ( (enumLiteral_0= 'Mon' ) | (enumLiteral_1= 'Tue' ) | (enumLiteral_2= 'Wed' ) | (enumLiteral_3= 'Thu' ) | (enumLiteral_4= 'Fri' ) | (enumLiteral_5= 'Sat' ) | (enumLiteral_6= 'Sun' ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 35:
                {
                alt7=3;
                }
                break;
            case 36:
                {
                alt7=4;
                }
                break;
            case 37:
                {
                alt7=5;
                }
                break;
            case 38:
                {
                alt7=6;
                }
                break;
            case 39:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCourseScheduler.g:811:3: (enumLiteral_0= 'Mon' )
                    {
                    // InternalCourseScheduler.g:811:3: (enumLiteral_0= 'Mon' )
                    // InternalCourseScheduler.g:812:4: enumLiteral_0= 'Mon'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDayAccess().getMonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDayAccess().getMonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCourseScheduler.g:819:3: (enumLiteral_1= 'Tue' )
                    {
                    // InternalCourseScheduler.g:819:3: (enumLiteral_1= 'Tue' )
                    // InternalCourseScheduler.g:820:4: enumLiteral_1= 'Tue'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDayAccess().getTueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDayAccess().getTueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCourseScheduler.g:827:3: (enumLiteral_2= 'Wed' )
                    {
                    // InternalCourseScheduler.g:827:3: (enumLiteral_2= 'Wed' )
                    // InternalCourseScheduler.g:828:4: enumLiteral_2= 'Wed'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDayAccess().getWedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDayAccess().getWedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCourseScheduler.g:835:3: (enumLiteral_3= 'Thu' )
                    {
                    // InternalCourseScheduler.g:835:3: (enumLiteral_3= 'Thu' )
                    // InternalCourseScheduler.g:836:4: enumLiteral_3= 'Thu'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDayAccess().getThuEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDayAccess().getThuEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCourseScheduler.g:843:3: (enumLiteral_4= 'Fri' )
                    {
                    // InternalCourseScheduler.g:843:3: (enumLiteral_4= 'Fri' )
                    // InternalCourseScheduler.g:844:4: enumLiteral_4= 'Fri'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDayAccess().getFriEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDayAccess().getFriEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCourseScheduler.g:851:3: (enumLiteral_5= 'Sat' )
                    {
                    // InternalCourseScheduler.g:851:3: (enumLiteral_5= 'Sat' )
                    // InternalCourseScheduler.g:852:4: enumLiteral_5= 'Sat'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDayAccess().getSatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDayAccess().getSatEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalCourseScheduler.g:859:3: (enumLiteral_6= 'Sun' )
                    {
                    // InternalCourseScheduler.g:859:3: (enumLiteral_6= 'Sun' )
                    // InternalCourseScheduler.g:860:4: enumLiteral_6= 'Sun'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDayAccess().getSunEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDayAccess().getSunEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleDay"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000C4001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});

}