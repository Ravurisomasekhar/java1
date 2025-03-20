import java.util.Scanner;

public class Solution {  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close(); 
        
        
        if ((x + y == 5) || (Math.abs(x - y) == 5)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

