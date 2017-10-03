import java.util.Scanner;

public class Exercise7
{
    public static void main(String args[])
    {
        int EvenNum,CounterTrue=0,CounterFalse=0;
        char Validation;

        Scanner j = new Scanner(System.in);

        System.out.print("Please enter a number\n: ");
        EvenNum = j.nextInt();


        if(isEven(EvenNum) == false)
        {
            CounterFalse++;
        }
        else if(isEven(EvenNum) == true)
        {
            CounterTrue++;
        }


        while(EvenNum != -1)
        {
            System.out.print("Please enter a number\n: ");
            EvenNum = j.nextInt();

            if(isEven(EvenNum) == false)
            {
                CounterFalse++;
            }
            else
            {
                CounterTrue++;
            }
        }

      System.out.println("\n\nThe amount of even numbers\n: " + CounterTrue + ".\n\nThe amount of odd numbers\n: " + (CounterFalse - 1) + ".");
    }

    public static boolean isEven(int x)
    {
        if(x % 2 == 0)
        {

            return true;
        }
        else
        {
            return false;
        }
    }
}
