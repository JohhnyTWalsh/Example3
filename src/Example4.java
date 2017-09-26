import java.util.Scanner;

public class Example4 {
    public static void main(String args[]) {

            String name;
            float LengthOfRoom, BreadthOfRoom, CostPSqMeter, TotalAreaOfTheRoom,TotalCostOfCarpet;

            Scanner j = new Scanner(System.in);

            System.out.print("Please enter your name\n: ");
            name = j.nextLine();

            System.out.print("\nPlease enter the length of the room\n: ");
            LengthOfRoom = j.nextFloat();

            System.out.print("\nPlease enter the breadth of the room\n: ");
            BreadthOfRoom = j.nextFloat();

            System.out.print("\nPlease enter the cost per square metre\n: ");
            CostPSqMeter = j.nextFloat();

            TotalAreaOfTheRoom = (LengthOfRoom * BreadthOfRoom);
            TotalCostOfCarpet = (TotalAreaOfTheRoom * CostPSqMeter);

            System.out.println(String.format("\n\n%-40s %.2f\n%-40s %.2f\n%-40s %.2f\n%-40s %.2f\n%-40s %.2f",
                    "Length Of Room", LengthOfRoom,"Breadth Of Room",BreadthOfRoom, "Total Area Of The Room",TotalAreaOfTheRoom,"Cost Per Square Metre Of Carpet", CostPSqMeter, "Total Cost Of Carpet", TotalCostOfCarpet));

                    //"Length: " + LengthOfRoom + "\nBreadth: " + BreadthOfRoom +
            //"\nTotal Area Of The Room: " + TotalAreaOfTheRoom + "\nCost Per Square Metre Of Carpet: " + CostPSqMeter + "\nTotal Cost Of Carpet: " + TotalCostOfCarpet);


    }
}
