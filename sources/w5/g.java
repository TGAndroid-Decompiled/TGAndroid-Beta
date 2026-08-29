package w5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class g {
    public static boolean f49772b = false;
    public static boolean f49773c = false;
    public static final int f49774e = 0;
    public static final AtomicBoolean f49771a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f49773c) {
                try {
                    PackageInfo c3 = i6.b.a(context).c(64, "com.google.android.gms");
                    h.b(context);
                    if (c3 != null && !h.d(c3, false) && h.d(c3, true)) {
                        f49772b = true;
                    } else {
                        f49772b = false;
                    }
                    f49773c = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    f49773c = true;
                }
            }
            if (!f49772b && "user".equals(Build.TYPE)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            f49773c = true;
            throw th2;
        }
    }

    public static int b(android.content.Context r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: w5.g.b(android.content.Context, int):int");
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
