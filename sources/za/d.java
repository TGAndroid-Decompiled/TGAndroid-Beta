package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f54290a = new Object();
    public static final ia.c f54291b = ia.c.c("appId");
    public static final ia.c f54292c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c f54293e = ia.c.c("osVersion");
    public static final ia.c f54294f = ia.c.c("logEnvironment");
    public static final ia.c f54295g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54291b, bVar.f54278a);
        eVar.a(f54292c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f54293e, Build.VERSION.RELEASE);
        eVar.a(f54294f, p.LOG_ENVIRONMENT_PROD);
        eVar.a(f54295g, bVar.f54279b);
    }
}
