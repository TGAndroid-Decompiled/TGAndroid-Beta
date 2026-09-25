package za;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class d0 {
    public static final d0 f49036a = new Object();
    public static final ka.c f49037b;

    static {
        ka.e eVar = new ka.e();
        eVar.a(c0.class, g.f49047a);
        eVar.a(l0.class, h.f49057a);
        eVar.a(j.class, e.f49038a);
        eVar.a(b.class, d.f49031a);
        eVar.a(a.class, c.f49024a);
        eVar.a(r.class, f.f49041a);
        eVar.d = true;
        f49037b = new ka.c(eVar, 0);
    }

    public static b a(k9.h hVar) {
        String valueOf;
        String str;
        hVar.a();
        Context context = hVar.f13534a;
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
        String str3 = hVar.f13536c.f13545b;
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
