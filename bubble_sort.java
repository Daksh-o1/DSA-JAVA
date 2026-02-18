public class bubble_sort {
    public static void main(String[] args) {
        int []arr = {9, 12, 2, 3, 7, 1, 5};
        int n = arr.length;
        int count = 0;

        for(int i = 0; i<n-1;i++){
            for(int j = 0; j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    count ++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println("\nNumber of swaps: "+count); 

        int arr1[] = {4,6,3,2,9};
        int original[] = arr1.clone(); // VERY IMPORTANT

        int n1 = arr.length;
        int totalSwaps = 0;

        // Bubble Sort
        for(int i = 0; i < n1-1; i++){
            for(int j = 0; j < n1-i-1; j++){
                if(arr[j] > arr[j+1]){
                    totalSwaps++;

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for(int num : arr1){
            System.out.print(num + " ");
        }

        System.out.println("\nTotal swaps: " + totalSwaps);


        // Swaps caused by each element
        System.out.println("\nSwaps caused by each element:");

        for (int i = 0; i < n; i++) {
            int count1 = 0;

            for (int j = i + 1; j < n; j++) {
                if (original[i] > original[j]) {
                    count1++;
                }
            }

            System.out.println(original[i] + 
                               " causes swaps = " + count1);
        }
    }
}
