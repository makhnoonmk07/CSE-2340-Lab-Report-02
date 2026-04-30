
package palindrome.c251227;
import java.util.Scanner;
public class PalindromeC251227 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
         System.out.print("Enter string: ");
        String str = sc.next();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    }
    

