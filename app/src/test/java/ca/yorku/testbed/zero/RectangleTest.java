package ca.yorku.testbed.zero;

import org.junit.Test;

public class RectangleTest
{
    @Test
    public void getAreaTest()
    {
        int w, h;
        System.out.println("Testing getArea:");
        //=====================================
        w = 4; h = 3;
        System.out.println(w + "," + h);
        System.out.println(Rectangle.getArea(w, h));
        System.out.println("---------------------");
        w = 2; h = 7;
        System.out.println(w + "," + h);
        System.out.println(Rectangle.getArea(w, h));
    }

    @Test
    public void getPerimeterTest()
    {
        int w, h;
        System.out.println("Testing getPerimeter:");
        //==========================================
        w = 4; h = 3;
        System.out.println(w + "," + h);
        System.out.println(Rectangle.getPerimeter(w, h));
        System.out.println("---------------------");
        w = 2; h = 7;
        System.out.println(w + "," + h);
        System.out.println(Rectangle.getPerimeter(w, h));
    }
}