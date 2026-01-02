import java.util.Scanner;

public class RangePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();

        printRange(start, end);

        scanner.close();
    }

public static void printRange(int start, int end) {
    for (int i = start + 1; i < end; i++) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }
}

}
