package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f54240a = new Object();
    public static final ia.c f54241b = ia.c.c("packageName");
    public static final ia.c f54242c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f54243e = ia.c.c("deviceManufacturer");
    public static final ia.c f54244f = ia.c.c("currentProcessDetails");
    public static final ia.c f54245g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54241b, aVar.f54226a);
        eVar.a(f54242c, aVar.f54227b);
        eVar.a(d, aVar.f54228c);
        eVar.a(f54243e, Build.MANUFACTURER);
        eVar.a(f54244f, aVar.d);
        eVar.a(f54245g, aVar.f54229e);
    }
}
