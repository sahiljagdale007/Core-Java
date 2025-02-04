package pattern_questions;

public class even_star_triangle_26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
