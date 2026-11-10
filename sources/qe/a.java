package qe;

import xd.k;
public abstract class a {
    public static final int f54100a;

    static {
        Object b10;
        int i7;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.j.d(property, "getProperty(...)");
            b10 = k.b(property);
        } catch (Throwable th2) {
            b10 = af.b.b(th2);
        }
        if (b10 instanceof gd.f) {
            b10 = null;
        }
        Integer num = (Integer) b10;
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = 2097152;
        }
        f54100a = i7;
    }
}
