import java.util.Scanner;
public class stack1 {
    public static void main(String[] args) {
        
        // wap to push and pop using switch case
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        int top = -1;
        int value;
        int []stack = new int[size];
    
        while(true){

            System.out.print("\nSelect operations to perform:\nEnter 1 to PUSH new value.\nEnter 2 to POP a value.\nEnter 3 to DISPLAY the Stack.\nEnter 4 to exit.\nChoice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    if(top == size-1){
                        System.out.println("\nStack is full.");
                    }else{
                        System.out.print("Enter value to push: ");
                        value = sc.nextInt();
                        top++;
                        stack[top] = value;
                    }
                    break;
                case 2:
                    if(top <0){
                        System.out.println("\nStack is empty.");
                    }
                    else{
                        System.out.println("\nElement deleted.");
                        top--;
                    }
                    break;
                case 3:
                    if(top==-1){
                        System.out.println("\nStack is empty.");
                    }
                    else{
                        for(int i = top;i>=0;i--){
                            System.out.println("|"+stack[i]+"|");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Program Ended.");
                    return;

                default:
                    System.out.println("invalid choice.");
    
            }
        }
    }
}
