package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f49032a = new Object();
    public static final ia.c f49033b = ia.c.c("appId");
    public static final ia.c f49034c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c e = ia.c.c("osVersion");
    public static final ia.c f49035f = ia.c.c("logEnvironment");
    public static final ia.c f49036g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49033b, bVar.f49020a);
        eVar.a(f49034c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f49035f, q.LOG_ENVIRONMENT_PROD);
        eVar.a(f49036g, bVar.f49021b);
    }
}
