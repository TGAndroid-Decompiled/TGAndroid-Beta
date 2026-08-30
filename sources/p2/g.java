package p2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
public final class g implements z3.d {
    public int f40990a;
    public int f40991b;
    public Object f40992c;

    @Override
    public int a() {
        return this.f40990a;
    }

    @Override
    public int b() {
        return this.f40991b;
    }

    @Override
    public int c() {
        int i10 = this.f40990a;
        if (i10 == -1) {
            return ((h5.w) this.f40992c).x();
        }
        return i10;
    }

    public int d() {
        return ((((byte[]) this.f40992c).length - this.f40990a) * 8) - this.f40991b;
    }

    public h e() {
        ?? obj = new Object();
        obj.f40993a = this.f40990a;
        obj.f40994b = this.f40991b;
        obj.f40995c = (String) this.f40992c;
        return obj;
    }

    public int f(int i10) {
        byte[] bArr = (byte[]) this.f40992c;
        if (i10 >= 1 && i10 <= 32 && i10 <= d()) {
            int i11 = this.f40991b;
            int i12 = 0;
            if (i11 > 0) {
                int i13 = 8 - i11;
                int min = Math.min(i10, i13);
                int i14 = i13 - min;
                int i15 = this.f40990a;
                int i16 = (((255 >> (8 - min)) << i14) & bArr[i15]) >> i14;
                i10 -= min;
                int i17 = this.f40991b + min;
                this.f40991b = i17;
                if (i17 == 8) {
                    this.f40991b = 0;
                    this.f40990a = i15 + 1;
                }
                i12 = i16;
            }
            if (i10 > 0) {
                while (i10 >= 8) {
                    int i18 = i12 << 8;
                    int i19 = this.f40990a;
                    this.f40990a = i19 + 1;
                    i10 -= 8;
                    i12 = i18 | (bArr[i19] & 255);
                }
                if (i10 > 0) {
                    int i20 = 8 - i10;
                    int i21 = ((bArr[this.f40990a] & ((255 >> i20) << i20)) >> i20) | (i12 << i10);
                    this.f40991b += i10;
                    return i21;
                }
            }
            return i12;
        }
        throw new IllegalArgumentException(String.valueOf(i10));
    }

    public synchronized int g() {
        PackageInfo packageInfo;
        if (this.f40990a == 0) {
            try {
                packageInfo = k6.c.a((Context) this.f40992c).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f40990a = packageInfo.versionCode;
            }
        }
        return this.f40990a;
    }

    public synchronized int h() {
        int i10 = this.f40991b;
        if (i10 != 0) {
            return i10;
        }
        Context context = (Context) this.f40992c;
        PackageManager packageManager = context.getPackageManager();
        if (k6.c.a(context).f9754a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!i6.b.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f40991b = i11;
                return i11;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i11 = 2;
            this.f40991b = i11;
            return i11;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == i6.b.d()) {
            i11 = 2;
        }
        this.f40991b = i11;
        return i11;
    }
}
