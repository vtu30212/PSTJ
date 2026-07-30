import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Enter the number to search: ");
        int target = input.nextInt();

        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {

            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                index = middle;
                break;
            }

            if (target < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        input.close();
    }
}