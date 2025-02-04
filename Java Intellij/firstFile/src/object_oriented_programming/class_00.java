package object_oriented_programming;

//Here I am declaring a class

class Employee {
    String eid = "E-7717";
    String ename = "Sahil Jagdale";
    float esal = 50000.0f;
    String eaddr = "Benglore";
    String eemail = "sahiljagdale07@gmail.com";
    String emobile = "+91 8421681523";

    //Here I am declaring a variable and methods inside user defined class as per the requirement

    public void getEmpDetails() {
        System.out.println("Employee Details");
        System.out.println("------------------------");
        System.out.println("Employee Id     :" + eid);
        System.out.println("Employee Name   :" + ename);
        System.out.println("Employee Salary :" + esal);
        System.out.println("Employee Address:" + eaddr);
        System.out.println("Employee Email  :" + eemail);
        System.out.println("Employee Mobile :" + emobile);
    }
}

//In main class, in main() method,crate object for the respective class.

public class class_00 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getEmpDetails();
    }
}
