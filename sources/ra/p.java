package ra;

import java.lang.reflect.Method;
import q5.c0;
public final class p extends r {
    public final Method f43457b;

    public p(Method method) {
        this.f43457b = method;
    }

    @Override
    public final Object a(Class cls) {
        String e = c0.e(cls);
        if (e == null) {
            return this.f43457b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(e));
    }
}
