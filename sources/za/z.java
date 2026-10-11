package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import z7.ce;
public final class z implements t {
    public static final v f54383e = new Object();
    public static final m1.c f54384f = w7.p.a(s.f54370a);
    public final Context f54385a;
    public final jd.h f54386b;
    public final AtomicReference f54387c;
    public final ce d;

    public z(Context context, jd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f54385a = context;
        this.f54386b = hVar;
        this.f54387c = new AtomicReference();
        f54383e.getClass();
        this.d = new ce(new pf.b(((k1.a0) f54384f.a(context, v.f54375a[0]).f15997b).f14324c, new ld.j(3, null), false, 13), this);
        ae.g0.q(ae.g0.b(hVar), new u(this, null, 0));
    }
}
