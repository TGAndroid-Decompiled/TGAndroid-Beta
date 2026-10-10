package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
public final class a0 implements t {
    public static final v f54230e = new Object();
    public static final m1.c f54231f = w7.p.a(s.f54330a);
    public final Context f54232a;
    public final jd.h f54233b;
    public final AtomicReference f54234c;
    public final z d;

    public a0(Context context, jd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f54232a = context;
        this.f54233b = hVar;
        this.f54234c = new AtomicReference();
        f54230e.getClass();
        this.d = new z(new pf.b(((k1.a0) f54231f.a(context, v.f54335a[0]).f15976b).f14325c, new ld.j(3, null), false, 13), this);
        ae.g0.q(ae.g0.b(hVar), new u(this, null, 0));
    }
}
