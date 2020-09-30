package com.bridgelabz.JunitTest;
import java.io.*;
import java.util.*;

public class MoodAnalyserMain{

    public String AnalyseMood(String message) throws MoodAnalyserException
    {
	try{
	if(message.length()==0)
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EMPTY,"Enter your mood type");
        if(message.contains(("sad")))
        {
            return "SAD";
        }
        else
            return "HAPPY";
    	}
	catch(NullPointerException e){
	throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NULL,"Enter your mood");
	}
	catch(IllegalArgumentException e){
	return "Illegal Exception";	
	}
	finally {
	System.out.println("Proper exception so we are in finally block");
	}
	
   }
    public static void main(String[] args) throws MoodAnalyserException {
       try {
           MoodAnalyserMain mood = new MoodAnalyserMain();
           System.out.println(mood.AnalyseMood(null));
       }
       catch (MoodAnalyserException e)
       {
           System.out.println(e.getMessage());
       }
	try {
           MoodAnalyserMain mood = new MoodAnalyserMain();
           System.out.println(mood.AnalyseMood("She is happy"));
       }
       catch (MoodAnalyserException e)
       {
           System.out.println(e.getMessage());
       }
	
    }
}