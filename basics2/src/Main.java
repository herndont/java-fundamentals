import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        //pluralize variables
        int animalCount = 0;
        String animalName = "dog";
        pluralize(animalCount, animalName);
        //pluralize system out
        System.out.println("I own " + animalCount + " " + pluralize(animalCount, "dog") + ".");

        //flipHeads system out
        System.out.println(flipNHeads(1));

        //Clock
        Clock();

    }


    public static String pluralize(int animalCount, String animalName) {
        if (animalCount > 1 || animalCount == 0) {
            animalName = animalName + "s";
        }
        return animalName;
    }


    public static int flipNHeads(int headCount) {
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
        System.out.println("It took " + flips + " flips to flip " + heads + " heads in a row.");
        return flips;
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





