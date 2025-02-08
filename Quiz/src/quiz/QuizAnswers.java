/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author NaeemFranks
 */
import java.util.Random;
public class QuizAnswers {
    
    private static String option1;
    private static String option2;
    private static String correctAnswer;
    private static String[] options = new String[3];
    private static Random ran = new Random();
    private static String A, B, C;
    private static int answer = 0;
    private static final int num = 3;
    private static final String answer1 = "Barry Allan";
    private static final String answer2 = "super speed";
    private static final String answer3 = "Thor";
    private static final String answer4 = " Lenard";
    private static final String answer5 = "Haward";
    private static final String answer6 = "Bow Wow";
    private static final String answer7 = " Sexual";
    private static final String answer8 = "hetty";
    private static final String answer9 = "Kenzi";
    private static final String answer10 = "America";
    private static final String answerS1 = "TINA TURNER";
    private static final String answerS2 = "HARVEY WALLBANGER";
    private static final String answerS3 = "ALASKA";
    private static final String answerS4 = "1967";
    private static final String answerS5 = "BANNOCKBURN";
    private static final String answerS6 = "COVENTRY";
    private static final String answerS7 = "ADDAMS FAMILY";
    private static final String answerS8 = "Black Beauty";
    private static final String answerS9 = "TEN";
    private static final String answerS10 = "BOB MARLEY";
    private static final String answer11 = "THE AFRICAN QUEEN ";
    private static final String answer12 = "SUGAR";
    private static final String answer13 = "TWEED";
    private static final String answer14 = "ROBIN COUSINS";
    private static final String answer15 = "1960";
    private static final String answer16 = "PELOTA ";
    private static final String answer17 = "LORRAINE CHASE";
    private static final String answer18 =  "MONTAGUE & CAPULET";
    private static final String answer19 =  "OVINE";
    private static final String answer20 = "LONELY STREET";
    private static final String answer21 = "FROM HERE TO ETERNITY";
    private static final String answer22 = "PEACH";
    private static final String answer23 = "ZURICH";
    private static final String answer24 = "JOHN SURTEES";
    private static final String answer25 = "MEMPHIS, TENNESSEE";
    private static final String answer26 = "BUCKINGHAMSHIRE";
    private static final String answer27 = "RUSS ABBOTT";
    private static final String answer28 = "PC PLOD";
    private static final String answer29 = "HERMAPHRODITE";
    private static final String answer30 = "JUKE BOX JURY";
    private static final String answer31 = "TOM, DICK, HARRY";
    private static final String answer32 = "BENEDICTINE";
    private static final String answer33 = "IBIZA";
    private static final String answer34 = "MARTINA NAVRATILOVA";
    private static final String answer35 = "KENYA";
    private static final String answer36 = "COINS";
    private static final String answer37 = "ANNE NIGHTINGALE";
    private static final String answer38 = "CAPTAIN NEMO";
    private static final String answer39 = "CAMELS";
    private static final String answer40 = "ERIC CLAPTON";
    private static final String answer41 = "ALIEN";
    private static final String answer42 = "SWEET CHESTNUTS";
    private static final String answer43 = "TIGRIS and EUPHRATES";
    private static final String answer44 = "CRICKET";
    private static final String answer45 = "SKEGNESS ";
    private static final String answer46 = "PASS SLIPPED STITCH OVER";
    private static final String answer47 = "CRINKLEY BOTTOM";
    private static final String answer48 = "MERRY WIVES OF WINDSOR";
    private static final String answer49 = "CALF";
    private static final String answer50 = "KENNY EVERETT";
    private static final String answer51 = "LIVE AND LET DIE ";
    private static final String answer52 = "NINE";
    private static final String answer53 = "LIZARD POINT";
    private static final String answer54 = "MIDDLEWEIGHT";
    private static final String answer55 = "SIR WALTER RALEIGH";
    private static final String answer56 = "PRIMA FACIE";
    private static final String answer57 = "SIMON TEMPLAR";
    private static final String answer58 = "BILLY BUNTER";
    private static final String answer59 = "PANTHER";
    private static final String answer60 = "FELIX MENDELSSHON";
    private static final String answer61 = "STEVE MCQUEEN";
    private static final String answer62 = "COURGETTES";
    private static final String answer63 = "SAN FRANCISCO BAY";
    private static final String answer64 = "RIVERSIDE";
    private static final String answer65 = "CHARLES GORDON";
    private static final String answer66 = "TINTAGEL";
    private static final String answer67 = "THE PRISONER";
    private static final String answer68 = "GREAT EXPECTATIONS";
    private static final String answer69 = "HOLT";
    private static final String answer70 = "WHITNEY HOUSTON";
    private static final String answer71 = "GREGORY PECK ";
    private static final String answer72 = "THIN STRIPS ";
    private static final String answer73 = "SUGAR LOAF";
    private static final String answer74 = "PAUL INCE";
    private static final String answer75 = "POSEIDON";
    private static final String answer76 = "CONTOUR";
    private static final String answer77 = "MR SPOCK";
    private static final String answer78 = "ANTON CHEKOV";
    private static final String answer79 = "GNU";
    private static final String answer80 = "FLOWERPOT MEN";
    private static final String answer81 = "DE LOREAN";
    private static final String answer82 = "TANTALUS";
    private static final String answer83 = "ALABAMA";
    private static final String answer84 = "REDSKINS";
    private static final String answer85 = "AMERICAN WAR OF INDEPENDENCE";
    private static final String answer86 = "FOUR YEARS";
    private static final String answer87 = "FENN STREET";
    private static final String answer88 = "IVANHOE";
    private static final String answer89 = "BEAVER"   ;                                                                                                                                                                                                                                                      
    private static final String answer90 = "PICCOLO";
    private static final String answer91 = "BLOFELD";
    private static final String answer92 = "NUTMEG";
    private static final String answer93 = "CHEVIOTS";
    private static final String answer94 = "GOLD" ;
    private static final String answer95 = "SHIRLEY WILLIAMS ";
    private static final String answer96 = "REFUGEES";
    private static final String answer97 = "MAX BYGRAVES";
    private static final String answer98 = "MR MICAWBER ";
    private static final String answer99 = "WEBBED";
    private static final String answer100 = "PAINT YOUR WAGON";
                    
