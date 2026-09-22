package t7;

import android.content.Context;
import c5.w;
import j$.util.Objects;
import java.util.HashMap;
public final class q {
    public static final l f43353b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String f43354a;

    public q(Context context, qb.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        qb.c.a(context);
        synchronized (u.class) {
            if (u.f43358a == null) {
                u.f43358a = new Object();
            }
        }
        this.f43354a = "common";
        qb.f a2 = qb.f.a();
        w wVar = new w(this, 2);
        a2.getClass();
        qb.f.b(wVar);
        qb.f a10 = qb.f.a();
        Objects.requireNonNull(kVar);
        p pVar = new p(kVar, 0);
        a10.getClass();
        qb.f.b(pVar);
        l lVar = f43353b;
        if (lVar.containsKey("common")) {
            y6.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
