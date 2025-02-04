package pattern_questions;

public class mirror_star_triangle_16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {             //this is for rows
            for (int j = 1; j <= 10 - i; j++) {     //this is for printing spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {         //this is for printing stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
