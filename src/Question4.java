public class Question4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 50) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("반복문이 종료되었습니다.");
    }
}
