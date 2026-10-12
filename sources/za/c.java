package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f54419a = new Object();
    public static final ia.c f54420b = ia.c.c("packageName");
    public static final ia.c f54421c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f54422e = ia.c.c("deviceManufacturer");
    public static final ia.c f54423f = ia.c.c("currentProcessDetails");
    public static final ia.c f54424g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54420b, aVar.f54408a);
        eVar.a(f54421c, aVar.f54409b);
        eVar.a(d, aVar.f54410c);
        eVar.a(f54422e, Build.MANUFACTURER);
        eVar.a(f54423f, aVar.d);
        eVar.a(f54424g, aVar.f54411e);
    }
}
