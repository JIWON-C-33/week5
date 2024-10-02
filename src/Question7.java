import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자: ");
        int a = sc.nextInt();

        long fac = 1;

        for (int i = 1; i <= a; i++) {
            fac *= i;
        }

        System.out.println(a + "! = " + fac);
    }
}