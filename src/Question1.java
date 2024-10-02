public class Question1 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++){
            System.out.println("7 * "+i+" = "+7*i);
        }
        for(int i=2; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.println(i+" * "+j+" = "+j*i);
            }
        }
    }
}
