package com.ellis.clrs.interview;

/**
 * Created by fudw on 17-4-19.
 * 反向打印链表
 *
 */
public class RevesePrintArray {
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

    /*Node index = head;
    while(index != null) {
      System.out.println(index.value);
      index = index.next;
    }
*/
    //revese(head);
    reveseArray(head);
  }

  public static void revese(Node head) {
    if (head != null) {
      if (head.next != null) {
        revese(head.next);
      }
    }
    System.out.println(head.value);
  }


  public static Node reveseArray(Node head) {
    Node psv = null;
    Node current = null;
    Node nxt = null;
    if (head == null) {
      return head;
    }

    psv = head;
    current = head.next;
    nxt = current.next;
    psv.next = null;

    while (current.next != null) {
      current.next = psv;
      psv = current;
      current = nxt;
      nxt = nxt.next;
    }
    current.next = psv;

    Node tmp = current;
    while(tmp != null) {
      System.out.println(tmp.value);
      tmp = tmp.next;
    }
    return null;
  }
}

class Node {
  int value;
  Node next;

  public Node(int value) {
    this.value = value;
  }

  public static void printLink(Node head) {
    if (head != null) {
      while (head != null) {
        System.out.print(head.value + "   ");
        head = head.next;
      }
    }
    System.out.println();
  }
}