package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f49049a = new Object();
    public static final ia.c f49050b = ia.c.c("packageName");
    public static final ia.c f49051c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f49052f = ia.c.c("currentProcessDetails");
    public static final ia.c f49053g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49050b, aVar.f49040a);
        eVar.a(f49051c, aVar.f49041b);
        eVar.a(d, aVar.f49042c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f49052f, aVar.d);
        eVar.a(f49053g, aVar.e);
    }
}
