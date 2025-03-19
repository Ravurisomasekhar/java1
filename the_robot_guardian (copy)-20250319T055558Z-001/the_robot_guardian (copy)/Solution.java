

import java.util.Scanner;


public class Solution{  
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        int age = sc.nextInt();
        boolean has_id = sc.nextBoolean();
        boolean knows_password = sc.nextBoolean();
        
        if (age >=18 && has_id || knows_password ){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }  
}  