package com.ellis.clrs.interview;

/**
 * Created by fudw on 17-4-19.
 */
public class RebuildTree {

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

    firstPrint(node);
    System.out.println();

    midPrint(node);
    System.out.println();

    endPrint(node);
  }

  public static void firstPrint(TreeNode node) {
    if (node != null) {
      System.out.print(node.value+ "    ");
      firstPrint(node.left);
      firstPrint(node.right);
    }
  }
  public static void midPrint(TreeNode node) {
    if (node != null) {
      firstPrint(node.left);
      System.out.print(node.value + "    ");
      firstPrint(node.right);

    }
  }
  public static void endPrint(TreeNode node) {
    if (node != null) {
      firstPrint(node.left);
      firstPrint(node.right);
      System.out.print(node.value+ "    ");
    }
  }

}

class TreeNode {
  int value;
  TreeNode left;
  TreeNode right;

  public TreeNode(int value, TreeNode left, TreeNode right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }
}
