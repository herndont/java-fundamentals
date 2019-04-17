public class Main {

    public static void main(String[] args) {

        //pluralize variables
        int animalCount = 5;
        String animalName = "dog";
        pluralize(animalCount, animalName);
        //pluralize system out
        System.out.println("I own " + animalCount + " " + pluralize(animalCount, "dog") + ".");

        //flipHeads variables
//        int heads = 5;
        int n = 5;
        //flipHeads system out
//        System.out.println("It took " + Flips + " flips to flip " + n + " heads in a row");
        System.out.println(flipNHeads(3));

    }


    public static String pluralize(int animalCount, String animalName) {
        if (animalCount > 1 || animalCount == 0) {
            animalName = animalName + "s";
        }
        return animalName;
    }

//Going to have to make sure that the heads are done in a row and not total.
    public static int flipNHeads(int n) {
        int Flips = 0;
        int i = 0;

        while (i < n) {
            double number = Math.random();
            System.out.println(number);
            if (number >= .5) {
                Flips++;
                n++;
                i++;
                System.out.println("Heads");
            } else {
                Flips++;
                System.out.println("Tails");
            }
        }
        return n;
    }
}

//        do{
//            double number = Math.random();
//
//            if (number > .5){
//            Flips++;
//            n++;
//            System.out.println("Heads");
//            } else {
//            Flips++;
//            System.out.println("Tails");
//            }
//        } while (n <  heads);





