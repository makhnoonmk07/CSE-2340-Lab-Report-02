
package average.c251227;
import java.util.Scanner;
public class AverageC251227 {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / 5;

        System.out.println("Average = " + avg);
    }
}
    
    

