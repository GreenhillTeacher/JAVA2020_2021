// Program to draw a figure that includes a series of stick figures on stairs.
// Change the value of the TOTAL_STAIRS constant to produce a different number
// of stairs in the output.

public class Stairs_Fig {
    public static int TOTAL_STAIRS;

    public static void main(String[] args) {

        for (int stairs = 1; stairs <= TOTAL_STAIRS; stairs++) {
            // 1st line of each stair
            for (int i = 1; i <= 5 * TOTAL_STAIRS - 5 * stairs; i++) {
                System.out.print(" ");
            }
            System.out.print("  O  ******");
            for (int i = 1; i <= stairs * 5 - 5; i++) {
                System.out.print(" ");
            }
            System.out.println("*");

            // 2nd line of each stair
            for (int i = 1; i <= 5 * TOTAL_STAIRS - 5 * stairs; i++) {
                System.out.print(" ");
            }
            System.out.print(" /|\\ *     ");
            for (int i = 1; i <= stairs * 5 - 5; i++) {
                System.out.print(" ");
            }
            System.out.println("*");

            // 3rd line of each stair
            for (int i = 1; i <= 5 * TOTAL_STAIRS - 5 * stairs; i++) {
                System.out.print(" ");
            }
            System.out.print(" / \\ *     ");
            for (int i = 1; i <= stairs * 5 - 5; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // final line of stars
        for (int i = 1; i <= 5 * TOTAL_STAIRS + 7; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
