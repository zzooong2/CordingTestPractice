package fibonacci;

public class FibonacciPractice {
    public static void main(String[] args) {
        int input = 8;
        for(int i=1; i<input; i++){
            System.out.println(fibo(i));
        }
    }

    public static int fibo(int n){
        if(n==1)
            return n;
        else
            return fibo(n-1) + (n-2);
    }
}
