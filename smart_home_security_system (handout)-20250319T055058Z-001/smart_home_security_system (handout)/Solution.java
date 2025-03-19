

import java.util.Scanner;


public class Solution{  
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        boolean door_open = sc.nextBoolean();
        boolean window_open = sc.nextBoolean();
        boolean motion_detected = sc.nextBoolean();
        boolean alarm_deactivated = sc.nextBoolean();
        if (door_open || window_open && !alarm_deactivated || motion_detected){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }  
}  