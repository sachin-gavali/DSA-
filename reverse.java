import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[5];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print(" The Array  is :-");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println();
        System.out.print(" The Revers Array is :- ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(" " + a[i]);
        }

    }

}
