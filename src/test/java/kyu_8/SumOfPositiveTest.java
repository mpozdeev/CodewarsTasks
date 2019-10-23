package kyu_8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SumOfPositiveTest {

    @Parameterized.Parameters(name = "Тест {index}: intArr = {0}, expected = {1}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4}, 10},
                {new int[]{0, 0, 0, 0}, 0},
                {new int[]{}, 0},
                {new int[]{-1, -2, -3, -4}, 0},
                {new int[]{-1, -2, 3, 4}, 7},
                {new int[]{-1, 2, -3, 4}, 6}
        });
    }

    private int[] intArr;
    private int expected;

    public SumOfPositiveTest(int[] intArr, int expected) {
        this.intArr = intArr;
        this.expected = expected;
    }

    @Test
    public void sumTestWithParameters() {
        assertEquals(expected, SumOfPositive.sum(intArr));
    }


    @Test
    public void sumTest() {
        assertEquals(10, SumOfPositive.sum(new int[]{1, 2, 3, 4}));
        assertEquals(0, SumOfPositive.sum(new int[]{0, 0, 0, 0}));
        assertEquals(0, SumOfPositive.sum(new int[]{-1, -2, -3, -4}));
        assertEquals(7, SumOfPositive.sum(new int[]{-1, -2, 3, 4}));
        assertEquals(6, SumOfPositive.sum(new int[]{-1, 2, -3, 4}));
    }

}