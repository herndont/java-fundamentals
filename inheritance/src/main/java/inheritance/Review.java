package inheritance;

public class Review {
    public String body;
    public String author;
    public double stars;
    public String extraData;

    public Review(String body, String author, double stars) {

        this.body = body;
        this.author = author;
        this.stars = stars;
        this.extraData = "";
    }

    public Review(String body, String author, double stars, String extraData) {

        this.body = body;
        this.author = author;
        this.stars = stars;
        this.extraData = extraData;
    }

    public String toString() {
        return "Business Review: " + body + " Rating Author: " + author + " Number of Stars given to the Business: "
                + stars + " This review was about " + (extraData!=""? extraData: "N/A");
    }

}
