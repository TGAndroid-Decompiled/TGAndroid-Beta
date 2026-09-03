package ud;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k7.g8;
import ld.e0;
import ld.m;
public final class d extends h implements a {
    public static final AtomicReferenceFieldUpdater f45286g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile;

    public d(boolean z4) {
        super(z4 ? 1 : 0);
        o3.c cVar;
        if (z4) {
            cVar = null;
        } else {
            cVar = e.f45287a;
        }
        this.owner$volatile = cVar;
    }

    public final boolean c() {
        if (Math.max(h.f45292f.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object d(wc.c cVar) {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f45292f;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 > 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
            } else {
                sc.i iVar = sc.i.f44318a;
                if (i11 <= 0) {
                    m l10 = e0.l(g8.b(cVar));
                    try {
                        a(new c(this, l10));
                        Object r10 = l10.r();
                        vc.a aVar = vc.a.f45727a;
                        if (r10 != aVar) {
                            r10 = iVar;
                        }
                        if (r10 == aVar) {
                            return r10;
                        }
                        return iVar;
                    } catch (Throwable th2) {
                        l10.A();
                        throw th2;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f45286g.set(this, null);
                    return iVar;
                }
            }
        }
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45286g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            o3.c cVar = e.f45287a;
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
        return "Mutex@" + e0.k(this) + "[isLocked=" + c() + ",owner=" + f45286g.get(this) + ']';
    }
}
