import java.util.Scanner;
public class AnimalPicker {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        
        while (valid == false) {
            System.out.println("\nWould you like to see a cat or a dog?");
            String choice = scan.nextLine();
            if (choice.equalsIgnoreCase ("cat")) {
                System.out.println( "/\\__/\\\n( o.o )\n > ^ <");
                valid = true;
            } else if (choice.equalsIgnoreCase("dog")) {
                System.out.println("  __      _\no'')}____//\n`_/      )\n(_(_/-(_/");
                valid = true;
            } else {
                System.out.print("Invalid response\n");
            }
        }
        scan.close();
    }
}