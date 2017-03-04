package com.ellis.clrs.search;

/**
 * Created by fudw on 17-3-4.
 */
public class BinarySearch {

    private int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    public int search(int value) {
        if (array == null) {
            return 0;
        }

        boolean flag = false;
        int start = 0;
        int end = array.length - 1;
        int media = 0;
        while (start <= end) {
            media = (end + start) /2;
            if (value == array[media]) {
                flag = true;
                break;
            } else if (value > array[media]) {
                start = media + 1;
            } else if (value < array[media]) {
                end = media - 1;
            }
        }
        return flag ? media : -1;
    }
}
