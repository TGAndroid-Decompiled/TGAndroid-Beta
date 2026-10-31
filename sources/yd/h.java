package yd;

import c3.i0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.a0;
import td.d2;
import td.e0;
import td.l0;
import td.w0;
public final class h extends l0 implements ed.d, cd.c {
    public static final AtomicReferenceFieldUpdater f54402n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile Object _reusableCancellableContinuation$volatile;
    public final a0 d;
    public final ed.c e;
    public Object f54403f;
    public final Object h;

    public h(a0 a0Var, ed.c cVar) {
        super(-1);
        this.d = a0Var;
        this.e = cVar;
        this.f54403f = a.f54393c;
        Object fold = cVar.getContext().fold(0, w.f54422c);
        kotlin.jvm.internal.i.b(fold);
        this.h = fold;
    }

    @Override
    public final void b(Object obj, CancellationException cancellationException) {
        if (!(obj instanceof td.w)) {
            return;
        }
        throw null;
    }

    @Override
    public final ed.d getCallerFrame() {
        ed.c cVar = this.e;
        if (i0.t(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final cd.h getContext() {
        return this.e.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.f54403f;
        this.f54403f = a.f54393c;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) {
        Object vVar;
        ed.c cVar = this.e;
        cd.h context = cVar.getContext();
        Throwable a2 = ad.g.a(obj);
        if (a2 == null) {
            vVar = obj;
        } else {
            vVar = new td.v(a2, false);
        }
        a0 a0Var = this.d;
        if (a0Var.d()) {
            this.f54403f = vVar;
            this.f48637c = 0;
            a0Var.c(context, this);
            return;
        }
        w0 a10 = d2.a();
        if (a10.f48675c >= 4294967296L) {
            this.f54403f = vVar;
            this.f48637c = 0;
            bd.g gVar = a10.e;
            if (gVar == null) {
                gVar = new bd.g();
                a10.e = gVar;
            }
            gVar.addLast(this);
            return;
        }
        a10.h(true);
        try {
            cd.h context2 = cVar.getContext();
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
    public final cd.c c() {
        return this;
    }
}
