package basiclibrary;

import java.util.*;

public class Lab2 {

    public static int[] roll(int n) {
        int[] output = new int[n];
        Random r = new Random();
        for (int i = 0; i < output.length; i++){
            int resulting = r.nextInt(6) +1;
            output[i] = resulting;
        }
        return output;
    }


    public static boolean containsDuplicates(int[] numArr) {
        Arrays.sort(numArr);
        for(int i = 1; i < numArr.length; i++){
            if(numArr[i - 1] == numArr[i])
                return true;
        }
        return false;
    }


    public static float avgCalc(int[] numArr) {
        float sumOfNums = 0;
        for(int i = 0; i < numArr.length; i++) {
            sumOfNums += numArr[i];
        }
        System.out.println(sumOfNums / numArr.length);
        return (sumOfNums / numArr.length);
    }


    public static int[] calculateArrWithLowestAverage(int[][] arrArr ) {
        double arrWithLowestAverage = avgCalc(arrArr[0]);
        int lowestAvg = 0;

        for(int i = 0; i < arrArr.length; i++) {
            double thisArrayAverage = avgCalc(arrArr[i]);
            if( thisArrayAverage < lowestAvg) {
                arrWithLowestAverage = thisArrayAverage;
                lowestAvg = i;
            }
        }

        return arrArr[lowestAvg];
    }

    public int[] lowestAverage (int[][] arrs) {
        int[] ans = arrs[0];
        float minAvg = avgCalc(arrs[0]);
        for (int i = 1; i < arrs.length; i++) {
            float currentAverage = avgCalc(arrs[i]);
            if (currentAverage < minAvg) {
                minAvg = currentAverage;
                ans = arrs[i];
            }
        }
        return ans;
    }
}
