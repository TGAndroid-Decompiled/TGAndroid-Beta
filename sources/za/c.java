package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f53087a = new Object();
    public static final ia.c f53088b = ia.c.c("packageName");
    public static final ia.c f53089c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f53090e = ia.c.c("deviceManufacturer");
    public static final ia.c f53091f = ia.c.c("currentProcessDetails");
    public static final ia.c f53092g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53088b, aVar.f53077a);
        eVar.a(f53089c, aVar.f53078b);
        eVar.a(d, aVar.f53079c);
        eVar.a(f53090e, Build.MANUFACTURER);
        eVar.a(f53091f, aVar.d);
        eVar.a(f53092g, aVar.f53080e);
    }
}
