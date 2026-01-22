import java.util.Scanner;
public class deleting_multiple_occurence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 3, 4, 5 };
        int count = 0;
        System.out.print("Enter target you want to delete: ");
        int tar = sc.nextInt();
        // for(int i = 0; i<arr.length;i++){
        //     if(arr[i]==tar){
        //         count++;
        //         for(int j =i;j<arr.length -1;j++){
        //             arr[j] = arr[j+1];
        //         }
        //         i--;
        //     }
        // }

        // new method (overwriting):-
        int index = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=tar){
                arr[index] = arr[i];
                index++;
            }else{
                count++;
            }
        }

        System.out.println("Array after Deletion: ");
        System.out.println("Your targeted number occured "+ count +" times.");
        for(int i = 0;i<arr.length-count;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
