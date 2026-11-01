package q2;

import android.content.Context;
import android.os.CancellationSignal;
import kotlin.jvm.internal.i;
import org.telegram.messenger.au;
import r2.y;
import td.m;
import v7.w6;
public final class b {
    public final Context f45424a;

    public b(Context context, int i10) {
        switch (i10) {
            case 1:
                i.e(context, "context");
                this.f45424a = context;
                return;
            default:
                context.getClass();
                this.f45424a = context;
                return;
        }
    }

    public static int b(b2.x r5) {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.b(b2.x):int");
    }

    public Object a(Context context, v0.e eVar, au auVar) {
        m mVar = new m(1, w6.b(auVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        y yVar = new y(mVar, 9);
        a3.b bVar = new a3.b(3);
        i.e(context, "context");
        v0.i c10 = k0.b.c(new k0.b(this.f45424a), eVar);
        if (c10 == null) {
            yVar.g(new w0.c(1, "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            yVar.g(new w0.c(3, "createCredential is not supported on this device"));
        } else {
            c10.onCreateCredential(context, eVar, cancellationSignal, bVar, yVar);
        }
        Object r10 = mVar.r();
        dd.a aVar = dd.a.f5864a;
        return r10;
    }
}
