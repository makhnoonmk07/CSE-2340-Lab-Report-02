
package sort_array.c251227;
import java.util.Scanner;
public class Sort_arrayC251227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Sorting
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j <arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
    
    

