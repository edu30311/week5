import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1부터 n까지 더해질 숫자n(합한 숫자가 100이상일때 출력): ");
        int number = sc.nextInt();
        int sum = 0;

        /*for (int i = 1; i <= number; i++) {
            if (sum > 100) {
                System.out.println(sum);
                break;
            }
            sum += i;
        }*/
        for (int i = 1; i <= number; i++) {
            sum += i;
            if (i < number) {
                continue;
            }
            else if (sum > 100) {
                System.out.println(sum);
                break;
            }
            else {
                break;
            }
        }
    }
}
