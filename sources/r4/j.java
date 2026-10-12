package r4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c0.m;
public abstract class j {
    public static final m f43916a = new Object();
    public static final Object f43917b = new Object();
    public static rb.b f43918c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return h.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static rb.b b() {
        rb.b bVar = new rb.b(21);
        f43918c = bVar;
        f43916a.k(bVar);
        return f43918c;
    }

    public static void c(android.content.Context r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: r4.j.c(android.content.Context, boolean):void");
    }
}
