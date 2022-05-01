/* Find the minimum number in array  */
public class Comp_Array1 {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 23, 12, 8 };
        int min = a[0];

        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) {
                min = a[i];

            }
        }
        System.out.println(" Min no " + min);
    }
}
