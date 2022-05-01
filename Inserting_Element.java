import java.util.*;

public class Inserting_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = { 10, 30, 54, 54, 64 };
        int b[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            if (i < n) {
                b[i] = a[i];
            } else if (i == n) {
                n = a[i];
            } else {
                b[i + 1] = a[i];
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(" " + b[i]);
        }
    }
}
