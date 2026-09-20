package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f49054a = new Object();
    public static final ia.c f49055b = ia.c.c("appId");
    public static final ia.c f49056c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c e = ia.c.c("osVersion");
    public static final ia.c f49057f = ia.c.c("logEnvironment");
    public static final ia.c f49058g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49055b, bVar.f49045a);
        eVar.a(f49056c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f49057f, o.LOG_ENVIRONMENT_PROD);
        eVar.a(f49058g, bVar.f49046b);
    }
}
