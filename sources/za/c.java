package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f49012a = new Object();
    public static final ia.c f49013b = ia.c.c("packageName");
    public static final ia.c f49014c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f49015f = ia.c.c("currentProcessDetails");
    public static final ia.c f49016g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49013b, aVar.f49000a);
        eVar.a(f49014c, aVar.f49001b);
        eVar.a(d, aVar.f49002c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f49015f, aVar.d);
        eVar.a(f49016g, aVar.e);
    }
}
