import java.util.Scanner;

public class CrapsRunner {
    public static void main(String[] args) {

        Die dice = new Die();

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to play Craps?");
        String play = input.nextLine();
        if(play.equals("Y"))
        {
            System.out.println("Would you like to know how to play Craps?");
            String instructions = input.nextLine();

            if(instructions.equals("Y"))
            {
                System.out.println("On the first roll, if you get a 7 or an 11 you win");
                System.out.println("If you roll a 2, 3, or 12 at first you lose");
                System.out.println("If you roll a number different than those, you keep rolling untill you get the first number again or a 7");
                System.out.println("Type Roll to roll the die");
            }
        }
        while(play.equals("Y"))
        {
            
            boolean win = false;
            boolean lose = false;
            int firstRoll = dice.Roll();
            System.out.print(firstRoll + "");
            if(firstRoll == 7 || firstRoll == 11)
            {
                win = true;
            }
            if(firstRoll == 2 || firstRoll == 3 || firstRoll == 12)
            {
                lose = true;
            }
            while(!win && !lose)
            {
                input.next();
                int point = dice.Roll();
                System.out.print(point + "");
                if(firstRoll == point)
                {
                    win = true;
                }
                if(point == 7)
                {
                    lose = true;
                }
            }
            System.out.println("");
            if(win)
            {
                System.out.println("Congrats on winning!");
            }else{
                System.out.println("Game Over");
            }

            System.out.println("Do you want to play again?");
            play = input.next();
            }
        }
}
