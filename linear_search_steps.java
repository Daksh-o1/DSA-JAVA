import java.util.Scanner;

public class linear_search_steps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};

        System.out.print("Enter element to find in array: ");
        int target = sc.nextInt();

        int steps = 0;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            steps++; 

            if(arr[i] == target){
                System.out.println(target + " found at index " + i);
                System.out.println("Steps required: " + steps);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Element not found.");
            System.out.println("Total steps performed: " + steps);
        }

    }
}
