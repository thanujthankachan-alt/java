import java.util.Scanner;

public class StringBufferExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first string: ");
        String input1 = sc.nextLine();

        
        StringBuffer sb = new StringBuffer(input1);

      
        System.out.println("StringBuffer Capacity: " + sb.capacity());

       
        sb.reverse();
        String reversedUpper = sb.toString().toUpperCase();
        System.out.println("Reversed Uppercase String: " + reversedUpper);

        
        System.out.print("Enter second string: ");
        String input2 = sc.nextLine();

        sb.append(input2);

        System.out.println("After Appending: " + sb);
    }
}