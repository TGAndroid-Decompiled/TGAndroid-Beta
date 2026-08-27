package pd;

import java.util.concurrent.TimeUnit;
import nd.v;

public abstract class k {

    public static final String f45723a;

    public static final long f45724b;

    public static final int f45725c;
    public static final int d;

    public static final long f45726e;

    public static final g f45727f;

    public static final com.google.android.gms.internal.cast.a f45728g;
    public static final com.google.android.gms.internal.cast.a h;

    static {
        String property;
        int i10 = v.f18508a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f45723a = property;
        f45724b = nd.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = v.f18508a;
        if (i11 < 2) {
            i11 = 2;
        }
        f45725c = nd.a.j(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = nd.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f45726e = TimeUnit.SECONDS.toNanos(nd.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f45727f = g.f45718a;
        f45728g = new com.google.android.gms.internal.cast.a(0);
        h = new com.google.android.gms.internal.cast.a(1);
    }
}
