package v5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

public final class h {

    public static h f48801b;

    public final Context f48802a;

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f48802a = context;
                break;
            default:
                this.f48802a = context.getApplicationContext();
                break;
        }
    }

    public static h a(Context context) {
        y5.l.h(context);
        synchronized (h.class) {
            try {
                if (f48801b == null) {
                    o.a(context);
                    f48801b = new h(context, 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f48801b;
    }

    public static final l c(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < lVarArr.length; i10++) {
                if (lVarArr[i10].equals(mVar)) {
                    return lVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (!z10) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z10 ? c(packageInfo2, n.f48812a) : c(packageInfo2, n.f48812a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public PackageInfo b(int i10, String str) {
        return this.f48802a.getPackageManager().getPackageInfo(str, i10);
    }
}
