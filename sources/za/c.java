package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f47867a = new Object();
    public static final ia.c f47868b = ia.c.c("packageName");
    public static final ia.c f47869c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f47870f = ia.c.c("currentProcessDetails");
    public static final ia.c f47871g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f47868b, aVar.f47857a);
        eVar.a(f47869c, aVar.f47858b);
        eVar.a(d, aVar.f47859c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f47870f, aVar.d);
        eVar.a(f47871g, aVar.e);
    }
}
