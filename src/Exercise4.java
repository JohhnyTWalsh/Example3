import java.util.Scanner;
import java.io.*;

public class Exercise4 {
    public static void main(String args[])
    {

        String name, Str1, Uppercase;
        char Initial;
        int nameLength = 0, counter=0;




        Scanner j = new Scanner(System.in);

        System.out.print("Please enter your full name\n: ");
        name = j.nextLine();
        nameLength = name.length();
        Str1 = name;

        Initial = name.charAt(0);

        Uppercase = name.toUpperCase();

        for(int v = name.lastIndexOf(' ');nameLength < counter; counter++)
        {
            if(counter > v)
            {

            }
        }


        System.out.println("\nThe length of your name is: " + Str1.length() +"\nThe first initial is: " +Initial +
                "\nYour name in Uppercase: " + Uppercase);
    }
}



































