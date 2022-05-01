public class A_Sum_Of_Element {
    public static void main(String[] args) {
        int a[] = { 10, 20, 3, 4, 54, 23, 53, 56 };
        int s = 23;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == s) {
                System.out.println(" Your name index is " + a[i]);
            }
        }
    }
}