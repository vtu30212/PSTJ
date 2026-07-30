public class Task4 {

    public static void main(String[] args) {

        int[] arr = {25, 10, 45, 30, 60, 15};

        int largest = arr[0];

        for (int value : arr) {
            if (value > largest) {
                largest = value;
            }
        }

        System.out.println("Largest element = " + largest);
    }
}