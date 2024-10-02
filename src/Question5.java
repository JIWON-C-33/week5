public class Question5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("반복문이 종료되었습니다.");
    }
}
