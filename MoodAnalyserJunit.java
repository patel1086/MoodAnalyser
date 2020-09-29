package com.bridgelabz.JunitTest;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;


public class MoodAnalyserTest {
    MoodAnalyserMain m=new MoodAnalyserMain();
    @Test
    public void if_sad_message_return_sad() throws Exception
    {
        String mood= m.analyseMood("'This is a sad message");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
    @Test
    public void if_happy_message_return_happy() throws Exception
    {
        String mood= m.analyseMood("'This is a happy message");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
    @Test
    public void if_not_sad_message_return_happy() throws Exception
    {
        String mood= m.analyseMood("'This is a message");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }


}