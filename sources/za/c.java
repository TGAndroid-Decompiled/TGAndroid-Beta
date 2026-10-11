package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f54282a = new Object();
    public static final ia.c f54283b = ia.c.c("packageName");
    public static final ia.c f54284c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f54285e = ia.c.c("deviceManufacturer");
    public static final ia.c f54286f = ia.c.c("currentProcessDetails");
    public static final ia.c f54287g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54283b, aVar.f54271a);
        eVar.a(f54284c, aVar.f54272b);
        eVar.a(d, aVar.f54273c);
        eVar.a(f54285e, Build.MANUFACTURER);
        eVar.a(f54286f, aVar.d);
        eVar.a(f54287g, aVar.f54274e);
    }
}
