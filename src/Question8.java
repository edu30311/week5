public class Question8 {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        while (i <= 100){
            i++;
            if (i % 2 == 0){
                continue;
            }
            num += i;

        }
        System.out.println(num);
    }
}
