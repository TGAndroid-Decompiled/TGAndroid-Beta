package td;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends h1 {
    public final m e;

    public o(m mVar) {
        this.e = mVar;
    }

    @Override
    public final void a(Throwable th2) {
        u1 i10 = i();
        m mVar = this.e;
        Throwable q6 = mVar.q(i10);
        if (mVar.x()) {
            cd.c cVar = mVar.d;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            yd.h hVar = (yd.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yd.h.f54423n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                ea.a aVar = yd.a.d;
                if (kotlin.jvm.internal.i.a(obj, aVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, q6)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
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
