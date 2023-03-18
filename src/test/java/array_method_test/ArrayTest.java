package array_method_test;

import org.example.ArrayHomework;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {
    ArrayHomework arrayHomework = new ArrayHomework();
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


}