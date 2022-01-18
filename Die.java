public class Die
{
    //paramaters
    private int num1;
    private int num2;


    //init variables
    public Die(){
        num1 = 0;
        num2 = 0;
    }

    //method

    public int Roll(){
        int num1 = (int)(Math.random() * 6) + 1;
        int num2 = (int)(Math.random() * 6) + 1;
        return num1 + num2;
    }
}