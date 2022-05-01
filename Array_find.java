public class Array_find {
    public static void main(String[] args) {
        int a[] = { 10, 30, 20, 45, 74, 56 };
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println();
    }
}