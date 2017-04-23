package com.ellis.clrs.interview;

/**
 * Created by fudw on 17-4-21.
 * 题目:给定单向链表的头指针和一个结点指针,定义一个函数在 O(1)时间删除
 * 该结点。
 */
public class Problem14 {

  public static void main(String[] args) {
    Node head = new Node(1);
    Node node1 = new Node(2);
    Node node2 = new Node(3);
    Node node3 = new Node(4);
    Node node4 = new Node(5);
    Node node5 = new Node(6);
    Node node6 = new Node(7);
    Node node7 = new Node(8);
    Node node8 = new Node(9);
    Node node9 = new Node(10);
    Node node10 = new Node(11);
    Node node11 = new Node(12);
    Node node12 = new Node(13);
    Node node13 = new Node(14);
    Node node14 = new Node(15);
    Node node15 = new Node(16);

    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    node5.next = node6;
    node6.next = node7;
    node7.next = node8;
    node8.next = node9;
    node9.next = node10;
    node10.next = node11;
    node11.next = node12;
    node12.next = node13;
    node13.next = node14;
    node14.next = node15;

    Node.printLink(removNode(head, node14));
  }

  public static Node removNode(Node head, Node toMove) {
    if (toMove == null) {
      return head;
    }

    if (head == null) return head;
    // 当链表只有一个节点，而且删除当前节点时，将head设置为null
    if (head.next == null && head.value == toMove.value) {
      head = null;
      return head;
    }

    Node current = head;
    Node temp = null;
    boolean flag = false;
    while (head != null && (flag = !(head.value == toMove.value))) {
      temp = head;
      head = head.next;
    }
    // 删除首节点
    if (temp == null) {
      current = head.next;
      return current;
    }
    // 删除最后一个节点
    if (!flag && head.next == null) {
      temp.next = null;
      return current;
    }

    if (!flag) {
      Node next = head.next;
      Node nextTwo = next.next;
      head.value = next.value;
      head.next = nextTwo;
      next.next = null;
    }
    return current;
  }

  public static Node removeNode2(Node head, Node remove) {
    if (head == null || remove == null) return head;
    if (head.next == null) {
      if (head == remove) {
        return head = null;
      }
      return head;
    }

    if (remove == head) {
      Node next = head.next;
      head = null;
      return next;
    }

    if (remove.next == null) {
      Node current = head;
      Node pre = null;
      while (current != null) {
        if (current.next == null) break;
        pre = current;
        current = current.next;
      }

      if (current == remove) {
        pre.next = null;
      }
    }

    return head;
  }
}

