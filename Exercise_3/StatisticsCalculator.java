import java.util.Arrays;

public class StatisticsCalculator {
    public static void main(String[] args) {
        // Define the array
        int[] elements = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        // Calculate mean
        double mean = calculateMean(elements);
        System.out.println("Mean: " + mean);

        // Calculate median
        double median = calculateMedian(elements);
        System.out.println("Median: " + median);

        // Calculate standard deviation
        double standardDeviation = calculateStandardDeviation(elements, mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    // Method to calculate mean
    public static double calculateMean(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    // Method to calculate median
    public static double calculateMedian(int[] arr) {
        Arrays.sort(arr); // Sort the array
        int length = arr.length;

        if (length % 2 == 0) {
            // If even, median is the average of the two middle elements
            return (arr[length / 2 - 1] + arr[length / 2]) / 2.0;
        } else {
            // If odd, median is the middle element
            return arr[length / 2];
        }
    }

    // Method to calculate standard deviation
    public static double calculateStandardDeviation(int[] arr, double mean) {
        double sumOfSquares = 0.0;
        for (int num : arr) {
            sumOfSquares += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumOfSquares / arr.length);
    }
}
