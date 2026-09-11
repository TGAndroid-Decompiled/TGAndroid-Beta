package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f51394a = new Object();
    public static final ia.c f51395b = ia.c.c("appId");
    public static final ia.c f51396c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c f51397e = ia.c.c("osVersion");
    public static final ia.c f51398f = ia.c.c("logEnvironment");
    public static final ia.c f51399g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51395b, bVar.f51384a);
        eVar.a(f51396c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f51397e, Build.VERSION.RELEASE);
        eVar.a(f51398f, o.LOG_ENVIRONMENT_PROD);
        eVar.a(f51399g, bVar.f51385b);
    }
}
