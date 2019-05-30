package basiclibrary;

import java.util.*;

public class Lab3 {

    public String tempFinder(int[][] inputArr) {
        int min = 100;
        int max = 0;
        String ans = "";
        HashSet<Integer> h = new HashSet();
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr[i].length; j++) {
                h.add(inputArr[i][j]);
                if (inputArr[i][j] > max)
                    max = inputArr[i][j];
                if (inputArr[i][j] < min)
                    min = inputArr[i][j];
            }
        }
        ans += ans.format("High: %s\nLow: %s\n", max, min);
        for(int k = min; k < max; k++){
            if(!h.contains(k)){
                ans += ans.format("Never saw temperature: %s\n",k);
            }
        }
        return ans;
    }

    public static String tally(List<String> arr){
        HashMap<String, Integer> votes = new HashMap();
        String[] plants = new String[]{"Bush", "Shrub", "Hedge"};
        for(String plant : plants){
            votes.put(plant, 0);
        }
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == "Bush"){
                int votesSoFar = votes.get("Bush");
                votes.put("Bush", votesSoFar + 1);
            } else if(arr.get(i) == "Shrub"){
                int votesSoFar = votes.get("Shrub");
                votes.put("Shrub", votesSoFar + 1);
            } else if(arr.get(i) == "Hedge"){
                int votesSoFar = votes.get("Hedge");
                votes.put("Hedge", votesSoFar + 1);
            }
        }
        int max = 0;
        String winner = "";
        for(String plant : plants){
            int count = votes.get(plant);
            if (count > max){
                max = count;
                winner = plant;
            }
        }
        return winner;
    }
}
