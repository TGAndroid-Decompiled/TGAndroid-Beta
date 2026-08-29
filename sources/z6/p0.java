package z6;

import j$.util.Objects;
import java.util.Comparator;
public abstract class p0 {
    public static final Comparator f50750a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(p0.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = o0.f50747a;
        }
        f50750a = comparator;
    }
}
