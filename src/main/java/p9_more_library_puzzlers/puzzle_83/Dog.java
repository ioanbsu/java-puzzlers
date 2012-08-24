package p9_more_library_puzzlers.puzzle_83;

public class Dog extends Exception {
    public static final Dog INSTANCE = new Dog();

    private Dog() {
    }

    public String toString() {
        return "Woof";
    }
}