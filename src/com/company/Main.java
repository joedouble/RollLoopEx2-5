package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int counter = 0;
        int roll = 0;
        boolean loopCondition = false;

        Random ran = new Random();

        do {
            roll = ran.nextInt();
            if (roll != 0) {
                counter++;
                loopCondition = true;
            } else {
                System.out.println("After " + counter + " rolls, roll is " + roll);
                loopCondition = false;
            }
        } while (loopCondition);

    }
}
