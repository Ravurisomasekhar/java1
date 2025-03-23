import java.util.Scanner;

public class Solution{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        int count = 0;
        for (int i=0;i<=first.length()-second.length();i++){
            if (first.substring(i,i+second.length()).equals(second)){
                count +=1;
            }
        }System.out.println(count);
    }
    
} 