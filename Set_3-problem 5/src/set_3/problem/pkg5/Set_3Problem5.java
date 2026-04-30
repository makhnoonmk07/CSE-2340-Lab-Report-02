
package set_3.problem.pkg5;

import java.util.Scanner;
public class Set_3Problem5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        double avg = (A + B) / 2.0;

        if (avg > C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
}
