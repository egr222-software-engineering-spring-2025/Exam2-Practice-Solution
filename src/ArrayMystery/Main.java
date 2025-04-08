package ArrayMystery;

public class Main {
    public static void arrayMystery5(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                nums[i + 1]++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\nx1");
        int[] x1 = {8};
        System.out.println(java.util.Arrays.toString(x1));
        arrayMystery5(x1);
        System.out.println(java.util.Arrays.toString(x1));

        System.out.println("\nx2");
        int[] x2 = {14, 7};
        System.out.println(java.util.Arrays.toString(x2));
        arrayMystery5(x2);
        System.out.println(java.util.Arrays.toString(x2));

        System.out.println("\nx3");
        int[] x3 = {7, 1, 3, 2, 0, 4};
        System.out.println(java.util.Arrays.toString(x3));
        arrayMystery5(x3);
        System.out.println(java.util.Arrays.toString(x3));

        System.out.println("\nx4");
        int[] x4 = {10, 8, 9, 5, 5};
        System.out.println(java.util.Arrays.toString(x4));
        arrayMystery5(x4);
        System.out.println(java.util.Arrays.toString(x4));

        System.out.println("\nx5");
        int[] x5 = {12, 11, 10, 10, 8, 7};
        System.out.println(java.util.Arrays.toString(x5));
        arrayMystery5(x5);
        System.out.println(java.util.Arrays.toString(x5));
    }
}