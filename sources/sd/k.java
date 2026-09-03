package sd;

import java.util.concurrent.TimeUnit;
import qd.v;
public abstract class k {
    public static final String f44342a;
    public static final long f44343b;
    public static final int f44344c;
    public static final int d;
    public static final long e;
    public static final g f44345f;
    public static final c5.c f44346g;
    public static final c5.c h;

    static {
        String str;
        int i10 = v.f43073a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f44342a = str;
        f44343b = qd.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f43073a;
        if (i11 < 2) {
            i11 = 2;
        }
        f44344c = qd.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = qd.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(qd.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f44345f = g.f44337a;
        f44346g = new c5.c(0);
        h = new c5.c(1);
    }
}
