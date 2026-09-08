package r4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c0.l;
public abstract class i {
    public static final l f44935a = new Object();
    public static final Object f44936b = new Object();
    public static rb.a f44937c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return g.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static rb.a b() {
        rb.a aVar = new rb.a(21);
        f44937c = aVar;
        f44935a.k(aVar);
        return f44937c;
    }

    public static void c(android.content.Context r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: r4.i.c(android.content.Context, boolean):void");
    }
}
