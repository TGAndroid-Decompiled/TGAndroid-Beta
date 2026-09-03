package sd;

import java.util.concurrent.TimeUnit;
import qd.v;
public abstract class k {
    public static final String f47301a;
    public static final long f47302b;
    public static final int f47303c;
    public static final int d;
    public static final long f47304e;
    public static final g f47305f;
    public static final c5.c f47306g;
    public static final c5.c h;

    static {
        String str;
        int i10 = v.f44853a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f47301a = str;
        f47302b = qd.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f44853a;
        if (i11 < 2) {
            i11 = 2;
        }
        f47303c = qd.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = qd.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f47304e = TimeUnit.SECONDS.toNanos(qd.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f47305f = g.f47296a;
        f47306g = new c5.c(0);
        h = new c5.c(1);
    }
}
