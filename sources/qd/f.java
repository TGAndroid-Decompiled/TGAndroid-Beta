package qd;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class f {
    public static final Collection f44829a;

    static {
        try {
            Iterator it = Arrays.asList(new md.b()).iterator();
            kotlin.jvm.internal.j.e(it, "<this>");
            f44829a = id.d.a(new id.a(new id.e(it, 1)));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
