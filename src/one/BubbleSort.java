package one;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 6, 5, 1};

        boolean changes = false;

        do {
            changes = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    changes = true;
                }
            }
        } while (changes);

        String arraysAsString = Arrays.toString(numbers);
        System.out.println(arraysAsString);
    }
}

