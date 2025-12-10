package streamApi.filterAndMap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/* 
 * Operations on Objects using filter and map 
 */
class Employee {
    int id;
    String name;
    String dept;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }
}

public class ObjFilterAndMap {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "IT", 60000),
                new Employee(2, "Bob", "HR", 45000),
                new Employee(3, "Charlie", "IT", 75000),
                new Employee(4, "David", "Finance", 50000),
                new Employee(5, "Eleven", "IT", 90000),
                new Employee(5, "joe", "IT", 80000));

        // Q.1 find employees whose salary is greater than 50K and less than 90000
        List<Employee> l1 = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .filter(e -> e.getSalary() < 90000)
                .toList();
        System.out.println("Employee whose salary is greater than 50K and less than 90000 ");
        for (Employee e : l1) {
            System.out.println(e.getName() + "  " + e.getSalary());
        }
        System.out.println();

        // Q2.Convert Employee objects into only names
        List<String> names = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("Employees names " + names);
        System.out.println();

        // Q.3 Get names of employees from IT department
        List<String> depNames = employees.stream()
                .filter(e -> e.getDept().equals("IT"))
                .map(Employee::getName)
                .toList();
        System.out.println("Employees from It department " + depNames);
        System.out.println();

        // Q4. Increase salary by 10% for all IT employees
        List<Employee> updateEmployees = employees.stream()
                .filter(e -> e.getDept().equals("IT"))
                .map(e -> new Employee(
                        e.getId(),
                        e.getName(),
                        e.getDept(),
                        e.getSalary() * 1.1))
                .toList();
        System.out.println("IT employess after 10 % increment in their salary");
        for (Employee e : updateEmployees) {
            System.out.println(e.getDept() + "  " + Math.round(e.getSalary()));
        }
        System.out.println();

        // Q6. Extract employee names in uppercase
        List<String> uppercaseName = employees.stream()
                .map(e -> e.getName().toUpperCase())
                .toList();
        System.out.println("Employees name in upper case " + uppercaseName);
        System.out.println();

        // Q7. Find the highest paid employee in IT using filter
        Optional<Employee> maxSalIT = employees.stream()
                .filter(e -> e.getDept().equals("IT"))
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println("max paid it employee " + maxSalIT.get().getSalary());
        System.out.println();

        // Q8. Check if all employees in IT earn more than 50K
        Boolean check = employees.stream()
                .filter(e -> e.getDept().equals("IT"))
                .allMatch(e -> e.getSalary() > 50);
        System.out.println("Is any IT employee earning more than 50k  " + check);
        System.out.println();

        // Q9. Convert list of Employees to list of their departments (unique)
        List<String> dept = employees.stream()
                .map(Employee::getDept)
                .distinct()
                .toList();
        System.out.println("list of departments " + dept);
        System.out.println();

        // 10. Get the names of top 2 highest paid employees in IT
        List<Double> ls = employees.stream()
                .filter(e -> e.getDept().equals("IT"))
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .toList();
        System.out.println("top 2 IT salary  are  " + ls);

    }

}
