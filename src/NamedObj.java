/**
 * Created by bholar on 7/10/2017.
 */
class InnerClass1{

    public void met1()
    {
        System.out.println("met1() in InnerClass1");
    }
}

public class NamedObj {
    public static void main(String args[])
    {
        InnerClass1 obj = new InnerClass1(){
            public void met1(){
                System.out.println("met1() in Anonymous class");
            }
        };

        obj.met1();
    }
}