package textmove;

public class Move {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i - j == 0) {
                    System.out.print("O");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }

        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(i+j == 5){
                    System.out.print("O");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }

    }
}
