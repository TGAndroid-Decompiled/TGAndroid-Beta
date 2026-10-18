package q2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.CancellationSignal;
import be.m;
import kotlin.jvm.internal.i;
import v0.h;
import v0.j;
import w7.n;
public final class b implements h {
    public final Context f44345a;

    public b(Context context, int i10) {
        switch (i10) {
            case 1:
                i.e(context, "context");
                this.f44345a = context;
                return;
            case 2:
                this.f44345a = context;
                return;
            default:
                context.getClass();
                this.f44345a = context;
                return;
        }
    }

    public static int c(b2.w r5) {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.c(b2.w):int");
    }

    public Object a(Context context, v0.e eVar, kd.c cVar) {
        m mVar = new m(1, n.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        l2.f fVar = new l2.f(mVar, 22);
        a3.b bVar = new a3.b(2);
        i.e(context, "context");
        j b10 = k6.h.b(new k6.h(this.f44345a, 3), eVar);
        if (b10 == null) {
            fVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            fVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            b10.onCreateCredential(context, eVar, cancellationSignal, bVar, fVar);
        }
        Object r10 = mVar.r();
        ld.a aVar = ld.a.f15998a;
        return r10;
    }

    public PackageInfo b(int i10, String str) {
        return this.f44345a.getPackageManager().getPackageInfo(str, i10);
    }
}
