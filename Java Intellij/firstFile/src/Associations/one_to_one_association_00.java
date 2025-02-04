package Associations;

//This the contained class in one to one association
class Account {
    String accNo;
    String accName;
    String accType;
    int balance;

    Account(String accNo, String accName, String accType, int balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.accType = accType;
        this.balance = balance;
    }
}

//This is the container class
class Employee {
    String eid;
    String ename;
    float esal;
    String eaddr;
    Account account;

    Employee(String eid, String ename, float esal, String eaddr, Account account) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
        this.eaddr = eaddr;
        this.account = account;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee Details");
        System.out.println("-----------------------");
        System.out.println("Employee Id      :" + this.eid);
        System.out.println("Employee Name    :" + this.ename);
        System.out.println("Employee Type    :" + this.esal);
        System.out.println("Employee Address :" + this.eaddr);
        System.out.println();
        System.out.println("Account Details");
        System.out.println("-------------------------");
        System.out.println("Account Number    :" + account.accNo);
        System.out.println("Account Name      :" + account.accName);
        System.out.println("Account Type      :" + account.accType);
        System.out.println("Account Balance   :" + account.balance);
        System.out.println();
    }
}

public class one_to_one_association_00 {
    public static void main(String[] args) {
         Account account = new Account("845659899156","Sahil Jagdale", "Savings",25000);
         Employee emp = new Employee("E-111","SAHIL JAGDALE",10000,"Sangli",account);
         emp.getEmployeeDetails();
    }
}
