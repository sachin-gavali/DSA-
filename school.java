import java.util.*;

class collage {
    int getRollNum;
    String getName;
    Scanner s = new Scanner(System.in);

    void rollNum() {
        System.out.println("ENTER THE ROLL NUMBER ");
        getRollNum = s.nextInt();
        if (getRollNum <= 54) {
            System.out.println(" You are student of this collage ");
        } else {
            System.out.println(" You are not student of this collage ");
        }
    }

    void name() {
        System.out.println(" Enter the Your name ");
        getName = s.next();
    }

}

class Grade {
    void um() {
        System.out.println(" hello ");
    }

}

public class school {

    public static void main(String[] args) {
        Grade c1 = new Grade();
        c1.um();
        collage s = new collage();
        s.name();
        s.rollNum();
    }
}