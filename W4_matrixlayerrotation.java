import java.io.*;
import java.util.*;

public class Solution {
    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();
        for (int layer = 0; layer < Math.min(m, n) / 2; layer++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = layer; j < n - layer; j++) {
                temp.add(matrix.get(layer).get(j));
            }

            for (int i = layer + 1; i < m - layer; i++) {
                temp.add(matrix.get(i).get(n - layer - 1));
            }

            for (int j = n - layer - 2; j >= layer; j--) {
                temp.add(matrix.get(m - layer - 1).get(j));
            }

            for (int i = m - layer - 2; i > layer; i--) {
                temp.add(matrix.get(i).get(layer));
            }

            int k = r % temp.size();

            ArrayList<Integer> rotated = new ArrayList<>();

            for (int i = k; i < temp.size(); i++) {
                rotated.add(temp.get(i));
            }

            for (int i = 0; i < k; i++) {
                rotated.add(temp.get(i));
            }
            int p = 0;

            for (int j = layer; j < n - layer; j++) {
                matrix.get(layer).set(j, rotated.get(p++));
            }

            
            for (int i = layer + 1; i < m - layer; i++) {
                matrix.get(i).set(n - layer - 1, rotated.get(p++));
            }
            for (int j = n - layer - 2; j >= layer; j--) {
                matrix.get(m - layer - 1).set(j, rotated.get(p++));
            }

            
            for (int i = m - layer - 2; i > layer; i--) {
                matrix.get(i).set(layer, rotated.get(p++));
            }
        }

        
        for (List<Integer> row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");

        int m = Integer.parseInt(first[0]);
        int n = Integer.parseInt(first[1]);
        int r = Integer.parseInt(first[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            String[] values = br.readLine().split(" ");

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(Integer.parseInt(values[j]));
            }

            matrix.add(row);
        }

        matrixRotation(matrix, r);

        br.close();
    }
}