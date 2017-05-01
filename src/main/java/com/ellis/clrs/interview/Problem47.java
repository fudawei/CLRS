package com.ellis.clrs.interview;


import java.util.Stack;

/**
 * Created by fudw on 17-4-21.
 *
 * 题目:写一个函数,求两个整数之和,要求在函数体内不得使用+、-、*、/四则
 * 运算符号
 */
public class Problem47 {

  public static void main(String[] args) {
    System.out.println(addLoop(999,999));
  }

  public static int add(int a, int b) {

    if (b == 0) {
      return  a;
    }

    int sum = a ^ b;
    int carray = (a & b) << 1;

    return add(sum, carray);
  }

  public static long addLoop(long a, long b) {
    long resoul = 0, carry = 0;
    do {
      long sum = a ^ b;
      carry = (a & b) << 1;
      a = sum;
      b = carry;
    } while (b != 0) ;

    return a;
  }
}