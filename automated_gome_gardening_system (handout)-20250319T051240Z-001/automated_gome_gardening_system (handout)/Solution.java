// # Write your solution here


import java.util.Scanner;


public class Solution{  
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        boolean soil_dry = sc.nextBoolean();
        boolean raining = sc.nextBoolean();
        boolean day_time = sc.nextBoolean();
        int temperature = sc.nextInt();
        if (soil_dry && !raining && day_time && temperature>10){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }  
}  