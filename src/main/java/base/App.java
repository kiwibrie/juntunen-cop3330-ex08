package base;

/*
 *  UCF COP3330 Summer 2021 Assignment 8 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();

        int people = myApp.prompt("people");
        int pizzas = myApp.prompt("pizzas do you have");
        int slices = myApp.prompt("slices per pizza");
        int totalSlices = pizzas * slices;

        myApp.printConfirmation(people, pizzas, totalSlices);

        int personalPizza = myApp.calcDistribution(people, totalSlices);
        int leftovers = myApp.calcLeftovers(people, totalSlices);

        myApp.printOutput(personalPizza, leftovers);
    }

    public void printOutput(int personalPizza, int leftovers){
        System.out.printf("Each person gets %d pieces of pizza.\n", personalPizza);
        System.out.printf("There are %d leftover pieces.", leftovers);
    }

    public void printConfirmation(int people, int pizzas, int totalSlices){
        System.out.printf("%d people with %d pizzas (%d slices)\n",
                people, pizzas, totalSlices);
    }

    public int prompt(String prompt){
        System.out.printf("How many %s?\n", prompt);
        return in.nextInt();
    }

    public int calcDistribution(int people, int totalSlices){
        return totalSlices / people;
    }

    public int calcLeftovers(int people, int totalSlices){
        return totalSlices % people;
    }
}
