import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("최대공약수 첫번째 수: ");
        int num1 = sc.nextInt();
        System.out.print("최소공약수 두번째 수: ");
        int num2 = sc.nextInt();

        for(int i = Math.max(num1, num2); i>0; i--) {
            if(num1 % i == 0 && num2 % i == 0) {
                System.out.println(i);
                break;
            }
        }

    }
}
