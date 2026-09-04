package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f51388a = new Object();
    public static final ia.c f51389b = ia.c.c("packageName");
    public static final ia.c f51390c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f51391e = ia.c.c("deviceManufacturer");
    public static final ia.c f51392f = ia.c.c("currentProcessDetails");
    public static final ia.c f51393g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51389b, aVar.f51378a);
        eVar.a(f51390c, aVar.f51379b);
        eVar.a(d, aVar.f51380c);
        eVar.a(f51391e, Build.MANUFACTURER);
        eVar.a(f51392f, aVar.d);
        eVar.a(f51393g, aVar.f51381e);
    }
}
