/**
 * Created by bholar on 7/10/2017.
 */
import java.util.Comparator;
import java.util.TreeSet;

public class MySetWithCompr1 {

    public static void main(String a[]){
        MyComp obj = new MyComp();
        TreeSet<String> ts = new TreeSet<String>(obj);
        ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        ts.add("Z");
        ts.add("AB");


        System.out.println(ts);
    }
}

//Comparator can be used for any type
//usage with String is given below
class MyComp1 implements Comparator<String>{

    //return negative if str1 is larger than str2
    //return positive int if str1 is smaller than str2
    public int compare(String str1, String str2) {
int n1=str1.length()-1;
int n2=str2.length()-1;
        //return str2.compareTo(str1);//sort in reverse order
        //System.out.println("Hello from Comparator str1:"+str1+" str2:"+str2);
        return (str1.charAt(n1)-str2.charAt(n2));//sort based on String size
        //return str2.compareTo(str1);
    }

}