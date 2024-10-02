import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("1 이상의 숫자를 입력: ");
            number = scanner.nextInt();

            if (number < 1) {
                System.out.println("다시 입력");
            }
        } while (number < 1);

        System.out.println("입력한 숫자: " + number);

        scanner.close();
    }
}