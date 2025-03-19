// # Write your solution here


import java.util.Scanner;


public class Solution{  
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        boolean action1  = sc.nextBoolean();
        boolean action2 = sc.nextBoolean();
        boolean action3 = sc.nextBoolean();
        
        if ((action1&&action2 &&action3)||(action1&&action3)||(action2&&(action1||action3))){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }  
}  