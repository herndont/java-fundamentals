package inheritance;

import org.junit.Assert;
import org.junit.Test;

public class RestaurantTest {

    @Test
    public void restaurantToStringTest() {
        Restaurant r = new Restaurant("BK", 4, "$");

        String actualValue = r.toString();
        Assert.assertNotNull(r);
        Assert.assertEquals(actualValue, "The Restaurant BK has a rating of 4.0 stars and a reference of $ out of $$$$$ for price. The restaurant has 0 reviews currently.");
    }

    @Test
    public void restaurantStarTest() {
        Restaurant r = new Restaurant("BK", 4, "$");
        r.addReview(new Review("This place was really REALLY gross!", "Nunya", 1));
        r.addReview(new Review("Not really sure what it was I was eating, but it looked the same coming back up later.", "Nunya Biz", 0));
        r.addReview(new Review("This place made the cat puke and I ate the puke. I'm a dog though, so yeah", "Tilleroo", 5));

        String actualValue = r.toString();
        Assert.assertNotNull(r);
        Assert.assertEquals("The Restaurant BK has a rating of 2.0 stars and a reference of $ out of $$$$$ for price. The restaurant has 3 reviews currently.\n" +
                "Business Review: This place was really REALLY gross! Rating Author: Nunya Number of Stars given to the Business: 1.0 This review was about N/A\n" +
                "Business Review: Not really sure what it was I was eating, but it looked the same coming back up later. Rating Author: Nunya Biz Number of Stars given to the Business: 0.0 This review was about N/A\n" +
                "Business Review: This place made the cat puke and I ate the puke. I'm a dog though, so yeah Rating Author: Tilleroo Number of Stars given to the Business: 5.0 This review was about N/A", actualValue);
    }
}