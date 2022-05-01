import java.util.*;

public class Bit_m7 {
    public static void oddEven() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & 1) == 1) {
            System.out.println(" Oddd num = ");
        } else {
            System.out.println(" Even  ");
        }

    }

    public static void main(String[] args) {
        oddEven();

    }

}
