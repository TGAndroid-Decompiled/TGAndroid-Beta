package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f51425a = new Object();
    public static final ia.c f51426b = ia.c.c("appId");
    public static final ia.c f51427c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c f51428e = ia.c.c("osVersion");
    public static final ia.c f51429f = ia.c.c("logEnvironment");
    public static final ia.c f51430g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51426b, bVar.f51415a);
        eVar.a(f51427c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f51428e, Build.VERSION.RELEASE);
        eVar.a(f51429f, o.LOG_ENVIRONMENT_PROD);
        eVar.a(f51430g, bVar.f51416b);
    }
}
