package p4_loopy_puzzlers.puzzle_34;

public class Count {
    public static void main(String[] args) {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) count++;
        System.out.println(count);
    }
}