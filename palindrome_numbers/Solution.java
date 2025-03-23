import java.util.Scanner;


public class Solution {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Start = sc.nextInt();
        int end = sc.nextInt();
        // IntStream.range(Start, end).forEachOrdered(n){
        //     System.out.println(n);
        // }
        // new IntRange(Start,end).toArray();
        StringBuilder result = new StringBuilder();

        for (int i = Start; i< end+1; i++){
            if (isPalindrome(i)){
                result.append(i).append(" ");
            }
        }
        System.out.println(result.toString().trim());

    }

    public static boolean isPalindrome(int n){
        int orgin = n,rever = 0;
        while (n>0){
            int digit = n%10;
            rever = rever * 10+digit;
            n/=10;
        }
        return orgin == rever;
    }
}