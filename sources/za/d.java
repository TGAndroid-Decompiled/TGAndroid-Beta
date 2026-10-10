package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f54248a = new Object();
    public static final ia.c f54249b = ia.c.c("appId");
    public static final ia.c f54250c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c f54251e = ia.c.c("osVersion");
    public static final ia.c f54252f = ia.c.c("logEnvironment");
    public static final ia.c f54253g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54249b, bVar.f54235a);
        eVar.a(f54250c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f54251e, Build.VERSION.RELEASE);
        eVar.a(f54252f, p.LOG_ENVIRONMENT_PROD);
        eVar.a(f54253g, bVar.f54236b);
    }
}
