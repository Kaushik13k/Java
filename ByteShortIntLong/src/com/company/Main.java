package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Max Value: " +myMaxIntValue);
        System.out.println("Integer Min Value: " +myMinIntValue);

        float myMinIntValue1 = Float.MIN_VALUE;
        float myMaxIntValue1 = Float.MAX_VALUE;
        System.out.println("Float Max Value: " +myMaxIntValue1);
        System.out.println("Float Min Value: " +myMinIntValue1);

        double myMinIntValue2 = Double.MIN_VALUE;
        double myMaxIntValue2 = Double.MAX_VALUE;
        System.out.println("Double Max Value: " +myMaxIntValue2);
        System.out.println("Double Min Value: " +myMinIntValue2);


        int intVal = 5 / 3;
        float floatVal = 5f / 3f;
        double doubleVal = 5d / 3f;

        System.out.println(intVal);
        System.out.println(floatVal);
        System.out.println(doubleVal);

        // Convert the pounds to kilograms

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the value in Pounds");
        double kilo = myScanner.nextDouble();

        double result = kilo * 0.45359237;
        System.out.println("Result is:" + result);
    }
}
