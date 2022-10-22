package gamblerGame;

public class Gambler {
    public void start(){
        System.out.println("Welcome To Gambler Game ");
        int stake =100;
        int bet =1;
        System.out.println("Start with \nstake" +stake+ "\nbet " +bet);

    }
    public static void main(String [] args){
        Gambler s =new Gambler();
        s.start();

    }
}
