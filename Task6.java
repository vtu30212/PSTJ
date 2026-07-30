public class Task6 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        for (int first = 0; first < arr.length - 1; first++) {

            for (int second = first + 1; second < arr.length; second++) {

                System.out.println(arr[first] + " - " + arr[second]);
            }
        }
    }
}