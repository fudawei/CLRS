package com.ellis.clrs.sort;

import com.ellis.clrs.util.PrintUtil;

/**
 * Created by fudw on 17-3-2.
 */
public class InsertSort {

    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
               if (array[j] > array[i]) {
                  int tmp = array[i];
                  move(array, j, i-1);
                  array[j] = tmp;
               }
            }
            PrintUtil.PrintArray(array);
        }
    }

    private void move(int[] array, int start, int end) {
        for (int i = end; i >= start; i--) {
            array[i + 1] = array[i];
        }
    }
}
