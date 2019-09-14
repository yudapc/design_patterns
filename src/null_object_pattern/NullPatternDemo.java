package null_object_pattern;

public class NullPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Cekiman");

        System.out.println("Customer 1");
        System.out.println("Name: " + customer1.getName());
        System.out.println("isNil: " + customer1.isNil());

        System.out.println("========================================");

        System.out.println("Customer 2");
        System.out.println("Name: " + customer2.getName());
        System.out.println("isNil: " + customer2.isNil());
    }
}
