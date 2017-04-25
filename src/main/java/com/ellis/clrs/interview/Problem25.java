package com.ellis.clrs.interview;


import java.net.Inet4Address;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by fudw on 17-4-21.
 *
 * 题目:输入一颗二叉树和一个整数,打印出二叉树中结点值的和为输入整数的所
 * 有路径。从树的根节点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class Problem25 {

  public static Stack<Integer> stack = new Stack<Integer>();

  public static void main(String[] args) {
    TreeNode node = new TreeNode(1, null, null);
    TreeNode node2 = new TreeNode(2, null, null);
    TreeNode node3 = new TreeNode(3, null, null);
    TreeNode node4 = new TreeNode(4, null, null);
    TreeNode node5 = new TreeNode(5, null, null);
    TreeNode node6 = new TreeNode(6, null, null);
    TreeNode node7 = new TreeNode(7, null, null);
    TreeNode node8 = new TreeNode(8, null, null);


    /*

            1

       2         3

    4         5       6

       7            8
     */
    node.left = node2;
    node.right =  node3;

    node2.left = node4;
    node4.right = node7;
    node3.left = node5;
    node3.right = node6;
    node6.left = node8;

    findPath(node, 18);

  }

  public static void findPath(TreeNode root,int sum){
    if(root==null)
      return;
    Stack<Integer> stack=new Stack<Integer>();
    int currentSum=0;
    findPath(root, stack, sum, currentSum);
  }

  public static void findPath(TreeNode root, Stack<Integer> stack, int num, int currSum)  {
    if(root==null)
      return;
    currSum += root.value;
    stack.add(root.value);
    if ((root.left == null && root.right == null) && num == currSum) {
      StringBuffer buffer = new StringBuffer();
      for (Integer value : stack) {
        buffer.append(value + " -> ");
      }
      String resoult = buffer.toString();
      System.out.println(resoult.substring(0, resoult.length() - 4));
    }

    if (root.left != null) {
      findPath(root.left, stack, num, currSum);
    }

    if (root.right != null) {
      findPath(root.right, stack, num, currSum);
    }
    stack.pop();
  }
}

