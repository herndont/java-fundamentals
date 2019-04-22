import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        //pluralize variables
        int animalCount = 1;
        String animalName = "dog";
        pluralize(animalCount, animalName);

        int animalCount2 = 5;
        String animalName2 = "Raccoon";
        pluralize(animalCount2, animalName2);

        int animalCount3 = 25;
        String animalName3 = "Giraffe";
        pluralize(animalCount3, animalName3);

        //pluralize system out
        System.out.println("I own " + animalCount + " " + pluralize(animalCount, animalName) + ".");
        System.out.println("I own " + animalCount2 + " " + pluralize(animalCount2, animalName2) + ".");
        System.out.println("I own " + animalCount3 + " " + pluralize(animalCount3, animalName3) + ".");


        //flipHeads system out
        System.out.println(flipNHeads(1));
        System.out.println(flipNHeads(5));
        System.out.println(flipNHeads(3));

        //Clock
        Clock();

    }


    public static String pluralize(int animalCount, String animalName) {
        if (animalCount > 1 || animalCount == 0) {
            animalName = animalName + "s";
        }
        return animalName;
    }


    public static String flipNHeads(int headCount) {
        int flips = 0;
        int heads = 0;

        while (heads < headCount) {
            double number = Math.random();
            if (number >= .5) {
                heads++;
                System.out.println("Heads");
            } else {
                heads = 0;
                System.out.println("Tails");
            }
            flips++;
        }
        return ("It took " + flips + " flips to flip " + heads + " heads in a row.");
    }

    public static void Clock(){
        int lastSecPrinted = 0;
        while(true){
                LocalDateTime now = LocalDateTime.now();
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            if (lastSecPrinted != now.getSecond()) {
                System.out.println(time);
                lastSecPrinted = now.getSecond();
            }
        }
    }
}





