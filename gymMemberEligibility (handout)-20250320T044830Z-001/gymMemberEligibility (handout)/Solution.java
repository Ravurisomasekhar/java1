import java.util.Scanner;

public class Solution {  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  
        int age = sc.nextInt();
        double BMI = sc.nextDouble();
        boolean healthCondition = sc.nextBoolean();
        sc.close(); 

        if ((age >= 18 && age <= 60 && BMI >= 18.5 && BMI <= 24.9 && !healthCondition) ||
            (age < 18 && BMI >= 18.5 && BMI <= 24.9) ||
            (age > 60 && BMI >= 18.5 && BMI <= 24.9 && !healthCondition)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
