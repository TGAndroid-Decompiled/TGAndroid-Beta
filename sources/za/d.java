package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f54324a = new Object();
    public static final ia.c f54325b = ia.c.c("appId");
    public static final ia.c f54326c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c f54327e = ia.c.c("osVersion");
    public static final ia.c f54328f = ia.c.c("logEnvironment");
    public static final ia.c f54329g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54325b, bVar.f54312a);
        eVar.a(f54326c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f54327e, Build.VERSION.RELEASE);
        eVar.a(f54328f, p.LOG_ENVIRONMENT_PROD);
        eVar.a(f54329g, bVar.f54313b);
    }
}
