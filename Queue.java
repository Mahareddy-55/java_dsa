import java.util.*;


public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> al = new PriorityQueue<Integer>(Collections.reverseOrder());
        al.offer(10);
        al.offer(1);
        al.offer(4);
        al.offer(-1);
        System.out.println(al);
        System.out.println(al.poll());
        System.out.println(al.poll());
        System.out.println(al.poll());
        System.out.println(al.peek());
        System.out.println(al.isEmpty());
    }
}