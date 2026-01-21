import java.util.Scanner;
public class numOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
            count++;
        }
        int midPosition = count/2;
        temp = num;
        for (int i = 0; i < midPosition; i++) {
            temp = temp / 10;
        }

        int middleDigit = temp % 10;
        
        // System.out.println(middleDigit);

        System.out.println("sum: "+ sum + "\nnumber of digits: "+ count);

        if (middleDigit % 2 == 0)
            System.out.println("Middle digit is Even");
        else
            System.out.println("Middle digit is Odd");
    }
}
