package Lists;

public class EmployeeNodeLinkedList {

    private Employee employee;
    private EmployeeNodeLinkedList next;

    public EmployeeNodeLinkedList(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNodeLinkedList getNext() {
        return next;
    }

    public void setNext(EmployeeNodeLinkedList next) {
        this.next = next;
    }

    public String toString() {
        return employee.toString();
    }
}
