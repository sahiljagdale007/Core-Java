package one_to_one_Test_package;


import one_to_one_Beans_package.Account;
import one_to_one_Beans_package.Employee;

public class Test {
    public static void main(String[] args){
        Account account = new Account();
        account.setAccNo("ACC-111");
        account.setAccName("Sahil Jagdale");
        account.setAccType("Savings");
        account.setAccBalance(50000.0f);

        Employee employee = new Employee();
        employee.setEid("E-111");
        employee.setEname("Sahil Jagdale");
        employee.setEsal(65000.0f);
        employee.setEaddr("Sangli");
        employee.setAccount(account);
        employee.getEmployeeDetails();
    }
}
