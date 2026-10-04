package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f53060a = new Object();
    public static final ia.c f53061b = ia.c.c("packageName");
    public static final ia.c f53062c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f53063e = ia.c.c("deviceManufacturer");
    public static final ia.c f53064f = ia.c.c("currentProcessDetails");
    public static final ia.c f53065g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53061b, aVar.f53050a);
        eVar.a(f53062c, aVar.f53051b);
        eVar.a(d, aVar.f53052c);
        eVar.a(f53063e, Build.MANUFACTURER);
        eVar.a(f53064f, aVar.d);
        eVar.a(f53065g, aVar.f53053e);
    }
}
