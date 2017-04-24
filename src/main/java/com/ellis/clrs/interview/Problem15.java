package com.ellis.clrs.interview;


import java.awt.*;

/**
 * Created by fudw on 17-4-21.
 *
 * 题目:输入一个链表,输出该链表中倒数第 k 个结点。为了符合大多数人的习惯,
 * 本题从 1 开始计数,即链表的尾结点是倒数第一个结点。例如一个有 6 个结点的
 * 链表,从头结点依次是 1,2,3,4,5,6。倒数第三个结点就是值为 4 的结点。
 */
public class Problem15 {

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

    Node.printLink(head);
    Node node = findKToTail1(head, 1);

    if (node.next == null) {
      node = null;
    }

    if (node.next != null) {
      System.out.println(node.value);
      Node next = node.next;
      node.value = node.next.value;
      if (next.next != null) {
        node.next = next.next;
      } else {
        node.next = null;
      }
      next = null;
    }

    Node.printLink(head);
  }

  public static Node findKToTail(Node current, int K) {
    Node head = current;

    if (head == null) {
      return current;
    }

    while (head != null) {
      head = head.next;
      K --;
       if(K < 0){
         current = current.next;
       }
    }
    current = current.next;
    return current;
  }

  public static Node findKToTail1(Node head,int k){
    if(head==null||k==0){
      return null;
    }
    Node resultNode=null;
    Node headListNode=head;
    for(int i=0;i<k;++i){
      if(headListNode.next!=null){
        headListNode=headListNode.next;
      }else{
        return null;
      }
    }
    resultNode=head;
    while(headListNode!=null){
      resultNode=resultNode.next;
      headListNode=headListNode.next;
    }
    return resultNode;
  }
}

