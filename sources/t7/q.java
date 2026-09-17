package t7;

import android.content.Context;
import c5.x;
import j$.util.Objects;
import java.util.HashMap;
public final class q {
    public static final l f46486b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String f46487a;

    public q(Context context, qb.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        qb.c.a(context);
        synchronized (u.class) {
            if (u.f46491b == null) {
                u.f46491b = new u(0);
            }
        }
        this.f46487a = "common";
        qb.f a2 = qb.f.a();
        x xVar = new x(this, 2);
        a2.getClass();
        qb.f.b(xVar);
        qb.f a10 = qb.f.a();
        Objects.requireNonNull(kVar);
        p pVar = new p(kVar, 0);
        a10.getClass();
        qb.f.b(pVar);
        l lVar = f46486b;
        if (lVar.containsKey("common")) {
            y6.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
