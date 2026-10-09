package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f54194a = new Object();
    public static final ia.c f54195b = ia.c.c("packageName");
    public static final ia.c f54196c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f54197e = ia.c.c("deviceManufacturer");
    public static final ia.c f54198f = ia.c.c("currentProcessDetails");
    public static final ia.c f54199g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54195b, aVar.f54180a);
        eVar.a(f54196c, aVar.f54181b);
        eVar.a(d, aVar.f54182c);
        eVar.a(f54197e, Build.MANUFACTURER);
        eVar.a(f54198f, aVar.d);
        eVar.a(f54199g, aVar.f54183e);
    }
}
