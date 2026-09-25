package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f49024a = new Object();
    public static final ia.c f49025b = ia.c.c("packageName");
    public static final ia.c f49026c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f49027f = ia.c.c("currentProcessDetails");
    public static final ia.c f49028g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49025b, aVar.f49012a);
        eVar.a(f49026c, aVar.f49013b);
        eVar.a(d, aVar.f49014c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f49027f, aVar.d);
        eVar.a(f49028g, aVar.e);
    }
}
