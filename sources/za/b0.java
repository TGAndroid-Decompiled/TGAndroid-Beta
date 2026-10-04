package za;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class b0 {
    public static final b0 f53064a = new Object();
    public static final k2.e f53065b;

    static {
        ka.d dVar = new ka.d();
        dVar.a(a0.class, g.f53099a);
        dVar.a(j0.class, h.f53108a);
        dVar.a(j.class, e.f53081a);
        dVar.a(b.class, d.f53072a);
        dVar.a(a.class, c.f53066a);
        dVar.a(p.class, f.f53092a);
        dVar.d = true;
        f53065b = new k2.e(dVar, 1);
    }

    public static b a(k9.h hVar) {
        String valueOf;
        String str;
        hVar.a();
        Context context = hVar.f14715a;
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
        String str3 = hVar.f14717c.f14728b;
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
