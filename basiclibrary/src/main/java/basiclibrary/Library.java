/*
 * This Java source file was generated by the Gradle 'init' task.
 */


package basiclibrary;

import java.util.Arrays;
import java.util.Random;

public class Library {
    public static void main(String[] args) {

        // start of dice game
        int n = 4; //number of rolls
        int m = 8;
        int o = 12;
        roll(n);
        roll(m);
        roll(o);


        // start of duplicate assignment

        // Should return True
        int[] array1 = new int[] {1, 2, 3, 4, 5, 6, 6, 7, 8};
        System.out.println(containsDuplicates(array1));

        //Should return False
        int[] array2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(containsDuplicates(array2));

        //Should return True
        int[] array3 = new int[] {1, 2, 3, 4, 5, 5, 5, 6, 7};
        System.out.println(containsDuplicates(array3));


        //starts averaging assignment
        System.out.println(arrayAverage(array1));
        System.out.println(arrayAverage(array2));
        System.out.println(arrayAverage(array3));


        //Start of Monthly Temperatures
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        
        double [] averages = weatherTemperatures(weeklyMonthTemperatures);
        System.out.println(getMin(averages));
    }




    public static int[] roll(int value) {
        Random rand = new Random();
        int[] rollingArray = new int[value]; //array of roll outcomes
        for (int i = 0; i < rollingArray.length; i++) {
            int outcome = rand.nextInt(7) + 1;
            rollingArray[i] = outcome;
        }
        System.out.println(Arrays.toString(rollingArray));
        return rollingArray;
    }

    public static boolean containsDuplicates(int[] input) {
            boolean value = false;
        for (int i =0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    value = true;
                    break;
                }else {
                    continue;
                }
            }
        }
        return value;
    }

    public static int arrayAverage(int[] input) {
        int total = 0;
        for (int i = 0; i < input.length; i++) {
            total = total + input[i];
        }
        return total/input.length;
    }

    public static double[] weatherTemperatures(int[][] input) {
        double averages[] = new double[input.length];
        double total[] = new double[input[0].length];
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                total[i] = sum + input[i][j];
            }
            averages[i] = total[i] / input.length;
        }
        return averages;
    }

        static double getMin(double[] averages){
            double minValue = averages[0];
            for(int k = 0; k < averages.length; k++){
                if(averages[k] < minValue){
                    minValue = averages[k];
                    System.out.println("The array with the smallest average is at indices "+ k);
                }
            }
            System.out.println("The average temperature for that indices or week was "+ minValue);
            return minValue;
        }

    }
//