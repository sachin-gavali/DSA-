import java.util.*;

public class Bit_m8 {
    public static void swap() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        swap();
    }

}
