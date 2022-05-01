
// print 1 to n number and print sum of all number 
import java.util.*;

public class sumOfn_num {
    public static void main(String[] args) {
        System.out.println(" Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println(" Sum of all number   = " + sum);
    }
}