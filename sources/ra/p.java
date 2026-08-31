package ra;

import java.lang.reflect.Method;
import q5.g0;
public final class p extends r {
    public final Method f46788b;

    public p(Method method) {
        this.f46788b = method;
    }

    @Override
    public final Object a(Class cls) {
        String f10 = g0.f(cls);
        if (f10 == null) {
            return this.f46788b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(f10));
    }
}
