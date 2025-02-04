package abstract_class_01;

abstract class A {
    void m1() {
        System.out.println("m1-A");
    }

    abstract void m2();

    abstract void m3();
}

class B extends A {
    void m2() {
        System.out.println("m2-B");
    }

    void m3() {
        System.out.println("m3-B");
    }
}

public class testing {
    public static void main(String[] args) {
        A Student = new B();
        Student.m1();
        Student.m2();
        Student.m3();

        System.out.println();

        B Teacher = new B();
        Teacher.m1();
        Teacher.m2();
        Teacher.m3();
    }
}
