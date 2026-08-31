package sd;

import java.util.concurrent.TimeUnit;
import qd.v;
public abstract class k {
    public static final String f47270a;
    public static final long f47271b;
    public static final int f47272c;
    public static final int d;
    public static final long f47273e;
    public static final g f47274f;
    public static final c5.c f47275g;
    public static final c5.c h;

    static {
        String str;
        int i10 = v.f44822a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f47270a = str;
        f47271b = qd.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f44822a;
        if (i11 < 2) {
            i11 = 2;
        }
        f47272c = qd.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = qd.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f47273e = TimeUnit.SECONDS.toNanos(qd.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f47274f = g.f47265a;
        f47275g = new c5.c(0);
        h = new c5.c(1);
    }
}
