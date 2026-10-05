package za;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class b0 {
    public static final b0 f53085a = new Object();
    public static final k2.e f53086b;

    static {
        ka.d dVar = new ka.d();
        dVar.a(a0.class, g.f53120a);
        dVar.a(j0.class, h.f53129a);
        dVar.a(j.class, e.f53102a);
        dVar.a(b.class, d.f53093a);
        dVar.a(a.class, c.f53087a);
        dVar.a(p.class, f.f53113a);
        dVar.d = true;
        f53086b = new k2.e(dVar, 1);
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
