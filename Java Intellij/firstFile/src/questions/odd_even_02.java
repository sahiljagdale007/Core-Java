package questions;

import java.util.*;

public class odd_even_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("given number is even");
        } else {
            System.out.println("given number is odd");
        }
    }
}
