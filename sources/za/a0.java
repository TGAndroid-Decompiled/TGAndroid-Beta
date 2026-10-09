package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
public final class a0 implements t {
    public static final v f54186e = new Object();
    public static final m1.c f54187f = w7.p.a(s.f54286a);
    public final Context f54188a;
    public final jd.h f54189b;
    public final AtomicReference f54190c;
    public final z d;

    public a0(Context context, jd.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f54188a = context;
        this.f54189b = hVar;
        this.f54190c = new AtomicReference();
        f54186e.getClass();
        this.d = new z(new pf.b(((k1.a0) f54187f.a(context, v.f54291a[0]).f15972b).f14325c, new ld.j(3, null), false, 13), this);
        ae.g0.q(ae.g0.b(hVar), new u(this, null, 0));
    }
}
