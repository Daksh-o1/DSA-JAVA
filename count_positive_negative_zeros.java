import java.util.Scanner;
public class count_positive_negative_zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int zeros = 0;
        int positves=0;
        int negatives=0;
        int[] arr = new int[size];
        for(int i = 0; i<size;i++){
            System.out.print("Enter Element: ");
            arr[i] = sc.nextInt();
            if(arr[i]>0){
                positves++;
            }else if(arr[i]<0){
                negatives++;
            }else{
                zeros++;
            }
        }
        System.out.println("Zeros: "+ zeros+"\nPositive number count: "+positves+"\nNegative number count: "+negatives);
    }
}
