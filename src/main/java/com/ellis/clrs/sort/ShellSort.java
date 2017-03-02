package com.ellis.clrs.sort;

import com.ellis.clrs.util.PrintUtil;

/**
 * Created by fudw on 17-3-2.
 */
public class ShellSort {

    public void sort(int[] data) {
        // 计算出最大的h值
        int h = 1;
        while (h <= data.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (int i = h; i < data.length; i += h) {
                if (data[i] < data[i - h]) {
                    int tmp = data[i];
                    int j = i - h;
                    while (j >= 0 && data[j] > tmp) {
                        data[j + h] = data[j];
                        j -= h;
                    }
                    data[j + h] = tmp;
                    PrintUtil.PrintArray(data);
                }
            }
            // 计算出下一个h值
            h = (h - 1) / 3;
        }
    }
}
