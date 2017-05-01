package com.ellis.clrs.interview;


/**
 * Created by fudw on 17-4-21.
 * <p>
 * 题目二:字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。比如输入字符串“abcdefg”和
 * 数字 2.该函数左旋转 2 位得到的结果“cdefgab".
 */
public class Problem42 {

  public static void main(String[] args) {
    leftRotateString("1,2,3,3,43", 2);
  }

  public static void leftRotateString(String sentence,int index){
    if(sentence==null||index>sentence.length()||index<0){
      return;
    }
    String[] splitString={sentence.substring(0,index),
            sentence.substring(index,sentence.length())};
    StringBuffer resultbBuffer=new StringBuffer();
    for(String s:splitString){
      resultbBuffer.append(reverse(s));
    }
    System.out.println(reverse(resultbBuffer.toString()));}
  public static String reverse(String str) {
    char[] array=str.toCharArray();
    for(int i=0;i<(array.length+1)/2;i++)
    {
      char temp=array[i];
      array[i]=array[array.length-1-i];
      array[array.length-1-i]=temp;
    }
    return String.valueOf(array);
  }
}