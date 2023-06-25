package org.Nikita;

public class Drawer {

    private int countMistakes;

    public void draw() {
        countMistakes++;
        switch (countMistakes) {
            case 1 -> System.out.println("""
                    ---
                     |  |
                     o  |
                        |
                        |
                    ----""");
            case 2 -> System.out.println("""
                    ---
                     |  |
                     o  |
                     |  |
                        |
                    ----""");
            case 3 -> System.out.println("""
                    ----
                     |  |
                     o  |
                    /|  |
                        |
                    ----""");
            case 4 -> System.out.println("""
                    ----
                     | |
                     o |
                    /|\\|
                       |
                    ----""");
            case 5 -> System.out.println("""
                    ----
                     | |
                     o |
                    /|\\|
                    /  |
                    ----""");
            case 6 -> System.out.println("""
                    ----
                     | |
                     o |
                    /|\\|
                    / \\|
                    ----
                    You lose(""");
        }
    }

    public int getCountMistakes(){
        return countMistakes;
    }
}
