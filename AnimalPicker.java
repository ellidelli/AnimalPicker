import java.util.Scanner;
public class AnimalPicker {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        
        while (valid == false) {
            System.out.println("\nWould you like to see a cat, dog, fish, frog, duck, or spider?");
            String choice = scan.nextLine();
            if (choice.equalsIgnoreCase ("cat")) {
                System.out.println( "/\\__/\\\n( o.o )\n > ^ <");
                valid = true;
            } else if (choice.equalsIgnoreCase("dog")) {
                System.out.println("  __      _\no'')}____//\n`_/      )\n(_(_/-(_/");
                valid = true;
            } else if (choice.equalsIgnoreCase("fish")) {
                System.out.println("               O  o\n                _\\_   o\n      >('>   \\\\/  o\\ .\n             //\\___=\n                ''");
                valid = true;
            } else if (choice.equalsIgnoreCase("frog")) {
                System.out.println("            _   _\n           (.)_(.)\n        _ (   _   ) _\n       / \\/`-----\'\\/ \\\njgs   )_/ /|\\   /|\\ \\_(");
                valid = true;
            } else if (choice.equalsIgnoreCase("duck")) {
                System.out.println("    __\n___( o)>\n\\ <_. )\n `---\'  ");
                valid = true;
            } else if (choice.equalsIgnoreCase("spider")) {
                System.out.println("  / _ \\\n\\_\\(_)/_/\n _//o\\\\_ \n  /   \\");
                valid = true;
            } else {
                System.out.print("Invalid response\n");
            }
        }
        scan.close();
    }
}