import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int eggs = scanner.nextInt(); 
        scanner.close();

        int yards = (int) Math.ceil(eggs / 12.0); 
        System.out.println(yards ); 
    }
}
