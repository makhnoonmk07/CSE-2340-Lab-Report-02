
package set_3.problem.pkg12;
import java.util.Scanner;
public class Set_3Problem12 {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int need = N - X;

        if (need <= 0) {
            System.out.println(0);
        } else {
            int packets = (need + 3) / 4;
            System.out.println(packets);
        }
    }
    
}
