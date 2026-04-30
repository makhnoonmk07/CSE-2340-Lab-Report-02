
package set_3.problem.pkg6;

import java.util.Scanner;
public class Set_3Problem6 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int subscriptions = (N + 5) / 6; // round up
        int cost = subscriptions * X;

        System.out.println(cost);  
    }
    
}
