package multiple;

public class MultiplePractice {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");

        for(int i=1; i<=9; i++){
            System.out.println();
            System.out.println("<" + i + "단>");

            for(int j=1; j<=9; j++){
                System.out.println(i + "x" + j + "=" + i*j);
            }
        }
    }
}
