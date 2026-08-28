package qd;

import g7.g7;
import hd.f0;
import hd.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class d extends h implements a {
    public static final AtomicReferenceFieldUpdater f46145g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile;

    public d(boolean z10) {
        super(z10 ? 1 : 0);
        e5.c cVar;
        if (z10) {
            cVar = null;
        } else {
            cVar = e.f46146a;
        }
        this.owner$volatile = cVar;
    }

    public final boolean c() {
        if (Math.max(h.f46152f.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(sc.c cVar) {
        int i9;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f46152f;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > 1) {
                do {
                    i9 = atomicIntegerFieldUpdater.get(this);
                    if (i9 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 1));
            } else {
                oc.i iVar = oc.i.f19197a;
                if (i10 <= 0) {
                    m l10 = f0.l(g7.b(cVar));
                    try {
                        a(new c(this, l10));
                        Object r10 = l10.r();
                        rc.a aVar = rc.a.f47127a;
                        if (r10 != aVar) {
                            r10 = iVar;
                        }
                        if (r10 == aVar) {
                            return r10;
                        }
                        return iVar;
                    } catch (Throwable th) {
                        l10.A();
                        throw th;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f46145g.set(this, null);
                    return iVar;
                }
            }
        }
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46145g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            e5.c cVar = e.f46146a;
            if (obj2 != cVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, cVar)) {
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
        return "Mutex@" + f0.k(this) + "[isLocked=" + c() + ",owner=" + f46145g.get(this) + ']';
    }
}
