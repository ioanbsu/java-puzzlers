package p4_loopy_puzzlers.puzzle_25;

public class Increment {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++) j = j++;
        System.out.println(j);
    }
}