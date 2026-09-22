package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f48742a = new Object();
    public static final ia.c f48743b = ia.c.c("packageName");
    public static final ia.c f48744c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f48745f = ia.c.c("currentProcessDetails");
    public static final ia.c f48746g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48743b, aVar.f48733a);
        eVar.a(f48744c, aVar.f48734b);
        eVar.a(d, aVar.f48735c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f48745f, aVar.d);
        eVar.a(f48746g, aVar.e);
    }
}
