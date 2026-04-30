package sum.c251227;
import java.util.Scanner;
public class SumC251227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;}
        System.out.println("Sum of all numbers:"+sum);
    }
}
