package yd;

import be.t;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wd.b0;
import wd.b1;
import wd.n1;
public final class o extends wd.a implements p, g {
    public final c d;

    public o(fd.h hVar, c cVar) {
        super(hVar, true);
        this.d = cVar;
    }

    @Override
    public final void Q(Throwable th2, boolean z10) {
        if (!this.d.g(th2, false) && !z10) {
            b0.m(this.f57457c, th2);
        }
    }

    @Override
    public final void R(Object obj) {
        dd.k kVar = (dd.k) obj;
        this.d.g(null, false);
    }

    public final void T(v0.g gVar) {
        c cVar = this.d;
        cVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f59386s;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, gVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(cVar);
                    t tVar = e.f59403q;
                    if (obj == tVar) {
                        t tVar2 = e.f59404r;
                        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, tVar, tVar2)) {
                            if (atomicReferenceFieldUpdater.get(cVar) != tVar) {
                                break;
                            }
                        }
                        gVar.invoke(cVar.m());
                        return;
                    } else if (obj == e.f59404r) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    } else {
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                }
            }
        }
    }

    @Override
    public final Object a(fd.c cVar, Object obj) {
        return this.d.a(cVar, obj);
    }

    @Override
    public final Object b(Object obj) {
        return this.d.b(dd.k.f8801a);
    }

    @Override
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new b1(m(), null, this);
        }
        k(cancellationException);
    }

    @Override
    public final void k(CancellationException cancellationException) {
        CancellationException N = n1.N(this, cancellationException);
        this.d.g(N, true);
        j(N);
    }
}
