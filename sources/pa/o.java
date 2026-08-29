package pa;

import java.lang.reflect.Method;
public final class o extends r {
    public final Method f45706b;
    public final int f45707c;

    public o(int i10, Method method) {
        this.f45706b = method;
        this.f45707c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String T1 = oc.i.T1(cls);
        if (T1 == null) {
            return this.f45706b.invoke(null, cls, Integer.valueOf(this.f45707c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(T1));
    }
}
