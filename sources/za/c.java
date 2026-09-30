package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f49025a = new Object();
    public static final ia.c f49026b = ia.c.c("packageName");
    public static final ia.c f49027c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f49028f = ia.c.c("currentProcessDetails");
    public static final ia.c f49029g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49026b, aVar.f49013a);
        eVar.a(f49027c, aVar.f49014b);
        eVar.a(d, aVar.f49015c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f49028f, aVar.d);
        eVar.a(f49029g, aVar.e);
    }
}
