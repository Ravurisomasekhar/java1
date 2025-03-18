import java.util.Scanner;
import java.lang.Math;
public class Solution {

    public static void main(String arg[]){
        Scanner sc  = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float f  = ((a*a)+(b*b));
        double C = Math.sqrt(f);
        System.out.println(C);
    }
}