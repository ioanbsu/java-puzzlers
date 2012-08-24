package p10_advanced_puzzlers.puzzle_92;

public class Twisted {
    private final String name;

    Twisted(String name) {
        this.name = name;
    }

    private String name() {
        return name;
    }

    private void reproduce() {
        new Twisted("reproduce") {
            void printName() {
                System.out.println(name());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new Twisted("main").reproduce();
    }
}