package inheritance;

import org.junit.Assert;
import org.junit.Test;

public class TheaterTest {

    @Test
    public void theaterToStringTest() {
        Theater t = new Theater("Marvelous Marvel");

        String actualValue = t.toString();
        Assert.assertNotNull(t);
        Assert.assertEquals(actualValue, "Theater Name: Marvelous Marvel.  Movies Showing: [] This theater currently has 0 reviews.");
    }

    @Test
    public void theaterAddReviewTest() {
        Theater t = new Theater("Marvelous Marvel Theater");
        t.addReview(new Review("This theater was clean and enjoyable", "Tilleroo", 5));
        t.addReview(new Review("Great for the kids!", "Susan", 4));

        String actualValue = t.toString();
        Assert.assertNotNull(t);
        Assert.assertEquals("Theater Name: Marvelous Marvel Theater.  Movies Showing: [] This theater currently has 2 reviews.\n" +
                "Business Review: This theater was clean and enjoyable Rating Author: Tilleroo Number of Stars given to the Business: 5.0 This review was about N/A\n" +
                "Business Review: Great for the kids! Rating Author: Susan Number of Stars given to the Business: 4.0 This review was about N/A", actualValue);
    }

    @Test
    public void theaterAddMoviesTest() {
        Theater t = new Theater("Marvelous Marvel Theater");
        t.addMovie("Avengers");
        t.addMovie("Spiderman");
        t.addMovie("Birds");

        t.addReview(new Review("This theater was clean and enjoyable", "Tilleroo", 5));
        t.addReview(new Review("Great for the kids!", "Susan", 4));

        String actualValue = t.toString();
        Assert.assertNotNull(t);
        Assert.assertEquals("Theater Name: Marvelous Marvel Theater.  Movies Showing: [Avengers, Spiderman, Birds] This theater currently has 2 reviews.\n" +
                "Business Review: This theater was clean and enjoyable Rating Author: Tilleroo Number of Stars given to the Business: 5.0 This review was about N/A\n" +
                "Business Review: Great for the kids! Rating Author: Susan Number of Stars given to the Business: 4.0 This review was about N/A", actualValue);


    }

    @Test
    public void theaterRemoveMoviesTest() {
        Theater t = new Theater("Marvelous Marvel Theater");
        t.addMovie("Avengers");
        t.addMovie("Spiderman");
        t.addMovie("Birds");
        t.removeMovie("Birds");

        t.addReview(new Review("This theater was clean and enjoyable", "Tilleroo", 5));
        t.addReview(new Review("Great for the kids!", "Susan", 4));

        String actualValue = t.toString();
        Assert.assertNotNull(t);
        Assert.assertEquals("Theater Name: Marvelous Marvel Theater.  Movies Showing: [Avengers, Spiderman] This theater currently has 2 reviews.\n" +
                "Business Review: This theater was clean and enjoyable Rating Author: Tilleroo Number of Stars given to the Business: 5.0 This review was about N/A\n" +
                "Business Review: Great for the kids! Rating Author: Susan Number of Stars given to the Business: 4.0 This review was about N/A", actualValue);


    }


}
