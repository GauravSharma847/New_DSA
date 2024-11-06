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

        public void addFirst(int val) {
            Node temp = new Node(val);
            if(size == 0) {
                // head = temp;
                // temp.next = null;
                // or
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
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

        public void addAtPos(int pos,int val) {
			Node temp = new Node(val);
			Node prev = head;
			if(size == 0 && pos > 1) {
				System.out.println("Please provide pos = 1 as your list is empty");
			} else if(pos < 0 || pos >= size) {
                System.out.println("Invalid arguments");
            } else {
				for(int i = 0 ; i < pos - 2 && prev != null ; i++) {
					prev = prev.next;
				}
				temp.next = prev.next;
				prev.next = temp;
				
				size++;
			}
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

        public void removeLast() {
            Node temp = head;
            if(size == 0) {
                System.out.println("List is empty");
            } else if(size == 1) {
                head =tail = null;
            } else {
                for(int i = 0 ; i < size - 2 ; i++) {
                    temp = temp.next;
                }
                tail = temp;
                temp.next = null;
                size--;
            }
        }

        public void removeAtpos(int pos) {
            if(pos == 0) {
                removeFirst();
            } else if(pos == size - 1) {
                removeLast();
            } else if(pos < 0 || pos >= size) {
                System.out.println("Invalid Arguments");
            } else {
                Node temp = head;
                for(int i = 0 ; i < pos - 2 && temp != null ; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
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
			if(size == 0) {
				System.out.println("List is empty");
				return -1;
			} else {
				return tail.data;
			}
		}
		
		public int getAtIndex(int pos) {
			Node prev = head;
			if(size == 0) {
				System.out.println("List is Empty");
				return -1;
			} else if(pos < 0 || pos >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
				for(int i = 0 ; i < pos - 1 && prev != null ; i++) {
					prev = prev.next;
				}
				return prev.data;
			}
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
        
        // list.removeFirst();
        // list.display();
        // System.out.println("Size -> "+list.size());
        
        // System.out.println("---------------------------------");
        
        int first = list.getFirst();
        System.out.println("First Node is -> "+first);
        
        System.out.println("---------------------------------");

        int last = list.getLast();
        System.out.println("Last -> "+last);

        System.out.println("---------------------------------");

        // list.addFirst(10);
        // list.display();
        // System.out.println("Size -> "+list.size());

        System.out.println("---------------------------------");

        list.removeAtpos(2);
        list.display();
        System.out.println("Size -> "+list.size());

        System.out.println("---------------------------------");

        // list.removeLast();
        // list.display();
        // System.out.println("Size -> "+list.size());

        // System.out.println("---------------------------------");

    }
}