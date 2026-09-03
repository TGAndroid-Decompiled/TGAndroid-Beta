package qd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class l {
    public static final AtomicReferenceFieldUpdater f44841a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur$volatile");
    private volatile Object _cur$volatile = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44841a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a2 = nVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 == 2) {
                    return false;
                }
            } else {
                n c3 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c3) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44841a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c3 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c3) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f44841a.get(this);
        nVar.getClass();
        long j10 = n.f44844f.get(nVar);
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44841a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d = nVar.d();
            if (d != n.f44845g) {
                return d;
            }
            n c3 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c3) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
