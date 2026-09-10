package za;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class c0 {
    public static final c0 f47872a = new Object();
    public static final a6.i f47873b;

    static {
        ka.d dVar = new ka.d();
        dVar.m(b0.class, g.f47895a);
        dVar.m(k0.class, h.f47901a);
        dVar.m(j.class, e.f47879a);
        dVar.m(b.class, d.f47874a);
        dVar.m(a.class, c.f47867a);
        dVar.m(p.class, f.f47885a);
        dVar.d = true;
        f47873b = new a6.i(dVar, 28);
    }

    public static b a(k9.h hVar) {
        String valueOf;
        String str;
        hVar.a();
        Context context = hVar.f12392a;
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
        String str3 = hVar.f12394c.f12403b;
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
        p b10 = q.b(context);
        hVar.a();
        return new b(str3, new a(packageName, str, str2, b10, q.a(context)));
    }
}
