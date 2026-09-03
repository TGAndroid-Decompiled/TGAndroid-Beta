package ra;

import java.lang.reflect.Method;
import q5.c0;
public final class p extends r {
    public final Method f46819b;

    public p(Method method) {
        this.f46819b = method;
    }

    @Override
    public final Object a(Class cls) {
        String f10 = c0.f(cls);
        if (f10 == null) {
            return this.f46819b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(f10));
    }
}
