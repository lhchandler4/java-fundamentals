package linter;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FileNotFoundException;


public class LinterTest {

    @Test
    public void returnNumberOfErrors() {
        int ERROR_NUMBER = 46;
        assertEquals("testing to make sure error number is 46", ERROR_NUMBER, Linter.linterSemicolon("folder/resources/gates.js"));
    }

    @Test
    public void throwAnErrorForWrongFilePath() {
        assertEquals("testing to make sure error is thrown for file not found", -1, Linter.linterSemicolon("abcdefg"));
    }
}
