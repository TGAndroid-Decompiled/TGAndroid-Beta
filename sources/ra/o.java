package ra;

import java.lang.reflect.Method;
import q5.g0;
public final class o extends r {
    public final Method f43431b;
    public final int f43432c;

    public o(int i10, Method method) {
        this.f43431b = method;
        this.f43432c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String t6 = g0.t(cls);
        if (t6 == null) {
            return this.f43431b.invoke(null, cls, Integer.valueOf(this.f43432c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(t6));
    }
}
