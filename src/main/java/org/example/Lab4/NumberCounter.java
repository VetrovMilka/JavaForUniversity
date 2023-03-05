package org.example.Lab4;

public class NumberCounter implements Runnable {
    private final String input;
    private int count;
    private int sum;

    public NumberCounter(String input) {
        this.input = input;
    }

    public int getCount() {
        return count;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                count++;
                sum += Character.getNumericValue(c);
            }
        }
    }
}
