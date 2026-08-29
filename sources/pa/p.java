package pa;

import java.lang.reflect.Method;
public final class p extends r {
    public final Method f45708b;

    public p(Method method) {
        this.f45708b = method;
    }

    @Override
    public final Object a(Class cls) {
        String T1 = oc.i.T1(cls);
        if (T1 == null) {
            return this.f45708b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(T1));
    }
}
