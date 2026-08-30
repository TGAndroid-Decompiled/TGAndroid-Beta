package ra;

import java.lang.reflect.Method;
import q5.g0;
public final class p extends r {
    public final Method f43433b;

    public p(Method method) {
        this.f43433b = method;
    }

    @Override
    public final Object a(Class cls) {
        String t6 = g0.t(cls);
        if (t6 == null) {
            return this.f43433b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(t6));
    }
}
