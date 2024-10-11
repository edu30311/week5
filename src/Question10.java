import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1부터 n까지 더해질 숫자n(합한 숫자가 100이상일때 출력): ");
        int number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (sum > 100) {
                break;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
