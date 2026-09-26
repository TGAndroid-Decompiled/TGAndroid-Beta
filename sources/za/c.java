package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f49022a = new Object();
    public static final ia.c f49023b = ia.c.c("packageName");
    public static final ia.c f49024c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f49025f = ia.c.c("currentProcessDetails");
    public static final ia.c f49026g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49023b, aVar.f49010a);
        eVar.a(f49024c, aVar.f49011b);
        eVar.a(d, aVar.f49012c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f49025f, aVar.d);
        eVar.a(f49026g, aVar.e);
    }
}
