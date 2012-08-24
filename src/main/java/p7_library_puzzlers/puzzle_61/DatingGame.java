package p7_library_puzzlers.puzzle_61;

import java.util.Calendar;
import java.util.Date;

public class DatingGame {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(1999, 12, 31); // Year, Month, Day
        System.out.print(cal.get(Calendar.YEAR) + " ");
        Date d = cal.getTime();
        System.out.println(d.getDay());
    }
}