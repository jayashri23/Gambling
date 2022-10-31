package gamblerGame;

import java.util.Random;

public class WinOrLoose {
    public int check(int bet ) {
        
        System.out.println("Welcome To Gambler Game");
        Random rand = new Random();
        int x = rand.nextInt(2);
        if (x == 1) {
            System.out.println("Win $1 bet");
            return x;
        } else {
            System.out.println("Loose $1 bet");
            return 0;
        }
    }
    public static void main(String [] args){
        WinOrLoose result =new WinOrLoose();
        result.check(1);
    }
}
