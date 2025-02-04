package one_to_one_Beans_package;

public class Employee {
    private String eid;
    private String ename;
    private float esal;
    private String eaddr;
    private Account account;

    public String getEid() {
        return eid;
    }
    public void setEid(String eid) {
        this.eid = eid;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public float getEsal() {
        return esal;
    }
    public void setEsal(float esal) {
        this.esal = esal;
    }
    public String getEaddr() {
        return eaddr;
    }
    public void setEaddr(String eaddr) {
        this.eaddr = eaddr;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("----------------------");
        System.out.println("Employee Id     :" +getEid());
        System.out.println("Employee Name   :" +getEname());
        System.out.println("Employee Salary :" +getEsal());
        System.out.println("Employee Address:" +getEaddr());
        System.out.println();
        System.out.println("Account Details");
        System.out.println("-------------------------");
        System.out.println("Account Number  :" +account.getAccName());
        System.out.println("Account Name    :" +account.getAccName());
        System.out.println("Account Type    :" +account.getAccType());
        System.out.println("Account Salary  :" +account.getAccBalance());

    }
}
