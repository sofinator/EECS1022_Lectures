package ca.yorku.testbed.zero;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

public class lecture2
{
    @Test
    public void ex(){
        double a =  2.75;
        System.out.println("Value of a = "+a);
        int b = (int) a;
        // Notice how casting to int always rounds down on the number
        System.out.println("Value of b =" + b);
        int c = (int) Math.round(a);
        System.out.println("Value of c =" + c);
        String str = String.format("%.1f",a);
        System.out.println(str);
    }

    @Test
    public void ex2(){
        int a = 9;
        int b = 2;
        double z = a/b;
        // Notice how we get 4.0 not 4.5 because we divided two int's
        System.out.println(z);
        // Casting a to double fixes the problem
        z = (double) a/b;
        System.out.println("Z = " + z);
        // However,if we cast a/b with parentheses we get 4.0 again because we casted it after computing a/b
        double z1 = (double) (a/b);
        System.out.println("Z1 = " + z1);
    }

}
