package inheritance;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void toStringTest() {
        Review r = new Review("This place was really REALLY gross!", "Nunya", 1);

        String actualValue = r.toString();
        Assert.assertNotNull(r);
        Assert.assertEquals("Business Review: This place was really REALLY gross! Rating Author: Nunya Number of Stars given to the Business: 1.0 This review was about N/A", actualValue);
    }
}