package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2; // 1+ 2 = 3
        System.out.println("1 + 2 = " + result);

        result = result - 1;
        System.out.println("3 - 1 = " + result);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 10;
        System.out.println("20 / 10 = " + result);

        result = result % 3;
        System.out.println("20 % 3 = " + result);


        // result = result + 1
        result ++;
        System.out.println(result);

        result --;
        System.out.println(result);

        // result = result + 2
        result += 2;
        System.out.println(result);

        // result = result * 2
        result *= 2;
        System.out.println(result);

        boolean isAlean = false;

        if(isAlean == false) {
            System.out.println("it is an alien!");
        }

        int topScore = 100;
        if (topScore == 100){
            System.out.println("You Got Top Score!");
        }

        // and Operator
        int secondScore = 80;
        if (topScore > secondScore && topScore <= 100){
            System.out.println(" Greater than second and less than 100!");
        }
        // Or Operator
        if (topScore > secondScore || topScore < 100){
            System.out.println(" Greater than second");
        }

        // Ternary Operator
        boolean isCar = false;
        if (isCar){
            System.out.println("This is not suppose to happen!");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("was truue!");
        }

    }
}
