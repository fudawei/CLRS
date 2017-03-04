package com.ellis.clrs.sort;

import com.ellis.clrs.search.BinarySearch;
import com.ellis.clrs.util.PrintUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fudw on 17-2-16.
 */
public class TestSearch {

    final static int[] array = new int[]{87,42, 22, 76, 3, 77, 79, 54, 81, 91, 37, 12, 24, 55, 77, 82, 3, 30, 84, 65 ,79, 47, 48, 4, 76, 11, 41, 57, 78, 24};

    @Test
    public void testBinarySearch() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);

        BinarySearch binarySearch = new BinarySearch(array);
        Assert.assertEquals(87, array[binarySearch.search(87)]);
        Assert.assertEquals(42, array[binarySearch.search(42)]);
        Assert.assertEquals(22, array[binarySearch.search(22)]);
        Assert.assertEquals(76, array[binarySearch.search(76)]);
        Assert.assertEquals(3, array[binarySearch.search(3)]);
        Assert.assertEquals(77, array[binarySearch.search(77)]);
        Assert.assertEquals(79, array[binarySearch.search(79)]);
        Assert.assertEquals(54, array[binarySearch.search(54)]);
        Assert.assertEquals(81, array[binarySearch.search(81)]);
        Assert.assertEquals(91, array[binarySearch.search(91)]);
        Assert.assertEquals(37, array[binarySearch.search(37)]);
        Assert.assertEquals(12, array[binarySearch.search(12)]);
        Assert.assertEquals(24, array[binarySearch.search(24)]);
        Assert.assertEquals(55, array[binarySearch.search(55)]);
        Assert.assertEquals(77, array[binarySearch.search(77)]);
        Assert.assertEquals(82, array[binarySearch.search(82)]);
        Assert.assertEquals(3, array[binarySearch.search(3)]);
        Assert.assertEquals(30, array[binarySearch.search(30)]);
        Assert.assertEquals(84, array[binarySearch.search(84)]);
        Assert.assertEquals(65, array[binarySearch.search(65)]);
        Assert.assertEquals(79, array[binarySearch.search(79)]);
        Assert.assertEquals(47, array[binarySearch.search(47)]);
        Assert.assertEquals(48, array[binarySearch.search(48)]);
        Assert.assertEquals(4, array[binarySearch.search(4)]);
        Assert.assertEquals(76, array[binarySearch.search(76)]);
        Assert.assertEquals(11, array[binarySearch.search(11)]);
        Assert.assertEquals(41, array[binarySearch.search(41)]);
        Assert.assertEquals(57, array[binarySearch.search(57)]);
        Assert.assertEquals(78, array[binarySearch.search(78)]);
        Assert.assertEquals(24, array[binarySearch.search(24)]);
    }
}
