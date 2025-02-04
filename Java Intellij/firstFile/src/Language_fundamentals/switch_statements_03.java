package Language_fundamentals;

import java.sql.SQLOutput;
import java.util.*;
public class switch_statements_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch(a) {
            case 1:
                System.out.println("First case tirgered");
                break;
            case 5:
                System.out.println("Second case tirgered");
                break;
            case 10:
                System.out.println("Third case trigered");
                break;
            case 15:
                System.out.println("Fourth case triggered");
                break;
            case 20:
                System.out.println("Fifth case triggered");
                break;
        }
    }
}
