import java.util.Scanner;

public class Solution {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        Float c = sc.nextFloat();
        double home =  (b*b) - (4*c);

        double root = (-b + Math.sqrt(home))/2;
        double root1 = (-b - Math.sqrt(home))/2;

        System.out.println(root);
        System.out.println(root1);


        



    }
} 