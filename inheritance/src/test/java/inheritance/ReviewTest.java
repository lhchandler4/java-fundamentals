package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void test_Review_Constructor() {
        Review l = new Review("Bart", 3.1, "I was not impressed by this restaurant", "Olive Garden");
        assertEquals("Should generate a review with a new author", "Bart", l.getAuthor());
    }

    @Test
    public void test_toString_Review() {
        Review l = new Review("Bart", 3.1, "I was not impressed by this restaurant", "Olive Garden");
        assertEquals("Returns the String", "Bart reviewed this business and give it a review of 3.1. This is what they had to say: I was not impressed by this restaurant", l.toString());
    }
}
