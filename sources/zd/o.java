package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends e1 {
    public final int f61875e;
    public final m f61876f;

    public o(m mVar, int i7) {
        this.f61875e = i7;
        this.f61876f = mVar;
    }

    @Override
    public final boolean i() {
        switch (this.f61875e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override
    public final void j(Throwable th2) {
        switch (this.f61875e) {
            case 0:
                n1 h = h();
                m mVar = this.f61876f;
                Throwable q10 = mVar.q(h);
                if (mVar.x()) {
                    ee.f fVar = (ee.f) mVar.d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.f.f10925n;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        ee.t tVar = ee.a.f10916c;
                        if (kotlin.jvm.internal.j.a(obj, tVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, tVar, q10)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != tVar) {
                                    break;
                                }
                            }
                            return;
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
                mVar.n(q10);
                if (!mVar.x()) {
                    mVar.o();
                    return;
                }
                return;
            default:
                this.f61876f.resumeWith(gd.k.f13485a);
                return;
        }
    }
}
