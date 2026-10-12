package t7;

import android.content.Context;
import c5.y;
import j$.util.Objects;
import java.util.HashMap;
public final class q {
    public static final l f45532b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String f45533a;

    public q(Context context, rb.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        rb.c.a(context);
        synchronized (u.class) {
            if (u.f45537b == null) {
                u.f45537b = new u(0);
            }
        }
        this.f45533a = "common";
        rb.f a2 = rb.f.a();
        y yVar = new y(this, 2);
        a2.getClass();
        rb.f.b(yVar);
        rb.f a10 = rb.f.a();
        Objects.requireNonNull(kVar);
        p pVar = new p(kVar, 0);
        a10.getClass();
        rb.f.b(pVar);
        l lVar = f45532b;
        if (lVar.containsKey("common")) {
            y6.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
