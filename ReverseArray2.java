import java.util.*;

public class ReverseArray2 {
    public static void main(String[] args) {
        int a[] = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println(" How many size of Your array");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println(" You Enter the Array is ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");

        }
        System.out.println(" Reverse a array ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(a[i] + " ");
        }
    }

}
