package qe;

import xd.k;
public abstract class a {
    public static final int f56109a;

    static {
        Object a10;
        int i7;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.j.d(property, "getProperty(...)");
            a10 = k.b(property);
        } catch (Throwable th2) {
            a10 = b7.h.a(th2);
        }
        if (a10 instanceof gd.f) {
            a10 = null;
        }
        Integer num = (Integer) a10;
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = 2097152;
        }
        f56109a = i7;
    }
}
