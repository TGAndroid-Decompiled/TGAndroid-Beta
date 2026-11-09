package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends e1 {
    public final int f60111e;
    public final m f60112f;

    public o(m mVar, int i7) {
        this.f60111e = i7;
        this.f60112f = mVar;
    }

    @Override
    public final boolean i() {
        switch (this.f60111e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override
    public final void j(Throwable th2) {
        switch (this.f60111e) {
            case 0:
                n1 h = h();
                m mVar = this.f60112f;
                Throwable q10 = mVar.q(h);
                if (mVar.x()) {
                    ee.f fVar = (ee.f) mVar.d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.f.f10774n;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        com.google.android.gms.internal.clearcut.e eVar = ee.a.f10765c;
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
                this.f60112f.resumeWith(gd.k.f13829a);
                return;
        }
    }
}
