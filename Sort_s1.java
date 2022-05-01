import java.util.*;

class Sort {
    public void Asending() {

        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
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
            System.out.println(" After swapping Array ");
            for (int n = 0; n < 5; n++) {
                System.out.println(n[i]);
            }
        }
    }
}

public class Sort_s1 {
    public static void main(String[] args) {
        Sort s = new Sort();
        s.Asending();
    }
}
