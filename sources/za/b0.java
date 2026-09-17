package za;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class b0 {
    public static final b0 f48770a = new Object();
    public static final ka.c f48771b;

    static {
        ka.e eVar = new ka.e();
        eVar.m(a0.class, g.f48801a);
        eVar.m(j0.class, h.f48809a);
        eVar.m(j.class, e.f48785a);
        eVar.m(b.class, d.f48777a);
        eVar.m(a.class, c.f48772a);
        eVar.m(p.class, f.f48795a);
        eVar.d = true;
        f48771b = new ka.c(eVar, 0);
    }

    public static b a(k9.h hVar) {
        String valueOf;
        String str;
        hVar.a();
        Context context = hVar.f13549a;
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
        String str3 = hVar.f13551c.f13560b;
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
