package builder_pattern;

public class EmployeeBuilder {
    private String name = "";
    private String phone = "";
    private String address = "";

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Employee build() {
        return new Employee(this.name, this.phone,this.address);
    }
}
