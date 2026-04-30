
package set_3.problem.pkg8;


import java.util.Scanner;
public class Set_3Problem8 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        int total = X * Y;

        if (Z > total / 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }  
    }
    
}
