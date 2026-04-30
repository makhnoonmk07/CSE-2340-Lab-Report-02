
package set_3.problem.pkg15;
import java.util.Scanner;
public class Set_3Problem15 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int minTemp = Math.max(A, C);

        if (minTemp <= B) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
}
