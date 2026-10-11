package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f54316a = new Object();
    public static final ia.c f54317b = ia.c.c("packageName");
    public static final ia.c f54318c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f54319e = ia.c.c("deviceManufacturer");
    public static final ia.c f54320f = ia.c.c("currentProcessDetails");
    public static final ia.c f54321g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54317b, aVar.f54305a);
        eVar.a(f54318c, aVar.f54306b);
        eVar.a(d, aVar.f54307c);
        eVar.a(f54319e, Build.MANUFACTURER);
        eVar.a(f54320f, aVar.d);
        eVar.a(f54321g, aVar.f54308e);
    }
}
