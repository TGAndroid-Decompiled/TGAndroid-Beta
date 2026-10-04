package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f53061a = new Object();
    public static final ia.c f53062b = ia.c.c("packageName");
    public static final ia.c f53063c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f53064e = ia.c.c("deviceManufacturer");
    public static final ia.c f53065f = ia.c.c("currentProcessDetails");
    public static final ia.c f53066g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53062b, aVar.f53051a);
        eVar.a(f53063c, aVar.f53052b);
        eVar.a(d, aVar.f53053c);
        eVar.a(f53064e, Build.MANUFACTURER);
        eVar.a(f53065f, aVar.d);
        eVar.a(f53066g, aVar.f53054e);
    }
}
