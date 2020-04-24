package com.licking.heights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("The rules are easy.");
        System.out.println("A random number between 1 and 100 will be chosen.");
        System.out.println("You have to try and guess the number.");
        System.out.println("If you guess too low, I will let you know.");
        System.out.println("If you guess too high, I will also let you know.");
        System.out.println("Please type your guess");

        String answer;
        int generatedNumber = (int) (Math.random() * 100) + 1;
        int numberOfGuesses = 1;
        Scanner keyboard = new Scanner(System.in);
        int guess = keyboard.nextInt();
        if (guess < generatedNumber) {
            System.out.println("Too low!");
        } else if (guess > generatedNumber) {
            System.out.println("Too high!");
        } else {
            System.out.println("Congratulations! It only took you " + numberOfGuesses + " tries. Do you want to try again?");
        }
        do {
            System.out.println("Please type your guess");
            keyboard = new Scanner(System.in);
            guess = keyboard.nextInt();
            ++numberOfGuesses;
            if (guess < generatedNumber) {
                System.out.println("Too low!");
            } else if (guess > generatedNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! It only took you " + numberOfGuesses + " tries.");
            }
        }while (guess != generatedNumber) ;

            System.out.println("Maybe next time you'll do better . Do you want to play again? (Yes or No)");
            Scanner key = new Scanner(System.in);
            answer = key.next();
            if (answer.equals("yes")) {
                do {
                    main(args);
                } while (guess != generatedNumber);
            } else if (answer.equals("no")) {
                System.out.println("Thank you for playing!");
            }
        }
}