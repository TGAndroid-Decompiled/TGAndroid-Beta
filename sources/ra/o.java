package ra;

import java.lang.reflect.Method;
import q5.c0;
public final class o extends r {
    public final Method f46817b;
    public final int f46818c;

    public o(int i10, Method method) {
        this.f46817b = method;
        this.f46818c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String f10 = c0.f(cls);
        if (f10 == null) {
            return this.f46817b.invoke(null, cls, Integer.valueOf(this.f46818c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(f10));
    }
}
