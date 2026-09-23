package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f48695a = new Object();
    public static final ia.c f48696b = ia.c.c("packageName");
    public static final ia.c f48697c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f48698f = ia.c.c("currentProcessDetails");
    public static final ia.c f48699g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48696b, aVar.f48683a);
        eVar.a(f48697c, aVar.f48684b);
        eVar.a(d, aVar.f48685c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f48698f, aVar.d);
        eVar.a(f48699g, aVar.e);
    }
}
