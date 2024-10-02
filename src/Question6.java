import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 숫자: ");
        int b = scanner.nextInt();

        int gcd = findGCD(a, b);

        System.out.println("두 수의 최대공약수는: " + gcd);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}