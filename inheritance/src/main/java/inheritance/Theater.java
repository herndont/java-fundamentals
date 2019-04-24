package inheritance;

public class Theater {
    public String name;
    //movies somehow... Looks like hashset online
    //probably need to implement reviews in this area as well

    public Theater(String name) {
        this.name = name;
    }

    public String toString() {
        return "Shop Name: " + name;
    }

    //Theater string is going to need to have the movies array or list within it
}


