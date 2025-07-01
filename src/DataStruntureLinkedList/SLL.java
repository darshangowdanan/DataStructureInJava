package DataStruntureLinkedList;

class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

public class SLL {
    private Node head;

    SLL(){
        head = null;
    }

    void insertAtHead(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NUll");
    }
    }
class Driver {
    public static void main(String[] args) {
        SLL ll = new SLL();
        ll.insertAtHead(50);
        ll.display();
    }
}
