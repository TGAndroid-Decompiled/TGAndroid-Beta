package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f48777a = new Object();
    public static final ia.c f48778b = ia.c.c("appId");
    public static final ia.c f48779c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c e = ia.c.c("osVersion");
    public static final ia.c f48780f = ia.c.c("logEnvironment");
    public static final ia.c f48781g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48778b, bVar.f48768a);
        eVar.a(f48779c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f48780f, o.LOG_ENVIRONMENT_PROD);
        eVar.a(f48781g, bVar.f48769b);
    }
}
