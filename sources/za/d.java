package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f54202a = new Object();
    public static final ia.c f54203b = ia.c.c("appId");
    public static final ia.c f54204c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c f54205e = ia.c.c("osVersion");
    public static final ia.c f54206f = ia.c.c("logEnvironment");
    public static final ia.c f54207g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54203b, bVar.f54189a);
        eVar.a(f54204c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f54205e, Build.VERSION.RELEASE);
        eVar.a(f54206f, p.LOG_ENVIRONMENT_PROD);
        eVar.a(f54207g, bVar.f54190b);
    }
}
