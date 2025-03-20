import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int inches = scanner.nextInt(); 
        scanner.close();

        int yards = (int) Math.ceil(inches / 36.0); 
        System.out.println(yards ); 
    }
}
