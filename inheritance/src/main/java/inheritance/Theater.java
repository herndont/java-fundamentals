package inheritance;

import java.util.ArrayList;

public class Theater {
    public String name;
    public ArrayList<String> movies;
    public ArrayList<Review> reviews;


    public Theater(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public void addMovie(String blockBusters) {
        movies.add(blockBusters);
    }

    public void removeMovie(String blockbusters) {
        movies.remove(blockbusters);
    }

    public void addReview(Review reviewInstance) {
        reviews.add(reviewInstance);
    }

    public String toString() {
        String summary = "Theater Name: " + name + ". " + " Movies Showing: " + movies + " This theater currently has " + reviews.size() + " reviews.";

        for (Review review : reviews) {
            summary = summary + "\n" + review.toString();
        }
        return summary;
    }
}


