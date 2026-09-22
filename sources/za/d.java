package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f48747a = new Object();
    public static final ia.c f48748b = ia.c.c("appId");
    public static final ia.c f48749c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c e = ia.c.c("osVersion");
    public static final ia.c f48750f = ia.c.c("logEnvironment");
    public static final ia.c f48751g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48748b, bVar.f48738a);
        eVar.a(f48749c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f48750f, o.LOG_ENVIRONMENT_PROD);
        eVar.a(f48751g, bVar.f48739b);
    }
}
