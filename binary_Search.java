import java.util.Scanner;
public class binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int size = sc.nextInt();
        
        if(size == 0){
            System.out.println("Array is empty.");
            return;
        }    
        int arr[] = new int[size];

        for(int i = 0; i<size;i++){
            System.out.print("Enter "+ i +" element: ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;
        int count = 0;

        while (low <= high) {
            count++;
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid + "\nTotal comparisons: "+count);
                found = true;
                break;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}

