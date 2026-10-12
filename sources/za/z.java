package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import z7.ce;
public final class z implements t {
    public static final v f54528e = new Object();
    public static final m1.c f54529f = w7.o.a(s.f54515a);
    public final Context f54530a;
    public final jd.h f54531b;
    public final AtomicReference f54532c;
    public final ce d;

    public z(Context context, jd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f54530a = context;
        this.f54531b = hVar;
        this.f54532c = new AtomicReference();
        f54528e.getClass();
        this.d = new ce(new pf.b(((k1.a0) f54529f.a(context, v.f54520a[0]).f297b).f14322c, new ld.j(3, null), false, 13), this);
        ae.g0.q(ae.g0.b(hVar), new u(this, null, 0));
    }
}
