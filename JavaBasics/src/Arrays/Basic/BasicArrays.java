package Arrays.Basic;

public class BasicArrays {
    public static void main(String[] args) {

        // make array
        int[] newArray;

        // Allocate memory - The number is the length of the list
        newArray = new int[3];

        // Java make all values equal to 0 or null for strings when first creating an array
        System.out.println(0);

        newArray[0] = 10;
        newArray[1] = 20;
        newArray[2] = 30;

        System.out.println(newArray[0]);
        System.out.println(newArray[1]);
        System.out.println(newArray[2]);

        // Better way to initialize array
        int[] numbers = {6, 9, 5};
        String[] cars = {"Honda", "Nisaan", "Ford"};

        System.out.println(cars.length);
        System.out.println(cars);



    }
}
