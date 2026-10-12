package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f54427a = new Object();
    public static final ia.c f54428b = ia.c.c("packageName");
    public static final ia.c f54429c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f54430e = ia.c.c("deviceManufacturer");
    public static final ia.c f54431f = ia.c.c("currentProcessDetails");
    public static final ia.c f54432g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54428b, aVar.f54416a);
        eVar.a(f54429c, aVar.f54417b);
        eVar.a(d, aVar.f54418c);
        eVar.a(f54430e, Build.MANUFACTURER);
        eVar.a(f54431f, aVar.d);
        eVar.a(f54432g, aVar.f54419e);
    }
}
