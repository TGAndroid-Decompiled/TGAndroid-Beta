package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends e1 {
    public final int f61920e;
    public final m f61921f;

    public o(m mVar, int i7) {
        this.f61920e = i7;
        this.f61921f = mVar;
    }

    @Override
    public final boolean i() {
        switch (this.f61920e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override
    public final void j(Throwable th2) {
        switch (this.f61920e) {
            case 0:
                n1 h = h();
                m mVar = this.f61921f;
                Throwable q10 = mVar.q(h);
                if (mVar.x()) {
                    ee.f fVar = (ee.f) mVar.d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.f.f10957n;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        ee.t tVar = ee.a.f10948c;
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
                this.f61921f.resumeWith(gd.k.f13517a);
                return;
        }
    }
}
