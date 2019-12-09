package com.sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JSonHandler {
	  public static void savingQuestion(String question,String answer) throws IOException{
	        File file = new File("rezultat.json");
	        FileWriter fr = new FileWriter(file,true);
	        BufferedWriter br = new BufferedWriter(fr);
	        PrintWriter saver = new PrintWriter(br);
	        String rezult = new String();
	        rezult = "\t\t{question:\""+question+"\",answer:\""+answer+"\"},";
	        saver.println(rezult);
	        saver.close();
	  }
	  public static void savingRecommendation(String recommendation) throws IOException {
	    	 File file = new File("rezultat.json");
	         FileWriter fr = new FileWriter(file,true);
	         BufferedWriter br = new BufferedWriter(fr);
	         PrintWriter saver = new PrintWriter(br);
	         saver.println("\t]");
	         saver.println("\trecommendation:\""+recommendation+"\"");
	         saver.close();
	    }
	    public static void preparingBeginingOfFile() throws FileNotFoundException {
	    	PrintWriter writer = new PrintWriter("rezultat.json");
	    	writer.println("{");
	    	writer.println("\tQuestions with answers:[");
	    	writer.close();
	    }
	    public static void preparingEndOfFile() throws IOException {
	    	 File file = new File("rezultat.json");
	         FileWriter fr = new FileWriter(file,true);
	         BufferedWriter br = new BufferedWriter(fr);
	         PrintWriter saver = new PrintWriter(br);
	         saver.println("}");
	         saver.close();
	    }
}
