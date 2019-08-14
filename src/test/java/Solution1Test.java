
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Solution1Test {

    private Solution soln = new Solution1();
    private int[] input;
    private int expected;

    public Solution1Test(int[] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testMaxArea() {
        System.out.println("expected result = " + expected);
        assertEquals(expected, soln.maxArea(input));
    }

    @Parameterized.Parameters
    public static Collection params() {
        return Arrays.asList(new Object[][]{
                {new int[]{1,1}, 1},
                {new int[]{1,8,6,2,5,4,8,3,7}, 49}
        });
    }
}