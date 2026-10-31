package yd;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class f {
    public static final Collection f54400a;

    static {
        try {
            Iterator it = Arrays.asList(new ud.b()).iterator();
            kotlin.jvm.internal.i.e(it, "<this>");
            f54400a = qd.d.a(new qd.a(new qd.e(it, 1)));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
