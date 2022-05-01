import java.util.*;

public class labProject {
    public static void user_Pay() {
        System.out.println("PAYMENT CASH OR ONLINE ");
        dash();
        Scanner sc = new Scanner(System.in);
        String pay = sc.next();
        switch (pay) {
            case "PHONE PAY ": {
                dash();
                System.out.println(" PHONE PAY NO .9067339470 ");
                dash();
                Thanks();
                dash();

            }

        }
    }

    public static void Thanks() {
        System.out.println("THANK YOU SIR  ");
    }

    public static void getBook() {
        int total = 0;
        System.out.println("HOW MANY BOOKS YOU HAVE ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a[] = new int[15];
            System.out.println(i + ".ENTER THE YOUR BOOK PRIZE ");
            dash();
            a[i] = sc.nextInt();
            total = a[i] + total;
        }
        dash();
        System.out.println("YOUR BOOKS TOTAL PRIZE IS " + total);
        dash();
        System.out.println(" JUST FOR YOU !");
        System.out.println(" I CAN GIVE YOU 10% DISCOUNT ");
        System.out.println(" APPLYING DISCOUNT YOUR TOTAL PRIZE IS = " + total / n);
    }

    public static void newLine() {
        System.out.println();

    }

    public static void dash() {

        for (int i = 0; i <= 10; i++) {
            System.out.print("-- ");

        }
        newLine();

    }

    public static void user_name() {
        dash();
        System.out.println(" ENTER YOUR GOOOD NAME SIR ");
        dash();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        dash();
        System.out.println("Welcome " + name + "!");
        dash();
        System.out.println("IN SACHIN BOOK SHOP");
        dash();

    }

    public static void main(String[] args) {

        user_name();
        getBook();

    }
}