package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue q = new LinkedList(); // Queue 인터페이스의 구현체인 LinkedList 사용

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("=====Queue=====");
        while(!q.isEmpty()){ // q 안에 데이터가 모두 빠져나올 때 까지
            System.out.println(q.poll());
        }
        System.out.println("===============");
    }
}
