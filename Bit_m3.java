public class Bit_m3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int And = a & b;
        int Or = a | b;
        int X_or = a ^ b;
        int complement = ~a;
        int complement2 = ~(b);
        int complement3 = ~(And);
        int complement4 = ~(X_or);
        System.out.println(a);
        System.out.println(b);
        System.out.println(And);
        System.out.println(Or);
        System.out.println(X_or);
        System.out.println(complement);
        System.out.println(complement2);
        System.out.println(complement3);
        System.out.println(complement4);

    }
}
