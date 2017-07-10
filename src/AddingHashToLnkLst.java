import java.util.*;

/**
 * Created by bholar on 7/10/2017.
 */
class  HashSet1 {
    private String s;
    private int i;

    HashSet1(String s, int i) {
        this.s = s;
        this.i = i;
    }
    public String toString(){
        return (s+ " " + i);
    }
}
public class AddingHashToLnkLst {
    public static void main(String[] args){
        HashSet1 h = new HashSet1("jdfgajg",65);
        HashSet1 h1 = new HashSet1("jdfgajg",65);
        HashSet1 h2 = new HashSet1("jdfgajg",65);
        LinkedList<HashSet1> ln =  new LinkedList<HashSet1>();
        ln.add(h);
        ln.add(h1);
        ln.add(h2);
        Iterator<HashSet1> itr= ln.iterator();
        while(itr.hasNext()){
            //itr.next();
            System.out.println(itr.next());

        }
        System.out.println(ln);
    }
}
