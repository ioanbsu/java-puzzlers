package p3_puzzlers_with_character.puzzle_21.com.javapuzzlers;

import java.io.File;

public class MeToo {
    public static void main(String[] args) {
        System.out.println(MeToo.class.getName().
                replaceAll("\\.", File.separator) + ".class");
    }
}
