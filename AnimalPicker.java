import java.util.Scanner;
public class AnimalPicker {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to see a cat or a dog?");
        String choice = scan.nextLine();
        if (choice.equalsIgnoreCase ("cat")) {
            System.out.println("ASCII cat");
        } else if (choice.equalsIgnoreCase("dog")) {
            System.out.println("ASCII dog");
        } else {
            System.out.print("Invalid response");
        }
        scan.close();
    }
}