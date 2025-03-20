import java.util.*;
public class Solution{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] a = s.split(":");
        String start = a[0];
        String mid = a[1];
        String end = a[2];
        if (a[2].endsWith("PM")){
            String b = end.replace("PM", "");
            if (Integer.parseInt(start) == 12){
                int number = 12;
                String f0 = Integer.toString(number) + ":"+ mid +":"+ b;
                System.out.println(f0);
            }
            else{

                int number = Integer.valueOf(start)+12;
                String f1 = Integer.toString(number) + ":"+ mid +":"+ b;
                System.out.println(f1);
            }


        }
        else if(Integer.parseInt(start) == 12 && end.endsWith("AM")){
            String c = end.replace("AM", "");
            String f2 = "00"+":"+mid+":"+c;
            System.out.println(f2);

        }
        else{
            System.out.println(s.replace("AM", ""));
        }

        sc.close();
}
    

}