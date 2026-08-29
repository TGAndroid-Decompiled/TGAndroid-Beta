package w5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.biometric.t;
import i7.v7;
import org.telegram.ui.ib0;
public final class h implements v0.h {
    public static h f49775b;
    public final Context f49776a;

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                kotlin.jvm.internal.j.e(context, "context");
                this.f49776a = context;
                return;
            default:
                this.f49776a = context.getApplicationContext();
                return;
        }
    }

    public static h b(Context context) {
        z5.l.h(context);
        synchronized (h.class) {
            try {
                if (f49775b == null) {
                    p.a(context);
                    f49775b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f49775b;
    }

    public static final m c(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < mVarArr.length; i10++) {
                if (mVarArr[i10].equals(nVar)) {
                    return mVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean d(android.content.pm.PackageInfo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: w5.h.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    public Object a(Context context, v0.e eVar, sc.c cVar) {
        jd.m mVar = new jd.m(1, v7.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        o4.g gVar = new o4.g(mVar, 19);
        ib0 ib0Var = new ib0(1);
        kotlin.jvm.internal.j.e(context, "context");
        v0.j b10 = t.b(new t(this.f49776a, 3), eVar);
        if (b10 == null) {
            gVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            gVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            b10.onCreateCredential(context, eVar, cancellationSignal, ib0Var, gVar);
        }
        Object r6 = mVar.r();
        tc.a aVar = tc.a.f48210a;
        return r6;
    }
}
