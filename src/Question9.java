import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        do{
            System.out.print("나이를 입력하세요: ");
            age = sc.nextInt();
        }while(age <= 0);
        System.out.println("당신의 나이는 " + age + "세 입니다");
    }
}
