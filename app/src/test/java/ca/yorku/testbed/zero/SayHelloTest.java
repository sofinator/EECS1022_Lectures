package ca.yorku.testbed.zero;

import org.junit.Test;

public class SayHelloTest
{
    @Test
    public void greetTest()
    {
        String testCase;
        System.out.println("Testing greet:");
        //===================================
        testCase = "EECS";
        System.out.println(testCase);
        System.out.println(SayHello.greet(testCase));
        System.out.println("---------------------");
        testCase = "York University";
        System.out.println(testCase);
        System.out.println(SayHello.greet(testCase));
    }
}