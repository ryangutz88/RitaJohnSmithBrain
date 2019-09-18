package com.company;

public class ClassWithAttributes {
    private int x;
    private double y;
    private String name;

    public ClassWithAttributes(int a, double b, String s)
    {
        x=a;
        y=b;
        name=s;
    }

    public String toString()
    {
        String s = name + " " + x + " " + y;
        return s;
    }

    public static void main(String [] args)
    {
        ClassWithAttributes c = new ClassWithAttributes(1, 2.0, "Jane");
        System.out.println(c);
    }
}
