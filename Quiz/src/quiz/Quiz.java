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
import javax.swing.JOptionPane;

public class Quiz {

private static int correctAnswers = 0, incorrectAnswers = 0;
  
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Welcome to \n"
               + "Nemo's TV Series Quiz");
        displayQuestions();
       
        displayStats();
        
    }
    
    public static void displayQuestions()
    { 
        String userInput;
        final int LIMIT = 10;
        int answer;
        String A, B, C;

        for(int x = 0; x < LIMIT; ++x)
        {
            
            for(int y = 0; y < LIMIT; ++y)
            {
            QuizAnswers.setOptions(x);
            QuizAnswers.setAnswer(x, y);
            QuizAnswers.decisions();
            
             A = QuizAnswers.getDecisionA();
             B = QuizAnswers.getDecisionB();
             C = QuizAnswers.getDecisionC();
             answer = QuizAnswers.getDecisionAnswer();
            
             userInput =  JOptionPane.showInputDialog(null, QuizQuestions.questions(x, y) + "\n \n"
                            +  " A \t" + A + "\n"
                            +  " B \t" + B + "\n"
                            +  " C \t" + C);

        if(userInput.equalsIgnoreCase("A") || userInput.equalsIgnoreCase("B") 
        || userInput.equalsIgnoreCase("C"))
              checkAnswer(answer, userInput, A, B, C);
        else
            incorrectInput(userInput,x,y,A,B,C,answer);
        
            }
            
            QuizStats.levelComplete(x);
        }
    }
    
    
    public static void checkAnswer(int answer, String userInput, String A, String B, String C)
    {
        
        
                if(answer == 1)
        {
            if(userInput.equalsIgnoreCase("A"))
            {
                JOptionPane.showMessageDialog(null, " Correct! ");
                ++correctAnswers;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect \n"
                        + "The Correct Answer is A " + A);
                ++incorrectAnswers;
            }
        }
               else if(answer == 2)
        {
            if(userInput.equalsIgnoreCase("B"))
            {
                JOptionPane.showMessageDialog(null, " Correct! ");
                ++correctAnswers;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect \n"
                        + "The Correct Answer is B " + B);
                ++incorrectAnswers;
            }
        }
                if(answer == 3)
        {
            if(userInput.equalsIgnoreCase("C"))
            {
                JOptionPane.showMessageDialog(null, " Correct! ");
                ++correctAnswers;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect \n"
                        + "The Correct Answer is C " + C);
                ++incorrectAnswers;
            }
        }
         QuizStats.setCorrectAnswers(correctAnswers);
         QuizStats.setincorrectAnswers(incorrectAnswers);
         
    }

    public static void incorrectInput(String userInput, int x, int y, String A,String B, String C, int answer)
    {
        JOptionPane.showMessageDialog(null, "Sorry, " + userInput + "\n"
                + "is not a valid  option");
        
            userInput =  JOptionPane.showInputDialog(null, QuizQuestions.questions(x, y) + "\n \n"
                            +  " A \t" + A + "\n"
                            +  " B \t" + B + "\n"
                            +  " C \t" + C);

        if(userInput.equalsIgnoreCase("A") || userInput.equalsIgnoreCase("B") 
        || userInput.equalsIgnoreCase("C"))
              checkAnswer(answer, userInput, A, B, C);
        else
            incorrectInput(userInput,x,y,A,B,C,answer);
        
    }
    
    public static void displayStats()
    {
         JOptionPane.showMessageDialog(null, "Quiz Complete!"
                + "\nScore:"
                + "\n"
                 + "\nNumber of correct Answers :  " + QuizStats.getCorrectAnswers()
                + "\nNumber of Incorrect Answers :    " + QuizStats.getIncorrectAnswers()
                + "\n"
                + "\n You scored    "  + QuizStats.getScore() + "%");
    }
}
