package inheritance;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class TheatreTest {
    @Test
    public void test_Theatre_Constructor() {
        Theatre a = new Theatre("Downtown", new LinkedList<>());
        assertEquals("Should generate a theatre with a new name", "Downtown", a.getName());
    }

    @Test
    public void test_AddMovie() {
        LinkedList<String> testList = new LinkedList<String>();
        testList.add("ABC");
        Theatre a = new Theatre("Downtown", testList);
        a.addMovie("Zorro");
        a.addMovie("It");
        assertEquals("size of linked list should increase", 3, testList.size());
    }

    @Test
    public void test_RemoveMovie() {
        LinkedList<String> testList = new LinkedList<String>();
        testList.add("ABC");
        Theatre a = new Theatre("Downtown", testList);
        a.addMovie("Zorro");
        a.addMovie("It");
        a.removeMovie("It");
        assertEquals("size of linked list should decrease", 2, testList.size());
    }

    @Test
    public void test_ReviewTheatre() {
        LinkedList<String> testList = new LinkedList<String>();
        Theatre a = new Theatre("Downtown", testList);
        a.addMovie("Zorro");
        a.addMovie("It");
        Review m = new Review("Luke", 4.0, "Nice and clean", "Downtown", "Zorro");
        Review n = new Review("Bob", 2.0, "Dirty", "Downtown", "Zorro");
        a.addReview(m);
        a.addReview(n);
        assertEquals("Returns the String", "A theatre named Downtown has a review average of 3.0 out of 2 reviews. This theatre is showing [Zorro, It]", a.toString());
    }




}
