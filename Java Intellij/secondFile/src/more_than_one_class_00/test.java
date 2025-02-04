package more_than_one_class_00;

public class test {
    public static void main(String[] args) {
        student std = new student();
        std.getStudentDetails();
        System.out.println();
        customer cust = new customer();
        cust.getCustomerDetails();
    }
}
