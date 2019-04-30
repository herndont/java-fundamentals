package inheritance;

public class Review {
    public String body;
    public String author;
    public double stars;

    public Review(String body, String author, double stars) {

        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public String toString() {
        return "Restaurant Review: " + body + " Rating Author:" + author + " Number of Stars given to the Restaurant: "
                + stars;
    }

}
