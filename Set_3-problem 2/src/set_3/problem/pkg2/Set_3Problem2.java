
package set_3.problem.pkg2;

import java.util.Scanner;
public class Set_3Problem2 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        String word = sc.next();

        if (word.length() > 10) {
            System.out.println("" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1));
        } else {
            System.out.println(word);
        } 
    }
    
}
