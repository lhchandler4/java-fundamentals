import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        pluralize("dog", 1);
        pluralize("cat", 2);
        pluralize("turtle", 0);

        flipNHeads(10);

        clock();
        
    }

    public static void pluralize(String x, int y) {
        if (y == 1) {
        System.out.println ("I own " + y + " " + x + ".");
        }else{ 
        System.out.println ("I own " + y + " " + x + "s.");
        }
    }

    public static void flipNHeads(int n) {
        Random f = new Random();
        
        int numHeads = 0;
        int totalNumFlips = 0;
        do {
            double result = f.nextDouble();
            if (result > 0.5) {
                System.out.println ("heads");
                numHeads++;
                totalNumFlips++;
             }else {
                System.out.println ("tails");
                totalNumFlips++;
                numHeads = 0;
            }
        } while (numHeads < n);
        System.out.println("It took " + totalNumFlips + " flips to flip " + n + " heads in a row");
    }

    public static void clock() {
        while(true){
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}