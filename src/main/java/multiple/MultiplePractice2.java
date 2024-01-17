package multiple;

public class MultiplePractice2 {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("5의 배수를 제외한 4단 출력");

        for(int i=1; i<10; i++){
            if(((4*i)%5!=0)){
                System.out.println(4 + "x" + i + "=" + 4*i);
            }
            count ++;
        }
        System.out.println("총 개수 = " + count);
    }
}
