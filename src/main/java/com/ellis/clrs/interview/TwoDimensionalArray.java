package com.ellis.clrs.interview;

/**
 * Created by fudw on 17-4-19.
 * 二位数组查找
 */
public class TwoDimensionalArray {

  static int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};

  /*
   *  1  2  8  9
   *  2  4  9  12
   *  4  7  10 13
   *  6  8  11 15
   */

  public static boolean search(int value, int[][] array) {
    int lenght1 = array.length;
    int lenght2 = array[0].length;
    int indexOne = 0, indexTwo = 0;
    while(true) {
      if (array[indexOne][indexTwo] == value) {
        return true;
      }
      System.out.println(array[indexTwo][indexOne]);
      if (array[indexTwo][indexOne] < 7) {
        indexOne ++;
      } else {
        indexOne --;
        indexTwo ++;
      }
      if (indexOne > (lenght2 - 1) || indexTwo > (lenght1 - 1)){
        return false;
      }
    }
  }

  public static void main(String[] args) {
    search(16,array);
  }
}
