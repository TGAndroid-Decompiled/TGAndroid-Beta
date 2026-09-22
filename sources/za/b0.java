package za;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class b0 {
    public static final b0 f49067a = new Object();
    public static final k2.e f49068b;

    static {
        ka.d dVar = new ka.d();
        dVar.m(a0.class, g.f49098a);
        dVar.m(j0.class, h.f49106a);
        dVar.m(j.class, e.f49082a);
        dVar.m(b.class, d.f49074a);
        dVar.m(a.class, c.f49069a);
        dVar.m(p.class, f.f49092a);
        dVar.d = true;
        f49068b = new k2.e(dVar, 1);
    }

    public static b a(k9.h hVar) {
        String valueOf;
        String str;
        hVar.a();
        Context context = hVar.f13548a;
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
        String str3 = hVar.f13550c.f13559b;
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
