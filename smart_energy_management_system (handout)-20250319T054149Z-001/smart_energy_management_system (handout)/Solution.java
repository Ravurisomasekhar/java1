// # Write your solution here


import java.util.Scanner;


public class Solution{  
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        boolean house_occupied = sc.nextBoolean();
        boolean high_energy_appliance_on = sc.nextBoolean();
        boolean peak_hours = sc.nextBoolean();
        int current_energy_usage = sc.nextInt();
        if (!house_occupied || high_energy_appliance_on && peak_hours && current_energy_usage>=50){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }  
}  