package pattern_questions;

public class abcd_triangle_pattern_09 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j)+" ");
            }
            System.out.println();
        }
    }
}
