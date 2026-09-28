package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f49023a = new Object();
    public static final ia.c f49024b = ia.c.c("packageName");
    public static final ia.c f49025c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f49026f = ia.c.c("currentProcessDetails");
    public static final ia.c f49027g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49024b, aVar.f49011a);
        eVar.a(f49025c, aVar.f49012b);
        eVar.a(d, aVar.f49013c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f49026f, aVar.d);
        eVar.a(f49027g, aVar.e);
    }
}
