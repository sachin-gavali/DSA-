import java.util.*;

public class bubbleSort3 {
    public static void main(String[] args) {
        int s[] = { 10, 20, 40, 22, 27, };
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
