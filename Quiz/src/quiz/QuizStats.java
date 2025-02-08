/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import javax.swing.JOptionPane;

/**
 *
 * @author NaeemFranks
 */
public class QuizStats {
    
    private static int correctAnswers, incorrectAnswers;
    private static double score;
    private static final int total = correctAnswers + incorrectAnswers;
    
    
    public static void setCorrectAnswers(int x)
    {
        correctAnswers = x;
    }
    public static int getCorrectAnswers()
    {
        return correctAnswers;
    }
     public static void setincorrectAnswers(int x)
    {
        incorrectAnswers = x;
    }
     public static int getIncorrectAnswers()
     {
         return incorrectAnswers;
     }
         public static double getScore()
    {
        if(correctAnswers < 10)
        score = correctAnswers % 10 * 10;
        
        else if(correctAnswers == total)
            score = 100;
        
        return score;
    }
         
         public static void levelComplete(int x)
         {
             String userInput;
             
             JOptionPane.showMessageDialog(null, "CONGRADULATIONS! "
                     + "\n Level " + ++x + " Complete!");
             
             Quiz.displayStats();
         }
}
