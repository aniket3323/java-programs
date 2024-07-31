import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();
        
        int largest = Math.max(num1, Math.max(num2, num3));
        
        System.out.println("The largest number is: " + largest);
    }
}
