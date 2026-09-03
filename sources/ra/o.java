package ra;

import java.lang.reflect.Method;
import q5.c0;
public final class o extends r {
    public final Method f43455b;
    public final int f43456c;

    public o(int i10, Method method) {
        this.f43455b = method;
        this.f43456c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String e = c0.e(cls);
        if (e == null) {
            return this.f43455b.invoke(null, cls, Integer.valueOf(this.f43456c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(e));
    }
}
