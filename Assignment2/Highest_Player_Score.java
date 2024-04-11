
/*2. You have a file that stores data about players' scores they achieved in different matches against different teams at different points in time, You have to identify the highest score of each player among all the matches
If the entry is only a string that is the name of the player, and if the entry is pak_55_01_nov that implies the match against Pakistan scored 55 runs on November first.*/

import java.io.*;
import java.util.*;

public class Highest_Player_Score {
  public static void main(String[] args) {
    String filename = "Scores.csv";
    Map<String, Integer> playerScores = new HashMap<>();

    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] parts = line.split(",");
        int n = 1;
        if (parts.length > n) {
          String playerName = parts[0];
          for (int i = 1; i < parts.length; i++) {
            String[] matchData = parts[i].split("_");
            int x = 3;
            if (matchData.length == x) {
              int score = Integer.parseInt(matchData[1]);
              playerScores.put(playerName, Math.max(playerScores.getOrDefault(playerName, 0), score));
            }
          }
        }
      }
      for (Map.Entry<String, Integer> entry : playerScores.entrySet()) {
        System.out.println("Player: " + entry.getKey() + ", Highest Score: " + entry.getValue());
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
