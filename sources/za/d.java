package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f53093a = new Object();
    public static final ia.c f53094b = ia.c.c("appId");
    public static final ia.c f53095c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c f53096e = ia.c.c("osVersion");
    public static final ia.c f53097f = ia.c.c("logEnvironment");
    public static final ia.c f53098g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53094b, bVar.f53083a);
        eVar.a(f53095c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f53096e, Build.VERSION.RELEASE);
        eVar.a(f53097f, o.LOG_ENVIRONMENT_PROD);
        eVar.a(f53098g, bVar.f53084b);
    }
}
