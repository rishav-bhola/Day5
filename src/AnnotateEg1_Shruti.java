/**
 * Created by bholar on 7/10/2017.
 */

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotateEg1_Shruti {

    public static void main(String[] args) {

        BusinessLogic bl = new BusinessLogic();
        Method[] methods = bl.getClass().getMethods();

        for (Method method : methods) {
            Annotation run[] = method.getAnnotations();
            for(Annotation r : run) {
                System.out.println(r.annotationType());
                if (r != null) {
                    try {
                        method.invoke(bl);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {

                }
            }
        }
    }
}
