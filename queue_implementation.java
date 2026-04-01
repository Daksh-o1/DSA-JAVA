import java.util.Scanner;
public class queue_implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Queue size: ");
        int size = sc.nextInt();
        int[] queue = new int[size];
        int front = -1, rear = -1;

        System.out.print("Enter 1 to Enqueue \nEnter 2 to Dequeue\nEnter 3 to Disaply\nEnter 4 to exit.");
        while(true){
            System.out.print("\nEnter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if(rear == size-1){
                        System.out.println("Queue overflow.");
                    }else{
                        System.out.print("Enter value: ");
                        int value = sc.nextInt();
                        if(front == -1){
                            front = 0;
                        }
                        rear +=1;
                        
                        queue[rear] = value;
                    }
                    break;

                case 2:
                    if(front == -1){
                        System.out.println("Queue underflow.");
                    }else{
                        System.out.println("Dequeue "+queue[front]);
                        front++;
                    }
                    break;
                case 3:
                    if(front == -1|| front > rear){
                        System.out.println("Queue is empty.");
                    }else{
                        System.out.println("Queue-");
                        System.out.print("|");
                        for(int i = front; i<=rear;i++){
                            System.out.print(queue[i]+"|");
                        }
                        System.out.println();
                    }
                    break;
            
                case 4:
                    return;
                default:
                    System.out.println("invalid choice.");
                    break;
            }

        }
    }
}
