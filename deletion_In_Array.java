import java.util.Scanner;
public class deletion_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 4, 40, 50};
        System.out.print("Enter element you want to delet: ");
        int del = sc.nextInt();

        int index =-1;
        // index search
        for(int i =0;i<arr.length;i++){
            if(arr[i] == del){
                index=i;
                break;
            }
        }

        // shifting elements
        for(int i =index; i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }

        // printing array
        System.out.println("Array After Deletion:");
        for(int i = 0; i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
