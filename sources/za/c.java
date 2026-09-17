package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f48772a = new Object();
    public static final ia.c f48773b = ia.c.c("packageName");
    public static final ia.c f48774c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f48775f = ia.c.c("currentProcessDetails");
    public static final ia.c f48776g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48773b, aVar.f48763a);
        eVar.a(f48774c, aVar.f48764b);
        eVar.a(d, aVar.f48765c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f48775f, aVar.d);
        eVar.a(f48776g, aVar.e);
    }
}
