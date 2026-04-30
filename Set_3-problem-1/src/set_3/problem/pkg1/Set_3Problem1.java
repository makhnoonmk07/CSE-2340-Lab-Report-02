
package set_3.problem.pkg1;

import java.util.Scanner;
public class Set_3Problem1 {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int C = sc.nextInt();

        if ((A + C) % 2 == 0) {
            int B = (A + C) / 2;
            System.out.println("B = " + B);
        } else {
            System.out.println("No integer B exists");
        }
    }
    
}
