package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f48782a = new Object();
    public static final ia.c f48783b = ia.c.c("appId");
    public static final ia.c f48784c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c e = ia.c.c("osVersion");
    public static final ia.c f48785f = ia.c.c("logEnvironment");
    public static final ia.c f48786g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48783b, bVar.f48773a);
        eVar.a(f48784c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f48785f, o.LOG_ENVIRONMENT_PROD);
        eVar.a(f48786g, bVar.f48774b);
    }
}
