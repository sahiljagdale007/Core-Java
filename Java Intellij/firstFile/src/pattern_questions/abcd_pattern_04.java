package pattern_questions;

public class abcd_pattern_04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((char) (64 + i));
            }
            System.out.println();
        }
    }
}
