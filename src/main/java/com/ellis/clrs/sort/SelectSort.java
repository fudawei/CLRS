package com.ellis.clrs.sort;

import com.ellis.clrs.util.PrintUtil;

/**
 * Created by fudw on 17-3-2.
 */
public class SelectSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            int tmp = array[index];
            move(array, i, index - 1);
            array[i] = tmp;
            PrintUtil.PrintArray(array);
        }
    }

    private void move(int[] array, int start, int end) {
        for (int i = end; i >= start; i--) {
            array[i + 1] = array[i];
        }
    }
}
