import java.util.Scanner;

public class circular_queue {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int cQ[] = new int[4];
        int size = cQ.length;
        int f = -1;
        int r = -1;
        while(true){
            if (((r + 1) % size == f)) {
                System.out.println("Queue Overflow");
                break;
            } else if (f == -1) {
                f = 0;
                r = 0;
            } else if ((r == size - 1) && (f != 0)) {
                r = 0;
            } else {
                r = (r + 1) % size;
            }
            System.out.println("Enter value:");
            cQ[r] = sc.nextInt();
            System.out.println("Element inserted: "+ cQ[r]);
        }
        
        System.out.println("Queue elements:");
        int i = f;
        while(true){
            System.out.println(cQ[i]);
            
            if(i == r){
                break;
            }
            i = (i+1)%size;
        }
        
    }    
    
}