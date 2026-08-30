package sd;

import java.util.concurrent.TimeUnit;
import qd.v;
public abstract class k {
    public static final String f44277a;
    public static final long f44278b;
    public static final int f44279c;
    public static final int d;
    public static final long e;
    public static final g f44280f;
    public static final c5.c f44281g;
    public static final c5.c h;

    static {
        String str;
        int i10 = v.f43043a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f44277a = str;
        f44278b = qd.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f43043a;
        if (i11 < 2) {
            i11 = 2;
        }
        f44279c = qd.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = qd.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(qd.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f44280f = g.f44272a;
        f44281g = new c5.c(0);
        h = new c5.c(1);
    }
}
