package org.Nikita;

import java.util.*;

public class Game {

    private final Set<Character> letters = new HashSet<>();

    public void game(List<String> words) {
        System.out.println("Select number: ");
        System.out.println("Continue game - 0");
        System.out.println("Exit - 1");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextByte();

        switch (num) {
            case 0:
                Random random = new Random();
                String word = words.get(random.nextInt(words.size()));

                String coder = word.replaceAll(".", "_");

                Replacer replacer = new Replacer(coder);
                Drawer drawer = new Drawer();

                for (; ; ) {
                    if (!coder.contains("_")) {
                        System.out.println("You are winner!!!\n");
                        break;
                    }

                    System.out.println(coder);
                    System.out.println("Enter a letter: ");

                    char letter = scanner.next().charAt(0);

                    if (checkRepeatLetter(letter)) {
                        System.out.println("You already entered this letter!");
                    } else {
                        if (checkContains(word, letter)) {
                            coder = replacer.replace(word, letter);
                        } else {
                            System.out.println("Wrong letter!");

                            drawer.draw();

                            System.out.println("mistakes: " + drawer.getCountMistakes());
                            if (drawer.getCountMistakes() == 6) {
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                return;
            default:
                System.out.println("Wrong number!");
        }
    }

    private boolean checkContains(String word, char letter) {
        boolean result = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter || word.charAt(i) == letter - 32) {
                result = true;
                break;
            }
        }
        return result;
    }

    private boolean checkRepeatLetter(char letter){
        boolean result = false;
        if (!letters.contains(letter)) {
            letters.add(letter);
        }else {
            result = true;
        }
        return result;
    }


}
