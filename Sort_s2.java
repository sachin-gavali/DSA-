import java.util.*;

public class Sort_s2 {
    public static void main(String[] args) {
        int a[] = new int[6];
        for (int i = 0; i < a.length; i++) {
            System.out.println(" Enter the Number ");
            Scanner sc = new Scanner(System.in);

            a[i] = sc.nextInt();

        }
        // System.out.println(" before Swapping Array " + a[i]);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; i < a.length; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[i] ^ a[j];
                    a[j] = a[i] ^ a[j];
                    a[i] = a[i] ^ a[j];
                }
            }
        }
        System.out.println(" After swapping Array ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
