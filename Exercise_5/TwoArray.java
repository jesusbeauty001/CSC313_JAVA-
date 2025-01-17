import java.util.Scanner;

public class TwoArray {
    public static void main(String[] args) {
        // Declare a 2D array of size 10x10
        int[][] array = new int[10][10];

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Loop to accept input from the user
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter a value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Print out the inputs using a nested for-each loop
        System.out.println("You entered:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}