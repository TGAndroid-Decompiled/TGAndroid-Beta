package y5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class g {
    public static boolean f47179b = false;
    public static boolean f47180c = false;
    public static final int e = 0;
    public static final AtomicBoolean f47178a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f47180c) {
                try {
                    PackageInfo L = k6.b.a(context).L(64, "com.google.android.gms");
                    h.b(context);
                    if (L != null && !h.d(L, false) && h.d(L, true)) {
                        f47179b = true;
                    } else {
                        f47179b = false;
                    }
                    f47180c = true;
                } catch (PackageManager.NameNotFoundException e6) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e6);
                    f47180c = true;
                }
            }
            if (!f47179b && "user".equals(Build.TYPE)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            f47180c = true;
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
