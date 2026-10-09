package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
public final class a0 implements t {
    public static final v f54184e = new Object();
    public static final m1.c f54185f = w7.p.a(s.f54284a);
    public final Context f54186a;
    public final jd.h f54187b;
    public final AtomicReference f54188c;
    public final z d;

    public a0(Context context, jd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f54186a = context;
        this.f54187b = hVar;
        this.f54188c = new AtomicReference();
        f54184e.getClass();
        this.d = new z(new pf.b(((k1.a0) f54185f.a(context, v.f54289a[0]).f15972b).f14325c, new ld.j(3, null), false, 13), this);
        ae.g0.q(ae.g0.b(hVar), new u(this, null, 0));
    }
}
