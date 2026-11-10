package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends e1 {
    public final int f60109e;
    public final m f60110f;

    public o(m mVar, int i7) {
        this.f60109e = i7;
        this.f60110f = mVar;
    }

    @Override
    public final boolean i() {
        switch (this.f60109e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override
    public final void j(Throwable th2) {
        switch (this.f60109e) {
            case 0:
                n1 h = h();
                m mVar = this.f60110f;
                Throwable q10 = mVar.q(h);
                if (mVar.x()) {
                    ee.f fVar = (ee.f) mVar.d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.f.f10779n;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        com.google.android.gms.internal.clearcut.e eVar = ee.a.f10770c;
                        if (kotlin.jvm.internal.j.a(obj, eVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, eVar, q10)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != eVar) {
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
                this.f60110f.resumeWith(gd.k.f13831a);
                return;
        }
    }
}
