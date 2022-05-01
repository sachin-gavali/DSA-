public class fact {
    public static void factroial_num(int n) {
        int fact1 = 1;
        for (int i = n; i <= 1; i--) {
            // int fact1 = 1;
            fact1 = n * fact1;

        }
        System.out.println(fact1);

    }

    public static void main(String[] args) {
        factroial_num(5);

    }

}
