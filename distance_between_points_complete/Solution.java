import java.util.Scanner;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float x1 = sc.nextFloat();
    float y1 = sc.nextFloat();
    float x2 = sc.nextFloat();
    float y2= sc.nextFloat();
    float j = (((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

    Double Dictance = Math.sqrt(j);
    System.out.println((Math.round(Dictance*10.0))/10.0);


    }
}