package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f49003a = new Object();
    public static final ia.c f49004b = ia.c.c("packageName");
    public static final ia.c f49005c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f49006f = ia.c.c("currentProcessDetails");
    public static final ia.c f49007g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49004b, aVar.f48994a);
        eVar.a(f49005c, aVar.f48995b);
        eVar.a(d, aVar.f48996c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f49006f, aVar.d);
        eVar.a(f49007g, aVar.e);
    }
}
