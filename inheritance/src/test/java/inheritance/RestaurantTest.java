package inheritance;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert;

public class RestaurantTest {

    @Test
    public void restaurantToStringTest() {
        Restaurant r = new Restaurant("BK", 4, "$");
        System.out.println(r);

//        Assert.assertArrayEquals();
    }

    @Test
    public void restaurantCreatorTest(){
        Restaurant a = new Restaurant("Cherry St Coffee", 4, "$$");

    }
}