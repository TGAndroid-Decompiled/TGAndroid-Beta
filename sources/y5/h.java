package y5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;
import c2.u;
import com.google.firebase.messaging.r;
import k7.g8;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.rb0;
import q5.g0;
public final class h implements v0.h {
    public static h f47087b;
    public Context f47088a;

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f47088a = context;
                return;
            case 2:
                kotlin.jvm.internal.j.e(context, "context");
                this.f47088a = context;
                return;
            default:
                this.f47088a = context.getApplicationContext();
                return;
        }
    }

    public static h d(Context context) {
        b6.m.h(context);
        synchronized (h.class) {
            try {
                if (f47087b == null) {
                    o.a(context);
                    f47087b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f47087b;
    }

    public static final l e(PackageInfo packageInfo, l... lVarArr) {
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

    public static final boolean f(android.content.pm.PackageInfo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: y5.h.f(android.content.pm.PackageInfo, boolean):boolean");
    }

    public void a(androidx.biometric.e eVar, u uVar, o5.i iVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager f10;
        if (uVar != null) {
            synchronized (uVar) {
                try {
                    if (((CancellationSignal) uVar.f2007c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        uVar.f2007c = cancellationSignal2;
                        if (uVar.f2006b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) uVar.f2007c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT >= 23 && (f10 = e0.b.f(this.f47088a)) != null) {
            e0.b.a(f10, e0.b.C(eVar), cancellationSignal, new k0.a(iVar));
        }
    }

    public y2.j b() {
        Context context = this.f47088a;
        if (context != null) {
            ?? obj = new Object();
            obj.f47017a = a3.a.a(y2.m.f47023a);
            a3.c cVar = new a3.c(context, 0);
            obj.f47018b = cVar;
            obj.f47019c = a3.a.a(new g0(20, cVar, new qk0(cVar, 21)));
            a3.c cVar2 = obj.f47018b;
            obj.d = new o5.i(cVar2, 16);
            rc.a a2 = a3.a.a(new bf.b(29, obj.d, a3.a.a(new ja.c(cVar2, 8))));
            obj.e = a2;
            db.a aVar = new db.a(4);
            a3.c cVar3 = obj.f47018b;
            androidx.biometric.e eVar = new androidx.biometric.e(cVar3, a2, aVar, 12);
            rc.a aVar2 = obj.f47017a;
            rc.a aVar3 = obj.f47019c;
            ?? obj2 = new Object();
            obj2.f2129a = aVar2;
            obj2.f2130b = aVar3;
            obj2.f2131c = eVar;
            obj2.d = a2;
            obj2.e = a2;
            ?? obj3 = new Object();
            obj3.f13641a = cVar3;
            obj3.f13642b = aVar3;
            obj3.f13643c = a2;
            obj3.d = eVar;
            obj3.e = aVar2;
            obj3.f13644f = a2;
            obj3.h = a2;
            obj.f47020f = a3.a.a(new s5.m((Object) obj2, (Object) obj3, new r(aVar2, a2, eVar, a2, 6), 11));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public Object c(Context context, v0.e eVar, uc.c cVar) {
        ld.m mVar = new ld.m(1, g8.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        o2.o oVar = new o2.o(mVar, 27);
        rb0 rb0Var = new rb0(1);
        kotlin.jvm.internal.j.e(context, "context");
        v0.j a2 = k6.b.a(new k6.b(this.f47088a, 1), eVar);
        if (a2 == null) {
            oVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            oVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            a2.onCreateCredential(context, eVar, cancellationSignal, rb0Var, oVar);
        }
        Object r10 = mVar.r();
        vc.a aVar = vc.a.f45663a;
        return r10;
    }
}
