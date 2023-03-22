package sorting_algorithms;

import com.bdg.algorithms.SortingAlgorithms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSortingAlgorithms {
    SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

    @Test
    void testBubbleSortMethod() {
        int[] arr = new int[]{4, 2, 1, 3, 5};
        int[] expectedArr = new int[]{1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expectedArr, sortingAlgorithms.bubbleSort(arr));
    }

    @Test
    void testSelectionSortMethod() {
        int[] arr = new int[]{4, 2, 1, 3, 5};
        int[] expectedArr = new int[]{1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expectedArr, sortingAlgorithms.selectionSort(arr));
    }

    @Test
    void testInsertionSortMethod() {
        int[] arr = new int[]{4, 2, 1, 3, 5};
        int[] expectedArr = new int[]{1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expectedArr, sortingAlgorithms.insertionSort(arr));
    }

}
