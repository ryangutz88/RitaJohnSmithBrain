package com.company;

public class MathEx
{
    private static int timeLeft(int curHour, int curMin, int depHour, int depMin) {
        int d = depHour * 60;
        d = d + depMin;
        int e = curHour * 60;
        e = e + curMin;
        int f = d - e;
        int g = f/60;
        int h = f%60;
        System.out.println(g + " hours " + h + " minutes ");
        return d;
    }

    private static int dayOfWeek(int j1,int date)
    {
     int i = (date +j1) - 1;
     i =i%7;
     return i;
    }

    public static int swap(int x)
    {
        int y = x % 10;
        int a = x % 100 / 10;
        int b = x / 100;
        int c = b * 100 + y * 10 + a;
        return c;
    }

    public static void main(String[] args)
    {
        int z = swap(123);
        System.out.println(z);
        timeLeft(1, 15, 4, 36);
        timeLeft(1, 34, 8, 20);
        int j = dayOfWeek(0,1);
        System.out.println(j);
        j = dayOfWeek(0,14);
        System.out.println(j);
        j = dayOfWeek(6,22);
        System.out.println(j);
        j = dayOfWeek(5,4);
        System.out.println(j);
        j = dayOfWeek(1,24);
        System.out.println(j);
        j = dayOfWeek(2,1);
        System.out.println(j);
    }


}
