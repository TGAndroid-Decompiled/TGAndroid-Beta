package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f54204a = new Object();
    public static final ia.c f54205b = ia.c.c("appId");
    public static final ia.c f54206c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c f54207e = ia.c.c("osVersion");
    public static final ia.c f54208f = ia.c.c("logEnvironment");
    public static final ia.c f54209g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54205b, bVar.f54191a);
        eVar.a(f54206c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f54207e, Build.VERSION.RELEASE);
        eVar.a(f54208f, p.LOG_ENVIRONMENT_PROD);
        eVar.a(f54209g, bVar.f54192b);
    }
}
