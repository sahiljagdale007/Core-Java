package pattern_questions;

public class inverted_star_pattern_11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
