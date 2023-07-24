import twosum.SolutionTwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,4,5};
        int[] results = new SolutionTwoSum().twoSum(numbers, 9);
        System.out.println("results = " + Arrays.toString(results));
    }
}