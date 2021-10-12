package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "How are you?";
        System.out.println("Hello, Kaushik. " + myString);

        myString = myString + ", and what did you have for breakfast?";
        System.out.println(myString);

        myString = myString + " \u00A9 2021";
        System.out.println("Hello, Kaushik. " + myString);

        String myNumberString = "200";
        myNumberString = myNumberString + "300";
        System.out.println(myNumberString);


        // TypeCasting
        String myNum = "20";
        int myNu = Integer.parseInt(myNum);
        int myNum1  = 50;
        myNum1 = myNum1 + myNu;
        System.out.println(myNum);

    }
}