package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Linter {


    public static void main(String[] args) {
        linterSemicolon("folder/resources/gates.js");
    }

    public static int linterSemicolon(String filePath) {
        int numOfErrors = 0;
        try {
            Scanner scan = new Scanner(new File(filePath));
            int lineNumber = 0;
            while (scan.hasNextLine()) {
                lineNumber++;
                String newLine = scan.nextLine();
                if (newLine.endsWith("{")
                        || newLine.endsWith("}")
                        || newLine.length() < 1
                        || newLine.contains("if")
                        || newLine.contains("else"))
                {
                    continue;
                } else if (!newLine.endsWith(";")) {
                    System.out.println(String.format("Line %d: Missing semicolon.", lineNumber));
                    numOfErrors++;
                }
            }

        } catch (FileNotFoundException e){
            numOfErrors = -1;
            System.out.println("File was not found.");
            System.out.println(e);
        }
        System.out.println(numOfErrors);
        return numOfErrors;
    }

}

