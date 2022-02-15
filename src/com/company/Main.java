package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[] dailyAverageTemp = new double[7];
        Scanner userInput = new Scanner(System.in);

        double[] dailyAverageTempCelsius = new double[7];

        for (int i = 0; i < dailyAverageTemp.length; i++) {
            System.out.println("Enter a temperature in Fahrenheit for day " + (i + 1));
            dailyAverageTemp[i] = userInput.nextDouble();
        }

        // change from Fahrenheit to Celcius...... (F - 32) / 1.8

        for (int i = 0; i < dailyAverageTempCelsius.length; i++) {
            dailyAverageTempCelsius[i]= (dailyAverageTemp[i] - 32) / 1.8;
        }


        //prints out each day in Fahrenheit
        System.out.println("Sunday: " + dailyAverageTemp[0] + "F and " + ", Monday: " + dailyAverageTemp[1] + "F, Tuesday: " +
                dailyAverageTemp[2] + ", Wednesday: " + dailyAverageTemp[3] + ", Thursday: " + dailyAverageTemp[4] +
                ", Friday: " + dailyAverageTemp[5] + ", Saturday: " + dailyAverageTemp[6]);

        //prints out each day in Celsius

        System.out.println("Sunday: " + dailyAverageTempCelsius[0] + "F and " + ", Monday: " + dailyAverageTempCelsius[1] + "F, Tuesday: " +
                dailyAverageTempCelsius[2] + ", Wednesday: " + dailyAverageTempCelsius[3] + ", Thursday: " + dailyAverageTempCelsius[4] +
                ", Friday: " + dailyAverageTempCelsius[5] + ", Saturday: " + dailyAverageTempCelsius[6]);

        //prints out average temp in Fahrenheit
        System.out.println("The average weekly temperature is: " + (dailyAverageTemp[0] + dailyAverageTemp[1] + dailyAverageTemp[2] + dailyAverageTemp[3] +
                dailyAverageTemp[4] + dailyAverageTemp[5] + dailyAverageTemp[6]) / 7);

        //prints out average temp in Celsius
        System.out.println("The average weekly temperature is: " + (dailyAverageTempCelsius[0] + dailyAverageTempCelsius[1] + dailyAverageTempCelsius[2] + dailyAverageTempCelsius[3] +
                dailyAverageTempCelsius[4] + dailyAverageTempCelsius[5] + dailyAverageTempCelsius[6]) / 7);
    }
}
