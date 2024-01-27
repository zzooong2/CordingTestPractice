package stack;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push("0"); //Stack에 값 0 추가
        st.push("1"); //Stack에 값 1 추가
        st.push("2"); //Stack에 값 2 추가


        System.out.println("=====Stack=====");
        while(!st.isEmpty()){ // st 안의 데이터가 모두 빠져나올 때 까지
            System.out.println(st.pop());
        }
        System.out.println("===============");
    }
}
