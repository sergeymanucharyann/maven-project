package array_method_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ArrayTest {

    /**
     * Ex.4
     * This is a method that finds and prints the smallest element of the float[] array.
     *
     * @param f float[]
     * @return min
     */
    public long smallestNumber(float[] f) {
        float min = f[0];
        for (float v : f) {
            if (v < min) {
                min = v;
            }
        }
        return (long) min;
    }
    @Test
    public void testSmallestNumberMethod() {
        float[] arr = {1.5f, -2.0f, 3.2f, -4f, 0.9f};
        float result = smallestNumber(arr);
        Assertions.assertEquals(-4f, result);
    }

//--------------------------------------------------------------------------------------------


    /**
     * Exercise 3
     * This is a method that finds and prints the largest element of the long[] array.
     *
     * @param i long[]
     * @return maximum
     */
    public long biggestNumber(long[] i) {
        long maximum = i[0];
        for (long l : i) {
            if (l > maximum) {
                maximum = l;
            }
        }
        return maximum;
    }
    @Test
    public void testBiggestNumberMethod() {
        long[] arr = {4,-5,6,-84,65,3,-3};
        long result = biggestNumber(arr);
        Assertions.assertEquals(65, result);
    }


}