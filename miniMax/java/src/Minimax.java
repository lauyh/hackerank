import java.util.Arrays;

public class Minimax {

    public Minimax() {

    }

    public long[] miniMax(long[] arr) {
        long min = 0;
        long max = 0;
        Arrays.sort(arr);
        // Stream<Integer> newArr = Arrays.stream(arr);
        long sum = Arrays.stream(arr).reduce(0, (a, b) -> a + b);

        min = sum - arr[arr.length - 1];
        max = sum - arr[0];

        long[] res = { min, max };
        return res;
    }
}