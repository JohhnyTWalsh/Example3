import java.util.Scanner;
import java.io.*;

public class Exercise4 {
    public static void main(String args[])
    {

        String name, Str1, Uppercase, Str2;
        char Initial, Initial2;
        int nameLength = 0, counter=0,v, k, counter2=0, LengthName;




        Scanner j = new Scanner(System.in);

        System.out.print("Please enter your full name\n: ");
        name = j.nextLine();
        nameLength = name.length();
        Str1 = name;
        Str2 = name;
        Initial = name.charAt(0);

        Uppercase = name.toUpperCase();

        for(v = name.lastIndexOf(' ');nameLength < counter; counter++)
        {

        }
        for(k = 0; k < name.length();k++)
        {Initial2 = name.charAt(k);
            if(Initial2 == ' ')
            {
                counter2++;
            }
        }

       LengthName =  (Str1.length() - counter2);
        System.out.println("\nThe length of your name is: " + LengthName +"\nThe first initial is: " +Initial +
                "\nYour name in Uppercase: " + Uppercase + "\nYour last surname is: " + Str2.substring(v+1,nameLength));
    }
}



































