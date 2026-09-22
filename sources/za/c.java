package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f49069a = new Object();
    public static final ia.c f49070b = ia.c.c("packageName");
    public static final ia.c f49071c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f49072f = ia.c.c("currentProcessDetails");
    public static final ia.c f49073g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49070b, aVar.f49060a);
        eVar.a(f49071c, aVar.f49061b);
        eVar.a(d, aVar.f49062c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f49072f, aVar.d);
        eVar.a(f49073g, aVar.e);
    }
}
