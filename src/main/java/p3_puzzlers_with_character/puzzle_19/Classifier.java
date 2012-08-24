package p3_puzzlers_with_character.puzzle_19;

public class Classifier {
    public static void main(String[] args) {
        System.out.println(classify('n') + classify('+') + classify('2'));
    }

    static String classify(char ch) {
        if ("0123456789".indexOf(ch) >= 0) return "NUMERAL ";
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(ch) >= 0)
            return "LETTER ";/* *      (Operators not supported yet)  */
        if ("+-*/&|!= ".indexOf(ch) >= 0)
            return " OPERATOR ";
        return " UNKNOWN ";
    }
}