


import java.lang.*;
import java.util.Scanner;
public class Solution {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	String password= sc.nextLine();
	String Special = "!@#$%^&*()_+-=|;:,./<>?).";
    int upper = 0;
    int lower = 0;
    int digit = 0;
    int sp = 0;
	//    int count = 0;
	   for(int i = 0; i < password.length(); i++) {
	      char ch = password.charAt(i);
	      if(Character.isUpperCase(ch)) {
	        //  System.out.println(ch + " is an Uppercase Letter");
	        upper = upper+1;
	      }
		  else if (Character.isLowerCase(ch)){
			lower = lower+1;
		  }
		  else if (Character.isDigit(ch)){
			digit = digit+1;
		  }
		  else if( (password.contains("!")) || (password.equals('@')) || (password.contains("#")) ||  (password.equals("$")) || (password.equals("%"))|| 
		  (password.equals("^")) ||(password.equals("&")) ||(password.equals("*")) || (password.equals("*")) ||
		  (password.equals("(")) || (password.equals(")")) || (password.equals("_")) ||(password.equals("-")) ||(password.equals("=")) ||
		  (password.equals("+")) ||(password.equals("?")) ||(password.equals("/"))){
			sp = sp+1;
		  }
      }
	  	// System.out.println(upper);
	  	// System.out.println(lower);
	  	// System.out.println(digit);
	  	// System.out.println(sp);
	   if(upper>=1 && lower>=1 && digit>=1 && sp>=1){
		System.out.println("True");
	   }
	   else{
		System.out.println("False");
	   }
		//    System.out.println("No Uppercase Letters in the String");
   }
}

