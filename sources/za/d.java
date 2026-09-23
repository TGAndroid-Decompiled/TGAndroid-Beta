package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f48702a = new Object();
    public static final ia.c f48703b = ia.c.c("appId");
    public static final ia.c f48704c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c e = ia.c.c("osVersion");
    public static final ia.c f48705f = ia.c.c("logEnvironment");
    public static final ia.c f48706g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48703b, bVar.f48690a);
        eVar.a(f48704c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f48705f, q.LOG_ENVIRONMENT_PROD);
        eVar.a(f48706g, bVar.f48691b);
    }
}
