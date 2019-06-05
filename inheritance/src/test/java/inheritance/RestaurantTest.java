package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void test_Restaurant_Constructor() {
        Restaurant o = new Restaurant("Olive Garden", 3.7, "$$");
        assertEquals("Should generate a restaurant with a new name", "Olive Garden", o.getName());
    }

    @Test
    public void test_toString_Restaurant() {
        Restaurant o = new Restaurant("Olive Garden", 3.7, "$$");
        Review m = new Review("Arthur", 2.5, "Eh", "Olive Garden");
        Review g = new Review("Austin", 3.5, "Pretty Good", "Olive Garden");
        o.addReview(m);
        o.addReview(g);
        assertEquals("Returns the String", "A restaurant named Olive Garden has a review average of 3.0 out of 2 reviews and is in the $$ price range", o.toString());
    }

    @Test
    public void test_Add_Two_Reviews() {
        Review p = new Review("Ben", 1.8, "Gross", "Bennigans");
        Review m = new Review("Tom", 2.3, "Eh", "Bennigans");
        Restaurant b = new Restaurant("Bennigans", 3.9, "$");
        b.addReview(p);
        b.addReview(m);
        assertEquals("new number of Reviews should be 2", 2, b.getCummulReviews());
    }

    @Test
    public void test_Add_Two_Diff_Rest_Reviews() {
        Review p = new Review("Ben", 1.8, "Gross", "Bennigans");
        Review m = new Review("Arthur", 4.1, "Pretty good", "Subway");
        Restaurant b = new Restaurant("Bennigans", 3.9, "$");
        b.addReview(p);
        b.addReview(m);
        assertEquals("new number of Reviews should be 1", 1, b.getCummulReviews());
    }


}
