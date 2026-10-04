package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f53066a = new Object();
    public static final ia.c f53067b = ia.c.c("appId");
    public static final ia.c f53068c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c f53069e = ia.c.c("osVersion");
    public static final ia.c f53070f = ia.c.c("logEnvironment");
    public static final ia.c f53071g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53067b, bVar.f53056a);
        eVar.a(f53068c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f53069e, Build.VERSION.RELEASE);
        eVar.a(f53070f, o.LOG_ENVIRONMENT_PROD);
        eVar.a(f53071g, bVar.f53057b);
    }
}
