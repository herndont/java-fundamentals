package inheritance;

import java.util.ArrayList;

public class Restaurant {
    public String name;
    public double stars;
    public String price;
    public ArrayList<Review> reviews;

    public Restaurant(String name, double stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.reviews = new ArrayList<>();

    }

    public void addReview(Review reviewInstance){
        reviews.add(reviewInstance);
        double starTotal = 0;
        for(int i = 0; i < reviews.size(); i++){
            double x = reviews.get(i).stars;
            starTotal = starTotal + x;
        }
        stars = starTotal / reviews.size();
    }

    public String toString() {
        String summary = "The Restaurant " + name + " has a rating of " + stars + " stars and a reference of " + price +
                " out of $$$$$ for price. The restaurant has " + reviews.size() + " reviews currently.";
        for (Review review : reviews) {
            summary = summary + "\n" + review.toString();
        }
        return summary;
    }
}
