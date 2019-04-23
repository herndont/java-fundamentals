package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void toStringTest() {
        Review r = new Review("This place was really REALLY gross!", "Nunya", 1);
        System.out.println(r.body);
        System.out.println(r.author);
        System.out.println(r.stars);

        //more needed here
    }
}