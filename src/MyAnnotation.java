/**
 * Created by bholar on 7/10/2017.
 */
//package custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD) // MyAnnotation Can be applied only for methods......We can make for others by putting comma
@Retention(value = RetentionPolicy.RUNTIME) // MyAnnotation will be retained until runtime
public @interface MyAnnotation {

}
