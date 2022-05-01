public class Array_Avarage {
    public static void Avarage() {
        int a[] = { 10, 2, 3, 4, 2, 5, 7 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {

            sum += a[i];

        }
        float Ave = (float) sum / a.length;
        System.out.println(Ave);
    }

    public static void main(String[] args) {
        Avarage();
    }
}
