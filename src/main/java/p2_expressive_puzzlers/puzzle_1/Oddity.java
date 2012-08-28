package p2_expressive_puzzlers.puzzle_1;

public class Oddity {
    public static boolean wrongIsOdd(int i) {
        return i % 2 == 1;//this does not work for negative values because of definition of [%] operation: (a/b)*b+(a%b)=a
    }

    public static boolean correctIsOdd(int i) {
        return i % 2 !=0;
    }

    public static void main(String[] args) {
        System.out.println("Wrong isOdd");
        System.out.println(wrongIsOdd(4));
        System.out.println(wrongIsOdd(3));
        System.out.println(wrongIsOdd(-4));
        System.out.println(wrongIsOdd(-3));
        System.out.println("Correct isOdd");
        System.out.println(correctIsOdd(4));
        System.out.println(correctIsOdd(3));
        System.out.println(correctIsOdd(-4));
        System.out.println(correctIsOdd(-3));
    }
}