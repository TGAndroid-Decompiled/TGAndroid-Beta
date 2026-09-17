package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f51389a = new Object();
    public static final ia.c f51390b = ia.c.c("packageName");
    public static final ia.c f51391c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f51392e = ia.c.c("deviceManufacturer");
    public static final ia.c f51393f = ia.c.c("currentProcessDetails");
    public static final ia.c f51394g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51390b, aVar.f51379a);
        eVar.a(f51391c, aVar.f51380b);
        eVar.a(d, aVar.f51381c);
        eVar.a(f51392e, Build.MANUFACTURER);
        eVar.a(f51393f, aVar.d);
        eVar.a(f51394g, aVar.f51382e);
    }
}
