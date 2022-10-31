package gamblerGame;

public class LossDayWinDay {
    public static final int playerBalancePerDay = 100;

    public static final int betAmountPerGame = 1;
    public static final int wonCurrentBet = 1;
    public static final int lostCurrentBet = 0;
    public static final int numberOfDayPlayedInMonth = 20;

    public static void main(String[] args) {
        System.out.println("Welcome Gambling Simulation Program:");
        int investedAmount = numberOfDayPlayedInMonth * playerBalancePerDay;
        int totalEarnedOrLost = 0;
        int day = 1;
        int profitDays = 0;
        int lossDays = 0;
        while (day <= numberOfDayPlayedInMonth) {
            int playerCurrentBalance = playerBalancePerDay;
            System.out.println("Day" + day);

            while (playerCurrentBalance > 50 && playerCurrentBalance < 150) {
                //Choice 0 means lost current game ,1 means won current bet
                int choice = (int) (Math.random() * 10 % 2);
                switch (choice) {
                    case wonCurrentBet:
                        playerCurrentBalance++;
                        break;
                    case lostCurrentBet:
                        playerCurrentBalance--;
                        break;
                }
                System.out.println(playerCurrentBalance);
            }
            if (playerCurrentBalance == 50) {
                lossDays++;
            } else {
                profitDays++;
            }
            totalEarnedOrLost = totalEarnedOrLost + playerCurrentBalance;
            System.out.println("Day" + day+"Balance" + playerCurrentBalance);
            day++;
        }
        System.out.println("In this month you won for " + profitDays + "days and lost for " + lossDays);
        //display Monthly Earnings
        if (investedAmount <= totalEarnedOrLost) {
            int profit = totalEarnedOrLost - investedAmount;
            System.out.println("You earned " + profit + " in this month");
        }
        //Display Monthly loss
        if (investedAmount > totalEarnedOrLost) {
            int loss = investedAmount - totalEarnedOrLost;
            System.out.println("You Lost " + loss + " in the month");
        }
    }
}

