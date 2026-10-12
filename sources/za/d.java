package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f54427a = new Object();
    public static final ia.c f54428b = ia.c.c("appId");
    public static final ia.c f54429c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c f54430e = ia.c.c("osVersion");
    public static final ia.c f54431f = ia.c.c("logEnvironment");
    public static final ia.c f54432g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54428b, bVar.f54415a);
        eVar.a(f54429c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f54430e, Build.VERSION.RELEASE);
        eVar.a(f54431f, p.LOG_ENVIRONMENT_PROD);
        eVar.a(f54432g, bVar.f54416b);
    }
}
