import java.util.Scanner;
public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        for(int i = 0; i<size;i++){
            System.out.print("Enter "+(i+1)+" element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("----------INSERTION MENU----------");
        System.out.println("Enter '1' to add element at the beginning: ");
        System.out.println("Enter '2' to add element at the end: ");
        System.out.print("Enter '3' to add element at desired position: ");
        int choice = sc.nextInt();
        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();
        switch(choice){
            case 1:
                for(int i = size;i>0;i--){
                    arr[i] = arr[i-1];
                }
                arr[0] = element;
                // size++;
                break;
            case 2:
                arr[size] = element;
                // size++;
                break;
            case 3:
              System.out.print("Enter position: ");  
              int pos = sc.nextInt();
              if(pos<1 || pos >size+1){
                System.out.println("Invalid position.");
              }
              for(int i = size;i>=pos;i--){
                arr[i] = arr[i-1];
              }
              arr[pos-1] = element;
            //   size++;
              break;
            default:
                System.out.println("Invalid choice.");
        }

        System.out.print("Array after insertion. ");
        for(int i =0;i<size+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
