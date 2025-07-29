import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(1);
        al.add(3);
        System.out.println("Forward:");
        Iterator<Integer> it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Backward:");
        ListIterator<Integer> i=al.listIterator(al.size());
        while(i.hasPrevious()){
            System.out.println(i.previous());
        }
    }
}