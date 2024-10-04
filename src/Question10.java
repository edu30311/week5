import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("plus until number: ");
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
