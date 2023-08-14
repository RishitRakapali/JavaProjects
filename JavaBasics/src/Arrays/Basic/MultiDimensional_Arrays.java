package Arrays.Basic;

public class MultiDimensional_Arrays {
    public static void main(String[] args) {

        // Grid
        int[][] numbs = {
                {1, 2, 3, 4}, {10, 9, 8}, {5, 7, 6, 11, 15}
        };

        System.out.println(numbs[1][2]);
        
        // Change element
        numbs[0][1] = 38924;
        
        // Loop through grid
        for (int row = 0; row < numbs.length; row++) {
            for (int col = 0; col < numbs[row].length; col++) {
                System.out.print(numbs[row][col] + "\t");
            }
            System.out.println();
        }

    }
}
