package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import z7.ce;
public final class z implements t {
    public static final v f54417e = new Object();
    public static final m1.c f54418f = w7.p.a(s.f54404a);
    public final Context f54419a;
    public final jd.h f54420b;
    public final AtomicReference f54421c;
    public final ce d;

    public z(Context context, jd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f54419a = context;
        this.f54420b = hVar;
        this.f54421c = new AtomicReference();
        f54417e.getClass();
        this.d = new ce(new pf.b(((k1.a0) f54418f.a(context, v.f54409a[0]).f16033b).f14324c, new ld.j(3, null), false, 13), this);
        ae.g0.q(ae.g0.b(hVar), new u(this, null, 0));
    }
}
