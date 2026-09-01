package y5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class g {
    public static boolean f50772b = false;
    public static boolean f50773c = false;
    public static final int f50774e = 0;
    public static final AtomicBoolean f50771a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f50773c) {
                try {
                    PackageInfo b10 = k6.c.a(context).b(64, "com.google.android.gms");
                    h.m(context);
                    if (b10 != null && !h.w(b10, false) && h.w(b10, true)) {
                        f50772b = true;
                    } else {
                        f50772b = false;
                    }
                    f50773c = true;
                } catch (PackageManager.NameNotFoundException e6) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e6);
                    f50773c = true;
                }
            }
            if (!f50772b && "user".equals(Build.TYPE)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            f50773c = true;
            throw th2;
        }
    }

    public static int b(android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: y5.g.b(android.content.Context, int):int");
    }

    public static boolean c(Context context) {
        try {
            for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if ("com.google.android.gms".equals(sessionInfo.getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
