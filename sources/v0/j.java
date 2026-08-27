package v0;

import android.content.Context;
import android.os.CancellationSignal;
import com.google.firebase.messaging.t;
import h7.h7;
import m.t3;
import org.telegram.ui.kb0;
import w3.b0;

public final class j implements h {

    public Context f48662a;

    public j(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        this.f48662a = context;
    }

    public w2.j a() {
        Context context = this.f48662a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        w2.j jVar = new w2.j();
        jVar.f48960a = y2.a.a(w2.m.f48967a);
        e.a aVar = new e.a(context);
        jVar.f48961b = aVar;
        jVar.f48962c = y2.a.a(new b0(3, aVar, new n1.d(aVar, 24)));
        e.a aVar2 = jVar.f48961b;
        jVar.d = new a9.i(aVar2, 12);
        oc.a aVarA = y2.a.a(new xe.b(jVar.d, y2.a.a(new k5.i(aVar2, 10)), false, 17));
        jVar.f48963e = aVarA;
        za.b bVar = new za.b(2);
        e.a aVar3 = jVar.f48961b;
        a5.n nVar = new a5.n(aVar3, aVarA, bVar, 4);
        oc.a aVar4 = jVar.f48960a;
        oc.a aVar5 = jVar.f48962c;
        af.h hVar = new af.h();
        hVar.f274a = aVar4;
        hVar.f275b = aVar5;
        hVar.f276c = nVar;
        hVar.d = aVarA;
        hVar.f277e = aVarA;
        t3 t3Var = new t3();
        t3Var.f17473a = aVar3;
        t3Var.f17474b = aVar5;
        t3Var.f17475c = aVarA;
        t3Var.d = nVar;
        t3Var.f17476e = aVar4;
        t3Var.f17477f = aVarA;
        t3Var.h = aVarA;
        jVar.f48964f = y2.a.a(new u2.b(hVar, t3Var, new t(aVar4, aVarA, nVar, aVarA, 6), 5));
        return jVar;
    }

    public Object b(Context context, e eVar, rc.c cVar) {
        id.m mVar = new id.m(1, h7.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new g(cancellationSignal));
        sd.b bVar = new sd.b(mVar);
        kb0 kb0Var = new kb0(1);
        kotlin.jvm.internal.j.e(context, "context");
        k kVarB = androidx.biometric.s.b(new androidx.biometric.s(this.f48662a, 2), eVar);
        if (kVarB == null) {
            bVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            bVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            kVarB.onCreateCredential(context, eVar, cancellationSignal, kb0Var, bVar);
        }
        Object objR = mVar.r();
        sc.a aVar = sc.a.f47847a;
        return objR;
    }
}
