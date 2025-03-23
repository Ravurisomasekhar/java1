import java.util.Scanner;

public class Solution{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long i = 1;
        long square_sum = 0;
        for (i=1;i<=n;i++){
            square_sum += i;
        }
        // System.out.println(square_sum*square_sum);
        long h = (square_sum*square_sum);
        long sumOfSquares = (n * (n + 1) * (2 * n + 1)) / 6;
        // System.out.println(sumOfSquares);

        long diff = h - sumOfSquares;
        System.out.println(diff);
        
        sc.close();
    }
    
} 