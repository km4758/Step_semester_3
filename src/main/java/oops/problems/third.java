package main.java.oops.problems;

class Employee {
    String empName;
    double salary;
    boolean permanent;
}

public class third {
    public static void main(String[] args) {
        // Create Employee object without setting any fields
        Employee emp = new Employee();

        // Print fields immediately to observe default values
        System.out.println("Name: " + emp.empName);
        System.out.println("Salary: " + emp.salary);
        System.out.println("Permanent: " + emp.permanent);
    }
}
