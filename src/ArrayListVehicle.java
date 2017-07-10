/**
 * Created by bholar on 7/10/2017.
 */
/**
 * Created by bholar on 7/10/2017.
 */

import java.lang.reflect.Array;
import java.util.*;


public class ArrayListVehicle {
    String make="Toyota";
    String model = "FORD";
    int number = 34;
    double price = 34000000;

    public static void main(String[] args) {
        ArrayListVehicle ob = new ArrayListVehicle();
        //List allows duplicate values, stores values in the order given/added
        //Dynamic Arrays, can shrink or increase size dynamically unlike normal arrays
        ArrayList<Object> atmp = new ArrayList<Object>();
        atmp.add(ob);



        dArrayList("Original ArrayList: ", atmp);
/*
        Collections.reverse(al);

        dArrayList("After Reversing: ",al);
        System.out.println("-------------------------");

        Collections.shuffle(al);

        dArrayList("After Shuffling ",al);

  */  }

    static void dArrayList(String str, ArrayList<Object> al)
    {
        System.out.println("------------------------------");
        System.out.println(str);
        Iterator<Object> itr = al.iterator();
        //using Iterator, we can traverse only in forward direction
        for(;itr.hasNext();)
        {
            Object tStr = itr.next(); //returns Object
            System.out.println(tStr+" ");
        }
    }
    public String toString(){
        return (make+"  " +  model+ "  "  +number);
    }

}
