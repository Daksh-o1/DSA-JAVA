import java.util.Scanner;

public class count_occurence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        boolean[] visited = new boolean[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " Element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nElement  Occurrence");

        for (int i = 0; i < size; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " time(s)");
        }
    }
}
