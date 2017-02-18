package com.ellis.clrs.util;

/**
 * Created by fudw on 17-2-16.
 */
public class PrintUtil {
    // 打印数组
    public static void PrintArray(int[] s) {
        System.out.print("\n下标:");
        for (int p = 0; p < s.length; p++) {
            System.out.printf("%2d,", p);
        }
        System.out.print("\n值值:");
        for (Integer m : s) {
            System.out.printf("%2d,", m);
        }
        System.out.println("\n-----------------------------");
    }

    public static void Println(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
        System.out.println();
    }
    public static void Print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }
}
