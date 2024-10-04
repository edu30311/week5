import java.util.Scanner;

public class Question7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("팩토리얼을 할 수를 입력하세요 : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
