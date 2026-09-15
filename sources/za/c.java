package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f48749a = new Object();
    public static final ia.c f48750b = ia.c.c("packageName");
    public static final ia.c f48751c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f48752f = ia.c.c("currentProcessDetails");
    public static final ia.c f48753g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48750b, aVar.f48740a);
        eVar.a(f48751c, aVar.f48741b);
        eVar.a(d, aVar.f48742c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f48752f, aVar.d);
        eVar.a(f48753g, aVar.e);
    }
}
