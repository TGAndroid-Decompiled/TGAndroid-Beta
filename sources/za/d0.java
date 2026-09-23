package za;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class d0 {
    public static final d0 f48707a = new Object();
    public static final ka.c f48708b;

    static {
        ka.e eVar = new ka.e();
        eVar.m(c0.class, g.f48718a);
        eVar.m(l0.class, h.f48728a);
        eVar.m(j.class, e.f48709a);
        eVar.m(b.class, d.f48702a);
        eVar.m(a.class, c.f48695a);
        eVar.m(r.class, f.f48712a);
        eVar.d = true;
        f48708b = new ka.c(eVar, 0);
    }

    public static b a(k9.h hVar) {
        String valueOf;
        String str;
        hVar.a();
        Context context = hVar.f13536a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            valueOf = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str2 = valueOf;
        hVar.a();
        String str3 = hVar.f13538c.f13547b;
        kotlin.jvm.internal.i.d(str3, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.i.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.i.d(RELEASE, "RELEASE");
        kotlin.jvm.internal.i.d(packageName, "packageName");
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str = str2;
        } else {
            str = str4;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.i.d(MANUFACTURER, "MANUFACTURER");
        hVar.a();
        r b10 = s.b(context);
        hVar.a();
        return new b(str3, new a(packageName, str, str2, b10, s.a(context)));
    }
}
