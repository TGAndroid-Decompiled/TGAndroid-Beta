package y5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;
import c2.u;
public final class h {
    public static h f47181b;
    public final Context f47182a;

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f47182a = context;
                return;
            default:
                this.f47182a = context.getApplicationContext();
                return;
        }
    }

    public static h b(Context context) {
        b6.m.h(context);
        synchronized (h.class) {
            try {
                if (f47181b == null) {
                    o.a(context);
                    f47181b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f47181b;
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

    public static final boolean d(android.content.pm.PackageInfo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: y5.h.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    public void a(af.d dVar, u uVar, o5.i iVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager f10;
        if (uVar != null) {
            synchronized (uVar) {
                try {
                    if (((CancellationSignal) uVar.f2037c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        uVar.f2037c = cancellationSignal2;
                        if (uVar.f2036b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) uVar.f2037c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT >= 23 && (f10 = e0.b.f(this.f47182a)) != null) {
            e0.b.a(f10, e0.b.C(dVar), cancellationSignal, new k0.a(iVar));
        }
    }
}
