package ra;

import java.lang.reflect.Method;
import q5.c0;
public final class n extends r {
    public final Method f46815b;
    public final Object f46816c;

    public n(Method method, Object obj) {
        this.f46815b = method;
        this.f46816c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String f10 = c0.f(cls);
        if (f10 == null) {
            return this.f46815b.invoke(this.f46816c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(f10));
    }
}
