import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* Non efficient way
        System.out.println("Enter the number 5: ");
        int numb = scanner.nextInt();

        while(numb != 5) {
            System.out.println("Enter the number 5: ");
            numb = scanner.nextInt();
        }
        */

        int numb = 0;

        do {
            System.out.println("Enter the number 5: ");
            numb = scanner.nextInt();
        }
        while (numb != 5);

    }
}
