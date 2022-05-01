import java.util.*;

public class bubbleSort4 {
    public static void main(String[] args) {
        int s[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s[n] = sc.nextInt();
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = 0; j < s.length - i - 1; j++) {
                if (s[j] > s[j + 1]) {
                    int temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;

                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }

}
