
/*1. Your company employs 200 people. They keep records of all the employee information in the *Employees.csv* file, which contains the following columns: first name, last name, department, position, and salary. However, they would like to sort the data; first, they would like to group the rows by department lexicographically, and then they would like to sort the rows by salary.
As a Java developer, you have been assigned to create a Java application that is capable of carrying out this task.*/
import java.util.*;
import java.io.*;

class Employee {
  private String firstName;
  private String lastName;
  private String department;
  private String email;
  private double salary;

  public Employee(String firstName, String lastName, String department, String email, double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.department = department;
    this.email = email;
    this.salary = salary;
  }

  public String getDepartment() {
    return department;
  }

  public double getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return firstName + "," + lastName + ", " + department + ", " + email + ", " + salary;
  }
}

public class EmployeeSorter {
  public static void main(String[] args) {
    List<Employee> employees = readEmployeesFromCSV("Employees.csv");

    Map<String, List<Employee>> departmentGroups = new HashMap<>();
    for (Employee employee : employees) {
      if (employee.getSalary() <= 0) {
        continue;
      }
      departmentGroups.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>())
          .add(employee);
    }

    List<String> sortedDepartments = new ArrayList<>(departmentGroups.keySet());
    Collections.sort(sortedDepartments);

    for (String department : sortedDepartments) {
      List<Employee> group = departmentGroups.get(department);
      group.sort((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()));
    }

    System.out.println("First_Name " + " " + "LastName " + " " + "Department " + " " + "Email " + " " + "Salary ");

    for (String department : sortedDepartments) {
      System.out.println("Department: " + department);
      List<Employee> group = departmentGroups.get(department);
      for (Employee employee : group) {
        System.out.println(employee);
      }
    }
  }

  private static List<Employee> readEmployeesFromCSV(String fileName) {
    List<Employee> employees = new ArrayList<>();
    String line;
    boolean isFirstLine = true;
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      while ((line = br.readLine()) != null) {
        if (isFirstLine) {
          isFirstLine = false;
          continue;
        }
        String[] data = line.split(",");
        if (data.length < 5) {
          // System.out.println("Invalid data format: " + line);
          continue;
        }
        String firstName = data[0].trim();
        String lastName = data[1].trim();
        String department = data[2].trim();
        String email = data[3].trim();
        double salary = 0.0;
        try {
          if (!data[4].isEmpty()) {
            salary = Double.parseDouble(data[4].trim());
          }
        } catch (NumberFormatException ignored) {
          continue;
        }
        employees.add(new Employee(firstName, lastName, department, email, salary));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return employees;
  }
}
