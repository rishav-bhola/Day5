/**
 * Created by bholar on 7/10/2017.
 */
public class EnumDemoCons1 {

    public enum Furniture {
        SOFA(7), CHAIR(2), DININGTABLE(3), TABLE(4), TV(98);

        Furniture(int price) {
            this.price = price;
            System.out.println("Cons");
        }

        private final int price;

        //can have our own methods
        public int getPrice() {
            return price;
        }

        public boolean isTable() {
            if(this.name().contains("TABLE"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        //Furniture of = new Furniture(10); //cannot instantiate Furniture, since its enum

        Furniture of; //right way to do it
        of = Furniture.CHAIR;    // Print CHAIR
        System.out.println(of);
        Furniture f[]= Furniture.values();
        //Furniture.values() returns an array of Furniture i..e Furniture[] which has all constants
        for (int i=0;i<f.length;i++) {
            System.out.print("Furniture: " + f[i] + ", ");

            if (f[i].getPrice() >= 4) {
                System.out.print("Expensive, ");
            } else {
                System.out.print("Affordable, ");
            }

            switch (f[i]) {
                case SOFA:
                    System.out.println("Relax on Sofa");
                    continue;
                case CHAIR:
                    System.out.println("Sit on chair");
                    continue;
                case TV:
                    System.out.println("See the TV");
                    continue;
                default:
                    System.out.println("OK");
            }
        }

    }

}