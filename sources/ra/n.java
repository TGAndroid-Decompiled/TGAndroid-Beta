package ra;

import java.lang.reflect.Method;
import q5.g0;
public final class n extends r {
    public final Method f43429b;
    public final Object f43430c;

    public n(Method method, Object obj) {
        this.f43429b = method;
        this.f43430c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String t6 = g0.t(cls);
        if (t6 == null) {
            return this.f43429b.invoke(this.f43430c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(t6));
    }
}
