import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Bit_m6 {
    public static void main(String[] args) {
        int a = 50;

        /*
         * left_swap = a << 2 ;
         * left_swap = a << 3 ;
         * left_swap = a << 4 ;
         * left_swap = a << 5 ;
         * left_swap = a << 6 ;
         */
        for (int i = 0; i < 6; i++) {
            int right_swap = a >> i;
            System.out.println(right_swap);
        }

    }

}
