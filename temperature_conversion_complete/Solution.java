import java.util.Scanner;
import java.lang.Math;
public class Solution {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float F = sc.nextFloat();
        double C = (5.0/9.0)*(F-32);
        System.out.println((Math.round(C*10.0))/10.0);



    }
}