package inheritance;

public class Shop {
    public String name;
    public String description;
    public String price;


    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String toString() {
        return "Shop Name: " + name + "Price: " + price +
                "Description: ";
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getPrice(){
        return price;
    }
}