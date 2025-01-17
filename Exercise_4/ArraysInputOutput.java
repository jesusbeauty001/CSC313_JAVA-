import java.util.Scanner;
public class ArraysInputOutput {
 public static void main(String[] args){
    int[] array = new int[10];

    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < array.length; i++){
        System.out.print("Enter a value for index " + i + ": ");
        array[i] = scanner.nextInt();
    }
    // Print out the inputs using a for-each loop
    System.out.println("You entered:");
    for (int value : array){
        System.out.println(value);
    }
    scanner.close();
 }
}
