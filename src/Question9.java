import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        do {
            System.out.println("나이: ");
            age = sc.nextInt();

            if (age > 0) {
                System.out.println(age);
            } else {
                System.out.println("0이상의 나이 입력");
            }
        } while (age <= 0);
    }
}
