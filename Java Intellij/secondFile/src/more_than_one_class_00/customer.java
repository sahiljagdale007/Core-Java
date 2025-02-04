package more_than_one_class_00;

public class customer {
    String custid = "C-555";
    String custname = "Anil";
    String custAddr = "Sangli";

    public void getCustomerDetails() {
        System.out.println("CUSTOMER DETAILS");
        System.out.println("-----------------------------");
        System.out.println("Customer Id     :" + custid);
        System.out.println("Customer Name   :" + custname);
        System.out.println("Customer Address:" + custAddr);
    }
}
