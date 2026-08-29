package sd;

import i7.v7;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.e0;
import jd.m;
public final class d extends h implements a {
    public static final AtomicReferenceFieldUpdater f47716g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile;

    public d(boolean z10) {
        super(z10 ? 1 : 0);
        fc.a aVar;
        if (z10) {
            aVar = null;
        } else {
            aVar = e.f47717a;
        }
        this.owner$volatile = aVar;
    }

    public final boolean c() {
        if (Math.max(h.f47723f.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(uc.c cVar) {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f47723f;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 > 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
            } else {
                qc.i iVar = qc.i.f46603a;
                if (i11 <= 0) {
                    m l10 = e0.l(v7.b(cVar));
                    try {
                        a(new c(this, l10));
                        Object r6 = l10.r();
                        tc.a aVar = tc.a.f48210a;
                        if (r6 != aVar) {
                            r6 = iVar;
                        }
                        if (r6 == aVar) {
                            return r6;
                        }
                        return iVar;
                    } catch (Throwable th2) {
                        l10.A();
                        throw th2;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f47716g.set(this, null);
                    return iVar;
                }
            }
        }
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f47716g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            fc.a aVar = e.f47717a;
            if (obj2 != aVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                b();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + e0.k(this) + "[isLocked=" + c() + ",owner=" + f47716g.get(this) + ']';
    }
}
