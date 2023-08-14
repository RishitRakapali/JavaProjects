public class StringBuilderBufferFormatting {
    public static void main(String[] args) {
        /*
       Inefficient will slow program down

        String info = "";

        info += "My name is Bob.";
        info += "";
        info += "I am a builder";
         */

        // More efficient
        StringBuilder sb = new StringBuilder();
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");
        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("Name is Roger")
                .append(" ")
                .append("I am a skydiver");
        System.out.println(s.toString());



        /////// Formatting /////////

        System.out.print("Some text.\tThat was a tab.\nThat was a newline");

        System.out.println(" More text. ");

        // Format integer
        System.out.printf("Total cost %d; quantity is %d\n", 5, 120);
        System.out.printf("Total cost %-10d; quantity is %7d\n", 5, 120);

        for (int i = 0; i < 20; i++) {
            System.out.printf("%-2d: some txt here\n", i);
        }

        // Format string
        for (int i = 0; i < 20; i++) {
            System.out.printf("%2d: %s\n", i, "some txtttx");
        }

        // Format floating point
        System.out.printf("Total value: %f\n", 5.6);
        // Length and width
        System.out.printf("Total value: %.2f\n", 5.696237812423342);
        System.out.printf("Total value: %10.2f\n", 5.6);
        System.out.printf("Total value: %-5.2f\n", 5.6);



    }
}
