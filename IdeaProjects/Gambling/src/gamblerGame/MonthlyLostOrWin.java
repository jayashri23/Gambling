package gamblerGame;
import java.util.Random;

public class MonthlyLostOrWin {
    private static final int stake=5;
    private static final int month=2;
    private static final int day=3;
    static void Monthly() {
        int win = 0;
        int num = 1;

        int lost =0;


        while (num <= month) {
            System.out.println("Month = " + num);
            int cnt = 1;
            while (cnt <= day) {
                System.out.println("Day= " + cnt);
                for (int i = 0; i <= stake; i++) {
                    Random rand = new Random();
                    int check = rand.nextInt(2);
                    if (check == 1) {
                        win++;
                    } else {
                        lost++;
                    }
                }
                System.out.println(win);
                System.out.println(lost);
                System.out.println();
                        int max = win;
                       int min = lost;
               if (max <= win)
                   max=win;
              else
                  System.out.println();
                if (min <= lost)
                   min=lost;
               else
                  System.out.println();
                cnt++;
            }num++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Calculating Win Or Lost In Month");
        Monthly();
    }
}


