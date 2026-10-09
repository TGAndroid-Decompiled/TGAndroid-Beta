package za;

import android.os.Build;
public final class c implements ia.d {
    public static final c f54196a = new Object();
    public static final ia.c f54197b = ia.c.c("packageName");
    public static final ia.c f54198c = ia.c.c("versionName");
    public static final ia.c d = ia.c.c("appBuildVersion");
    public static final ia.c f54199e = ia.c.c("deviceManufacturer");
    public static final ia.c f54200f = ia.c.c("currentProcessDetails");
    public static final ia.c f54201g = ia.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54197b, aVar.f54182a);
        eVar.a(f54198c, aVar.f54183b);
        eVar.a(d, aVar.f54184c);
        eVar.a(f54199e, Build.MANUFACTURER);
        eVar.a(f54200f, aVar.d);
        eVar.a(f54201g, aVar.f54185e);
    }
}
