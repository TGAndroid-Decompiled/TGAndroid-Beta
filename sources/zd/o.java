package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends e1 {
    public final int f61310e;
    public final m f61311f;

    public o(m mVar, int i7) {
        this.f61310e = i7;
        this.f61311f = mVar;
    }

    @Override
    public final boolean i() {
        switch (this.f61310e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override
    public final void j(Throwable th2) {
        switch (this.f61310e) {
            case 0:
                n1 h = h();
                m mVar = this.f61311f;
                Throwable q10 = mVar.q(h);
                if (mVar.x()) {
                    ee.f fVar = (ee.f) mVar.d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.f.f10610n;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        aa.b0 b0Var = ee.a.f10601c;
                        if (kotlin.jvm.internal.j.a(obj, b0Var)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, b0Var, q10)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != b0Var) {
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
                this.f61311f.resumeWith(gd.k.f13173a);
                return;
        }
    }
}
