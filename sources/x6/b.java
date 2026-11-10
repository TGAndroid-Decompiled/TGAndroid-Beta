package x6;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.biometric.t;
import java.io.Closeable;
import java.io.IOException;
import n6.h;
public abstract class b {
    public static final char[] f58642a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static Boolean f58643b;
    public static Boolean f58644c;
    public static Boolean d;
    public static Boolean f58645e;

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean e(Context context, int i7) {
        if (g(i7, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                h a10 = h.a(context);
                a10.getClass();
                if (packageInfo != null) {
                    if (!h.b(packageInfo, false)) {
                        if (h.b(packageInfo, true)) {
                            if (!n6.g.a(a10.f20513a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f58643b == null) {
            f58643b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (!f58643b.booleanValue() || Build.VERSION.SDK_INT >= 24) {
            if (f58644c == null) {
                f58644c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (f58644c.booleanValue()) {
                if (!d() || Build.VERSION.SDK_INT >= 30) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean g(int i7, Context context, String str) {
        t a10 = z6.b.a(context);
        a10.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a10.f2020a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i7, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
