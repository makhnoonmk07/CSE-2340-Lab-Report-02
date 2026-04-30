
package search_element.c251227;

import java.util.Scanner;
public class Search_elementC251227 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        boolean found = false;

          for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
 
    }
    

