package u4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c0.m;
public abstract class i {
    public static final m f56245a = new Object();
    public static final Object f56246b = new Object();
    public static nb.a f56247c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return g.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static nb.a b() {
        nb.a aVar = new nb.a(26);
        f56247c = aVar;
        f56245a.k(aVar);
        return f56247c;
    }

    public static void c(android.content.Context r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: u4.i.c(android.content.Context, boolean):void");
    }
}
