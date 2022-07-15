import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import java.util.List;
import java.util.ArrayList;

public class MinimaxTest {
    Minimax minimax = new Minimax();
    // List<Integer> arr = new ArrayList<Integer>();
    long[] arr_1 = { 1, 3, 2, 4, 5 };
    long[] arr_2 = { 256741038L, 623958417, 467905213, 714532089, 938071625 };
    long[] expectOutput = { 10, 14 };
    long[] expectOutput2 = { 2063136757, 2744467344L };

    @Test
    public void calcMinMax() {
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(5);

        int[] res = minimax.miniMax(arr_1);

        System.out.printf("[INFO]\t-\tres: %d %d", res[0], res[1]);
        assertArrayEquals(expectOutput, res);
    }

    @Test
    public void calcMinMax2() {

        // arr.add(256741038);
        // arr.add(623958417);
        // arr.add(467905213);
        // arr.add(714532089);
        // arr.add(938071625);

        int[] res = minimax.miniMax(arr_2);

        System.out.printf("[INFO]\t-\tres: %d %d", res[0], res[1]);
        assertArrayEquals(expectOutput2, res);
    }
}