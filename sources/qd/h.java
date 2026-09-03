package qd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ld.a0;
import ld.c2;
import ld.e0;
import ld.l0;
import ld.w0;
public final class h extends l0 implements wc.d, uc.c {
    public static final AtomicReferenceFieldUpdater f43054n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final wc.c e;
    public Object f43055f;
    public final Object h;

    public h(a0 a0Var, wc.c cVar) {
        super(-1);
        this.d = a0Var;
        this.e = cVar;
        this.f43055f = a.f43045c;
        Object fold = cVar.getContext().fold(0, w.f43074c);
        kotlin.jvm.internal.j.b(fold);
        this.h = fold;
    }

    @Override
    public final void c(Object obj, CancellationException cancellationException) {
        if (!(obj instanceof ld.w)) {
            return;
        }
        throw null;
    }

    @Override
    public final wc.d getCallerFrame() {
        wc.c cVar = this.e;
        if (e2.c.s(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final uc.h getContext() {
        return this.e.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.f43055f;
        this.f43055f = a.f43045c;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object vVar;
        wc.c cVar = this.e;
        uc.h context = cVar.getContext();
        Throwable a2 = sc.f.a(obj);
        if (a2 == null) {
            vVar = obj;
        } else {
            vVar = new ld.v(a2, false);
        }
        a0 a0Var = this.d;
        if (a0Var.e()) {
            this.f43055f = vVar;
            this.f12006c = 0;
            a0Var.c(context, this);
            return;
        }
        w0 a10 = c2.a();
        if (a10.f12044c >= 4294967296L) {
            this.f43055f = vVar;
            this.f12006c = 0;
            tc.e eVar = a10.e;
            if (eVar == null) {
                eVar = new tc.e();
                a10.e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a10.h(true);
        try {
            uc.h context2 = cVar.getContext();
            Object k10 = a.k(context2, this.h);
            cVar.resumeWith(obj);
            a.f(context2, k10);
            do {
            } while (a10.j());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + e0.t(this.e) + ']';
    }

    @Override
    public final uc.c f() {
        return this;
    }
}
