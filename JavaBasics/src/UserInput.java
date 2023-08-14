// Have to import Scanner class
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner newInput = new Scanner(System.in);

        // Read User input
        String userName = newInput.nextLine();
        System.out.println(userName);

        // Use different Input Types to read other types of inputs
        int age = newInput.nextInt();
        System.out.println(age);

    }
}
