package LinkedList;
import java.util.*;
public class Implementation {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public LinkedList() {
            head = null;
            tail = null;
            size = 0;
        }


        public void addLast(int val){
            Node temp = new Node(val);
            // temp.data = val;  // if u not using constructor than declare values here
            // temp.next = null;
            if(size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public void removeFirst() {
            if(size == 0) {
                System.out.println("List is empty");
            } else if(size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }


        public int getFirst() {
            if(size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            Node temp = head;
            if(size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                // temp = temp.next;
                // if(temp.next == null) {
                //     // temp = temp.next;
                //     return temp.data;
                // }
                return tail.data;
            }
        }

        public int getAt(int indx) {
            return -1;
        }


        public int size() {
            return size;
        }

        public void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+ "->");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.display();
        System.out.println("Size ->"+list.size());

        System.out.println("---------------------------------");

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.display();
        list.size();
        System.out.println("Size ->"+list.size());

        System.out.println("---------------------------------");
        
        list.removeFirst();
        list.display();
        System.out.println("Size -> "+list.size());
        
        System.out.println("---------------------------------");
        
        int first = list.getFirst();
        System.out.println("First Node is -> "+first);
        
        System.out.println("---------------------------------");

        int last = list.getLast();
        System.out.println("Last -> "+last);
    }
}