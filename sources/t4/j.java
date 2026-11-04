package t4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c0.m;
public abstract class j {
    public static final m f54926a = new Object();
    public static final Object f54927b = new Object();
    public static ra.e f54928c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return h.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static ra.e b() {
        ra.e eVar = new ra.e(24);
        f54928c = eVar;
        f54926a.k(eVar);
        return f54928c;
    }

    public static void c(android.content.Context r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: t4.j.c(android.content.Context, boolean):void");
    }
}
