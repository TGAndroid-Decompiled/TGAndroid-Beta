package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f47874a = new Object();
    public static final ia.c f47875b = ia.c.c("appId");
    public static final ia.c f47876c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c e = ia.c.c("osVersion");
    public static final ia.c f47877f = ia.c.c("logEnvironment");
    public static final ia.c f47878g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f47875b, bVar.f47863a);
        eVar.a(f47876c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f47877f, o.LOG_ENVIRONMENT_PROD);
        eVar.a(f47878g, bVar.f47864b);
    }
}
