package org.Nikita;

public class Replacer {

    private String word;

    public Replacer(String word) {
        this.word = word;
    }


    public String replace(String input, char letter) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char partOfWord = input.charAt(i);
            if (partOfWord == letter || partOfWord == (letter - 32)) {
                builder.append(letter);
            } else if (Character.isLetter(word.charAt(i))) {
                builder.append(word.charAt(i));
            } else {
                builder.append('_');
            }
        }
        word = builder.toString();
        return word;
    }
}
