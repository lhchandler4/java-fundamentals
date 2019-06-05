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

    

}
