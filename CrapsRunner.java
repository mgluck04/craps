import java.util.Scanner;

public class CrapsRunner {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = input.next();

        Die dice = new Die();
        boolean win = false;
        boolean lose = false;

        if(true)
        {
            int firstRoll = dice.Roll();
            System.out.print(firstRoll);
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
                int point = dice.Roll();
                System.out.print(point);
                if(firstRoll == point)
                {
                    win = true;
                }
                if(point == 7)
                {
                    lose = true;
                }
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
    }
}
