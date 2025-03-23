import java.util.Scanner;

public class Solution{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String[] s = N.split(" ");
        String max = s[0];
        // System.out.println(max);

        for (String i :s ){
            if (i.length()>=max.length()){
                max = i;
            }
        }
        System.out.println(max);
        sc.close();

        
        
        
    }
}
    