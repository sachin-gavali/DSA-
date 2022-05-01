import java.util.*;

class Add {
    public int getNum(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;

    }
}

public class mathsProject {
    public static void main(String[] args) {
        Add s = new Add();
        s.getNum(5, 7);
    }
}
