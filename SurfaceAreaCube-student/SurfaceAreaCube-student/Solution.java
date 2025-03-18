


import java.util.Scanner;

public class Solution{  
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int h = (a*a)+(b*b);
        int SurfaceArea = 2*(h);
        System.out.println(SurfaceArea);  
    }  
}  