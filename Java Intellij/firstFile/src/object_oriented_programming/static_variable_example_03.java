package object_oriented_programming;

class k {
    int i = 10;
    static int j = 10;
}

public class static_variable_example_03 {
    public static void main(String[] args) {
        k a1 = new k();
        System.out.println(a1.i + "    " + a1.j);
        a1.i = a1.i + 1;
        a1.j = a1.j + 1;
        System.out.println(a1.i + "    " + a1.j);
        System.out.println();
        k a2 = new k();
        System.out.println(a2.i + "    " + a2.j);
        a2.i = a2.i + 1;
        a2.j = a2.j + 1;
        System.out.println(a2.i + "    " + a2.j);
        System.out.println(a1.i + "    " + a1.j);
        System.out.println();
        k a3 = new k();
        System.out.println(a3.i + "    " + a3.j);
        a3.i = a3.i + 1;
        a3.j = a3.j + 1;
        System.out.println(a3.i + "    " + a3.j);
        System.out.println(a1.i + "    " + a1.j);
        System.out.println(a2.i + "    " + a2.j);

    }
}
