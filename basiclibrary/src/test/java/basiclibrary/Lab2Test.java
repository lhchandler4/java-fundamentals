package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class Lab2Test {

    @Test
    public void test_lab2_roll_five(){
        Lab2 lab2test = new Lab2();
        assertTrue("test_lab2_roll_five should return 'true'", lab2test.roll(5).length == 5);
    }

    @Test
    public void test_lab2_roll_check_values() {
        Lab2 lab2test = new Lab2();
        int [] rollArray = lab2test.roll(5);
        for(int i = 0; i < rollArray.length; i++){
            assertTrue("each item should be between 1 and 6", 1 <= rollArray[i] && rollArray[i] <= 6);
        }
    }

    @Test
    public void test_lab2_duplicate_check_false(){
        Lab2 lab2test = new Lab2();
        assertFalse("should not have duplicates returns 'false'", lab2test.containsDuplicates(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test_lab2_duplicate_check_true(){
        Lab2 lab2test = new Lab2();
        assertTrue("should have duplicates returns 'true'", lab2test.containsDuplicates(new int[]{1,2,3,4,4,5}));
    }

    @Test
    public void test_lab2_average_check_correct(){
        Lab2 lab2test = new Lab2();
        assertEquals( "should return the average of '5.4'", lab2test.avgCalc(new int[]{1, 2, 3, 17, 4}), (float) 5.4, 0);
    }

    @Test
    public void test_lab2_average_check_false(){
        Lab2 lab2test = new Lab2();
        assertFalse("should return the average '5.4'", lab2test.avgCalc(new int[] {1,2,3,17,4}) == 5.4);
    }

    
}
