package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f53066a = new Object();
    public static final ia.c f53067b = ia.c.c("packageName");
    public static final ia.c f53068c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f53069e = ia.c.c("deviceManufacturer");
    public static final ia.c f53070f = ia.c.c("currentProcessDetails");
    public static final ia.c f53071g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f53067b, aVar.f53056a);
        eVar.a(f53068c, aVar.f53057b);
        eVar.a(d, aVar.f53058c);
        eVar.a(f53069e, Build.MANUFACTURER);
        eVar.a(f53070f, aVar.d);
        eVar.a(f53071g, aVar.f53059e);
    }
}
