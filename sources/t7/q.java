package t7;

import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;
public final class q {
    public static final l f48554b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String f48555a;

    public q(Context context, jb.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        jb.c.a(context);
        synchronized (u.class) {
            if (u.f48559b == null) {
                u.f48559b = new u(0);
            }
        }
        this.f48555a = "common";
        jb.f a2 = jb.f.a();
        c5.t tVar = new c5.t(this, 2);
        a2.getClass();
        jb.f.b(tVar);
        jb.f a10 = jb.f.a();
        Objects.requireNonNull(kVar);
        p pVar = new p(kVar, 0);
        a10.getClass();
        jb.f.b(pVar);
        l lVar = f48554b;
        if (lVar.containsKey("common")) {
            y6.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
