package textmove;

public class Move {
    public static void main(String[] args) {
        for(int i=1; i<7; i++){
            for(int j=1; j<7; j++){
                if(i-j==0){
                    System.out.print(">");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        for(int i=1; i<7; i++){
            for(int j=1; j<7; j++){
                if(i+j==7){
                    System.out.print("<");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
