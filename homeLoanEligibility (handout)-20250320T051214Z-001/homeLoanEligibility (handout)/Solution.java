import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = scanner.nextInt();
        
        
        double annualIncome = scanner.nextDouble();
        
        
        int creditScore = scanner.nextInt();
        
        
        double currentDebts = scanner.nextDouble();
        
        boolean eligibility = false;
        
        if (age >= 25 && age <= 65) {
            if (annualIncome >= 50000 && creditScore >= 700 && currentDebts < 50000) {
                eligibility = true;
            }
        } else if (age < 25) {
            if (annualIncome >= 70000 && creditScore >= 750 && currentDebts < 30000) {
                eligibility = true;
            }
        } else if (age > 65) {
            if (annualIncome >= 40000 && creditScore >= 650 && currentDebts < 20000) {
                eligibility = true;
            }
        }
        
        System.out.println(eligibility ? "True" : "False");
        scanner.close();
    }
}
