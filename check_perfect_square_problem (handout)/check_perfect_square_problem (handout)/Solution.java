import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        int num = scanner.nextInt();
        scanner.close(); 

        
        int sqrt = (int) Math.sqrt(num);
        if (sqrt * sqrt == num) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

