package Lists;

public class EmployeeDoublyLinkedList {

    // My simple implementation of a Doubly Linked List
    // Use a doubly linked list if you want to add items to the front or back of the list
    // otherwise it will be O(n) instead of O(1) same thing with removing an item because you need to iterate the list

    private EmployeeNodeDoublyLinkedList head;
    private EmployeeNodeDoublyLinkedList tail;

    private int size = 0;

    public void addToFront(Employee employee) {
        EmployeeNodeDoublyLinkedList node = new EmployeeNodeDoublyLinkedList(employee);

        // Connect nodes
        // 1- new node with new value next linked to the head
        node.setNext(head);
        // check for empty list
        if (head == null) {
            tail = node;
        } else {
            // 2- head previous linked to new node
            head.setPrevious(node);
        }
        // 3- set head to new node
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNodeDoublyLinkedList node = new EmployeeNodeDoublyLinkedList(employee);

        // Connect nodes
        // 1- new node with new value previous linked to the tail
        node.setPrevious(tail);
        // check for empty list
        if (tail == null) {
            head = node;
        } else {
            // 2- tail next linked to new node
            tail.setNext(node);
            node.setPrevious(tail);
        }
        // 3- set tail to new node
        tail = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeNodeDoublyLinkedList removeFromFront() {

        if (isEmpty()) {
            return null;
        }

        EmployeeNodeDoublyLinkedList removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();

        size--;
        // Clear references
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNodeDoublyLinkedList removeFromEnd() {

        if (isEmpty()) {
            return null;
        }

        EmployeeNodeDoublyLinkedList removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();

        size--;
        // Clear references
        removedNode.setPrevious(null);
        return removedNode;
    }

    public void printList() {
        EmployeeNodeDoublyLinkedList current = head;
        System.out.print("HEAD <=> ");

        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.print("null\n\n");
    }
}
