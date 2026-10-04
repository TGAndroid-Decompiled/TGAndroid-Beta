package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends h1 {
    public final m f53252e;

    public o(m mVar) {
        this.f53252e = mVar;
    }

    @Override
    public final void a(Throwable th2) {
        u1 i10 = i();
        m mVar = this.f53252e;
        Throwable q6 = mVar.q(i10);
        if (mVar.x()) {
            id.c cVar = mVar.d;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            ee.h hVar = (ee.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.h.f8872n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                com.google.android.gms.internal.clearcut.e eVar = ee.a.d;
                if (kotlin.jvm.internal.i.a(obj, eVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, eVar, q6)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != eVar) {
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
