
package set_3.problem.pkg14;
import java.util.Scanner;
public class Set_3Problem14 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();

        if (P > Q + R + S || Q > P + R + S || R > P + Q + S || S > P + Q + R) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
}
