package com.ellis.clrs.interview;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by fudw on 17-4-21.
 *
 * 题目:输入一个链表,输出该链表中倒数第 k 个结点。为了符合大多数人的习惯,
 * 本题从 1 开始计数,即链表的尾结点是倒数第一个结点。例如一个有 6 个结点的
 * 链表,从头结点依次是 1,2,3,4,5,6。倒数第三个结点就是值为 4 的结点。
 */
public class Problem22 {

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

    4         5     6

       7         8
     */
    node.left = node2;
    node.right =  node3;

    node2.left = node4;
    node4.right = node7;
    node3.left = node5;
    node3.right = node6;
    node6.left = node8;


    AddToStack(node);

  }

  public static void AddToStack(TreeNode root) {
    if(root==null)
      return;
    Queue<TreeNode> queue=new
            LinkedList<TreeNode>();
    queue.add(root);
    while(!queue.isEmpty()){
      TreeNode node=queue.poll();
      System.out.print(node.value + "   ");
      if(node.left!=null){
        queue.add(node.left);
      }
      if(node.right!=null){
        queue.add(node.right);
      }
    }
  }
}

