package com.ellis.clrs.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fudw on 17-2-16.
 */
public class TestSort {

    static int[] array = new int[]{87,42, 22, 76, 3, 77, 79, 54, 81, 91, 37, 12, 24, 55, 77, 82, 3, 30, 84, 65 ,79, 47, 48, 4, 76, 11, 41, 57, 78, 24};
    static int[] tmp = new int[]{87,42, 22, 76, 3, 77, 79, 54, 81, 91, 37, 12, 24, 55, 77, 82, 3, 30, 84, 65 ,79, 47, 48, 4, 76, 11, 41, 57, 78, 24};


    @Test
    public void testMergeSort() {
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length - 1);
        assertSort();
    }

    @Test
    public void testQuikSort(){
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array);
        assertSort();
    }

    @Test
    public void testBubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        assertSort();
    }

    @Test
    public void testInsertSort() {
        InsertSort insertSort = new InsertSort();
        insertSort.sort(array);
        assertSort();
    }

    @Test
    public void testSelectSort(){
        SelectSort selectSort = new SelectSort();
        selectSort.sort(array);
        assertSort();
    }

    @Test
    public void testHeapSort(){
        HeapSort heapSort = new HeapSort();
        heapSort.sort(array);
        assertSort();
    }

    @Test
    public void testShellSort(){
        ShellSort shellSort = new ShellSort();
        shellSort.sort(array);
        assertSort();
    }

    @Test
    public void testCountingSort(){
        CountingSort countingSort = new CountingSort();
        countingSort.sort(array);
        assertSort();
    }

    private void assertSort(){
        boolean flag  = true;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                if (array[i] > array[i + 1]) {
                    flag = false;
                    break;
                }
            }
        }
        Assert.assertTrue(flag);
    }
}
