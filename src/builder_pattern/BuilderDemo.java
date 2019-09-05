package builder_pattern;

public class BuilderDemo {
    public static void main(String[] args) {
        Employee employee = (new EmployeeBuilder()).setName("Yuda").setAddress("Jakarta").build();
        System.out.println("Name: " + employee.getName());
        System.out.println("Phone: " + employee.getPhone());
        System.out.println("Address: " + employee.getAddress());
    }
}
