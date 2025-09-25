package com.example;
import java.util.Scanner;
import java.util.ArrayList;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW
        double newPercent = (double) percent / 100;

        double totalTip = (cost * newPercent);
        
        totalTip = (double) Math.round(totalTip * 100) / 100; // Learned this from stack overflow post comments: https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java
        double billCost = cost + totalTip;
        billCost = (double) Math.round(billCost * 100) / 100;
        double averageCost = cost / people;
        averageCost = (double) Math.round(averageCost * 100) / 100;
        double averageTip = totalTip/ people;
        averageTip = (double) Math.round(averageTip * 100) / 100;
        double billCost2 = cost * (1 + newPercent);
        double totalCostAverage = billCost2 / people;
        totalCostAverage = (double) Math.round(totalCostAverage * 100) / 100;



        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + totalTip + "\n" +
                       "Total Bill with tip: $" + billCost + "\n" +
                       "Per person cost before tip: $" + averageCost + "\n" +
                       "Tip per person: $" + averageTip + "\n" +
                       "Total cost per person: $" + totalCostAverage + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        boolean isDone = false;
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        double newPercent = (double) percent / 100;

        double totalTip = (cost * newPercent);
        
        totalTip = (double) Math.round(totalTip * 100) / 100; // Learned this from stack overflow post comments: https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java
        double billCost = cost + totalTip;
        billCost = (double) Math.round(billCost * 100) / 100;
        double averageCost = cost / people;
        averageCost = (double) Math.round(averageCost * 100) / 100;
        double averageTip = totalTip/ people;
        averageTip = (double) Math.round(averageTip * 100) / 100;
        double billCost2 = cost * (1 + newPercent);
        double totalCostAverage = billCost2 / people;
        totalCostAverage = (double) Math.round(totalCostAverage * 100) / 100;

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + totalTip + "\n" +
                       "Total Bill with tip: $" + billCost + "\n" +
                       "Per person cost before tip: $" + averageCost + "\n" +
                       "Tip per person: $" + averageTip + "\n" +
                       "Total cost per person: $" + totalCostAverage + "\n" +
                       "-------------------------------\n";
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        Scanner noodle = new Scanner(System.in);
        while (isDone != true) {
            System.out.println("Print a food item you want to add to your list. Enter -1 to quit");
            String item = noodle.nextLine();
            String escape = "1";
            if (item.equals(escape)){
                isDone = true;
            } else {

            }
    
        }

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
