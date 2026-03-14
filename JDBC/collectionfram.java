import java.util.ArrayList;
import java.util.Iterator;

public class collectionfram {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){//iterator
            System.out.println(it.next());
        }
        for(int x:list){//iterable
            System.out.println(x);
        }
    }
}
