public class Main {

    public static void main(String[] args){

        //pluralize variables
        int animalCount = 5;
        String animalName = "dog";
        pluralize(animalCount, animalName);
        //pluralize system out
        System.out.println("I own " + animalCount + " " + pluralize(animalCount,"dog") + ".");

        //flipHeads variables
        int heads = 5;
        int n = 0;
        int Flips = 0;
        //flipHeads system out
        System.out.println("It took " + Flips + " flips to flip " + n + " heads in a row");
    }


    public static String pluralize(int animalCount, String animalName){
        if (animalCount > 1 || animalCount == 0) {
            animalName = animalName + "s";
        }
        return animalName;
    }


    public static void flipHeads(int n) {
        int Flips = 0;
        do{
            double number = Math.random();

            if (number > .5){
            Flips++;
            n++;
            System.out.println("Heads");
            } else {
            Flips++;
            System.out.println("Tails");
            }
        } while (n < int heads);
        return;
    }
}



