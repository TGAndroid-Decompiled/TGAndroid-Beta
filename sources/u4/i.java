package u4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c0.m;
public abstract class i {
    public static final m f58457a = new Object();
    public static final Object f58458b = new Object();
    public static sa.d f58459c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return g.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static sa.d b() {
        sa.d dVar = new sa.d(26);
        f58459c = dVar;
        f58457a.k(dVar);
        return f58459c;
    }

    public static void c(android.content.Context r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: u4.i.c(android.content.Context, boolean):void");
    }
}
