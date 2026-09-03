package ra;

import java.lang.reflect.Method;
import q5.c0;
public final class n extends r {
    public final Method f43453b;
    public final Object f43454c;

    public n(Method method, Object obj) {
        this.f43453b = method;
        this.f43454c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String e = c0.e(cls);
        if (e == null) {
            return this.f43453b.invoke(this.f43454c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(e));
    }
}
