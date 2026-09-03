package y5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import b6.l0;
import java.util.concurrent.atomic.AtomicBoolean;
public class e {
    public static final int f50804a;
    public static final e f50805b;

    static {
        AtomicBoolean atomicBoolean = g.f50807a;
        f50804a = 12451000;
        f50805b = new Object();
    }

    public static int a(Context context) {
        AtomicBoolean atomicBoolean = g.f50807a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(Context context, String str, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            int i11 = l0.f1756a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && i6.b.f(context)) {
            int i12 = l0.f1756a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder sb = new StringBuilder("gcore_");
            sb.append(f50804a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(k6.c.a(context).b(0, context.getPackageName()).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb2 = sb.toString();
            int i13 = l0.f1756a;
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(sb2)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }

    public int c(Context context) {
        return d(context, f50804a);
    }

    public int d(Context context, int i10) {
        int b10 = g.b(context, i10);
        boolean z4 = true;
        if (b10 != 18) {
            if (b10 == 1) {
                z4 = g.c(context);
            } else {
                z4 = false;
            }
        }
        if (z4) {
            return 18;
        }
        return b10;
    }
}
