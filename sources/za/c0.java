package za;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class c0 {
    public static final c0 f54433a = new Object();
    public static final a4.l f54434b;

    static {
        ka.d dVar = new ka.d();
        dVar.a(b0.class, g.f54459a);
        dVar.a(k0.class, h.f54465a);
        dVar.a(j.class, e.f54441a);
        dVar.a(b.class, d.f54435a);
        dVar.a(a.class, c.f54427a);
        dVar.a(q.class, f.f54447a);
        dVar.d = true;
        f54434b = new a4.l(dVar, 26);
    }

    public static b a(k9.h hVar) {
        String valueOf;
        String str;
        hVar.a();
        Context context = hVar.f14744a;
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
        String str3 = hVar.f14746c.f14757b;
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
