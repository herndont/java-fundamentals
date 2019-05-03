package inheritance;

import java.util.ArrayList;

public class Shop {
    public String name;
    public String description;
    public String price;
    public ArrayList<Review> reviews;



    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review reviewInstance){
        reviews.add(reviewInstance);
       }

    public String toString() {
        String summary = "Shop Name: " + name + " Price: " + price +
                " Description: " + description + ". This business has " + reviews.size() + " reviews currently.";

        for (Review review : reviews) {
            summary = summary + "\n" + review.toString();
        }
        return summary;
    }
}
