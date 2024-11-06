package LinkedList;

public class DoublyImplementation {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static class DoubleLinkedList {
        Node head;
        Node tail;
        int size;

        public DoubleLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }

        

        public int size() {
            return size;
        }

        public void addFirst(int val) {
            Node temp = new Node(val);
            if(size == 0) {
                head = tail = temp;
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            size++;
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
        DoubleLinkedList list = new DoubleLinkedList();
        list.display();
        System.out.println("Size ->"+list.size());

        System.out.println("---------------------------------");
        
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        list.display();
        System.out.println(list.size());
        
        System.out.println("---------------------------------");
    }
    
}
