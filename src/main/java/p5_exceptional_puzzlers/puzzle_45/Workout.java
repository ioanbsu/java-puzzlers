package p5_exceptional_puzzlers.puzzle_45;

public class Workout {
    public static void main(String[] args) {
        workHard();
        System.out.println("It's nap time.");
    }

    private static void workHard() {
        try {
            workHard();
        } finally {
            workHard();
        }
    }
}