package u7;

import a8.gg;
import a8.hg;
import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;
public final class p {
    public static final l f49607b = l.b(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String f49608a;

    public p(Context context, sb.k kVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        sb.c.a(context);
        synchronized (s.class) {
            if (s.f49611b == null) {
                s.f49611b = new s(0);
            }
        }
        this.f49608a = "common";
        sb.f a2 = sb.f.a();
        gg ggVar = new gg(this, 5);
        a2.getClass();
        sb.f.b(ggVar);
        sb.f a10 = sb.f.a();
        Objects.requireNonNull(kVar);
        hg hgVar = new hg(kVar, 1);
        a10.getClass();
        sb.f.b(hgVar);
        l lVar = f49607b;
        if (lVar.containsKey("common")) {
            z6.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
