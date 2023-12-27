package factorial;

public class FactorialPractice {
    public static void main(String[] args) {
        int input = 4;

        System.out.println(factorial(input));
    }

    public static int factorial(int n){
        if(n==1)
            return n;
        else
            return factorial(n-1) * n;
    }
}
