package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f49019a = new Object();
    public static final ia.c f49020b = ia.c.c("appId");
    public static final ia.c f49021c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c e = ia.c.c("osVersion");
    public static final ia.c f49022f = ia.c.c("logEnvironment");
    public static final ia.c f49023g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49020b, bVar.f49007a);
        eVar.a(f49021c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f49022f, q.LOG_ENVIRONMENT_PROD);
        eVar.a(f49023g, bVar.f49008b);
    }
}
