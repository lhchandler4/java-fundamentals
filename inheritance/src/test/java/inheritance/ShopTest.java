package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void test_Shop_Constructor() {
        Shop a = new Shop("Safeway", "this is a grocery store", "$$");
        assertEquals("Should generate a shop with a new name", "Safeway", a.getName());
    }

    @Test
    public void test_toString_Shop() {
        Shop a = new Shop("Safeway", "this is a grocery store", "$$");
        Review m = new Review("Luke", 0.5, "No Toasted Cheez-Its", "Safeway");
        Review g = new Review("Chai", 3.5, "Pretty Good", "Safeway");
        a.addReview(m);
        a.addReview(g);
        assertEquals("Returns the String", "A shop named Safeway has a review average of 2.0 out of 2 reviews and is in the $$ price range. This shop is this is a grocery store", a.toString());
    }

    @Test
    public void test_Add_Two_Shop_Reviews() {
        Review p = new Review("Robert", 4.0, "Bad Scotch Selection", "7/11");
        Review m = new Review("Will", 2.0, "Beer was good", "7/11");
        Shop b = new Shop("7/11", "A convenient store.", "$");
        b.addReview(p);
        b.addReview(m);
        assertEquals("new number of Reviews should be 2", 2, b.getCummulReviews());
    }


}
