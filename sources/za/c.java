package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f49065a = new Object();
    public static final ia.c f49066b = ia.c.c("packageName");
    public static final ia.c f49067c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f49068f = ia.c.c("currentProcessDetails");
    public static final ia.c f49069g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49066b, aVar.f49056a);
        eVar.a(f49067c, aVar.f49057b);
        eVar.a(d, aVar.f49058c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f49068f, aVar.d);
        eVar.a(f49069g, aVar.e);
    }
}
