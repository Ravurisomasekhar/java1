import java.util.Scanner;

class Solution {
    static boolean isPrime(int n)
    {
        
        if (n <= 1)
            return false;

        
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        for (int j = 1;j<number+1;j++)

        if (isPrime(j)){
            System.out.println("Prime");
        }else if (j%3 == 0 && j%5 ==0){
            System.out.println("FizzBuzz");
        }else if(j%3 == 0 && j%7 == 0){
            System.out.println("FizzBoom");
        }else if(j%7 == 0){
            System.out.println("Boom");
        }else if(j%3==0){
            System.out.println("Fizz");
        }else if (j%5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(j);
        }

    }
}
