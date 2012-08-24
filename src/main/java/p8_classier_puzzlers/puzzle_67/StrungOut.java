package p8_classier_puzzlers.puzzle_67;

public class StrungOut {
    public static void main(String[] args) {
        String s = new String("Hello world");
        System.out.println(s);
    }
}

class String {
    private final java.lang.String s;

    public String(java.lang.String s) {
        this.s = s;
    }

    public java.lang.String toString() {
        return s;
    }
}