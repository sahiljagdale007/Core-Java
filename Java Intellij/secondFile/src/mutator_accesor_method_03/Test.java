package mutator_accesor_method_03;

class Employee {
    private int eno;
    private String ename;
    private float esal;
    private String eaddr;

    public void setEno(int setEno) {
        eno = setEno;
    }

    public void setEname(String setEname) {
        ename = setEname;
    }

    public void setEsal(float setEsal) {
        esal = setEsal;
    }

    public void setAddr(String setAddr) {
        eaddr = setAddr;
    }

    public int getEno() {
        return eno;
    }

    public String getEname() {
        return ename;
    }

    public float getEsal() {
        return esal;
    }

    public String getAddr() {
        return eaddr;
    }
}

public class Test {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEno(23410005);
        emp.setEname("Sahil Ashok Jagdale");
        emp.setEsal(80000.0f);
        emp.setAddr("Plot no-9/10, Flat No-302, Pragati Colony, Pragati Resedeny, 100Feet Road, Sangli-416416");

        System.out.println(emp.getEno());
        System.out.println(emp.getEname());
        System.out.println(emp.getEsal());
        System.out.println(emp.getAddr());
    }
}
