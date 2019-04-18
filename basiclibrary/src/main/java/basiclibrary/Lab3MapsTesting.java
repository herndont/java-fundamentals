package basiclibrary;

import java.util.*;

public class Lab3MapsTesting {
    public static void main(String[] args) {

        //starts Seattle Weather hash set challenge
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        Set<Integer> weatherSeattle = new HashSet<>();
        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            for (int j = 0; j < weeklyMonthTemperatures[i].length; j++)
                weatherSeattle.add(weeklyMonthTemperatures[i][j]);
        }
        int obj = Collections.max(weatherSeattle);
        int obj2 = Collections.min(weatherSeattle);
        System.out.println("High: " + obj);
        System.out.println("Low :" + obj2);

        //calling the function
        findMissingNumbers(weatherSeattle, obj2, obj);

        //starts Tallying Election challenge
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        //calling the function
        tally(votes);
    }


    //starts Tallying Election challenge
    public static void tally(List<String> voteList){
        Map<String, Integer>
    }



    //starts Seattle Weather hash set challenge
    public static void findMissingNumbers(Set <Integer> weather, int low, int high) {
            for (int k =low; k <= high; k++) {
                if(!weather.contains(k)){
                    System.out.println("Never saw temperature: " + k);
                }
            }
        }

    }
