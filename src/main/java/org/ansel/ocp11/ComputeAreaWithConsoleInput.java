package org.ansel.ocp11;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for radius:");
        double radius = input.nextDouble();
        System.out.println("The area for the circle of radius "
            + radius + " is: \n" + Math.PI * radius * 2);
    }
}
