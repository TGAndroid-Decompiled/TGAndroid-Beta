package qd;

import java.util.concurrent.TimeUnit;
import od.w;
public abstract class k {
    public static final String f46630a;
    public static final long f46631b;
    public static final int f46632c;
    public static final int d;
    public static final long f46633e;
    public static final g f46634f;
    public static final a5.c f46635g;
    public static final a5.c h;

    static {
        String str;
        int i10 = w.f19538a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f46630a = str;
        f46631b = od.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = w.f19538a;
        if (i11 < 2) {
            i11 = 2;
        }
        f46632c = od.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = od.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f46633e = TimeUnit.SECONDS.toNanos(od.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f46634f = g.f46625a;
        f46635g = new a5.c(0);
        h = new a5.c(1);
    }
}
