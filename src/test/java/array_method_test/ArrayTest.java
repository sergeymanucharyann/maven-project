package array_method_test;

import org.example.ArrayHomework;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class ArrayTest {
    ArrayHomework arrayHomework = new ArrayHomework();

    @Test
    void testReverseArrayMethod() {
        short[] arr = {1, 2, 3};
        List<Short> reversedList = arrayHomework.printReversArray(arr);
        Assertions.assertEquals(arr.length, reversedList.size());
        Assertions.assertEquals(3, reversedList.get(0).shortValue());
        Assertions.assertEquals(2, reversedList.get(1).shortValue());
        Assertions.assertEquals(1, reversedList.get(2).shortValue());
    }

    @Test
    public void testSmallestNumberMethod() {
        float[] arr = {1.5f, -2.0f, 3.2f, -4f, 0.9f};
        float result = arrayHomework.smallestNumber(arr);
        Assertions.assertEquals(-4f, result);
    }

    @Test
    public void testBiggestNumberMethod() {
        long[] arr = {4, -5, 6, -84, 65, 3, -3};
        long result = arrayHomework.biggestNumber(arr);
        Assertions.assertEquals(65, result);
    }

    @Test
    void testMoveMethod() {
        int[] r = {1, 2, 3};
        int[] m = {4, 5, 6};
        int[] result = arrayHomework.move(r, m);
        Assertions.assertArrayEquals(m, result);
        Assertions.assertArrayEquals(m, r);
    }

    @Test
    void testCreatArrayMethod() {
        int[] first = new int[]{7, -5, 9, 6, 4};
        int[] second = new int[]{1, 5, 8, 9, 6};
        int[] expected = new int[]{8, 0, 17, 15, 10};
        int[] original = arrayHomework.createArrays(first, second);
        Assertions.assertArrayEquals(expected, original);
    }

    @Test
    void testRepeatNumberMethod() {
        int[] ints = {4, -5, 6, 4, 65, 3, 4};
        int k = 4;
        int count = 3;
        int original = arrayHomework.repeatNumber(ints, k);
        Assertions.assertEquals(count, original);
    }
}