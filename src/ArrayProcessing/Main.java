package src.ArrayProcessing;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i < 9; i++) {
            numbers[i] = numbers[i + 1];
        }

        System.out.println(java.util.Arrays.toString(numbers));
    }
}