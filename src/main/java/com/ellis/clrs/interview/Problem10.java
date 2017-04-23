package com.ellis.clrs.interview;

/**
 * Created by fudw on 17-4-21.
 *
 * 题目:请实现一个函数,输入一个整数,输出该数二进制表示中 1 的个数。例如
 *　把 9 表示成二进制是 1001;有 2 位是 1,因此如果输入 9,函数输出 2.
 *
 *   0000 0001    1
 *   0000 0010    2
 *   0000 0011    3
 *   0000 0100    4
 *   0000 0101    5
 *   0000 0110    6
 *   0000 0111    7
 */
public class Problem10 {

  public static void main(String[] args) {
    System.out.println(numberOf1(7));
  }

  public static int numberOf1(int n)
  {
    int count=0;
    while(n!=0)
    {
      count++;
      n=(n-1) & n;
    }
    return count;
  }
}
