package multiple;

public class MultiplePractice2 {
    public static void main(String[] args) {

        System.out.println("7의 배수를 제외한 5단 출력");
        for(int i=1; i<10; i++){
            if(((5 * i) % 7)!=0){
                System.out.println(5 + " x " + i + " = " + 5*i);
            }
        }
    }
}



