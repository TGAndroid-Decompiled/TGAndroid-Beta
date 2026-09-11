package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends h1 {
    public final m f51580e;

    public o(m mVar) {
        this.f51580e = mVar;
    }

    @Override
    public final void a(Throwable th2) {
        u1 i10 = i();
        m mVar = this.f51580e;
        Throwable q6 = mVar.q(i10);
        if (mVar.x()) {
            id.c cVar = mVar.d;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            ee.h hVar = (ee.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.h.f9072n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                d9.f fVar = ee.a.d;
                if (kotlin.jvm.internal.i.a(obj, fVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, fVar, q6)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != fVar) {
                            break;
                        }
                    }
                    return;
                } else if (!(obj instanceof Throwable)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    return;
                }
            }
        }
        mVar.n(q6);
        if (!mVar.x()) {
            mVar.o();
        }
    }
}
