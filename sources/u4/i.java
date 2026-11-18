package u4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c0.m;
public abstract class i {
    public static final m f58411a = new Object();
    public static final Object f58412b = new Object();
    public static sa.d f58413c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return g.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static sa.d b() {
        sa.d dVar = new sa.d(26);
        f58413c = dVar;
        f58411a.k(dVar);
        return f58413c;
    }

    public static void c(android.content.Context r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: u4.i.c(android.content.Context, boolean):void");
    }
}
