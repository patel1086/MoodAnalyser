package com.bridgelabz.JunitTest;
import java.util.*;
import java.io.*;
public class MoodAnalyserException extends  Exception{

enum ExceptionType
{
    NULL,EMPTY;
}
ExceptionType e;
    public MoodAnalyserException(ExceptionType e,String message) {
        super(message);
        this.e=e;
    }
}