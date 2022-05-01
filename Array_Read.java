import java.util.*;

class Read {
    public void ReadNum() {
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter the Number ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(" Element in Array =  " + " " + a[i]);
        }

    }
}

public class Array_Read {

    public static void main(String[] args) {
        Read s = new Read();
        s.ReadNum();
    }
}
