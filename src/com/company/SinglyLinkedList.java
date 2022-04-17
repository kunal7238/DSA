package com.company;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Display Singly Linked List
    public void display(){
        if(head == null){
            System.out.println("Singly Linked List is Empty");
        }
        ListNode current = head;
        while(current != null){
            System.out.print(current.data +"-->");
            current= current.next;
        }
        System.out.println("Null");
    }

    // Print Length of the Singly Linked List
    public int length(){
        if(head == null){
            return 0;
        }
        int count =0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    // Add first node in Singly Linked List
    public void addFirst(int value){
        ListNode newList = new ListNode(value);
        newList.next = head;
        head = newList;
    }

    // Insert the node at last of the Singly Linked List
    public void addLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null ){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String args[]){
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.head = new ListNode(10);
    ListNode second = new ListNode(20);
    ListNode third = new ListNode(30);

    sll.head.next = second;
    second.next = third;

    sll.display();
    System.out.println("Length is : " + sll.length());
    sll.addFirst(1);
    sll.display();
    System.out.println("Length is : " + sll.length());

    sll.addLast(40);
    sll.display();
    System.out.println("Length is : " + sll.length());

    }
}
