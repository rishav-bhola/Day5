/**
 * Created by bholar on 7/10/2017.
 */
import java.util.ArrayList;
import java.util.*;

/**
 * Created by bholar on 7/10/2017.
 */
class HashDuplicate{
    private String make;

    public HashDuplicate(String make, String model,   long nunit,  double price) {
        this.make = make;
        this.model = model;
        this.nunit = nunit;
        this.price = price;
    }

    private String model;
    private long nunit;
    private double price;

    public String toString(){
        return make + " " + model + " " + nunit + " " + price;
    }
}
class ArrayListVehicle3 {
    public static void main(String[] args){
        HashDuplicate vm1 = new HashDuplicate("Ford","Fiesta",872367,76523462);

        HashDuplicate vm2 = new HashDuplicate("Ford","Fiesta",872367,76523462);

        HashDuplicate vm3 = new HashDuplicate("Ford","Fiesta",872367,76523462);

        HashDuplicate vm4 = new HashDuplicate("Ford","Fiesta",872367,76523462);

        HashSet<HashDuplicate> alvm = new HashSet<HashDuplicate>();

        alvm.add(vm1);
        alvm.add(vm2);
        alvm.add(vm3);
        alvm.add(vm4);

        Iterator<HashDuplicate> itr = alvm.iterator();
        for(;itr.hasNext();)
        {
            HashDuplicate vmo = itr.next();
            System.out.println(vmo);
        }



    }
}
