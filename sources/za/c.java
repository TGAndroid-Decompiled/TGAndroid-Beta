package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f51419a = new Object();
    public static final ia.c f51420b = ia.c.c("packageName");
    public static final ia.c f51421c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f51422e = ia.c.c("deviceManufacturer");
    public static final ia.c f51423f = ia.c.c("currentProcessDetails");
    public static final ia.c f51424g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51420b, aVar.f51409a);
        eVar.a(f51421c, aVar.f51410b);
        eVar.a(d, aVar.f51411c);
        eVar.a(f51422e, Build.MANUFACTURER);
        eVar.a(f51423f, aVar.d);
        eVar.a(f51424g, aVar.f51412e);
    }
}
