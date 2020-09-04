package Lists;

public class EmployeeLinkedList {

    // My simple implementation of a Singly Linked List
    // Use a singly linked list if you only want to add items to the front of the list
    // otherwise it will be O(n) instead of O(1) same thing with removing an item

    private EmployeeNodeLinkedList head;
    private int size = 0;

    public void addToFront(Employee employee) {
        EmployeeNodeLinkedList node = new EmployeeNodeLinkedList(employee);
        // Connect nodes
        // 1- new node with new value next linked to the head
        node.setNext(head);
        // 2- new node now is the head
        head = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeNodeLinkedList removeFromFront(){

        if(isEmpty()){
            return null;
        }

        EmployeeNodeLinkedList removedNode = head;
        head = head.getNext();

        size--;
        // Clear references
        removedNode.setNext(null);
        return removedNode;
    }

    public void printList() {
        EmployeeNodeLinkedList current = head;
        System.out.print("HEAD -> ");

        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("null\n\n");
    }
}