    private static final String[][] answers = {{answer1,answer2,answer3,answer4,answer5
     ,answer6,answer7,answer8,answer9,answer10},
     {answerS1,answerS2,answerS3,answerS4,answerS5,answerS6,answerS7,answerS8,answerS9,answerS10}
    ,{answer11,answer12,answer13,answer14,answer15,answer16,answer17,answer18,answer19,answer20}
    ,{answer21,answer22,answer23,answer24,answer25 ,answer26,answer27,answer28,answer29,answer30}
    ,{answer31,answer32,answer33,answer34,answer35,answer36,answer37,answer38,answer39,answer40}
    ,{answer41,answer42,answer43,answer44,answer45,answer46,answer47,answer48,answer49,answer50}
    ,{answer51,answer52,answer53,answer54,answer55,answer56,answer57,answer58,answer59,answer60}
    ,{answer61,answer62,answer63,answer64,answer65,answer66,answer67,answer68,answer69,answer70}
    ,{answer71,answer72,answer73,answer74,answer75,answer76,answer77,answer78,answer79,answer80}
    ,{answer81,answer82,answer83,answer84,answer85,answer86,answer87,answer88,answer89,answer90}
    ,{answer91,answer92,answer93,answer94,answer95,answer96,answer97,answer98,answer99,answer100}};
    
    
    public static void setAnswer(int x,int y)
    {
         correctAnswer = answers[x][y];
    }
    
    public static String getAnswer()
    {
        return correctAnswer;
    }
    
    public static void setOptions(int x)
    {
        
        Random ran = new Random();
        final int LIMIT = 9;
        int num = ran.nextInt(LIMIT);
  
            option1 = answers[x][++num];
            option2 = answers[x][--num];
    }
    
    public static String getOption1()
    {
        return option1;
    }
    
    public static String getOption2()
    {
        return option2;
    }
    
    public static void decisions()
    {

        
            options[0] = QuizAnswers.getOption1();
            options[1] = QuizAnswers.getOption2();
            options[2] = QuizAnswers.getAnswer();
            
            A = options[ran.nextInt(num)];
            
            if(A.equals(options[0]))
            {
                answer = 2;
                B = options[2];
                C = options[1];
            }
            else if(A.equals(options[1]))
            {
                answer = 3;
                B = options[0];
                C = options[2];
            }
             if(A.equals(options[2]))
            {
                answer = 1;
                B = options[1];
                C = options[0];
            }
    }
    
    public static int getDecisionAnswer()
    {
        return answer;
    }
    
    public static String getDecisionA()
    {
        return A;
    }
    
    public static String getDecisionB()
    {
        return B;
    }
    
    public static String getDecisionC()
    {
        return C;
    }
}
