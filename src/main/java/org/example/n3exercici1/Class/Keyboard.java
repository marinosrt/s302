package org.example.n3exercici1.Class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Keyboard {

    public static int getInt(String message){
        Scanner sc = new Scanner(System.in);
        boolean correct = false;
        int input = 0;

        do {
            System.out.println(message);
            try {
                input = sc.nextInt();
                correct = true;
            } catch (InputMismatchException ex){
                System.out.println("Invalid input. Enter an integer.");
            }
            sc.nextLine();
        } while (!correct);

        return input;

    }

    public static double getDouble(String message){
        Scanner sc = new Scanner(System.in);
        boolean correct = false;
        double input = 0;

        do {
            System.out.println(message);
            try {
                input = sc.nextDouble();
                correct = true;
            } catch (InputMismatchException ex){
                System.out.println("Invalid input. Enter a double.");
            }
            sc.nextLine();
        } while(!correct);

        return input;
    }

}
