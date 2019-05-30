package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class Lab3Test {
    @Test
    public void testFunctionality() {
        Lab3 classUndertest = new Lab3();
        int[][] inputArr = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String expectedOutput = "High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69\n";
        assertEquals("should return the string stating the high and low and temperature not included.", expectedOutput, classUndertest.tempFinder(inputArr));
    }

    @Test
    public void testTallyVotes() {
        Lab3 classUndertest = new Lab3();

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String expectedOutputB = "Bush";
        assertEquals("should return the string stating the high and low and temperature not included.", expectedOutputB, classUndertest.tally(votes));
    }
}
