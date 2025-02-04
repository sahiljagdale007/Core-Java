package questions;

import java.util.*;

public class greatest_of_three_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("a is greatest number");
            } else {
                System.out.println("c is greatest number");
            }
        }
        if (b > c) {
            if (b > a) {
                System.out.println("b is greatest number");
            } else {
                System.out.println("a is greatest number");
            }
        }
        if (c > a) {
            if (c > b) {
                System.out.println("c is greatest number");
            } else {
                System.out.println("b is greatest number");
            }
        } else {
            System.out.println("a,b,b is equal numbers");
        }
    }
}
