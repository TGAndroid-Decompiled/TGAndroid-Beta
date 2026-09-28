package q2;

import android.content.Context;
import android.os.CancellationSignal;
import k2.u;
import kotlin.jvm.internal.i;
import v0.h;
import v0.j;
import zd.m;
public final class b implements h {
    public final Context f41387a;

    public b(Context context, int i10) {
        switch (i10) {
            case 1:
                i.e(context, "context");
                this.f41387a = context;
                return;
            default:
                this.f41387a = context;
                return;
        }
    }

    public static int b(b2.s r5) {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.b(b2.s):int");
    }

    public Object a(Context context, v0.e eVar, id.c cVar) {
        m mVar = new m(1, w7.g.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        u uVar = new u(mVar, 27);
        a3.b bVar = new a3.b(2);
        i.e(context, "context");
        j c10 = k6.h.c(new k6.h(this.f41387a, 4), eVar);
        if (c10 == null) {
            uVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            uVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            c10.onCreateCredential(context, eVar, cancellationSignal, bVar, uVar);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.f12959a;
        return r10;
    }
}
