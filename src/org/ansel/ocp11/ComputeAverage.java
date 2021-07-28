package org.ansel.ocp11;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ComputeAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input amount of number: ");

        final int NUMBER = input.nextInt();
        List<Double> doubleList = new LinkedList<>();

        System.out.println("Please input " + NUMBER + " numbers:");

        for (int i = 0; i < NUMBER; i++) {
            doubleList.add(input.nextDouble());
        }

        doubleList.stream().mapToDouble(d -> d).average().ifPresent(average -> {
            System.out.println("Average value of input " + NUMBER
                + " number is: \n"
                + average);
        });
    }
}
