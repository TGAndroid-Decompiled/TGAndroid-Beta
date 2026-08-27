package rd;

import h7.h7;
import id.f0;
import id.m;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class d extends h implements a {

    public static final AtomicReferenceFieldUpdater f46904g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile;

    public d(boolean z10) {
        super(z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : e.f46905a;
    }

    public final boolean c() {
        return Math.max(h.f46911f.get(this), 0) == 0;
    }

    public final Object d(tc.c cVar) throws IllegalAccessException, InvocationTargetException {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f46911f;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 > 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
            } else {
                pc.i iVar = pc.i.f45696a;
                if (i11 <= 0) {
                    m mVarL = f0.l(h7.b(cVar));
                    try {
                        a(new c(this, mVarL));
                        Object objR = mVarL.r();
                        sc.a aVar = sc.a.f47847a;
                        if (objR != aVar) {
                            objR = iVar;
                        }
                        return objR == aVar ? objR : iVar;
                    } catch (Throwable th) {
                        mVarL.A();
                        throw th;
                    }
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f46904g.set(this, null);
                    return iVar;
                }
            }
        }
    }

    public final void e(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46904g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            ec.a aVar = e.f46905a;
            if (obj2 != aVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                        b();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + f0.k(this) + "[isLocked=" + c() + ",owner=" + f46904g.get(this) + ']';
    }
}
