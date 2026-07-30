import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter the position: ");
        int pos = input.nextInt();

        if (pos < 0 || pos >= arr.length) {
            System.out.println("Index is out of range.");
        } else {
            int value = arr[pos];
            System.out.println("Element at index " + pos + " is: " + value);
        }

        input.close();
    }
}