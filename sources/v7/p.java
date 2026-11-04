package v7;

import android.content.Context;
import b8.dg;
import b8.eg;
import j$.util.Objects;
import java.util.HashMap;
public final class p {
    public static final l f56469b = l.c(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String f56470a;

    public p(Context context, mb.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        mb.c.a(context);
        synchronized (s.class) {
            if (s.f56473b == null) {
                s.f56473b = new s(0);
            }
        }
        this.f56470a = "common";
        mb.f a10 = mb.f.a();
        dg dgVar = new dg(this, 3);
        a10.getClass();
        mb.f.b(dgVar);
        mb.f a11 = mb.f.a();
        Objects.requireNonNull(kVar);
        eg egVar = new eg(kVar, 1);
        a11.getClass();
        mb.f.b(egVar);
        l lVar = f56469b;
        if (lVar.containsKey("common")) {
            a7.f.d(context, (String) lVar.get("common"), false);
        }
    }
}
