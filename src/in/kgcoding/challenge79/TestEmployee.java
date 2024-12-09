package in.kgcoding.challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Pramod",25,20000);
        System.out.println(emp.getEmployeeDetails());
        emp.setEmpName("Surya");
        System.out.println(emp.getEmployeeDetails());

    }
}
