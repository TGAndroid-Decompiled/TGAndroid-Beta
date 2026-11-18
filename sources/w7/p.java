package w7;

import a8.pa;
import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;
public final class p {
    public static final l f59623b = l.c(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String f59624a;

    public p(Context context, pb.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        pb.c.a(context);
        synchronized (s.class) {
            if (s.f59627b == null) {
                s.f59627b = new s(0);
            }
        }
        this.f59624a = "common";
        pb.f a10 = pb.f.a();
        a2.b bVar = new a2.b(this, 5);
        a10.getClass();
        pb.f.b(bVar);
        pb.f a11 = pb.f.a();
        Objects.requireNonNull(kVar);
        pa paVar = new pa(kVar, 2);
        a11.getClass();
        pb.f.b(paVar);
        l lVar = f59623b;
        if (lVar.containsKey("common")) {
            b7.f.d(context, (String) lVar.get("common"), false);
        }
    }
}
