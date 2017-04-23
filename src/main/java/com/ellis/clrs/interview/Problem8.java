package com.ellis.clrs.interview;

/**
 * Created by fudw on 17-4-21.
 *
 * 题目描述:把一个数组最开始的若干个元素搬到数组的末尾,我们称之为数组的
 * 旋转。输入一个递增排序的数组的一个旋转,输出旋转数组的最小元素。例如数
 * 组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转,该数组的最小值为 1.
 *
 *[1,2,3,4,5] ==> [3,4,5,1,2]
 *特殊情况：
 * []
 * [1]
 * [1,2,3,4,5]
 *
 */
public class Problem8 {

  public static void main(String[] args) {
    int[] array = {3,4,5,0,1,2};
    //int[] array = {1,2,3,4,5};
    System.out.println(findMiniNum(array));
  }

  public static int findMiniNum(int[] array) {
    if (array == null) {
      throw new RuntimeException("parameter is null !");
    }

    if (array.length == 0) {
      throw new RuntimeException("array size is 0 !");
    }

    if (array.length == 1) {
      return array[0];
    }

    int begin = 0,end = array.length - 1;
    int last = array[end];

    if (array[begin] < array[end]) {
      return array[begin];
    }

    while(begin < end) {
      int mid = (begin + end) / 2;
      if (array[mid] > last) {
        begin = mid + 1;
      } else if(array[mid] < last) {
        if (array[mid - 1] > array[mid]) {
          return array[mid];
        }
        end = mid - 1;
      }
    }
    return 0;
  }
}
