package com.ellis.clrs.sort;
import static com.ellis.clrs.util.PrintUtil.PrintArray;

/**
 * Created by fudw on 17-2-10.
 */
public class MergeSort {


    public void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int start1, end1, start2, end2, mid;
        mid = (start + end) / 2;
        start1 = start;
        end1 = mid;
        start2 = mid + 1;
        end2 = end;

        sort(arr, start1, end1);
        sort(arr, start2, end2);

        merge(arr, start1, end1, start2, end2);
    }

    private void merge(int[] arr, int start1, int end1, int start2, int end2) {
        System.out.println("合并： [" + start1 + ", " + end1 + "] " + "[" + start2 + ", " + end2 + "] ");
        int[] tmp = new int[end2 - start1 + 1];
        int i = start1, j = start2, index = 0;
        while (!(i > end1 && j > end2)) {
            if (i <= end1 && j <= end2) {
                if (arr[i] <= arr[j]) {
                    tmp[index] = arr[i];
                    i++;
                } else {
                    tmp[index] = arr[j];
                    j++;
                }
            } else if (i <= end1 && j > end2) {
                tmp[index] = arr[i];
                i++;
            } else if (i > end1 && j <= end2) {
                tmp[index] = arr[j];
                j++;
            }

            index++;
        }


        int it = 0;
        for (int k = start1; k <= end2; k++) {
            arr[k] = tmp[it];
            it++;
        }
        PrintArray(arr);
    }
}