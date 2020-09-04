package Lists;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {

        // Starting with List to be easier to implement other types of lists besides ArrayList
        List<Employee> employeeList = new ArrayList<>();

        // Use the add method to add elements to the List
        employeeList.add(new Employee("Jane", "Jones", 122));
        employeeList.add(new Employee("Leo", "Noronha Santos", 2553));
        employeeList.add(new Employee("Doug", "Jhonson", 288));
        employeeList.add(new Employee("Gui", "Nascimento", 744));

        // Print items in a list
        // employeeList.forEach(employee -> System.out.println(employee));

        // Print an item by the index
        // System.out.println("Employee at index 0 is:\n" + employeeList.get(0));

        // Check if list is empty
         System.out.println("Is List empty? " + employeeList.isEmpty());

        // Update/Replace item based on index
        // employeeList.set(0, new Employee("Jane", "Tarzan", 155));
        // System.out.println("Now employee at index 0 is:\n" + employeeList.get(0));

        // Get size of the list [ number of items ]
        // System.out.println("Number of items in the list is: " + employeeList.size());

        // Add items in a specific index and not at the end
        // employeeList.add(3, new Employee("Makr", "Corkz", 553));
        // System.out.println("Now employee at index 3 is: " + employeeList.get(3));

        // Get array with items from list
        // Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        // for (Employee employee: employeeArray){
        //    System.out.println(employee);
        // }

        // Check if list contains an item [Make sure the class you are using,
        // Employee in my case has the equal method implemented
        // System.out.println(employeeList.contains(new Employee("Leo", "Noronha Santos", 2553)));

        // Check if list contains an item based on the index
        // System.out.println(employeeList.indexOf(new Employee("Leo", "Noronha Santos", 2553)));

        // Remove an item from the list and remove it by the index
        // employeeList.remove(new Employee("Leo", "Noronha Santos", 2553));
        // employeeList.remove(2);
        // employeeList.forEach(employee -> System.out.println(employee));
    }
}
