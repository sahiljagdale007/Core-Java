package object_oriented_programming;

class A {
    int val = 10;

    A() {
        System.out.println("A-Contex");
        //val = 20;
    }

    public void getValue() {
        System.out.println(val);
    }
}

public class Instance_context_example_02 {
    public static void main(String[] args) {
        A a = new A();
        a.getValue();
    }
}
