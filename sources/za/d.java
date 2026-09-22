package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f49074a = new Object();
    public static final ia.c f49075b = ia.c.c("appId");
    public static final ia.c f49076c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c e = ia.c.c("osVersion");
    public static final ia.c f49077f = ia.c.c("logEnvironment");
    public static final ia.c f49078g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49075b, bVar.f49065a);
        eVar.a(f49076c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f49077f, o.LOG_ENVIRONMENT_PROD);
        eVar.a(f49078g, bVar.f49066b);
    }
}
