public class MinMaxCalculation {
    public static int findMinimum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("The input array is empty.");
        }

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static int findMaximum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("The input array is empty.");
        }

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
}
