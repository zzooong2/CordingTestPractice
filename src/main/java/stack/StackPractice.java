package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push("0");
        st.push("1");
        st.push("2");

        System.out.println("=====Stack=====");
        while(!st.isEmpty()){ // st 안의 데이터가 모두 빠져나올 때 까지
            System.out.println(st.pop());
        }
        System.out.println("===============");
    }
}
