package r4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c0.l;
public abstract class i {
    public static final l f41253a = new Object();
    public static final Object f41254b = new Object();
    public static qb.b f41255c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return g.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static qb.b b() {
        qb.b bVar = new qb.b(21);
        f41255c = bVar;
        f41253a.k(bVar);
        return f41255c;
    }

    public static void c(android.content.Context r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: r4.i.c(android.content.Context, boolean):void");
    }
}
