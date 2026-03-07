import java.util.LinkedList;
import java.util.List;

class Basic
{
    public static void main(String[] args){
        List<Integer> al=new LinkedList<Integer>();
        LinkedList<Integer> al1=new LinkedList<Integer>();
        LinkedList<Integer> al2=new LinkedList<>();
        al.addFirst(3);
        al.addLast(99);
        al.removeFirst();
        al.removeLast();
        System.out.println(al);
    
    }
}