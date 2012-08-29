package p2_expressive_puzzlers.puzzle_2;

import java.math.BigDecimal;

public class Change {
    public static void main(String args[]) {
        System.out.println(2.00 - 1.10);      //1.1 can not be represented in double correctly.
        System.out.print(new BigDecimal("2.00").subtract(new BigDecimal("1.10") ));
    }
}