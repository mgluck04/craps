import java.util.Scanner;

public class CrapsRunner {
    public static void main(String[] args) {
        
        Die dice = new Die();
        boolean win = false;
        boolean lose = false;

        if(true)
        {
            int firstRoll = dice.Roll();
            if(firstRoll == 7 || firstRoll == 11)
            {
                win = true;
            }
            if(firstRoll == 2 || firstRoll == 3 || firstRoll == 12)
            {
                lose = true;
            }

        }
        for(int x = 0; x < 1000; x++)
        {
            System.out.println(dice.Roll());
        }
    }
}
