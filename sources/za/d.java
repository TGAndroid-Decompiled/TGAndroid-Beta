package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f53067a = new Object();
    public static final ia.c f53068b = ia.c.c("appId");
    public static final ia.c f53069c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c f53070e = ia.c.c("osVersion");
    public static final ia.c f53071f = ia.c.c("logEnvironment");
    public static final ia.c f53072g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53068b, bVar.f53057a);
        eVar.a(f53069c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f53070e, Build.VERSION.RELEASE);
        eVar.a(f53071f, o.LOG_ENVIRONMENT_PROD);
        eVar.a(f53072g, bVar.f53058b);
    }
}
