package com.ellis.clrs.interview;

/**
 * 题目:输入一个整数 n,求从 1 到 n 这 n 个整数的十进制表示中 1 出现的次
 * 数。例如输入 12,这些整数中包含 1 的数字有 1,10,11,12, 1 一共出现了 5 次。
 */
public class Problem31 {

  public static void main(String[] args) {
    System.out.println(countOne(257));
  }

  public static int countOne(int n) {
    if (n == 0) return 0;
    int count = 0;
    while (n != 0) {
      count ++;
      n = n & (n - 1);
    }

    return count;
  }
}
