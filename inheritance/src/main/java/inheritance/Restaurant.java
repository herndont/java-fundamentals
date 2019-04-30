package inheritance;

public class Restaurant {
    public String name;
    public double stars;
    public String price;

    public Restaurant(String name, double stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public String returnName() {
        return name;
    }

    public int getStars() {
        
    }

    public String toString() {
        return "The Restaurant " + name + " has a rating of " + stars + " stars and a reference of " + price +
                " out of 5 for price.";
    }
}
