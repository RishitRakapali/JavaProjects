package Arrays.Basic;

public class LoopingArrays {
    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        String[] words = {"hello", "tree", "pencil", "mouse"};

        // Basic for loop
        for (int i = 0; i < words.length ; i++) {
            System.out.println(words[i]);
        }

        // For Each loop is used specifically with arrays
        for (String i: words) {
            System.out.println(i);
        }

    }
}
