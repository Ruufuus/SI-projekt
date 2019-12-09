package com.sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base       	
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    public static void saving(String question,String answer) throws IOException{
        File file = new File("rezultat.json");
        FileWriter fr = new FileWriter(file,true);
        BufferedWriter br = new BufferedWriter(fr);
        PrintWriter saver = new PrintWriter(br);
        String rezult = new String();
        rezult = "\t\t{question:\""+question+"\",answer:\""+answer+"\"}";
        saver.println(rezult);
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
         saver.println("\t]");
         saver.println("}");
         saver.close();
    }
    
}
