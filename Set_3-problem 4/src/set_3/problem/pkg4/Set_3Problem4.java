
package set_3.problem.pkg4;

import java.util.Scanner;
public class Set_3Problem4 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b) {
            System.out.println(c);
        } else if (a == c) {
            System.out.println(b);
        } else {
            System.out.println(a);
    }
    
}
}