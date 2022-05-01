
class Number {
    public void Min_Max() {
        int max = 0;

        int a[] = { 10, 30, 40, 29, 45 };
        int min = a[0];
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

    }
}

public class Max_Min {
    public static void main(String[] args) {
        Number s = new Number();

        s.Min_Max();
    }
}