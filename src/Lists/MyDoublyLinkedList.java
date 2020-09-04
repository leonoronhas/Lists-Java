package Lists;

public class MyDoublyLinkedList {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 122);
        Employee leoSantos = new Employee("Leo", "Noronha Santos", 2553);
        Employee dougJhonson = new Employee("Doug", "Jhonson", 288);
        Employee guiNascimento = new Employee("Gui", "Nascimento", 744);

        // Create new linked list
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        // Add items to the front of the list with our addToFront method
        list.addToFront(janeJones);
        list.addToFront(leoSantos);
        list.addToFront(dougJhonson);

        // Add items to the back of the list with our addToEnd method
        list.addToEnd(guiNascimento);

        // Print items from our printList method
        list.printList();

        // Get size
         System.out.println("\nSingly linked list size: " + list.getSize());

        // Is list empty? boolean
         System.out.println("Is list empty? " + list.isEmpty());

        // Remove item from front of the list
         list.removeFromFront();

         list.printList();

        // Remove item from end of the list
         list.removeFromEnd();

         list.printList();
    }
}
