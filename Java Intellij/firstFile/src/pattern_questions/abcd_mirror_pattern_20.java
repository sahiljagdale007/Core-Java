package pattern_questions;

public class abcd_mirror_pattern_20 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char) (64 + i));
            }
            System.out.println();
        }
    }
}
