import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter txt: ");
        String text = input.nextLine();

        // Like if else statment
        // Mianly used w/ string and integers
        switch (text) {
            // Argumnets cant have conditions
            // Only static
            case "start":
                System.out.println("-- Mahcine Started --");
                // Use breaks after case to save time when running
                break;
            case "stop":
                System.out.println("-- Machine stopped --");
                break;
            default:
                System.out.println("-- Command not recognized --");
        }
    }
}
