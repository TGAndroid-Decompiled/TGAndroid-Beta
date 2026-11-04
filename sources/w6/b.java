package w6;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.emoji2.text.n;
import java.io.Closeable;
import java.io.IOException;
import m6.h;
public abstract class b {
    public static final char[] f57391a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static Boolean f57392b;
    public static Boolean f57393c;
    public static Boolean d;
    public static Boolean f57394e;

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

    public static boolean e(Context context, int i3) {
        if (g(i3, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                h a10 = h.a(context);
                a10.getClass();
                if (packageInfo != null) {
                    if (!h.b(packageInfo, false)) {
                        if (h.b(packageInfo, true)) {
                            if (!m6.g.a(a10.f19196a)) {
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
        if (f57392b == null) {
            f57392b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (!f57392b.booleanValue() || Build.VERSION.SDK_INT >= 24) {
            if (f57393c == null) {
                f57393c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (f57393c.booleanValue()) {
                if (!d() || Build.VERSION.SDK_INT >= 30) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean g(int i3, Context context, String str) {
        n a10 = y6.b.a(context);
        a10.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a10.f1741a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i3, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
