package wd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends e1 {
    public final int f57521e;
    public final m f57522f;

    public o(m mVar, int i3) {
        this.f57521e = i3;
        this.f57522f = mVar;
    }

    @Override
    public final boolean i() {
        switch (this.f57521e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override
    public final void j(Throwable th2) {
        switch (this.f57521e) {
            case 0:
                n1 h = h();
                m mVar = this.f57522f;
                Throwable q10 = mVar.q(h);
                if (mVar.x()) {
                    be.f fVar = (be.f) mVar.d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be.f.f3262n;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        be.t tVar = be.a.f3253c;
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
                this.f57522f.resumeWith(dd.k.f8801a);
                return;
        }
    }
}
