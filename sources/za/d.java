package za;

import android.os.Build;
public final class d implements ia.d {
    public static final d f49030a = new Object();
    public static final ia.c f49031b = ia.c.c("appId");
    public static final ia.c f49032c = ia.c.c("deviceModel");
    public static final ia.c d = ia.c.c("sessionSdkVersion");
    public static final ia.c e = ia.c.c("osVersion");
    public static final ia.c f49033f = ia.c.c("logEnvironment");
    public static final ia.c f49034g = ia.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49031b, bVar.f49018a);
        eVar.a(f49032c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f49033f, q.LOG_ENVIRONMENT_PROD);
        eVar.a(f49034g, bVar.f49019b);
    }
}
