import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start + 1; i < end; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}

