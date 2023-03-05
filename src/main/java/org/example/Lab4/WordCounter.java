package org.example.Lab4;

public class WordCounter implements Runnable {
    private final String input;
    private int count;

    public WordCounter(String input) {
        this.input = input;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        String cleanedInput = input.replaceAll("\\d+", "");
        String[] words = cleanedInput.split("\\W+");
        count = words.length;
    }
}

