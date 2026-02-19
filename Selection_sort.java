import java.util.Scanner;
public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // selection sort 
        for(int i=0;i<size-1;i++){
            int min = i;

            //finding min
            for(int j=i;j<size;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
