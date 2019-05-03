package inheritance;

import org.junit.Assert;
import org.junit.Test;


public class ShopTest {

    @Test
    public void shopNameTest() {
        Shop rando = new Shop("Rando", "This place is just as it states, completely random in its merchandise.", "$$");

        String actualValue = rando.toString();
        Assert.assertNotNull(rando);
        Assert.assertEquals("Shop Name: Rando Price: $$ Description: This place is just as it states, completely random in its merchandise.. This business has 0 reviews currently.", actualValue);
    }

    @Test
    public void addReviewTest() {
        Shop rando = new Shop("Rando", "This place is just as it states, completely random in its merchandise.", "$$");
        rando.addReview(new Review("Pretty hard to find anything of value in this store", "Tilleroo", 3));
        rando.addReview(new Review("I found some really awesome Christmas presents for all of my friends. Never would have thought of half of this stuff.", "Tilleroo", 5));

        String actualValue = rando.toString();
        Assert.assertNotNull(rando);
        Assert.assertEquals("Shop Name: Rando Price: $$ Description: This place is just as it states, completely random in its merchandise.. This business has 2 reviews currently.\n" +
                "Business Review: Pretty hard to find anything of value in this store Rating Author: Tilleroo Number of Stars given to the Business: 3.0 This review was about N/A\n" +
                "Business Review: I found some really awesome Christmas presents for all of my friends. Never would have thought of half of this stuff. Rating Author: Tilleroo Number of Stars given to the Business: 5.0 This review was about N/A", actualValue);
    }
}