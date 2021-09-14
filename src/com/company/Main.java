package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declare variables
        double height;
        double weight;
        double bmi;
        // Assign values

        // Ask user to enter height and weight
        Scanner myinput = new Scanner(System.in);
        System.out.println("Enter height in M");
        height = myinput.nextDouble();
        System.out.println("Enter weight in KG");
        weight = myinput.nextDouble();

        // Divide height with 100 to get meters

        // Calculate BMI
        bmi = weight / (height*height);

        // Print to output
        System.out.println("Your BMI is "+bmi);
        if (bmi < 18.5) {
            System.out.println("you are underweight");
        }
        else if (bmi>=25 && bmi<=30){
            System.out.println("you are overweight");
        }
        else if (bmi > 30){
            System.out.println("you are super fat");
        }
        else System.out.println("you have a normal weight");

    }
}