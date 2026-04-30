
package set_3.problem.pkg3;

import java.util.Scanner;
public class Set_3Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        String result = Character.toUpperCase(word.charAt(0)) + word.substring(1);
        System.out.println(result);
    }
    
}
