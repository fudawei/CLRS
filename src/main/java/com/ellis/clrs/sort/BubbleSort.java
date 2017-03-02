package com.ellis.clrs.sort;

import com.ellis.clrs.util.PrintUtil;

/**
 * Created by fudaw on 2017/3/1.
 */
public class BubbleSort {

  public void sort(int[] array) {
    if (array == null) {
      return;
    }

    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          switchValue(array, j + 1, j);
        }
      }
      PrintUtil.PrintArray(array);
    }
  }

  private void switchValue(int[] array,int index1, int index2) {
    int tmp = array[index1];
    array[index1] = array[index2];
    array[index2] = tmp;
  }
}
