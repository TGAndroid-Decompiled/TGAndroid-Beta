package pa;

import java.lang.reflect.Method;
public final class n extends r {
    public final Method f45704b;
    public final Object f45705c;

    public n(Method method, Object obj) {
        this.f45704b = method;
        this.f45705c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String T1 = oc.i.T1(cls);
        if (T1 == null) {
            return this.f45704b.invoke(this.f45705c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(T1));
    }
}
