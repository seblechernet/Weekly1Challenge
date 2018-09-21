package com.seb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Instantiating the Scanner object
        Scanner input = new Scanner(System.in);
        //Prompt the user for the number up to what they want to work
        System.out.println("Enter up to what number you want the program to work: ");
        //Read the user input as Integer and store in variable n
        int n = input.nextInt();
        //Set the first statement that will come on the out put
        System.out.println("1 is not a prime number");
        //Call the primeCheck Method to check the numbers up to n are prime or not
        for(int j=2;j<=n;j++){
            System.out.println (j + primeCheck(j));
        }


    }
    //int num is a variable that is used to pass a value to the method
    public static String primeCheck(int num) {
        String asentence = " is a prime number";
    //for the int numbre i up to n(excluding) check if n divided by i remainder is zero
        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) {
                asentence = " is not a prime number";
            }
        }

        return asentence;
    }

}








