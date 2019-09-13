package com.company;

public class SpecialRita {
    public static void main(String[] args)
    {
        int a = method1();
        System.out.println(a);
        double b = method2();
        System.out.println(b);

    }
    public static int method1 () {
        int x = 4;
        int y = 5;
        int z = x+y;
        return z;
    }
    public static double method2() {
        double x = 3.5;
        double y =8.2;
        double z = x+y;
    }
}
