package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f51426a = new Object();
    public static final ia.c f51427b = ia.c.c("appId");
    public static final ia.c f51428c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c f51429e = ia.c.c("osVersion");
    public static final ia.c f51430f = ia.c.c("logEnvironment");
    public static final ia.c f51431g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51427b, bVar.f51416a);
        eVar.a(f51428c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f51429e, Build.VERSION.RELEASE);
        eVar.a(f51430f, o.LOG_ENVIRONMENT_PROD);
        eVar.a(f51431g, bVar.f51417b);
    }
}
