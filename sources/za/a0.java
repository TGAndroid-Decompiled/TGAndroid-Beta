package za;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
public final class a0 implements u {
    public static final w e = new Object();
    public static final m1.c f49003f = w7.r.a(t.f49094a);
    public final Context f49004a;
    public final id.h f49005b;
    public final AtomicReference f49006c;
    public final o0.a d;

    public a0(Context context, id.h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f49004a = context;
        this.f49005b = hVar;
        this.f49006c = new AtomicReference();
        e.getClass();
        this.d = new o0.a(29, new n4.y(9, ((k1.a0) f49003f.a(context, w.f49099a[0]).f13369b).f13142c, new kd.j(3, null)), this);
        zd.e0.q(zd.e0.b(hVar), new v(this, null, 0));
    }
}
