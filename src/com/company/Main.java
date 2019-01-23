package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int a = 1;
        int b = 5;
        int c = 10;
        printRandomNumber(a);
        printRandomNumber(b);
        printRandomNumber(c);
    }

    private static void printRandomNumber(int max)
    {
        java.util.Random random = new java.util.Random();

        int number = random.nextInt(max);
        number = number + 1;
        System.out.println(number);
    }
}
