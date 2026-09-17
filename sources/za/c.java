package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f51420a = new Object();
    public static final ia.c f51421b = ia.c.c("packageName");
    public static final ia.c f51422c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f51423e = ia.c.c("deviceManufacturer");
    public static final ia.c f51424f = ia.c.c("currentProcessDetails");
    public static final ia.c f51425g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51421b, aVar.f51410a);
        eVar.a(f51422c, aVar.f51411b);
        eVar.a(d, aVar.f51412c);
        eVar.a(f51423e, Build.MANUFACTURER);
        eVar.a(f51424f, aVar.d);
        eVar.a(f51425g, aVar.f51413e);
    }
}
