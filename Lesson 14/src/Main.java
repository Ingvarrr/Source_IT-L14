/**
 * Created by vig on 11/18/16.
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(4);
        c.add(6);
        c.add(10);
        c.add(12);

        for (Number ii : c){
            Integer i = (Integer) ii;
//            c.add (8);
        }

        System.out.println(c);
        Iterator<Integer> iterator = c.iterator();
        while (iterator.hasNext()){
            int k = iterator.next();
            System.out.println(k);
            if (k%2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(c);

        Integer [] i = {1, 5, 6};
        Collection collectionToRetain = Arrays.asList(i);

        c.retainAll(collectionToRetain);

        System.out.println(c.contains(1));
    }
}
