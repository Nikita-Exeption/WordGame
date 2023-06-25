package org.Nikita;

import java.util.List;

public class Main {

    static List<String> words = List.of("Word", "Hello", "World", "Java", "Subject", "Program");

    public static void main(String[] args) {
        Game game = new Game();
        while (true) {
           game.game(words);
        }
    }

}
