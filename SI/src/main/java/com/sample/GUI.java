package com.sample;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GUI {
    
   public static String askQuestionGUI(ArrayList<String> answ, String question){
    	String[] answers = (String[])answ.toArray(new String[answ.size()]);
    	int answerIndex = JOptionPane.showOptionDialog(null,
    											 question,
                                                 "Question",
                                                 JOptionPane.DEFAULT_OPTION,
                                                 JOptionPane.INFORMATION_MESSAGE,
                                                 null,
                                                 answers,
                                                 answers[0]);
        if(answerIndex<answ.size())
       		return answ.get(answerIndex);
        else
        	return null;
    }
    
   public static void showingRecommendationGUI(String recommendation){
	   JOptionPane.showMessageDialog(null,"Twoja rekomendacja to: "+recommendation);
   }
}
