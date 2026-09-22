package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import x7.d7;
public final class y implements s {
    public static final u e = new Object();
    public static final m1.c f49158f = w7.r.a(r.f49145a);
    public final Context f49159a;
    public final id.h f49160b;
    public final AtomicReference f49161c;
    public final d7 d;

    public y(Context context, id.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f49159a = context;
        this.f49160b = hVar;
        this.f49161c = new AtomicReference();
        e.getClass();
        n4.y yVar = new n4.y(((k1.a0) f49158f.a(context, u.f49150a[0]).f13672b).f13154c, new kd.j(3, null));
        ?? obj = new Object();
        obj.f45702a = yVar;
        obj.f45703b = this;
        this.d = obj;
        zd.e0.q(zd.e0.b(hVar), new t(this, null, 0));
    }
}
