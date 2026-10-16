package r4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c0.m;
public abstract class j {
    public static final m f43675a = new Object();
    public static final Object f43676b = new Object();
    public static sb.a f43677c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return h.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static sb.a b() {
        sb.a aVar = new sb.a(21);
        f43677c = aVar;
        f43675a.k(aVar);
        return f43677c;
    }

    public static void c(android.content.Context r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: r4.j.c(android.content.Context, boolean):void");
    }
}
