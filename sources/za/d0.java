package za;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class d0 {
    public static final d0 f54208a = new Object();
    public static final a4.l f54209b;

    static {
        ka.d dVar = new ka.d();
        dVar.a(c0.class, g.f54220a);
        dVar.a(l0.class, h.f54231a);
        dVar.a(j.class, e.f54210a);
        dVar.a(b.class, d.f54202a);
        dVar.a(a.class, c.f54194a);
        dVar.a(q.class, f.f54213a);
        dVar.d = true;
        f54209b = new a4.l(dVar, 26);
    }

    public static b a(k9.h hVar) {
        String valueOf;
        String str;
        hVar.a();
        Context context = hVar.f14747a;
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
        String str3 = hVar.f14749c.f14760b;
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
        q b10 = r.b(context);
        hVar.a();
        return new b(str3, new a(packageName, str, str2, b10, r.a(context)));
    }
}
