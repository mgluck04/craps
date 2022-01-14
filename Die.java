public class Die
{
    //paramaters
    private int num;


    //init variables
    public Die(){
        num = (int)(Math.random() * 5) + 1;
    }

    //method

    public int diceRoll(){
        return num;
    }
}