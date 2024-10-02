import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int n = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 이상의 수를 입력하세요: ");
            n = sc.nextInt();
        }while (n < 1);
        System.out.println("입력한 값은 - "+ n);
    }
}
