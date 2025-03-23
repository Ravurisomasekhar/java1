import java.util.Scanner;

public class Solution {  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        boolean talking= sc.nextBoolean(); 
        int hour = sc.nextInt();

        
        if(talking && (hour<7 || hour >20)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        
        sc.close(); 

        
    }
}
