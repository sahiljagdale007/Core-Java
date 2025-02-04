package pattern_questions;

public class diamond_pattern_29 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 9 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int l = 0; l < 10; l++) {
            for (int m = 0; m <= l; m++) {
                System.out.print(" ");
            }
            for (int n = 0; n <= 9 - l; n++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
