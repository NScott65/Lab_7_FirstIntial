import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 6; // Size of the letter 'N'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces for better visibility
                }
            }
            System.out.println();
        }
    }
}