import java.util.*;

public class multiplyingNum {
    public static void main(String[] args) {
        int a[] = new int[10];
        System.out.println(" Enter the Number to have multiply ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(" Enter the Number to multiple with " + n);

            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
            int Num = a[i] * 2;
            System.out.println(a[i] + " x  " + n + "   =  " + Num);

        }
        System.out.println();
    }
}
