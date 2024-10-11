import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("숫자 입력: ");
        int a = sc.nextInt();

        for (int i = 0; i <= a; i++) {
            sum += i;
            if (sum >= 100) {
                System.out.println("합이 100 이상입니다: " + sum);
                break;
            }
        }

        if (sum < 100) {
            System.out.println("최종 합: " + sum);
        }

        sc.close();
    }
}