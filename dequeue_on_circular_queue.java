import java.util.Scanner;

public class dequeue_on_circular_queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] cq = new int[size];
        int f = -1, r = -1;

        if (f == -1) {
            System.out.println("QUEUE IS EMPTY.\nENTER ELEMENTS:");

            f = 0;
            r = 0;

            for (int i = 0; i < size; i++) {
                System.out.print("Enter value: ");
                cq[r] = sc.nextInt();
                r = (r + 1) % size;
            }
        }

        // count elements
        int count = (r - f + size) % size;

        System.out.print("How many dequeue you want to perform: ");
        int dm = sc.nextInt();

        if (dm > count) {
            System.out.println("Not enough elements to dequeue.");
        } else {
            System.out.println("\nPerforming Dequeue...");

            for (int i = 0; i < dm; i++) {
                System.out.println("Element " + cq[f] + " dequeued.");
                f = (f + 1) % size;
            }
        }

        // check empty
        if (f == r) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Left over elements...");

        int i = f;
        while (i != r) {
            System.out.print(cq[i] + " ");
            i = (i + 1) % size;
        }
    }
}