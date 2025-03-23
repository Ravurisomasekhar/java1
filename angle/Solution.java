import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        if (n>0 && n<90 ){
            System.out.println("Acute");
            return;
        }else if (n==90){
            System.out.println("Right");
            return;
        }else if (n>90 && n<180){
            System.out.println("Obtuse");
            return ;
        }
        else {
            System.out.println("Invalid");
            
        }

        
        sc.close();
    }
}
