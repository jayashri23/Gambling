package gamblerGame;

import java.util.Random;

public class LooseOrWinHalfPercentStopGame {
    private static final int bet = 1;
    static void halfPercent() {
        int winCurrentBet = 0;
        int lostCurrentBet = 0;
        int stake =100;
        for (int i = 0; i <= stake/2; i++) {
            int playerCurrentBalance=stake;
            Random rand = new Random();
            int check = rand.nextInt(2);
            if (check == 1) {
                playerCurrentBalance++;
            } else {
                playerCurrentBalance--;
            }
            System.out.println(playerCurrentBalance);
        }
    }
        public static void main (String[] args){
            System.out.println("Gambler Plays the game upTo 50% loose or win for the day");
            halfPercent();
        }
    }

