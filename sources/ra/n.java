package ra;

import java.lang.reflect.Method;
import q5.g0;
public final class n extends r {
    public final Method f46784b;
    public final Object f46785c;

    public n(Method method, Object obj) {
        this.f46784b = method;
        this.f46785c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String f10 = g0.f(cls);
        if (f10 == null) {
            return this.f46784b.invoke(this.f46785c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(f10));
    }
}
