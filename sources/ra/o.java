package ra;

import java.lang.reflect.Method;
import q5.g0;
public final class o extends r {
    public final Method f46786b;
    public final int f46787c;

    public o(int i10, Method method) {
        this.f46786b = method;
        this.f46787c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String f10 = g0.f(cls);
        if (f10 == null) {
            return this.f46786b.invoke(null, cls, Integer.valueOf(this.f46787c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(f10));
    }
}
