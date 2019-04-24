package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void toStringTest() {
        Restaurant r = new Restaurant("BK", 4, "$");
        System.out.println(r);

    }

    @Test
    public void restaurantCreatorTest(){
        Restaurant a = new Restaurant("Cherry St Coffee", 4, "$$");

    }
}