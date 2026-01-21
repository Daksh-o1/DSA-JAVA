import java.util.Scanner;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
        System.out.print("Enter element to find in array: ");
        int target = sc.nextInt();
        boolean Found = false;

        for(int i =0; i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(target+" found at index "+ i);
                Found = true;
                break;
            }
        }
        if(Found == false){
            System.out.println("Element not found.");
        }
    }
}
