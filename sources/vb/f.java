package vb;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface f {
    int objectTypeIndication() default -1;

    int[] tags();
}
