import java.util.ArrayList;
import java.util.*;

/**
 * Created by bholar on 7/10/2017.
 */
class VehicleModel{
    private String make;

    public VehicleModel(String make, String model,   long nunit,  double price) {
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
public class ArrayListVehicle2 {
    public static void main(String[] args){
        VehicleModel vm1 = new VehicleModel("Ford","Fiesta",872367,76523462);

        VehicleModel vm2 = new VehicleModel("Ford","Fiesta",872367,76523462);

        VehicleModel vm3 = new VehicleModel("Ford","Fiesta",872367,76523462);

        VehicleModel vm4 = new VehicleModel("Ford","Fiesta",872367,76523462);

        ArrayList<VehicleModel> alvm = new ArrayList<VehicleModel>();

        alvm.add(vm1);
        alvm.add(vm2);
        alvm.add(vm3);
        alvm.add(vm4);
        alvm.add(2,vm2);

        Iterator<VehicleModel> itr = alvm.iterator();
        for(;itr.hasNext();)
        {
            VehicleModel vmo = itr.next();
            System.out.println(vmo);
        }



    }
}
