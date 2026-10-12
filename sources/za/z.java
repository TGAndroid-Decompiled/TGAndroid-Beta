package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import z7.ce;
public final class z implements t {
    public static final v f54520e = new Object();
    public static final m1.c f54521f = w7.o.a(s.f54507a);
    public final Context f54522a;
    public final jd.h f54523b;
    public final AtomicReference f54524c;
    public final ce d;

    public z(Context context, jd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f54522a = context;
        this.f54523b = hVar;
        this.f54524c = new AtomicReference();
        f54520e.getClass();
        this.d = new ce(new pf.b(((k1.a0) f54521f.a(context, v.f54512a[0]).f297b).f14321c, new ld.j(3, null), false, 13), this);
        ae.g0.q(ae.g0.b(hVar), new u(this, null, 0));
    }
}
