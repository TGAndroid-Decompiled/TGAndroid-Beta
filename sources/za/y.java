package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import x7.d7;
public final class y implements s {
    public static final u e = new Object();
    public static final m1.c f49138f = w7.r.a(r.f49125a);
    public final Context f49139a;
    public final id.h f49140b;
    public final AtomicReference f49141c;
    public final d7 d;

    public y(Context context, id.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f49139a = context;
        this.f49140b = hVar;
        this.f49141c = new AtomicReference();
        e.getClass();
        n4.y yVar = new n4.y(((k1.a0) f49138f.a(context, u.f49130a[0]).f13384b).f13154c, new kd.j(3, null));
        ?? obj = new Object();
        obj.f45681a = yVar;
        obj.f45682b = this;
        this.d = obj;
        zd.e0.q(zd.e0.b(hVar), new t(this, null, 0));
    }
}
