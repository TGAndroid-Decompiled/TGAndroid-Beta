package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f49131a = new Object();
    public static final ia.c f49132b = ia.c.c("packageName");
    public static final ia.c f49133c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c e = ia.c.c("deviceManufacturer");
    public static final ia.c f49134f = ia.c.c("currentProcessDetails");
    public static final ia.c f49135g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49132b, aVar.f49119a);
        eVar.a(f49133c, aVar.f49120b);
        eVar.a(d, aVar.f49121c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f49134f, aVar.d);
        eVar.a(f49135g, aVar.e);
    }
}
