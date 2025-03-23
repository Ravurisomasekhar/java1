import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();

        String s = Long.toString(N);

        char[] ch = s.toCharArray();

        int C = 0;
        for (int i = 0; i < ch.length; i++) {
            int k = Integer.parseInt(String.valueOf(ch[i]));
            C += k;
            
        }
        // System.out.print(C);

        String kit = Integer.toString(C);

        char[] hit = kit.toCharArray();

        int q = 0;
        for (int j = 0; j<hit.length;j++){
            int z = Integer.parseInt(String.valueOf(hit[j]));
            q += z;
        }
        System.out.println(q);



        



    }
}
        
        
    
// }


// import java.util.Scanner;

// public class Solution {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
        
//         String N = sc.nextLine();

//         int C = 0;
//         for (int i = 0; i < N.length(); i++) {
//             int k = Integer.parseInt(N, N.charAt(i));
//             C += k;
//             System.out.print(C);
    //     }
    // }
 
        
        
    
// }

