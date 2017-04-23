package com.ellis.clrs.interview;

/**
 * Created by fudw on 17-4-21.
 *
 * 题目一:写一个函数,输入 n,求斐波那契数列的第 n 项
 *
 */
public class Problem9 {

  public static void main(String[] args) {
    System.out.println(fibonacci(1));
    System.out.println(fibonacci(2));
    System.out.println(fibonacci(3));
    System.out.println(fibonacci(4));
    System.out.println(fibonacci(5));
    System.out.println(fibonacci(6));
    System.out.println(fibonacci(7));

    System.out.println(fibonacci2(1));
    System.out.println(fibonacci2(2));
    System.out.println(fibonacci2(3));
    System.out.println(fibonacci2(4));
    System.out.println(fibonacci2(5));
    System.out.println(fibonacci2(6));
    System.out.println(fibonacci2(7));
  }

  public static int fibonacci(int n) {
    if (n < 2) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }


  public static long fibonacci2(int n)
  {
    long result=0;
    long preOne=0;
    long preTwo=1;
    if(n==0){
      return preOne;
    }
    if(n==1)
    {
      return preTwo;
    }
    for(int i=2;i<=n;i++)
    {
      result=preOne+preTwo;
      preOne=preTwo;
      preTwo=result;
    }
    return result;
  }
}
