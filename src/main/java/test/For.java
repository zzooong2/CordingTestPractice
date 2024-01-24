package test;

public class For {
    public static void main(String[] args){

        int num = 8;
        int t = 5;
        int out = 0;

        for(int i=0; i<num; i++){
            out += t; // out = out + t
            if(out > num){
                out = num * out ;
                out = out * i ;
                break;
            }
            System.out.println(out);
            i++;
            System.out.println(i);
        }
        System.out.println(out);

    }
}
