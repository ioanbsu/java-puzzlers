package p9_more_library_puzzlers.puzzle_83;

public class CopyDog {
    public static void main(String[] args) {
        Dog newDog = Dog.INSTANCE; //todo: fifure it out... You figure out what to put here        // This line should print false
        System.out.println(newDog == Dog.INSTANCE);        // This line should print "Woof"
        System.out.println(newDog);
    }
}