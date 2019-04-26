package inheritance;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void shopNameTest() {
        Shop rando = new Shop("Rando", "This place is just as it states, completely random in its merchandise", "$$");
        //Need to figure out what the testing error is here
        Assert.assertEqual("Shop Name: " + "Rando" + "Price: " + "$$" + "Description: " + "This place is just as it states, completely random in its merchandise", rando.getName());
        Assert.assertEqual("Shop Name: " + "Rando" + "Price: " + "$$" + "Description: " + "This place is just as it states, completely random in its merchandise", rando.getPrice());
        Assert.assertEqual("Shop Name: " + "Rando" + "Price: " + "$$" + "Description: " + "This place is just as it states, completely random in its merchandise", rando.getDescription());
    }
}