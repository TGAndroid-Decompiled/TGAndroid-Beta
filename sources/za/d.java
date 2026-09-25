package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f49031a = new Object();
    public static final ia.c f49032b = ia.c.c("appId");
    public static final ia.c f49033c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c e = ia.c.c("osVersion");
    public static final ia.c f49034f = ia.c.c("logEnvironment");
    public static final ia.c f49035g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49032b, bVar.f49019a);
        eVar.a(f49033c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f49034f, q.LOG_ENVIRONMENT_PROD);
        eVar.a(f49035g, bVar.f49020b);
    }
}
