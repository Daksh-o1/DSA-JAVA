import java.util.Scanner;
public class odd_even_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements to store in array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0; i<num; i++){
            System.out.print("Enter "+ (i+1)+" element of array: ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Number of Even elements in this array: "+ evenCount+"\nNumber of odd elements in this array: "+ oddCount);
    }
}


