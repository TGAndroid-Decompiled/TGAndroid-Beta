package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f54435a = new Object();
    public static final ia.c f54436b = ia.c.c("appId");
    public static final ia.c f54437c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c f54438e = ia.c.c("osVersion");
    public static final ia.c f54439f = ia.c.c("logEnvironment");
    public static final ia.c f54440g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54436b, bVar.f54423a);
        eVar.a(f54437c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f54438e, Build.VERSION.RELEASE);
        eVar.a(f54439f, p.LOG_ENVIRONMENT_PROD);
        eVar.a(f54440g, bVar.f54424b);
    }
}
