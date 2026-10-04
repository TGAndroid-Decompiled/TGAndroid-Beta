package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f53072a = new Object();
    public static final ia.c f53073b = ia.c.c("appId");
    public static final ia.c f53074c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c f53075e = ia.c.c("osVersion");
    public static final ia.c f53076f = ia.c.c("logEnvironment");
    public static final ia.c f53077g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53073b, bVar.f53062a);
        eVar.a(f53074c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f53075e, Build.VERSION.RELEASE);
        eVar.a(f53076f, o.LOG_ENVIRONMENT_PROD);
        eVar.a(f53077g, bVar.f53063b);
    }
}
