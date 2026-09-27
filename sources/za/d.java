package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f49070a = new Object();
    public static final ia.c f49071b = ia.c.c("appId");
    public static final ia.c f49072c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c e = ia.c.c("osVersion");
    public static final ia.c f49073f = ia.c.c("logEnvironment");
    public static final ia.c f49074g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49071b, bVar.f49061a);
        eVar.a(f49072c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f49073f, o.LOG_ENVIRONMENT_PROD);
        eVar.a(f49074g, bVar.f49062b);
    }
}
