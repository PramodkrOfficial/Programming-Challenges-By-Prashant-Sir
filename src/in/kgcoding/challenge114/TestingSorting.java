package in.kgcoding.challenge114;


import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Pramod",20000),
                new Employee("Anand",25000),
                new Employee("Saurabh",18000),
                new Employee("Arvind",15000),
                new Employee("Roshan",28000));

        employees.stream()
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}
