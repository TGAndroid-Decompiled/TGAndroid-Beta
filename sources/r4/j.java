package r4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c0.m;
public abstract class j {
    public static final m f45428a = new Object();
    public static final Object f45429b = new Object();
    public static rb.b f45430c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return h.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static rb.b b() {
        rb.b bVar = new rb.b(21);
        f45430c = bVar;
        f45428a.k(bVar);
        return f45430c;
    }

    public static void c(android.content.Context r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: r4.j.c(android.content.Context, boolean):void");
    }
}
